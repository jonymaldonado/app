package model;

import java.util.ArrayList;

public class City {
	private String message;
	private int cod;
	private int count;
	private ArrayList <Cuerpo> list;
	
	
	public City(String message, int cod, int count, ArrayList<Cuerpo> list) {
		super();
		this.message = message;
		this.cod = cod;
		this.count = count;
		this.list = list;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public int getCod() {
		return cod;
	}


	public void setCod(int cod) {
		this.cod = cod;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public ArrayList<Cuerpo> getList() {
		return list;
	}


	public void setList(ArrayList<Cuerpo> list) {
		this.list = list;
	}
	
	
	

}
