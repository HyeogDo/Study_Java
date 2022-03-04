package com.javalec.base;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField strNum1;
	private JTextField strNum2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setTitle("Button Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Java Swing Button Test");
		lblNewLabel.setBounds(28, 20, 161, 16);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showMessage();
			}
		});
		btnNewButton.setBounds(78, 116, 117, 29);
		contentPane.add(btnNewButton);
		
		strNum1 = new JTextField();
		strNum1.setBounds(65, 56, 130, 26);
		contentPane.add(strNum1);
		strNum1.setColumns(10);
		
		strNum2 = new JTextField();
		strNum2.setColumns(10);
		strNum2.setBounds(235, 56, 130, 26);
		contentPane.add(strNum2);
	}
	
	
	public void showMessage() {
		int strNum11 = Integer.parseInt(strNum1.getText());
		int strNum22 = Integer.parseInt(strNum2.getText());
		JOptionPane.showMessageDialog(null, (strNum11 + strNum22));
	}
}
