package lab6;

import java.awt.*;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class DrawPanel extends JPanel implements MouseMotionListener, MouseListener {

	private static final long serialVersionUID = 1L;
	OptionPanel optionPanel;
	Menu menu;
	MainFrame window;
	DownPanel downPanel;
	private ArrayList<Integer> list_x = new ArrayList<Integer>();
	private ArrayList<Integer> list_y = new ArrayList<Integer>();
	ArrayList<Figure> figures = new ArrayList<>();
	Line linee;
	Pencil pencil;
	Circle circle;
	Oval oval;
	Square square;
	Eraser eraser;

	BufferedImage image;

	public DrawPanel(MainFrame window, OptionPanel option, Menu menu, DownPanel downPanel) {

		super();

		optionPanel = option;
		this.menu = menu;
		this.window = window;
		this.downPanel = downPanel;
		this.setBorder(BorderFactory.createBevelBorder(0));
		addMouseListener(this);
		addMouseMotionListener(this);

	}

	public void setBackgroudImage(BufferedImage imagee) {

		image = imagee;
		repaint();

	}

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;

		if (image != null) {
			int x = (this.getWidth() - image.getWidth(null)) / 2;
			int y = (this.getHeight() - image.getHeight(null)) / 2;
			g2d.drawImage(image, x, y, null);
		}

		if (window.optionPanel.line.isSelected()) {

			for (int i = 0; i < figures.size(); i++) {
				figures.get(i).draw(g2d);
			}

		}
		if (optionPanel.pencil.isSelected()) {

			for (int i = 0; i < figures.size(); i++) {
				figures.get(i).draw(g2d);
			}

		}
		if (optionPanel.circle.isSelected()) {

			for (int i = 0; i < figures.size(); i++) {
				figures.get(i).draw(g2d);
			}

		}
		if (optionPanel.square.isSelected()) {
			for (int i = 0; i < figures.size(); i++) {
				figures.get(i).draw(g2d);
			}

		}
		if (optionPanel.eraser.isSelected()) {
			for (int i = 0; i < figures.size(); i++) {
				figures.get(i).draw(g2d);
			}

		}
		if (optionPanel.oval.isSelected()) {

			for (int i = 0; i < figures.size(); i++) {
				figures.get(i).draw(g2d);
			}

		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (optionPanel.line.isSelected()) {

			linee = new Line(downPanel);
			linee.c = downPanel.color_l;
			linee.r = downPanel.size;
			figures.add(linee);
			if (list_x.size() == 2) {
				list_x.clear();
				list_y.clear();

			}
			linee.addPoint(e.getX(), e.getY());

		}

		if (optionPanel.pencil.isSelected()) {
			pencil = new Pencil(downPanel);
			pencil.c = downPanel.color_l;
			pencil.r = downPanel.size;
			figures.add(pencil);
			if (list_x.size() == 2) {
				list_x.clear();
				list_y.clear();

			}
			pencil.addPoint(e.getX(), e.getY());
			repaint();

		}

		if (optionPanel.circle.isSelected()) {

			circle = new Circle(downPanel);
			circle.c = downPanel.color_l;
			circle.r = downPanel.size;
			figures.add(circle);
			if (list_x.size() == 2) {
				list_x.clear();
				list_y.clear();

			}
			circle.addPoint(e.getX(), e.getY());
		}
		if (optionPanel.oval.isSelected()) {

			oval = new Oval(downPanel);
			oval.c = downPanel.color_l;
			oval.r = downPanel.size;
			figures.add(oval);

			if (list_x.size() == 2) {
				list_x.clear();
				list_y.clear();

			}
			oval.addPoint(e.getX(), e.getY());

		}
		if (optionPanel.square.isSelected()) {
			square = new Square(downPanel);
			square.c = downPanel.color_l;
			square.r = downPanel.size;
			figures.add(square);
			if (list_x.size() == 2) {
				list_x.clear();
				list_y.clear();

			}
			square.addPoint(e.getX(), e.getY());

		}
		if (optionPanel.eraser.isSelected()) {
			eraser = new Eraser(downPanel);
			eraser.r = downPanel.size;
			figures.add(eraser);
			if (list_x.size() == 2) {
				list_x.clear();
				list_y.clear();

			}
			eraser.addPoint(e.getX(), e.getY());
			repaint();
		}

	}

	@Override
	public void mouseReleased(MouseEvent e) {

		if (optionPanel.line.isSelected()) {

			linee.addPoint(e.getX(), e.getY());
			repaint();

		}
		if (optionPanel.circle.isSelected()) {

			circle.addPoint(e.getX(), e.getY());
			repaint();

		}
		if (optionPanel.oval.isSelected()) {

			oval.addPoint(e.getX(), e.getY());
			repaint();

		}
		if (optionPanel.square.isSelected()) {

			square.addPoint(e.getX(), e.getY());
			repaint();

		}
		if (optionPanel.eraser.isSelected()) {
			eraser.addPoint(e.getX(), e.getY());
			repaint();
		}

		if (optionPanel.pencil.isSelected()) {

			pencil.addPoint(e.getX(), e.getY());
			repaint();

		}

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseDragged(MouseEvent e) {
/*
		if (optionPanel.pencil.isSelected()) {
			pencil = new Pencil(downPanel);
			pencil.c = downPanel.color_l;
			pencil.r = downPanel.size;
			figures.add(pencil);
			if (list_x.size() == 2) {
				list_x.clear();
				list_y.clear();

			}
			pencil.list_x.add(1,getX());
			pencil.list_y.add(1,getY());
			repaint();
		}
*/
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		/*if (optionPanel.pencil.isSelected()) {
			pencil = new Pencil(downPanel);
			pencil.c = downPanel.color_l;
			pencil.r = downPanel.size;
			figures.add(pencil);
			if (list_x.size() == 2) {
				list_x.clear();
				list_y.clear();

			}
			pencil.list_x.add(getX());
			pencil.list_y.add(getY());
			repaint();*/

		

	}

}
