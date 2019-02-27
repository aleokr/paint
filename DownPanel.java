package lab6;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class DownPanel extends JPanel {
	//JButton clear;
	static final int SLIDER_MIN = 1;
	static final int SLIDER_MAX = 30;
	static final int SLIDER_INIT = 1;

	JSlider slider;
	JLabel change_line;
	JLabel line;
	int size;
	JButton color_line;
	//JButton color_background;
	Color color;
	Color color_l;
	DrawPanel drawPanel;

	public DownPanel(DrawPanel drawPanel) {
		this.drawPanel=drawPanel;
		
		//clear = new JButton("Wyczyść ekran");
		slider = new JSlider(JSlider.HORIZONTAL, SLIDER_MIN, SLIDER_MAX, SLIDER_INIT);
		change_line = new JLabel(String.format("%d", slider.getValue()));
		line = new JLabel("Grubość lini");
		//color_background = new JButton("Dodaj kolor tła");
		color_line = new JButton("Zmien kolor linii");

		slider.addChangeListener(new SliderChangeListener());

		//add(clear);
		add(line);
		add(slider);
		add(change_line);
		add(color_line);
		//add(color_background);
		this.setLayout(new FlowLayout());
		
		/*color_background.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				color = JColorChooser.showDialog(null, "Choose Color",color);
				
			}
		});*/
		color_line.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				color_l = JColorChooser.showDialog(null, "Choose Color",color_l);
				
			}
		});
		
	}

	public class SliderChangeListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			String value = String.format("%d", slider.getValue());
			change_line.setText(value);
			size = slider.getValue();
		}

	}

}
