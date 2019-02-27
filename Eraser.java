package lab6;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class Eraser extends Figure {


	int r=1;
	public Eraser(DownPanel downPanel) {
		super(downPanel);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {

		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.white);
		for (int i = 0; i < list_x.size() - 1; ++i) {

			g2d.fillOval(list_x.get(i), list_y.get(i), 15+r, 15+r);

		}
	}

}
