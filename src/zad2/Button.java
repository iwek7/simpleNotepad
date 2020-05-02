package zad2;


import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

class Button extends JButton implements ActionListener {

    private JPanel Panel;
    private Color[] colors = //{ fill color.XYZ };

    Button(JPanel Panel) {
        super("bName");
        this.Panel = Panel;
        addActionListener(this);
    }

    int wskaznik = null;

    @Override
    public void actionPerformed(ActionEvent e) {
         //add if condition
        Panel.setBackground(colors[wskaznik]);
    }
}