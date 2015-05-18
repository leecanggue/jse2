package oop01.Syntax;

public class Bicycle {
	private int cadence ;
	private int gear ;
	private int speed ;
	private int id ;
	private static int numberofbicycles = 0 ;
	
	public Bicycle(int startcadence, int startgear, int startspeed) {
		super();
		this.cadence = startcadence;
		this.gear = startgear;
		this.speed = startspeed;
		this.id = ++numberofbicycles;
	}

	public int getCadence() {
		return cadence;
	}

	public void setCadence(int newValue) {
		this.cadence = newValue;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int newValue) {
		this.gear = newValue;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void applyBrake(int decrement){
		speed -= decrement;
	}
	public void speedUp(int increment){
		speed += increment;
	}
	
}
