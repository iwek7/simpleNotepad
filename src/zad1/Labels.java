package zad1;

import java.awt.*;
import javax.swing.*;
import static java.awt.Color.*;
import static javax.swing.SwingConstants.*;

public class Labels extends JFrame {

	public Labels() {
		setLayout(new GridLayout(0, 2));
		Icon i = new ImageIcon("red.gif");
		add(creLab("Lab 1", i, BLACK, YELLOW, LEFT, TOP, LEFT, CENTER));
		add(creLab("Lab 2", i, WHITE, BLUE, CENTER, CENTER, CENTER, BOTTOM));
		add(creLab("Lab 3", i, RED, WHITE, RIGHT, BOTTOM, RIGHT, CENTER));
		add(creLab("Lab 4", i, YELLOW, BLACK, LEFT, CENTER, CENTER, TOP));
		add(creLab("Lab 5", i, GREEN, BLACK, LEFT, CENTER, CENTER, TOP));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}

	JLabel creLab(String txt, Icon icon, Color fc, Color bc, int halign, int valign, int htxtpos, int vtxtpos) {
		JLabel l = new JLabel(txt);
		l.setFont(new Font("Dialog", Font.BOLD, 24));
		l.setOpaque(true);
		l.setIcon(icon);
		l.setBackground(bc);
		l.setForeground(fc);
		l.setHorizontalAlignment(halign);
		l.setVerticalAlignment(valign);
		l.setHorizontalTextPosition(htxtpos);
		l.setVerticalTextPosition(vtxtpos);
		return l;
	}

}
