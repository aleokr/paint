package lab6;

import java.awt.*;
import javax.swing.*;

public class OptionPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	JLabel shape;
	JLabel accesories;

	JCheckBox line;
	JCheckBox oval;
	JCheckBox circle;
	JCheckBox square;
	ButtonGroup grup1;

	JCheckBox pencil;
	JCheckBox eraser;

	

	OptionPanel() {
		shape = new JLabel("Kształty");
		accesories = new JLabel("Przybory");

		line = new JCheckBox("linia");
		line.setPreferredSize(new Dimension(100, 20));

		oval = new JCheckBox("okrąg");
		oval.setPreferredSize(new Dimension(100, 20));

		circle = new JCheckBox("koło");
		circle.setPreferredSize(new Dimension(100, 20));

		square = new JCheckBox("prostokąt");
		square.setPreferredSize(new Dimension(100, 20));

		grup1 = new ButtonGroup();
		grup1.add(line);
		grup1.add(circle);
		grup1.add(oval);
		grup1.add(square);
		circle.setSelected(true);

		pencil = new JCheckBox("ołówek");
		pencil.setPreferredSize(new Dimension(100, 20));
		eraser = new JCheckBox("gumka");
		eraser.setPreferredSize(new Dimension(100, 20));

		grup1.add(pencil);
		grup1.add(eraser);
		pencil.setSelected(true);

		

		this.setLayout(new GridLayout(7, 1));
		this.add(line);
		this.add(oval);
		this.add(circle);
		this.add(square);
		this.add(pencil);
		this.add(eraser);
		// this.add(clear);
		this.setVisible(true);

	}

}
