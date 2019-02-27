package lab6;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	OptionPanel optionPanel;
	DrawPanel drawPanel;
	Menu menu;
	DownPanel downPanel;

	BufferedImage image;
	JMenuBar menuBar;
	

	public MainFrame() {

		this.setSize(800, 800);
		menu = new Menu(this, drawPanel);
		downPanel=new DownPanel(drawPanel);
		
		menuBar= new JMenuBar();
		optionPanel = new OptionPanel();
		menuBar.add(menu);
		this.setJMenuBar(menuBar);
		this.setLayout(new BorderLayout());
		optionPanel.setPreferredSize(new Dimension(100, 800));
		

		drawPanel = new DrawPanel(this, optionPanel, menu,downPanel);

		drawPanel.setPreferredSize(new Dimension(700, 750));

		

		drawPanel.setBackground(Color.white);
		this.add(optionPanel, BorderLayout.WEST);
		this.add(drawPanel, BorderLayout.CENTER);
		this.add(downPanel, BorderLayout.SOUTH);
		this.setVisible(true);

		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		
		
		
		
		

	}

	public static void main(String[] args) {

		new MainFrame();

	}

	
		

	
}
