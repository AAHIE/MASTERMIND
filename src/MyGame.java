import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPasswordField;

public class MyGame {

	private JFrame frame;
	private JTextField textField0;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textFieldWhite;
	private JTextField textFieldBlack;
	private JButton btnRules;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyGame window = new MyGame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyGame() {
		initialize();
		
		
		
		
		
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField0 = new JTextField();
		textField0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		textField0.setBounds(30, 161, 86, 20);
		frame.getContentPane().add(textField0);
		textField0.setColumns(10);
		
		JLabel lblYourGuess = new JLabel("TYPE YOUR GUESS:");
		lblYourGuess.setFont(new Font("Papyrus", Font.BOLD, 10));
		lblYourGuess.setBounds(133, 130, 175, 20);
		frame.getContentPane().add(lblYourGuess);
		
		JButton btnCheck = new JButton("CHECK!");
		btnCheck.setForeground(Color.WHITE);
		btnCheck.setBackground(Color.BLACK);
		btnCheck.setFont(new Font("Papyrus", Font.BOLD, 10));
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num0, num1, num2, num3;
				int white = 0;
				int black = 0;
				int[] secret = new int[4];
				secret[0]=7;
				secret[1]=4;
				secret[2]=0;
				secret[3]=3;
				
				try{
					num0 = Integer.parseInt(textField0.getText());
					num1 = Integer.parseInt(textField1.getText());
					num2 = Integer.parseInt(textField2.getText());
					num3 = Integer.parseInt(textField3.getText());
					
					if(num0==secret[0]){
						white++;
					}
					if(num1==secret[1]){
						white++;
					}
					if(num2==secret[2]){
						white++;
					}
					if(num3==secret[3]){
						white++;
					}
					
					if(num0==secret[1] || num0==secret[2] || num0==secret[3]){
						black++;
					}
					if(num1==secret[0] || num1==secret[2] || num1==secret[3]){
						black++;
					}
					if(num2==secret[1] || num2==secret[0] || num2==secret[3]){
						black++;
					}
					if(num3==secret[1] || num3==secret[2] || num3==secret[0]){
						black++;
					}
					if(white<4 && black<4){
						textFieldWhite.setText(Integer.toString(white));
						textFieldBlack.setText(Integer.toString(black));
					}
					
					if(white==4){
						JOptionPane.showMessageDialog(null, "Whoa! You win!!");
						
					}
					
					if(white==3){
						JOptionPane.showMessageDialog(null, "You have " + white + " whites! Keep trying, you're almost there!");
					}
					
					if(black==4 || black==3){
						JOptionPane.showMessageDialog(null, "You have " + black + "blacks! Keep trying, you're almost there!");
						
					}
					
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, "Please enter valid number between 0 to 9!");
				}
			
				
			}
		});
		btnCheck.setBounds(30, 214, 111, 23);
		frame.getContentPane().add(btnCheck);
		
		textField1 = new JTextField();
		textField1.setBounds(126, 161, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(222, 161, 86, 20);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		textField3 = new JTextField();
		textField3.setBounds(318, 161, 86, 20);
		frame.getContentPane().add(textField3);
		textField3.setColumns(10);
		
		textFieldWhite = new JTextField();
		textFieldWhite.setBounds(288, 199, 86, 20);
		frame.getContentPane().add(textFieldWhite);
		textFieldWhite.setColumns(10);
		
		textFieldBlack = new JTextField();
		textFieldBlack.setBounds(288, 230, 86, 20);
		frame.getContentPane().add(textFieldBlack);
		textFieldBlack.setColumns(10);
		
		JLabel lblWhites = new JLabel("WHITES:");
		lblWhites.setFont(new Font("Papyrus", Font.BOLD, 10));
		lblWhites.setBounds(171, 204, 96, 17);
		frame.getContentPane().add(lblWhites);
		
		JLabel lblBlacks = new JLabel("BLACKS:");
		lblBlacks.setFont(new Font("Papyrus", Font.BOLD, 10));
		lblBlacks.setBounds(171, 232, 96, 19);
		frame.getContentPane().add(lblBlacks);
		
		JLabel lblHeyThereWelcome = new JLabel("WELCOME TO MASTERMIND!");
		lblHeyThereWelcome.setForeground(Color.BLACK);
		lblHeyThereWelcome.setBackground(Color.LIGHT_GRAY);
		lblHeyThereWelcome.setFont(new Font("Papyrus", Font.BOLD, 10));
		lblHeyThereWelcome.setBounds(97, 11, 266, 26);
		frame.getContentPane().add(lblHeyThereWelcome);
		
		btnRules = new JButton("HOW TO PLAY?");
		btnRules.setForeground(Color.WHITE);
		btnRules.setBackground(Color.BLACK);
		btnRules.setFont(new Font("Papyrus", Font.BOLD, 10));
		btnRules.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "This is a number guessing game.\nWe have a secret code for you.\nYou've got to discover this code by typing in your guesses (a number from 0-9) into each of the four spaces.\nWhites indicate the correct guesses.\nBlacks mean the number is right but it's location is wrong.\nFor eg, if you have 1 white and 3 blacks it means one of your guesses is completely right while 3 others are incorrectly placed.", "HOW TO PLAY?", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnRules.setBounds(116, 59, 192, 20);
		frame.getContentPane().add(btnRules);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(206, 90, 6, 20);
		frame.getContentPane().add(passwordField);
	}
}
