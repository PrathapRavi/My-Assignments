package Week1.Day1;

public class Bike {
	
public void applyBrake() {
		
		System.out.println("Applied Bike Brake");
	}
	
	public void soundHorn() {
		
		System.out.println("sound Bike Horn");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car=new Car();
		Bike bike=new Bike();
		
	car.applyBrake();
	car.soundHorn();
	bike.applyBrake();
	bike.soundHorn();
		

	}

}
