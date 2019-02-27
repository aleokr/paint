package lab6;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Circle extends Figure {

	Color c=Color.black;
	int r=1;
	public Circle(DownPanel downPanel) {
		super(downPanel);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		((Graphics2D) g).setStroke(new BasicStroke(r));
		g2d.setColor(c);

		g2d.fillOval(Math.min(list_x.get(0), list_x.get(1)), Math.min(list_y.get(0), list_y.get(1)),
				Math.abs(list_x.get(0) - list_x.get(1)), Math.abs(list_y.get(0) - list_y.get(1)));

	}

}
