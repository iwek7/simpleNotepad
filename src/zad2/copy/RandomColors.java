package zad2.copy;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.*;
import javax.swing.*;

public class RandomColors extends JFrame {

//	String[] ctab = { "red", "blue", "yellow", "green" };
	private Color[] colorBackground = { RED, BLUE, YELLOW, GREEN, BLACK };
	private int i;

	public RandomColors() {
		super("random colors");

		final Container cp = getContentPane();
		cp.setLayout(new FlowLayout());

		JButton button = new JButton("Shuffle color");
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (i >= colorBackground.length) {
					i = 0;
				}
				cp.setBackground(colorBackground[i++]);
			}
		});
		cp.add(button);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}

}
