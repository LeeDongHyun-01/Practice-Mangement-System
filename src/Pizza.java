package myframe;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Pizza extends JFrame {

	public Pizza() {
		Container a = getContentPane();
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JLabel l1 = new JLabel("Welcome to Java pizza. Choose the type of pizza.");
		JLabel l2 = new JLabel("Count");
		p1.add(l1);
		JButton b1 = new JButton("Combination Pizza");
		JButton b2 = new JButton("Potato pizza");
		JButton b3 = new JButton("Roasted meat pizza.");
		JTextField t1 = new JTextField("              ");
		
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(l2);
		p2.add(t1);
		
		a.add(p1, BorderLayout.NORTH);
		a.add(p2, BorderLayout.CENTER);
		pack();
		
		setSize(600, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setTitle("Pizza");
	}
}
