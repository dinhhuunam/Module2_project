package View;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyCaculator extends JFrame{
	public MyCaculator() {
		this.setTitle("My Caculator");
		
		this.setSize(300,600);
		
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField jTextField = new JTextField(50);
		
		JPanel jPanel_head = new JPanel();
		jPanel_head.setLayout(new BorderLayout());
		jPanel_head.add(jTextField,BorderLayout.CENTER);
		
		JPanel jPanel_button = new JPanel();
		jPanel_button.setLayout(new GridLayout(5,3,5,5));
		jPanel_button.add(new JButton("0"));
		jPanel_button.add(new JButton("1"));
		jPanel_button.add(new JButton("2"));
		jPanel_button.add(new JButton("3"));
		jPanel_button.add(new JButton("4"));
		jPanel_button.add(new JButton("5"));
		jPanel_button.add(new JButton("6"));
		jPanel_button.add(new JButton("7"));
		jPanel_button.add(new JButton("8"));
		jPanel_button.add(new JButton("9"));
		jPanel_button.add(new JButton("+"));
		jPanel_button.add(new JButton("-"));
		jPanel_button.add(new JButton("*"));
		jPanel_button.add(new JButton("/"));
		jPanel_button.add(new JButton("="));
		
		this.setLayout(new BorderLayout());
		this.add(jPanel_head,BorderLayout.NORTH);
		this.add(jPanel_button,BorderLayout.CENTER);
		
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new MyCaculator();
	}
}