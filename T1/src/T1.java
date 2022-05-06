import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLayeredPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JProgressBar;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;

public class T1 {

	private JFrame frame;
	private JTextField textField_End;
	private JTextField textField_Start;
	private JTextField textField_Person;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					T1 window = new T1();
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
	public T1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		
		JLayeredPane layeredPane = new JLayeredPane();
		frame.getContentPane().add(layeredPane, BorderLayout.CENTER);
		
		JLabel lblStartWoche = new JLabel("Start-Woche:");
		lblStartWoche.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblStartWoche.setBounds(10, 80, 160, 40);
		layeredPane.add(lblStartWoche);
		
		JLabel lblEndWoche = new JLabel("End-Woche:");
		lblEndWoche.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblEndWoche.setBounds(10, 130, 160, 40);
		layeredPane.add(lblEndWoche);
		
		textField_End = new JTextField();
		textField_End.setColumns(10);
		textField_End.setBounds(180, 130, 180, 40);
		layeredPane.add(textField_End);
		
		textField_Start = new JTextField();
		textField_Start.setColumns(10);
		textField_Start.setBounds(180, 80, 180, 40);
		layeredPane.add(textField_Start);
		
		JLabel lblTheFlyingDuchman = new JLabel("Blackwater Resort");
		lblTheFlyingDuchman.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 30));
		lblTheFlyingDuchman.setBounds(10, 11, 471, 40);
		layeredPane.add(lblTheFlyingDuchman);
		
		JButton btnNewButton = new JButton("Browse Bungalows");
		btnNewButton.setFont(new Font("Century Gothic", Font.ITALIC, 15));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(540, 130, 180, 40);
		layeredPane.add(btnNewButton);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBackground(Color.CYAN);
		progressBar.setForeground(Color.CYAN);
		progressBar.setBounds(0, 497, 784, 14);
		layeredPane.add(progressBar);
		
		JLabel lblAvailableBungalos = new JLabel("Select Bungalo:");
		lblAvailableBungalos.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblAvailableBungalos.setBounds(10, 224, 160, 40);
		layeredPane.add(lblAvailableBungalos);
		
		JLabel lblAnzahlPersonen = new JLabel("Anzahl Personen:");
		lblAnzahlPersonen.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblAnzahlPersonen.setBounds(370, 80, 160, 40);
		layeredPane.add(lblAnzahlPersonen);
		
		textField_Person = new JTextField();
		textField_Person.setColumns(10);
		textField_Person.setBounds(540, 80, 180, 40);
		layeredPane.add(textField_Person);
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(new Color(0, 255, 127));
		textPane.setText("1");
		textPane.setBounds(180, 224, 100, 40);
		layeredPane.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBackground(new Color(0, 255, 127));
		textPane_1.setText("2");
		textPane_1.setBounds(290, 224, 100, 40);
		layeredPane.add(textPane_1);
		
		JTextPane textPane_1_1 = new JTextPane();
		textPane_1_1.setBackground(new Color(0, 255, 127));
		textPane_1_1.setText("6");
		textPane_1_1.setBounds(180, 320, 80, 40);
		layeredPane.add(textPane_1_1);
		
		JTextPane textPane_1_1_1 = new JTextPane();
		textPane_1_1_1.setText("7");
		textPane_1_1_1.setBackground(new Color(0, 255, 127));
		textPane_1_1_1.setBounds(280, 320, 80, 40);
		layeredPane.add(textPane_1_1_1);
		
		JTextPane textPane_1_1_1_1 = new JTextPane();
		textPane_1_1_1_1.setText("4");
		textPane_1_1_1_1.setBackground(new Color(0, 255, 127));
		textPane_1_1_1_1.setBounds(510, 224, 100, 40);
		layeredPane.add(textPane_1_1_1_1);
		
		JTextPane textPane_1_1_1_2 = new JTextPane();
		textPane_1_1_1_2.setText("5");
		textPane_1_1_1_2.setBackground(new Color(0, 255, 127));
		textPane_1_1_1_2.setBounds(620, 224, 100, 40);
		layeredPane.add(textPane_1_1_1_2);
		
		JTextPane textPane_1_1_1_3 = new JTextPane();
		textPane_1_1_1_3.setText("9");
		textPane_1_1_1_3.setBackground(new Color(0, 255, 127));
		textPane_1_1_1_3.setBounds(540, 320, 80, 40);
		layeredPane.add(textPane_1_1_1_3);
		
		JTextPane textPane_1_1_1_4 = new JTextPane();
		textPane_1_1_1_4.setText("10");
		textPane_1_1_1_4.setBackground(new Color(0, 255, 127));
		textPane_1_1_1_4.setBounds(640, 320, 80, 40);
		layeredPane.add(textPane_1_1_1_4);
		
		JTextPane textPane_1_1_1_5 = new JTextPane();
		textPane_1_1_1_5.setText("3");
		textPane_1_1_1_5.setBackground(new Color(0, 255, 127));
		textPane_1_1_1_5.setBounds(400, 224, 100, 40);
		layeredPane.add(textPane_1_1_1_5);
		
		JTextPane textPane_1_1_1_5_1 = new JTextPane();
		textPane_1_1_1_5_1.setText("8");
		textPane_1_1_1_5_1.setBackground(new Color(0, 255, 127));
		textPane_1_1_1_5_1.setBounds(370, 320, 160, 40);
		layeredPane.add(textPane_1_1_1_5_1);
		
		JRadioButton rdbtnPersons = new JRadioButton("2 Persons");
		rdbtnPersons.setBounds(180, 264, 100, 23);
		layeredPane.add(rdbtnPersons);
		
		JRadioButton rdbtnPersons_1 = new JRadioButton("4 Persons");
		rdbtnPersons_1.setBounds(290, 264, 100, 23);
		layeredPane.add(rdbtnPersons_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("10 Persons");
		rdbtnNewRadioButton.setBounds(400, 264, 100, 23);
		layeredPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnpersons = new JRadioButton("6 Persons");
		rdbtnpersons.setBounds(510, 264, 100, 23);
		layeredPane.add(rdbtnpersons);
		
		JRadioButton rdbtnPersons_2 = new JRadioButton("8 Persons");
		rdbtnPersons_2.setBounds(620, 264, 100, 23);
		layeredPane.add(rdbtnPersons_2);
		frame.setBounds(100, 100, 800, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
