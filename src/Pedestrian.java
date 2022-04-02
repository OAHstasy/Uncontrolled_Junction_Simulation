public class Pedestrian {
	double randomValue = Math.random();
	
	public Pedestrian() {
		
	}
	if(randomValue > 0.75) {
		System.out.println("A pedestrian is waiting on the 4th road");
	}
	else if(randomValue > 0.5) {
		System.out.println("A pedestrian is waiting on the 3rd road");
	}
	else if(randomValue > 0.25) {
		System.out.println("A pedestrian is waiting on the 2nd road");
	}
	else {
		System.out.println("A pedestrian is waiting on the 1st road");
	}
}
