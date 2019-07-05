package model;

import java.util.ArrayList;

public class Cuerpo {
	private int id;
	private String name;
	private Coordenadas coord;
	private DatosMain main;
	private Viento wind;
	private Country sys;
	private boolean rain;
	private boolean snow;
	private Clouds clouds;
	private ArrayList<Weather> weather;
	public Cuerpo(int id, String name, Coordenadas coord, DatosMain main, Viento wind, Country sys, boolean rain,
			boolean snow, Clouds clouds, ArrayList<Weather> weather) {
		super();
		this.id = id;
		this.name = name;
		this.coord = coord;
		this.main = main;
		this.wind = wind;
		this.sys = sys;
		this.rain = rain;
		this.snow = snow;
		this.clouds = clouds;
		this.weather = weather;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Coordenadas getCoord() {
		return coord;
	}
	public void setCoord(Coordenadas coord) {
		this.coord = coord;
	}
	public DatosMain getMain() {
		return main;
	}
	public void setMain(DatosMain main) {
		this.main = main;
	}
	public Viento getWind() {
		return wind;
	}
	public void setWind(Viento wind) {
		this.wind = wind;
	}
	public Country getSys() {
		return sys;
	}
	public void setSys(Country sys) {
		this.sys = sys;
	}
	public boolean isRain() {
		return rain;
	}
	public void setRain(boolean rain) {
		this.rain = rain;
	}
	public boolean isSnow() {
		return snow;
	}
	public void setSnow(boolean snow) {
		this.snow = snow;
	}
	public Clouds getClouds() {
		return clouds;
	}
	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}
	public ArrayList<Weather> getWeather() {
		return weather;
	}
	public void setWeather(ArrayList<Weather> weather) {
		this.weather = weather;
	}
	
	
	

}
