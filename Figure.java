package lab6;


import java.awt.Graphics;

import java.util.ArrayList;

public abstract class Figure {

	ArrayList<Integer> list_x;
	ArrayList<Integer> list_y;
	DownPanel downPanel;

	// Konstruktor
	public Figure(DownPanel downPanel) {
		this.downPanel = downPanel;
		list_x = new ArrayList<Integer>();
		list_y = new ArrayList<Integer>();
	}

	// Dodawanie punktów do linii
	public void addPoint(int x, int y) {
		list_x.add(x);
		list_y.add(y);
	}

	abstract public void draw(Graphics g); 
	
}
