package zad2;

import java.awt.*;
import javax.swing.*;

public class Panel extends JPanel {

	public static final int HEIGHT = 100;
	public static final int WIDTH = 300;

	private JButton bButton;

	public Panel() {
		bButton = new Button(this);

		setLayout(new FlowLayout());
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		add(bButton);

	}
}
