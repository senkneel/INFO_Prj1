/* VERSION DAY4
 * -SOLL DIE FRONT SEIN
 * -AUTHOR = LEONARD
 * -Backbone wurde in T1 aufgelöst
 * 
 */
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
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JProgressBar;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JSpinner;

public class T1 {

	private JFrame frmBlackwaterResortReservation;
	private JTextField textField_End;
	private JTextField textField_Start;
	private JTextField textField_Person;
	public JTextArea text_out;
	public JTextArea text_knr;
	int[][] Buchungen = new int[11][5];;
	int nr=0;
	Random random;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					T1 window = new T1();
					window.frmBlackwaterResortReservation.setVisible(true);
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
		
		random = new Random();
		
		frmBlackwaterResortReservation = new JFrame();
		frmBlackwaterResortReservation.setTitle("Blackwater Resort Reservation Tool");
		frmBlackwaterResortReservation.getContentPane().setBackground(Color.WHITE);
		
		JLayeredPane layeredPane = new JLayeredPane();
		frmBlackwaterResortReservation.getContentPane().add(layeredPane, BorderLayout.CENTER);
		
		JLabel lblTheFlyingDuchman = new JLabel("Blackwater Resort Reservation");
		lblTheFlyingDuchman.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 30));
		lblTheFlyingDuchman.setBounds(10, 11, 471, 40);
		layeredPane.add(lblTheFlyingDuchman);
		
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
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBackground(Color.CYAN);
		progressBar.setForeground(Color.CYAN);
		progressBar.setBounds(0, 499, 780, 14);
		layeredPane.add(progressBar);
		
		JLabel lblAvailableBungalos = new JLabel("Select Bungalo:");
		lblAvailableBungalos.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblAvailableBungalos.setBounds(10, 224, 160, 40);

		
		JLabel lblAnzahlPersonen = new JLabel("Anzahl Personen:");
		lblAnzahlPersonen.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblAnzahlPersonen.setBounds(370, 80, 160, 40);
		layeredPane.add(lblAnzahlPersonen);
		
		textField_Person = new JTextField();
		textField_Person.setColumns(10);
		textField_Person.setBounds(540, 80, 180, 40);
		layeredPane.add(textField_Person);
		
		//TEXTPANES
		JTextPane textPane_B1 = new JTextPane();
		textPane_B1.setBackground(new Color(0, 255, 127));
		textPane_B1.setText("1");
		textPane_B1.setBounds(180, 224, 100, 40);
		
		JTextPane textPane_B2 = new JTextPane();
		textPane_B2.setBackground(new Color(0, 255, 127));
		textPane_B2.setText("2");
		textPane_B2.setBounds(180, 293, 100, 40);

		JTextPane textPane_B6 = new JTextPane();
		textPane_B6.setBackground(new Color(0, 255, 127));
		textPane_B6.setText("6");
		textPane_B6.setBounds(400, 293, 100, 40);
		
		JTextPane textPane_B7 = new JTextPane();
		textPane_B7.setText("7");
		textPane_B7.setBackground(new Color(0, 255, 127));
		textPane_B7.setBounds(510, 224, 100, 40);
		
		JTextPane textPane_B4 = new JTextPane();
		textPane_B4.setText("4");
		textPane_B4.setBackground(new Color(0, 255, 127));
		textPane_B4.setBounds(290, 293, 100, 40);

		JTextPane textPane_B5 = new JTextPane();
		textPane_B5.setText("5");
		textPane_B5.setBackground(new Color(0, 255, 127));
		textPane_B5.setBounds(400, 224, 100, 40);

		JTextPane textPane_B9 = new JTextPane();
		textPane_B9.setText("9");
		textPane_B9.setBackground(new Color(0, 255, 127));
		textPane_B9.setBounds(620, 224, 100, 40);
		
		JTextPane textPane_B10 = new JTextPane();
		textPane_B10.setText("10");
		textPane_B10.setBackground(new Color(0, 255, 127));
		textPane_B10.setBounds(620, 293, 100, 40);
		
		JTextPane textPane_B3 = new JTextPane();
		textPane_B3.setText("3");
		textPane_B3.setBackground(new Color(0, 255, 127));
		textPane_B3.setBounds(290, 224, 100, 40);
		
		JTextPane textPane_B8 = new JTextPane();
		textPane_B8.setText("8");
		textPane_B8.setBackground(new Color(0, 255, 127));
		textPane_B8.setBounds(510, 293, 100, 40);
		
		
		//SELECTORS
		JRadioButton rdbtn_p1 = new JRadioButton("2 Persons");
		rdbtn_p1.setBounds(180, 264, 100, 23);
		
		JRadioButton rdbtn_p4 = new JRadioButton("4 Persons");
		rdbtn_p4.setBounds(290, 333, 100, 23);
		
		JRadioButton rdbtn_p10 = new JRadioButton("10 Persons");
		rdbtn_p10.setBounds(620, 333, 100, 23);
		
		JRadioButton rdbtn_p7 = new JRadioButton("8 Persons");
		rdbtn_p7.setBounds(510, 264, 100, 23);
		
		JRadioButton rdbtn_p9 = new JRadioButton("10 Persons");
		rdbtn_p9.setBounds(620, 264, 100, 23);
		
		JRadioButton rdbtn_p8 = new JRadioButton("8 Persons");
		rdbtn_p8.setBounds(510, 333, 100, 23);
		
		JRadioButton rdbtn_p6 = new JRadioButton("6 Persons");
		rdbtn_p6.setBounds(400, 333, 100, 23);
		
		JRadioButton rdbtn_p2 = new JRadioButton("2 Persons");
		rdbtn_p2.setBounds(180, 333, 100, 23);
		
		JRadioButton rdbtn_p3 = new JRadioButton("4 Persons");
		rdbtn_p3.setBounds(290, 264, 100, 23);
		
		JRadioButton rdbtn_p5 = new JRadioButton("6 Persons");
		rdbtn_p5.setBounds(400, 264, 100, 23);

		
		//BUTTONS
		JButton btnReserve = new JButton("Reserve Bungalow");
		btnReserve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				reserve(1,Integer.parseInt(textField_Start.getText()),Integer.parseInt(textField_End.getText()),Integer.parseInt(textField_Person.getText()));
				
			}
		});
		
		layeredPane.add(lblAvailableBungalos);
		
		layeredPane.add(textPane_B1);
		layeredPane.add(textPane_B2);
		layeredPane.add(textPane_B3);
		layeredPane.add(textPane_B4);
		layeredPane.add(textPane_B5);
		layeredPane.add(textPane_B6);
		layeredPane.add(textPane_B7);
		layeredPane.add(textPane_B8);
		layeredPane.add(textPane_B9);
		layeredPane.add(textPane_B10);
		
		layeredPane.add(rdbtn_p1);
		layeredPane.add(rdbtn_p2);
		layeredPane.add(rdbtn_p3);
		layeredPane.add(rdbtn_p4);
		layeredPane.add(rdbtn_p5);
		layeredPane.add(rdbtn_p6);
		layeredPane.add(rdbtn_p7);
		layeredPane.add(rdbtn_p8);
		layeredPane.add(rdbtn_p9);
		layeredPane.add(rdbtn_p10);
		
		layeredPane.add(btnReserve);
		
		btnReserve.setFont(new Font("Dialog", Font.ITALIC, 15));
		btnReserve.setBackground(Color.WHITE);
		btnReserve.setBounds(180, 362, 210, 40);
		
		JButton btnBrowse = new JButton("Browse Bungalows");
		btnBrowse.setFont(new Font("Century Gothic", Font.ITALIC, 15));
		btnBrowse.setBackground(Color.WHITE);
		btnBrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				layeredPane.add(lblAvailableBungalos);
				
				layeredPane.add(textPane_B1);
				layeredPane.add(textPane_B2);
				layeredPane.add(textPane_B3);
				layeredPane.add(textPane_B4);
				layeredPane.add(textPane_B5);
				layeredPane.add(textPane_B6);
				layeredPane.add(textPane_B7);
				layeredPane.add(textPane_B8);
				layeredPane.add(textPane_B9);
				layeredPane.add(textPane_B10);
				
				layeredPane.add(rdbtn_p1);
				layeredPane.add(rdbtn_p2);
				layeredPane.add(rdbtn_p3);
				layeredPane.add(rdbtn_p4);
				layeredPane.add(rdbtn_p5);
				layeredPane.add(rdbtn_p6);
				layeredPane.add(rdbtn_p7);
				layeredPane.add(rdbtn_p8);
				layeredPane.add(rdbtn_p9);
				layeredPane.add(rdbtn_p10);
				
				layeredPane.add(btnReserve);
			}
		});
		btnBrowse.setBounds(540, 130, 180, 40);
		layeredPane.add(btnBrowse);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(780, 0, 5, 510);
		layeredPane.add(separator);
		
		text_out = new JTextArea();
		text_out.setEditable(false);
		text_out.setBounds(790, 224, 286, 279);
		layeredPane.add(text_out);
		
		JLabel lblBungalo = new JLabel("Bungalo:");
		lblBungalo.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblBungalo.setBounds(795, 80, 75, 40);
		layeredPane.add(lblBungalo);
		
		JLabel lblCheck = new JLabel("Check Reservation");
		lblCheck.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 30));
		lblCheck.setBounds(795, 11, 471, 40);
		layeredPane.add(lblCheck);
		
		JComboBox combo_select = new JComboBox();
		combo_select.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		combo_select.setBounds(880, 80, 60, 40);
		layeredPane.add(combo_select);
		
		JButton btnCheck = new JButton("Check Bungalo");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check();
			}
		});
		
		btnCheck.setFont(new Font("Dialog", Font.ITALIC, 15));
		btnCheck.setBackground(Color.WHITE);
		btnCheck.setBounds(795, 130, 180, 40);
		layeredPane.add(btnCheck);
		
		JLabel lblknr = new JLabel("Ihre Kundenummer:");
		lblknr.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblknr.setBounds(10, 449, 160, 40);
		layeredPane.add(lblknr);
		
		text_knr = new JTextArea();
		text_knr.setFont(new Font("Bahnschrift", Font.BOLD | Font.ITALIC, 20));
		text_knr.setEditable(false);
		text_knr.setBounds(180, 458, 590, 40);
		layeredPane.add(text_knr);

		frmBlackwaterResortReservation.setBounds(100, 100, 1100, 550);
		frmBlackwaterResortReservation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void reserve(int bnr, int start, int end, int pers) {
		

		if (Integer.parseInt(textField_Start.getText()) <= 1 || Integer.parseInt(textField_Start.getText()) >= 52) {
			text_knr.setText("Fehler bei Eingabe der Startwoche! [1-52]"); textField_Start.setText(null);
		}

		else if (Integer.parseInt(textField_End.getText()) <= 1 || Integer.parseInt(textField_End.getText()) >= 52) {
			text_knr.setText("Fehler bei Eingabe der Endwoche! [1-52]"); textField_End.setText(null);
		}
		
		else if (Integer.parseInt(textField_End.getText()) < Integer.parseInt(textField_Start.getText())) {
			text_knr.setText("Endwoche kann nicht vor der Startwoche sein! [SW<EW]"); textField_End.setText(null);
		}
		
		else if (Integer.parseInt(textField_Person.getText()) <= 0 || Integer.parseInt(textField_Person.getText()) > 10) {
			text_knr.setText("Fehler bei Eingabe der Anzahl von Personen! [1-10]"); textField_Person.setText(null);
		}
		
		else {
		for (int i = 0; i < nr+1; i++) {
			 if(Buchungen[i][0]== bnr) {
				 if(start >= Buchungen[i][1] && start <= Buchungen[i][2] || end >= Buchungen[i][1] && end <= Buchungen[i][2]) {
					 
					 text_knr.setText("Dieses Bungalow für ausgwählten Zeitraum schon besetzt.");
					 textField_Start.setText(null);
					 textField_End.setText(null);
					 
				 }
				 else {
					 
					 	int knr;
						knr = random.nextInt(9999);
						 
						Buchungen[nr][0] = bnr;
						Buchungen[nr][1] = start;
						Buchungen[nr][2] = end;
						Buchungen[nr][3] = pers;
						Buchungen[nr][4] = knr;
						
						text_knr.setText("" + Buchungen[nr][4]);
						
						textField_Start.setText(null);
						textField_End.setText(null);
						textField_Person.setText(null);
				 }
			 }
			 
			 else {
				 
				 int knr;
				 knr = random.nextInt(9999);
				 
				 Buchungen[nr][0] = bnr;
				 Buchungen[nr][1] = start;
				 Buchungen[nr][2] = end;
				 Buchungen[nr][3] = pers;
				 Buchungen[nr][4] = knr;
				 
				 text_knr.setText(""+Buchungen[nr][4]);
				 
				 textField_Start.setText(null);
				 textField_End.setText(null);
				 textField_Person.setText(null);
			 }
			 
			}
	
	}}
	
	public void check() {
		
	text_out.setText("Bungalo Nr." + Buchungen[0][0] + "\n"
			+ "Startwoche: " + Buchungen[0][1] + "\n"
			+ "Endwoche: " + Buchungen[0][2] + "\n"
			+ "Anzahl Personen: " + Buchungen[0][3] + "\n"
			+ "Kundennummer: " + Buchungen[0][4]);
	
		
		
	}
}
