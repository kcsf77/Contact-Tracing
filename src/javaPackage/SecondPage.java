package javaPackage;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.imageio.ImageIO;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.EnumMap;
import java.util.Map;
import java.awt.event.ActionEvent;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;





public class SecondPage extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static JTextField textField;
	public static JTextField textField_1;
	public static String identifier;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SecondPage frame = new SecondPage();
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
	public SecondPage() {
		setTitle("Analysis");
		getContentPane().setBackground(Color.DARK_GRAY);
		setBackground(new Color(0, 0, 255));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000,700);
		setResizable(false);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 255, 255));
		panel.setBounds(122, 34, 851, 605);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HEALTH DECLARATION");
		lblNewLabel.setForeground(new Color(0, 0, 102));
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 19));
		lblNewLabel.setBounds(328, 10, 206, 49);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Answer the following statements briefly");
		lblNewLabel_1.setFont(new Font("Dialog", Font.ITALIC, 15));
		lblNewLabel_1.setBounds(51, 120, 292, 42);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textField.setEditable(false);
		textField.setBounds(50, 65, 293, 32);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textField_1.setEditable(false);
		
		textField_1.setBounds(421, 68, 58, 32);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Traveled outside the country");
		chckbxNewCheckBox.setBackground(SystemColor.info);
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxNewCheckBox.setBounds(445, 184, 257, 32);
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxCloseContactWith = new JCheckBox("Close Contact with Covid-19 positive");
		chckbxCloseContactWith.setBackground(SystemColor.info);
		chckbxCloseContactWith.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxCloseContactWith.setBounds(44, 184, 326, 32);
		panel.add(chckbxCloseContactWith);
		
		JLabel lblNewLabel_2 = new JLabel("COVID-19 SYMPTOMS");
		lblNewLabel_2.setForeground(SystemColor.desktop);
		lblNewLabel_2.setFont(new Font("Microsoft YaHei Light", Font.BOLD, 17));
		lblNewLabel_2.setBackground(SystemColor.scrollbar);
		lblNewLabel_2.setBounds(44, 269, 188, 25);
		panel.add(lblNewLabel_2);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Fever");
		chckbxNewCheckBox_1.setBackground(SystemColor.info);
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxNewCheckBox_1.setBounds(45, 347, 180, 21);
		panel.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("Chest Pain");
		chckbxNewCheckBox_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxNewCheckBox_1_1.setBackground(SystemColor.info);
		chckbxNewCheckBox_1_1.setBounds(45, 398, 180, 21);
		panel.add(chckbxNewCheckBox_1_1);
		
		JCheckBox chckbxNewCheckBox_1_1_1 = new JCheckBox("Dry Cough");
		chckbxNewCheckBox_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxNewCheckBox_1_1_1.setBackground(SystemColor.info);
		chckbxNewCheckBox_1_1_1.setBounds(44, 452, 180, 21);
		panel.add(chckbxNewCheckBox_1_1_1);
		
		JCheckBox chckbxNewCheckBox_1_1_2 = new JCheckBox("Difficulty Breathing");
		chckbxNewCheckBox_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxNewCheckBox_1_1_2.setBackground(SystemColor.info);
		chckbxNewCheckBox_1_1_2.setBounds(45, 501, 180, 21);
		panel.add(chckbxNewCheckBox_1_1_2);
		
		JCheckBox chckbxNewCheckBox_1_1_3 = new JCheckBox("Head Ache");
		chckbxNewCheckBox_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxNewCheckBox_1_1_3.setBackground(SystemColor.info);
		chckbxNewCheckBox_1_1_3.setBounds(264, 349, 180, 21);
		panel.add(chckbxNewCheckBox_1_1_3);
		
		JCheckBox chckbxNewCheckBox_1_1_4 = new JCheckBox("Loss of Speech");
		chckbxNewCheckBox_1_1_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxNewCheckBox_1_1_4.setBackground(SystemColor.info);
		chckbxNewCheckBox_1_1_4.setBounds(264, 400, 180, 21);
		panel.add(chckbxNewCheckBox_1_1_4);
		
		JCheckBox chckbxNewCheckBox_1_1_5 = new JCheckBox("Fatigue");
		chckbxNewCheckBox_1_1_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxNewCheckBox_1_1_5.setBackground(SystemColor.info);
		chckbxNewCheckBox_1_1_5.setBounds(264, 452, 180, 21);
		panel.add(chckbxNewCheckBox_1_1_5);
		
		JCheckBox chckbxNewCheckBox_1_1_6 = new JCheckBox("Sore Throat");
		chckbxNewCheckBox_1_1_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxNewCheckBox_1_1_6.setBackground(SystemColor.info);
		chckbxNewCheckBox_1_1_6.setBounds(264, 503, 180, 21);
		panel.add(chckbxNewCheckBox_1_1_6);
		
		
		JCheckBox [] symptoms = new JCheckBox[8];
		
		symptoms[0] = chckbxNewCheckBox_1;
		symptoms[1] = chckbxNewCheckBox_1_1;
		symptoms[2] = chckbxNewCheckBox_1_1_1;
		symptoms[3] = chckbxNewCheckBox_1_1_2;
		symptoms[4] = chckbxNewCheckBox_1_1_3;
		symptoms[5] = chckbxNewCheckBox_1_1_4;
		symptoms[6] = chckbxNewCheckBox_1_1_5;
		symptoms[7] = chckbxNewCheckBox_1_1_6;
		
		for(int i = 0; i < 8; i++) {
			symptoms[i].setFocusable(false);
			
			}
		chckbxNewCheckBox.setFocusable(false);
		chckbxCloseContactWith.setFocusable(false);
			
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(617, 10, 224, 140);
		panel.add(lblNewLabel_3);		
		ImageIcon imageIcon = new ImageIcon(CovidTracker.class.getResource("/javaPackage/covid-removebg-preview.png")); // load the image to a imageIcon
		Image image = imageIcon.getImage(); // transform it 
		Image newimg = image.getScaledInstance(250, 250,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		imageIcon = new ImageIcon(newimg);  // transform it back
		lblNewLabel_3.setIcon(imageIcon);
		
		JLabel lblQrIcon = new JLabel("");
		lblQrIcon.setBounds(592, 301, 200, 200);
		panel.add(lblQrIcon);
		
		JButton btnGenerateQrcode = new JButton("GENERATE QRCODE");
		btnGenerateQrcode.setVisible(false);
		btnGenerateQrcode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fileName = textField.getText().toLowerCase().replace(' ', '-') + textField_1.getText().toLowerCase().replace(' ', '-');
		        String filePath = "C:\\Users\\Hi\\Downloads\\%s.png".formatted(fileName);
		        int size = 200;
		        String fileType = "png";
		        File qrFile = new File(filePath);
				try {
		            Map<EncodeHintType, Object> hintType = new EnumMap<EncodeHintType, Object>(EncodeHintType.class);
		            hintType.put(EncodeHintType.CHARACTER_SET, "UTF-8");
		 		        
		            hintType.put(EncodeHintType.MARGIN, 1); 
		            hintType.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
		 
		            QRCodeWriter mYQRCodeWriter = new QRCodeWriter(); // throws com.google.zxing.WriterException
		            BitMatrix bitMatrix = mYQRCodeWriter.encode(textField.getText() + "\n" + textField_1.getText() + "\n" + SecondPage.identifier, BarcodeFormat.QR_CODE, size,
		                    size, hintType);
		            int qrWidth = bitMatrix.getWidth();
		       
		            BufferedImage bufferedImage = new BufferedImage(qrWidth, qrWidth,
		            BufferedImage.TYPE_INT_RGB);
		            bufferedImage.createGraphics();
		 
		            Graphics2D graphics = (Graphics2D) bufferedImage.getGraphics();
		            graphics.setColor(Color.white);		           
		            graphics.fillRect(0, 0, qrWidth, qrWidth);
		            graphics.setColor(Color.BLACK);
		 
		            for (int i = 0; i < qrWidth; i++) {
		                for (int j = 0; j < qrWidth; j++) {
		                    if (bitMatrix.get(i, j)) {
		                        graphics.fillRect(i, j, 1, 1);
		                    }
		                }
		            }		 
		            
		            ImageIO.write(bufferedImage, fileType, qrFile);		 
		            System.out.println("\nCongratulation.. You have successfully created QR Code.. \n" +
		                    "Check your code here: " + filePath);		            
		            ImageIcon icon = new ImageIcon(filePath);
		            lblQrIcon.setIcon(icon);		            
		            
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});
			
		btnGenerateQrcode.setForeground(new Color(0, 255, 0));
		btnGenerateQrcode.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGenerateQrcode.setFocusable(false);
		btnGenerateQrcode.setBackground(new Color(160, 82, 45));
		btnGenerateQrcode.setBounds(613, 262, 165, 32);
		panel.add(btnGenerateQrcode);	
		
		JButton btnFinish = new JButton("Finish");
		btnFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int counter1 = 0;
				int counter2 = 0;
									
				if(chckbxNewCheckBox.isSelected()){
					counter1++;
				}if(chckbxCloseContactWith.isSelected()){
					counter1++;
				}
								
				for(int i = 0; i < 8; i++ ) {
					if(symptoms[i].isSelected()) {
						counter2++;
					}					
				}
				if(counter1 > 0 && counter2 == 0) {
				JOptionPane.showMessageDialog(panel, "You need to self isolate for 14 days due to possible contact with a person tested positve with the virus", "NOTICE", JOptionPane.WARNING_MESSAGE);
				identifier = "Need to self isolate for 14 days due to possible contact with a person tested positve with the virus";
				}else if(counter2 >= 1 && counter2 <=3) {
				JOptionPane.showMessageDialog(panel, "You need to self isolate and get medical attention for possible symptoms of Covid-19", "NOTICE", JOptionPane.WARNING_MESSAGE);
				identifier ="Need to self isolate and get medical attention for possible symptoms of Covid-19";
				}else if(counter1 == 0 && counter2 == 0) {
				JOptionPane.showMessageDialog(panel, "You are cleared, always wear mask and have a nice day", "NOTICE", JOptionPane.WARNING_MESSAGE);
				identifier = "Cleared, always wear mask and have a nice day";
				}else if(counter1 >= 0 && counter2 > 3 ) {
				JOptionPane.showMessageDialog(panel, "You are on a serious condition, please get medical attention as fast as possible ", "NOTICE", JOptionPane.WARNING_MESSAGE);
				identifier = "On a serious condition, please get medical attention as fast as possible";
				}	
				
				btnGenerateQrcode.setVisible(true);
			}
		});
		btnFinish.setForeground(new Color(250, 128, 114));
		btnFinish.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnFinish.setFocusable(false);
		btnFinish.setBackground(new Color(238, 232, 170));
		btnFinish.setBounds(711, 531, 113, 32);
		panel.add(btnFinish);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chckbxNewCheckBox.setSelected(false);
				chckbxCloseContactWith.setSelected(false);
				
				for(int i = 0; i < 8; i++) {
				symptoms[i].setSelected(false); 								
				}				
			}
		});
		btnReset.setForeground(new Color(250, 128, 114));
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnReset.setFocusable(false);
		btnReset.setBackground(new Color(238, 232, 170));
		btnReset.setBounds(558, 531, 113, 32);
		panel.add(btnReset);
		
		JButton btnNewResponse = new JButton("NEW RESPONSE");
		btnNewResponse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CovidTracker ct = new CovidTracker();
				ct.frame.setVisible(true);
				dispose();
			}
		});
		btnNewResponse.setForeground(new Color(255, 250, 205));
		btnNewResponse.setFont(new Font("Century Schoolbook", Font.BOLD, 14));
		btnNewResponse.setFocusable(false);
		btnNewResponse.setBackground(new Color(205, 92, 92));
		btnNewResponse.setBounds(10, 10, 171, 32);
		panel.add(btnNewResponse);		
	}
}
