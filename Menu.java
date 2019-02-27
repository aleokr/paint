package lab6;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

import javax.swing.filechooser.FileNameExtensionFilter;

import java.io.File;

import javax.swing.*;

public class Menu extends JMenu implements ActionListener {

	MainFrame window;
	JMenuItem save;
	JMenuItem open;
	JMenuItem newfile;
	DrawPanel drawPanel;
	BufferedImage image;

	public Menu(MainFrame window, DrawPanel drawPanel) {

		this.window = window;
		this.drawPanel = drawPanel;
		setText("Plik");
		save = new JMenuItem("Zapisz plik");
		open = new JMenuItem("Otwórz plik");
		newfile = new JMenuItem("Nowy plik");

		save.addActionListener(this);
		open.addActionListener(this);
		newfile.addActionListener(this);

		add(save);
		add(newfile);
		add(open);

	}
	@Override
	public void actionPerformed(ActionEvent e) {

		Object ob = e.getSource();
		if (ob == save) {
			saveFile(drawPanel);
		}
		 else if (ob == newfile) {
			window. drawPanel.figures.clear();
			window.drawPanel.repaint();
			//window.drawPanel.setBackground(Color.white);
		}
		else if (ob == open) {
			openFile(drawPanel);
		}
	}


	public void openFile(DrawPanel drawPanel) {
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Graphic files", "jpg", "gif", "png", "bmp");
		chooser.setFileFilter(filter);
		int returnVal = chooser.showOpenDialog(null);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			BufferedImage image = null;
			try {
				System.out.println(chooser.getSelectedFile());
				image = ImageIO.read(chooser.getSelectedFile());
			} catch (IOException e) {
				e.printStackTrace();
				
			}
			window.drawPanel.setBackgroudImage(image);
		}
		


	}
	public void saveFile(DrawPanel drawPanel) {
		JFileChooser chooser = new JFileChooser();
		int returnVal = chooser.showDialog(null, "Wybierz");
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			BufferedImage image = new BufferedImage(window.drawPanel.getWidth(), window.drawPanel.getHeight(),
					BufferedImage.TYPE_INT_RGB);
			Graphics2D g2im = image.createGraphics();
			window.drawPanel.paint(g2im);
			try {
				ImageIO.write(image, "jpeg", chooser.getSelectedFile());

			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			}

		}
	

	}


	
}
