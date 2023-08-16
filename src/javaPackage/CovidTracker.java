package javaPackage;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class CovidTracker {

	 JFrame frame;
	public static JTextField textField;
	public static JTextField textField_1;
	public static JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	public static JTextField textField_6;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CovidTracker window = new CovidTracker();
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
	public CovidTracker() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	public void initialize() {
		frame = new JFrame();
		frame.setSize(1000,700);
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 199, 792);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
				
		JLabel lblNewLabel_6 = new JLabel();
		lblNewLabel_6.setBounds(0, 10, 189, 163);
		panel.add(lblNewLabel_6);
				
		ImageIcon imageIcon = new ImageIcon(CovidTracker.class.getResource("/javaPackage/covid19icon.png")); // load the image to a imageIcon
		Image image = imageIcon.getImage(); // transform it 
		Image newimg = image.getScaledInstance(200, 200,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		imageIcon = new ImageIcon(newimg);  // transform it back
		lblNewLabel_6.setIcon(imageIcon);
		
		JLabel lblNewLabel_7 = new JLabel("Copyright \u00A9 2021 G2");
		lblNewLabel_7.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_7.setBounds(29, 609, 121, 13);
		panel.add(lblNewLabel_7);
			
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(204, 0, 51));
		panel_1.setBackground(new Color(204, 255, 255));
		panel_1.setBounds(197, 0, 810, 792);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 847, 107);
		panel_2.setBackground(Color.CYAN);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("COVID-19 CONTACT TRACING");
		lblNewLabel.setForeground(new Color(0, 100, 0));
		lblNewLabel.setFont(new Font("DialogInput", Font.BOLD, 29));
		lblNewLabel.setBounds(128, 37, 442, 27);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_8 = new JLabel();
		lblNewLabel_8.setBounds(527, 10, 120, 97);
		panel_2.add(lblNewLabel_8);
			
		ImageIcon imageIcon2 = new ImageIcon(CovidTracker.class.getResource("/javaPackage/contact-removebg-preview.png")); // load the image to a imageIcon
		Image image2 = imageIcon2.getImage(); // transform it 
		Image newimg2 = image2.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		imageIcon2 = new ImageIcon(newimg2);  // transform it back
		lblNewLabel_8.setIcon(imageIcon2);
		
		JLabel lblNewLabel_1 = new JLabel("Please fill out the form");
		lblNewLabel_1.setForeground(new Color(139, 69, 19));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.ITALIC, 13));
		lblNewLabel_1.setBounds(10, 117, 138, 13);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2.setBounds(41, 169, 50, 26);
		panel_1.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBackground(new Color(224, 255, 255));
		textField.setBounds(41, 212, 261, 32);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setBackground(new Color(224, 255, 255));
		textField_1.setColumns(10);
		textField_1.setBounds(333, 212, 232, 32);
		panel_1.add(textField_1);
		
		JLabel lblNewLabel_3 = new JLabel("First name");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(41, 254, 60, 13);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Last Name");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3_1.setBounds(333, 254, 60, 13);
		panel_1.add(lblNewLabel_3_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_2.setBackground(new Color(224, 255, 255));
		textField_2.setBounds(602, 212, 60, 32);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("M.I");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(602, 255, 45, 13);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_2_1 = new JLabel("Address");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2_1.setBounds(41, 298, 84, 26);
		panel_1.add(lblNewLabel_2_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(224, 255, 255));
		textField_3.setBounds(41, 334, 621, 32);
		panel_1.add(textField_3);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Contact #");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2_1_1.setBounds(41, 417, 84, 26);
		panel_1.add(lblNewLabel_2_1_1);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(224, 255, 255));
		textField_4.setBounds(41, 460, 621, 32);
		panel_1.add(textField_4);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Age");
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2_1_1_1.setBounds(41, 531, 50, 26);
		panel_1.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("House # / Barangay / Municipality ");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3_2.setBounds(41, 376, 188, 13);
		panel_1.add(lblNewLabel_3_2);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_5.setColumns(10);
		textField_5.setBackground(new Color(224, 255, 255));
		textField_5.setBounds(83, 531, 50, 32);
		panel_1.add(textField_5);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Temperature");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_2_1_1_1_1.setBounds(41, 594, 130, 26);
		panel_1.add(lblNewLabel_2_1_1_1_1);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_6.setColumns(10);
		textField_6.setBackground(new Color(224, 255, 255));
		textField_6.setBounds(163, 594, 50, 32);
		panel_1.add(textField_6);
		
		JLabel lblNewLabel_5 = new JLabel("\u00B0C");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(217, 603, 30, 13);
		panel_1.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Continue");		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				
				String [] formValues = {
					textField.getText(),
					textField_1.getText(),
					textField_2.getText(),
					textField_3.getText(),
					textField_4.getText(),
					textField_5.getText(),
					textField_6.getText(),
				};
				
				for (int i = 0; i < formValues.length; i++) {
					if (formValues[i].equals("")) {
						JOptionPane.showMessageDialog(frame, "Please complete the form !!", "NOTICE", JOptionPane.WARNING_MESSAGE);	
						return;
					}
				}
	
				SecondPage sp = new SecondPage();							
				sp.setVisible(true);
				frame.dispose();			
				SecondPage.textField.setText(CovidTracker.textField.getText() + " " + CovidTracker.textField_2.getText() + " " + CovidTracker.textField_1.getText());
				SecondPage.textField_1.setText(" " + CovidTracker.textField_6.getText() + "°C");
			}
		});
		
		btnNewButton.setForeground(new Color(250, 128, 114));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBackground(new Color(238, 232, 170));
		btnNewButton.setBounds(602, 593, 113, 32);
		btnNewButton.setFocusable(false);
		panel_1.add(btnNewButton);
		
		JButton btnClearForm = new JButton("Clear form");
		btnClearForm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
			}
		});
		btnClearForm.setForeground(new Color(250, 128, 114));
		btnClearForm.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClearForm.setFocusable(false);
		btnClearForm.setBackground(new Color(238, 232, 170));
		btnClearForm.setBounds(467, 594, 113, 32);
		panel_1.add(btnClearForm);
		
		frame.setTitle("Covid-19 Form");		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
}

