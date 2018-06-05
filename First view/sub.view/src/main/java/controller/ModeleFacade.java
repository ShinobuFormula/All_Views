package controller;

import java.util.Observable;

public class ModeleFacade extends Observable{

	int mapChoice;
	int x = 0;
	int y = 0;
	int lor_x = 352;
	int lor_y = 128;
	
	public void setMap(int mapChoice_p) {
		this.mapChoice = mapChoice_p;
		System.out.println(mapChoice);
	}
	
	public int getX() {
		return x;
	}
	
	public int addX(int add) {
		x+=add;
	
		return x;
	}
	
	public int addY(int add) {
		y+=add;
	
		return y;
	}
	
	public int addLX(int add) {
		lor_x+=add;
	
		return lor_x;
	}
	
	public int addLY(int add) {
		lor_y+=add;

		return lor_y;
	}
	
	public int subLX(int add) {
		lor_x-=add;

		return lor_x;
	}
	
	public int subLY(int add) {
		lor_y-=add;
	
		return lor_y;
	}
	
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return y;
	}
	
	public void setLY(int y) {
		this.lor_y = y;
	}
	
	public void setLX(int x) {
		this.lor_x = x;
	}
	
	public int getLY() {
		return lor_y;
	}
	
	public int getLX() {
		return lor_x;
	}
	
	public void updt() {
		this.setChanged();
		this.notifyObservers();
		
	}
}
