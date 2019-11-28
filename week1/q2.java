package week1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class q2 extends JFrame implements ActionListener {
	// declare text fields and button
	private JTextField jtfinput1 = new JTextField(10);
	private JTextField jtfinput2 = new JTextField(10);
	private JTextField jtfResult = new JTextField(20);
	private JButton jbCompute = new JButton("Compute");

	// Main method
	public static void main(String[] args) {
		q2 frame = new q2();
		frame.pack();
		frame.setTitle("Q2");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public q2() {
		// Panel p1 to hold labels and text fields using GridLayout
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(4, 2));
		// add components here
		p1.add(new JLabel("input1:"));
		p1.add(jtfinput1);
		p1.add(new JLabel("input2:"));
		p1.add(jtfinput2);
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

		
		if (e.getSource() == jbCompute) {
			String input1 = jtfinput1.getText();
			String input2 = jtfinput2.getText();
			if (input1 != null && !input1.isEmpty()) {
				if (input2 != null && !input2.isEmpty()) {
					if (input1.contains(input2)) {		// checks to see if the second string is a substring of the first
						jtfResult.setText("'" + input2 + "'" + " is a substring of " + "'" + input1 + "'");
					} else {
						jtfResult.setText("'" + input2 + "'" + " is not a substring of " + "'" + input1 + "'");
					}
				}
			} else {
				jtfResult.setText("input error");
			}
		}
	}
}