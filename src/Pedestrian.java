public class Pedestrian {
	
	private double randomPedestrianValue = Math.random();
	public int road;

	public Pedestrian(int road) {
		this.road = road;
	}
	
	public Pedestrian pedestrianInitializer() {
		Pedestrian pedestrian;
		if (randomPedestrianValue <= 0.1 ) {
			double randomRoadValue = Math.random();
			
			if(randomRoadValue > 0.75) {
				road = 4;
				pedestrian = new Pedestrian(road);
				return pedestrian;
			}
			else if(randomRoadValue > 0.5) {
				road = 3;
				pedestrian = new Pedestrian(road);				
				return pedestrian;
			}
			else if(randomRoadValue > 0.25) {
				road = 2;
				pedestrian = new Pedestrian(road);				
				return pedestrian;
			}
			else {
				road = 1;
				pedestrian = new Pedestrian(road);
				return pedestrian;
			}
		}
		pedestrian = new Pedestrian(0);
		return pedestrian;
	}
	
}
