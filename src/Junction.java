import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Junction {
	final int totalVehicle = 20;
	public Junction() throws IOException {
		List<Road> roadList = new ArrayList<>();
		for (int roadNum = 1; roadNum <= 4; roadNum++) {
			roadList.add(new Road(roadNum));
		}
		
		for(int vehicleNum = 1; vehicleNum <= totalVehicle; vehicleNum++) {
			Generator generator = new Generator();
			int road = generator.getRoad();
			roadList.get(road-1).addVehicleToRoad(generator.initializeVehicle());
		}
		FileWriter txtFile = new FileWriter("SimResult.txt");
		SimToText simToText = new SimToText();
		
		simToText.writeToFile("Vehicles:\n", txtFile);
		int passageRights[] = {0, 0, 0, 0};
		for (int roadNum = 1 ;roadNum <= 4; roadNum++) {
			simToText.writeToFile("\t" + roadNum + simToText.getNumberSuffix(roadNum) + " Road:\n", txtFile);
			
			if (roadList.get(roadNum - 1).getVehicle(0) == null) {
				System.out.println(999999111);
			}
			passageRights[roadNum-1] = roadList.get(roadNum - 1).getVehicle(0).getPassSuperiority();
			int roadSize = roadList.get(roadNum - 1).getRoadSize();
			if (roadSize == 0) {
				simToText.writeToFile("Road is empty\n", txtFile);
			}
			else {
				for (int vehicleIndex = 0; vehicleIndex < roadSize; vehicleIndex++) {
					String vehicleType = roadList.get(roadNum - 1).getVehicle(vehicleIndex).getClassName();
					String vehicleDirection = roadList.get(roadNum - 1).getVehicle(vehicleIndex).getVehicleDirection();

					simToText.writeToFile("\t\t" + (vehicleIndex + 1) + ".  " + vehicleType + " (Go " + vehicleDirection + ")" +
							roadList.get(roadNum - 1).getVehicle(vehicleIndex).getPassSuperiority() +"\n" , txtFile);
				}
			}
		}
		
		
		Round round = new Round();
		
		boolean simulationOver = false;
		
		boolean hasPedesterian = false;
		Pedestrian pedestrian = new Pedestrian(0);

		simToText.writeToFile("Right-of-way:\n", txtFile);
		
		while (!simulationOver) {
			for (int roadNum = 1; roadNum <= 4; roadNum++) {
				passageRights[roadNum - 1] = roadList.get(roadNum - 1).getVehicle(0).getPassSuperiority();
			}
			
			if (hasPedesterian) {
				roadList.get(pedestrian.road - 1).crossPedestrian();
				System.out.println("Pedestrian crossed on the " + pedestrian.road + simToText.getNumberSuffix(pedestrian.road) + " road");
				hasPedesterian = false;
			}
			else {
				int roadToDrive = rightOfWay(passageRights);
				
				if (round.getRound() <= totalVehicle) {
					if(roadToDrive != 0) {
						roadList.get(roadToDrive).moveVehicle();
					}
					
					System.out.println(round.getRound() + "- " + roadToDrive);
					round.nextRound();
					pedestrian = pedestrian.pedestrianInitializer();
					if (pedestrian.road != 0) {
						hasPedesterian = true;
						roadList.get(pedestrian.road - 1).spawnPedestrian();
						System.out.println("Pedestrian is initialized in " + pedestrian.road + simToText.getNumberSuffix(pedestrian.road) + " road");
					}
					else {
						pedestrian.road = 0;
					}
				}
				else {
					simulationOver = true;
				}
			}
			
		}
		txtFile.close();
	}
	private int rightOfWay(int passageRights[]) {
		boolean isMaxSingle = false;
		int maxSuperiority = passageRights[0];
		int maxSuperiorRoad = 0;
		for (int roadNum = 1; roadNum <= 4; roadNum++) {
			int superiority = passageRights[roadNum - 1];
			if (superiority > maxSuperiority) {
				maxSuperiority = superiority;
				isMaxSingle = true;
				maxSuperiorRoad = roadNum;
			}
			else if (superiority == maxSuperiority) {
				isMaxSingle = false;
			}
		}
		
		if (isMaxSingle) {
			System.out.println(isMaxSingle);
			return maxSuperiorRoad;
		}
		else {
			if (true) {
				
			}
			System.out.println(isMaxSingle);
			return 0;
		}
	}

}
