package model;

public class DatosMain {
	
	private int temp;
	private int pressure;
	private int humidity;
	private int temp_min;
	private int temp_max;
	
	
	public DatosMain(int temp, int pressure, int humidity, int temp_min, int temp_max) {
		super();
		this.temp = temp;
		this.pressure = pressure;
		this.humidity = humidity;
		this.temp_min = temp_min;
		this.temp_max = temp_max;
	}


	public int getTemp() {
		return temp;
	}


	public void setTemp(int temp) {
		this.temp = temp;
	}


	public int getPressure() {
		return pressure;
	}


	public void setPressure(int pressure) {
		this.pressure = pressure;
	}


	public int getHumidity() {
		return humidity;
	}


	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}


	public int getTemp_min() {
		return temp_min;
	}


	public void setTemp_min(int temp_min) {
		this.temp_min = temp_min;
	}


	public int getTemp_max() {
		return temp_max;
	}


	public void setTemp_max(int temp_max) {
		this.temp_max = temp_max;
	}
	
	
	
	

}
