package zad3;

import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.event.*;
import java.io.*;

public class Notepad extends JFrame implements ActionListener {

	JMenuBar mbar;
	JMenu file, edit, options, font, adresses, background, foreground;
	JMenuItem open, save, saveas, separator, exit;
	JMenuItem home, school, work;
	JMenuItem fsize1, fsize2, fsize3, fsize4, fsize5;
	JMenuItem fsize6, fsize7, fsize8, fsize9;
	JMenuItem colorback1, colorback2, colorback3, colorback4, colorback5;
	JMenuItem colorback6, colorback7;
	JMenuItem colorfore1, colorfore2, colorfore3, colorfore4, colorfore5;
	JMenuItem colorfore6, colorfore7;

	JPanel mainpanel;
	JScrollPane scroll;
	JEditorPane text;

	Font f;

	String command = " ";
	String str = " ";

	String str1 = " ", str2 = " ", str3 = " ";
	String str4 = " ";

	String str6 = " ";
	String str7 = " ", str8 = " ", str9 = " ";

	String str10 = " ", str11 = " ", str12 = " ", str13 = " ";

	int len, len1, len2;

	int i = 0;

	public Notepad(String str) {

		super(str);

		// Panel
		mainpanel = new JPanel();
		mainpanel = (JPanel) getContentPane();
		mainpanel.setLayout(new BorderLayout());

		// Menu bar
		mbar = new JMenuBar();
		setJMenuBar(mbar);

		// Menu
		file = new JMenu("File");
		edit = new JMenu("Edit");
		options = new JMenu("Options");
		font = new JMenu("Size");
		adresses = new JMenu("Adresy");
		foreground = new JMenu("Foreground");
		background = new JMenu("Background");

		// File menu and shortcuts
		file.add(open = new JMenuItem("Open"));
		file.add(save = new JMenuItem("Save"));
		file.add(saveas = new JMenuItem("Save As..."));
		file.add(separator = new JMenuItem("------------"));
		file.add(exit = new JMenuItem("Exit"));
		mbar.add(file);

		// Edit menu and shortcuts
		edit.add(adresses);
		adresses.add(work = new JMenuItem("Praca"));
		adresses.add(school = new JMenuItem("Szkoła"));
		adresses.add(home = new JMenuItem("Dom"));

		mbar.add(edit);

		// shortcuts - mnemonics
		open.setMnemonic(KeyEvent.VK_O);
		save.setMnemonic(KeyEvent.VK_S);
		saveas.setMnemonic(KeyEvent.VK_F5);
		exit.setMnemonic(KeyEvent.VK_F1);
		home.setMnemonic(KeyEvent.VK_H);
		school.setMnemonic(KeyEvent.VK_L);
		work.setMnemonic(KeyEvent.VK_W);

		// Shortcuts accelerator
		KeyStroke keyStrokeOpen = KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK);
		open.setAccelerator(keyStrokeOpen);
		KeyStroke keyStrokeSave = KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK);
		save.setAccelerator(keyStrokeSave);
		KeyStroke keyStrokeSaveAs = KeyStroke.getKeyStroke(KeyEvent.VK_F5, KeyEvent.CTRL_DOWN_MASK);
		saveas.setAccelerator(keyStrokeSaveAs);
		KeyStroke keyStrokeExit = KeyStroke.getKeyStroke(KeyEvent.VK_F1, KeyEvent.CTRL_DOWN_MASK);
		exit.setAccelerator(keyStrokeExit);
		KeyStroke keyStrokeHome = KeyStroke.getKeyStroke(KeyEvent.VK_H, KeyEvent.CTRL_DOWN_MASK);
		home.setAccelerator(keyStrokeHome);
		KeyStroke keyStrokeSchool = KeyStroke.getKeyStroke(KeyEvent.VK_L, KeyEvent.CTRL_DOWN_MASK);
		school.setAccelerator(keyStrokeSchool);
		KeyStroke keyStrokeWork = KeyStroke.getKeyStroke(KeyEvent.VK_W, KeyEvent.CTRL_DOWN_MASK);
		work.setAccelerator(keyStrokeWork);

		// Options menu
		options.add(font);
		font.add(fsize1 = new JMenuItem("8"));
		font.add(fsize2 = new JMenuItem("10"));
		font.add(fsize3 = new JMenuItem("12"));
		font.add(fsize4 = new JMenuItem("14"));
		font.add(fsize5 = new JMenuItem("16"));
		font.add(fsize6 = new JMenuItem("18"));
		font.add(fsize7 = new JMenuItem("20"));
		font.add(fsize8 = new JMenuItem("22"));
		font.add(fsize9 = new JMenuItem("24"));

		// Submenu foreground
		options.add(foreground);
		foreground.add(colorfore1 = new JMenuItem("Blue"));
		foreground.add(colorfore2 = new JMenuItem("Yellow"));
		foreground.add(colorfore3 = new JMenuItem("Orange"));
		foreground.add(colorfore4 = new JMenuItem("Red"));
		foreground.add(colorfore5 = new JMenuItem("White"));
		foreground.add(colorfore6 = new JMenuItem("Black"));
		foreground.add(colorfore7 = new JMenuItem("Green"));

		// Submenu background
		options.add(background);
		background.add(colorback1 = new JMenuItem("Blue"));
		background.add(colorback2 = new JMenuItem("Yellow"));
		background.add(colorback3 = new JMenuItem("Orange"));
		background.add(colorback4 = new JMenuItem("Red"));
		background.add(colorback5 = new JMenuItem("White"));
		background.add(colorback6 = new JMenuItem("Black"));
		background.add(colorback7 = new JMenuItem("Green"));
		mbar.add(options);

		// Actions
		open.addActionListener(this);
		save.addActionListener(this);
		saveas.addActionListener(this);
		exit.addActionListener(this);
		home.addActionListener(this);
		school.addActionListener(this);
		work.addActionListener(this);
		colorfore1.addActionListener(this);
		colorfore2.addActionListener(this);
		colorfore3.addActionListener(this);
		colorfore4.addActionListener(this);
		colorfore5.addActionListener(this);
		colorfore6.addActionListener(this);
		colorfore7.addActionListener(this);
		colorback1.addActionListener(this);
		colorback2.addActionListener(this);
		colorback3.addActionListener(this);
		colorback4.addActionListener(this);
		colorback5.addActionListener(this);
		colorback6.addActionListener(this);
		colorback7.addActionListener(this);
		fsize1.addActionListener(this);
		fsize2.addActionListener(this);
		fsize3.addActionListener(this);
		fsize4.addActionListener(this);
		fsize5.addActionListener(this);
		fsize6.addActionListener(this);
		fsize7.addActionListener(this);
		fsize8.addActionListener(this);
		fsize9.addActionListener(this);

		// Text panel
		text = new JEditorPane();
		scroll = new JScrollPane(text);
		mainpanel.add(scroll, BorderLayout.CENTER);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Default font
		f = new Font("Arial", Font.PLAIN, 15);
		text.setFont(f);

	}

	public void actionPerformed(ActionEvent ae) {

		// commands
		command = (String) ae.getActionCommand();

		try {

			if (command.equals("Open")) {

				str4 = "";
				FileDialog dialog = new FileDialog(this, "Open");
				dialog.setVisible(true);

				str1 = dialog.getDirectory();
				str2 = dialog.getFile();
				str3 = str1 + str2;

				File f = new File(str3);
				FileInputStream fobj = new FileInputStream(f);
				len = (int) f.length();
				for (int j = 0; j < len; j++) {
					char str5 = (char) fobj.read();
					str4 = str4 + str5;
				}
				fobj.close();

				text.setText(str4);
			}
			this.setTitle("Prosty edytor" + str2);

		} catch (IOException e) {
		}

		// save as
		try {

			if (command.equals("Save As...")) {
				FileDialog dialog1 = new FileDialog(this, "Save As", FileDialog.SAVE);
				dialog1.setVisible(true);

				str7 = dialog1.getDirectory();
				str8 = dialog1.getFile();
				str9 = str7 + str8;

				str6 = text.getText();
				len1 = str6.length();
				byte buf[] = str6.getBytes();

				File f1 = new File(str9);
				FileOutputStream fobj1 = new FileOutputStream(f1);
				for (int k = 0; k < len1; k++) {
					fobj1.write(buf[k]);
				}
				fobj1.close();
			}

			this.setTitle(str8);

		} catch (IOException e) {
		}

		// Save from "Open"
		try {

			if (command.equals("Save")) {

				str10 = text.getText();
				len2 = str10.length();
				byte buff[] = str10.getBytes();

				File f2 = new File(str3);
				FileOutputStream fboj2 = new FileOutputStream(f2);
				for (int i = 0; i < len2; i++) {
					fboj2.write(buff[i]);
				}
				fboj2.close();
			}

		} catch (Exception e) {

		}

		// Save from "Save as.."
		try {

			if (command.equals("Save")) {

				str10 = text.getText();
				len2 = str10.length();
				byte buff[] = str10.getBytes();

				File f2 = new File(str9);
				FileOutputStream fboj2 = new FileOutputStream(f2);
				for (int i = 0; i < len2; i++) {
					fboj2.write(buff[i]);
				}
				fboj2.close();
			}

		} catch (Exception e) {

		}

		if (command.equals("Exit")) {
			System.exit(0);
		}

		// Adresy menu
		Document doc = text.getDocument();
		int cursor = text.getCaretPosition();
		try {

			if (command.equals("Dom")) {
				String home = "adres domowy";
				doc.insertString(cursor, home, null);
			}

			if (command.equals("Szkoła")) {
				String school = "adres szkoły";
				doc.insertString(cursor, school, null);
			}

			if (command.equals("Praca")) {
				String work = "adres pracy";
				doc.insertString(cursor, work, null);
			}

		} catch (Exception e) {

		}

		// set foreground
		colorfore1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setForeground(Color.blue);
			}
		});

		colorfore2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setForeground(Color.yellow);
			}
		});

		colorfore3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setForeground(Color.orange);
			}
		});
		colorfore4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setForeground(Color.red);
			}
		});
		colorfore5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setForeground(Color.white);
			}
		});
		colorfore6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setForeground(Color.black);
			}
		});
		colorfore7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setForeground(Color.green);
			}
		});

		// set background
		colorback1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setBackground(Color.blue);
			}
		});

		colorback2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setBackground(Color.yellow);
			}
		});

		colorback3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setBackground(Color.orange);
			}
		});

		colorback4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setBackground(Color.red);
			}
		});

		colorback5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setBackground(Color.white);
			}
		});

		colorback6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setBackground(Color.black);
			}
		});

		colorback7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setBackground(Color.green);
			}
		});

		// set font size
		if (command.equals("8")) {
			String fontName = f.getName();
			int fontStyle = f.getStyle();

			f = new Font(fontName, fontStyle, 8);
			text.setFont(f);
		}

		if (command.equals("12")) {
			String fontName = f.getName();
			int fontStyle = f.getStyle();

			f = new Font(fontName, fontStyle, 12);
			text.setFont(f);
		}

		if (command.equals("14")) {
			String fontName = f.getName();
			int fontStyle = f.getStyle();

			f = new Font(fontName, fontStyle, 14);
			text.setFont(f);
		}
		if (command.equals("18")) {
			String fontName = f.getName();
			int fontStyle = f.getStyle();

			f = new Font(fontName, fontStyle, 18);
			text.setFont(f);
		}
		if (command.equals("20")) {
			String fontName = f.getName();
			int fontStyle = f.getStyle();

			f = new Font(fontName, fontStyle, 20);
			text.setFont(f);

		}

		if (command.equals("22")) {
			String fontName = f.getName();
			int fontStyle = f.getStyle();

			f = new Font(fontName, fontStyle, 22);
			text.setFont(f);

		}

		if (command.equals("24")) {
			String fontName = f.getName();
			int fontStyle = f.getStyle();

			f = new Font(fontName, fontStyle, 24);
			text.setFont(f);

		}
	}

}