package model;

public class Viento {
	private float speed;
	private int deg;
	
	
	public Viento(float speed, int deg) {
		super();
		this.speed = speed;
		this.deg = deg;
	}


	public float getSpeed() {
		return speed;
	}


	public void setSpeed(float speed) {
		this.speed = speed;
	}


	public int getDeg() {
		return deg;
	}


	public void setDeg(int deg) {
		this.deg = deg;
	}
	
	
	
	

}
