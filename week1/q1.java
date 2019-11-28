package week1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class q1 extends JFrame implements ActionListener {
	// declare text fields and button
	private JTextField jtfinput = new JTextField(10);
	private JTextField jtfResult = new JTextField(20);
	private JButton jbCompute = new JButton("Compute");

	// Main method
	public static void main(String[] args) {
		q1 frame = new q1();
		frame.pack();
		frame.setTitle("Q1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public q1() {
		// Panel p1 to hold labels and text fields using GridLayout
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(4, 2));
		// add components here
		p1.add(new JLabel("input:"));
		p1.add(jtfinput);
		p1.add(new JLabel("Result"));
		p1.add(jtfResult);
		jtfResult.setEditable(false);
		this.getContentPane().setLayout(new BorderLayout());
		// Add p1 to the CENTER region of the frame
		this.getContentPane().add(p1, BorderLayout.CENTER);
		// Add compute button to the SOUTH region of the frame
		this.getContentPane().add(jbCompute, BorderLayout.SOUTH);
		// Register the current frame to be the actionListener of the button
		jbCompute.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// Armstrong number checking and display results
		if (e.getSource() == jbCompute) {
			try {
				int input = Integer.parseInt(jtfinput.getText());
				int number = input, originalNumber, digit1, digit2, digit3, result = 0;
				originalNumber = number;
				if (originalNumber < 100 || originalNumber > 999)
					throw new Exception();
				digit1 = originalNumber % 10;
				result += Math.pow(digit1, 3);
				originalNumber /= 10;
				digit2 = originalNumber % 10;
				result += Math.pow(digit2, 3);
				originalNumber /= 10;
				digit3 = originalNumber % 10;
				result += Math.pow(digit3, 3);
				if (result == number) {
					jtfResult.setText("yes");
				} else {
					jtfResult.setText("no");
				}
			} catch (NumberFormatException nfe) {
				JOptionPane.showMessageDialog(rootPane, "Input Number Format Error !");
			} catch (Exception f) {
				JOptionPane.showMessageDialog(rootPane, "Input Error");
			}
		}
	}
}