package frc.robot.gui;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class SavePanel extends JPanel {
	private static JTextField field;
	private JLabel label;

	public SavePanel() {
		setLayout(new FlowLayout());
		label = new JLabel("File Selection:");
		label.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 18));
		label.setForeground(Color.blue);
		add(label);

		field = new JTextField(15);
		add(field);
		updateText(getSaveCount());
	}

	public static int getSaveCount() {
		Scanner input;
		try {
			input = new Scanner(new File("PISS\\saveInfo.txt"));
		} catch (Exception e) {
			System.out.println("no such file");
			return 1;
		}
		int size = input.nextInt();
		input.close();
		return size;
	}

	public static void updateSaveCount() {
		int count = getSaveCount();
		try {
			System.setOut(new PrintStream(new FileOutputStream("PISS\\saveInfo.txt")));
		} catch (Exception er) {
			return;
		}
		updateText(count + 1);
		System.out.println(count + 1);

	}

	public static void updateText(int number) {
		field.setText("" + number);
	}

	public static int getText() {
		return Integer.parseInt(field.getText());
	}
}
