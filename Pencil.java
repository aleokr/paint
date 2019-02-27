package lab6;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class Pencil extends Figure {

	Color c=Color.black;
	int r=1;
	public Pencil(DownPanel downPanel) {
		super(downPanel);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		((Graphics2D) g).setStroke(new BasicStroke(r));

		g2d.setColor(c);
		for (int i = 0; i < list_x.size() - 1; ++i) {
			g2d.drawLine(list_x.get(i), list_y.get(i), list_x.get(i + 1), list_y.get(i + 1));
		}

	}

}