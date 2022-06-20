/* VERSION DAY10
 * -SOLL DIE FRONT SEIN
 * -AUTHOR: LEONARD
 * -Benötigte Extraklassen: Reservierung
 * -Backbone wurde in T1 aufgelöst
 * -TODO: SAVEN, EVT. JPANEL SWITCHEN!
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
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JProgressBar;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.JScrollBar;

public class T1 {

	private JFrame frmBlackwaterResortReservation; 
	private JTextField textField_End;
	private JTextField textField_Start;
	private JTextField textField_Person;
	public JTextArea text_out;
	public JTextArea text_knr;
	public JRadioButton rdbtn_p1;
	public JRadioButton rdbtn_p2;
	public JRadioButton rdbtn_p3;
	public JRadioButton rdbtn_p4;
	public JRadioButton rdbtn_p5;
	public JRadioButton rdbtn_p6;
	public JRadioButton rdbtn_p7;
	public JRadioButton rdbtn_p8;
	public JRadioButton rdbtn_p9;
	public JRadioButton rdbtn_p10;
	protected JComboBox combo_select;
	protected JComboBox combo_select_jahr;
	public ArrayList<Reservierung> reservierungen;
	int nr=0;
	int bnr=0;
	int knr=0;
	Random random;
	private JTextField textField_stonieren;

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
		
		//Random objekt
		random = new Random();
		
		//Arraylist mit den Daten
		reservierungen = new ArrayList<Reservierung>();
		
		
		//JFrame erzeugen
		frmBlackwaterResortReservation = new JFrame();
		frmBlackwaterResortReservation.setTitle("Blackwater Resort Reservation Tool");
		frmBlackwaterResortReservation.getContentPane().setBackground(Color.WHITE);
		
		
		//Haupt JPane erzeugen
		JLayeredPane layeredPane = new JLayeredPane();
		frmBlackwaterResortReservation.getContentPane().add(layeredPane, BorderLayout.CENTER);
		
		
		//Labels zur beschriftung erzeugen
		JLabel lblTheFlyingDuchman = new JLabel("Blackwater Resort Reservierung");
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
		
		JLabel lblAvailableBungalos = new JLabel("Bungalow Auswahl:");
		lblAvailableBungalos.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblAvailableBungalos.setBounds(10, 250, 160, 40);
		
		JLabel lblAnzahlPersonen = new JLabel("Anzahl Personen:");
		lblAnzahlPersonen.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblAnzahlPersonen.setBounds(370, 80, 160, 40);
		layeredPane.add(lblAnzahlPersonen);
		
		
		//Eingabefelder erzeugen
		textField_End = new JTextField();
		textField_End.setColumns(10);
		textField_End.setBounds(180, 130, 180, 40);
		layeredPane.add(textField_End);
		
		textField_Start = new JTextField();
		textField_Start.setColumns(10);
		textField_Start.setBounds(180, 80, 180, 40);
		layeredPane.add(textField_Start);
		
		textField_Person = new JTextField();
		textField_Person.setColumns(10);
		textField_Person.setBounds(540, 80, 180, 40);
		layeredPane.add(textField_Person);
		
		
		//Progressbar um fortschritt der reservierung zu zeigen (Not working)
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBackground(Color.CYAN);
		progressBar.setForeground(Color.CYAN);
		progressBar.setBounds(0, 499, 780, 14);
		layeredPane.add(progressBar);
		

		//Textpanes der Bungalows erzeugen
		JTextPane textPane_B1 = new JTextPane();
		textPane_B1.setText("1");
		textPane_B1.setBounds(180, 250, 100, 40);
		
		JTextPane textPane_B2 = new JTextPane();
		textPane_B2.setText("2");
		textPane_B2.setBounds(180, 319, 100, 40);

		JTextPane textPane_B6 = new JTextPane();
		textPane_B6.setText("6");
		textPane_B6.setBounds(400, 319, 100, 40);
		
		JTextPane textPane_B7 = new JTextPane();
		textPane_B7.setText("7");
		textPane_B7.setBounds(510, 250, 100, 40);
		
		JTextPane textPane_B4 = new JTextPane();
		textPane_B4.setText("4");
		textPane_B4.setBounds(290, 319, 100, 40);

		JTextPane textPane_B5 = new JTextPane();
		textPane_B5.setText("5");
		textPane_B5.setBounds(400, 250, 100, 40);

		JTextPane textPane_B9 = new JTextPane();
		textPane_B9.setText("9");
		textPane_B9.setBounds(620, 250, 100, 40);
		
		JTextPane textPane_B10 = new JTextPane();
		textPane_B10.setText("10");
		textPane_B10.setBounds(620, 319, 100, 40);
		
		JTextPane textPane_B3 = new JTextPane();
		textPane_B3.setText("3");
		textPane_B3.setBounds(290, 250, 100, 40);
		
		JTextPane textPane_B8 = new JTextPane();
		textPane_B8.setText("8");
		textPane_B8.setBounds(510, 319, 100, 40);
		
		
		//Buttons zum auswählen des Bungalows in einer ButtonGroup, sodass man nur ein auswählen kann
		ButtonGroup bg = new ButtonGroup();
		
		rdbtn_p1 = new JRadioButton("2 Personen");
		rdbtn_p1.setBounds(180, 290, 100, 23);
		
		rdbtn_p4 = new JRadioButton("4 Personen");
		rdbtn_p4.setBounds(290, 359, 100, 23);
		
		rdbtn_p10 = new JRadioButton("10 Personen");
		rdbtn_p10.setBounds(620, 359, 100, 23);
		
		rdbtn_p7 = new JRadioButton("8 Personen");
		rdbtn_p7.setBounds(510, 290, 100, 23);
		
		rdbtn_p9 = new JRadioButton("10 Personen");
		rdbtn_p9.setBounds(620, 290, 100, 23);
		
		rdbtn_p8 = new JRadioButton("8 Personen");
		rdbtn_p8.setBounds(510, 359, 100, 23);
		
		rdbtn_p6 = new JRadioButton("6 Personen");
		rdbtn_p6.setBounds(400, 359, 100, 23);
		
		rdbtn_p2 = new JRadioButton("2 Personen");
		rdbtn_p2.setBounds(180, 359, 100, 23);
		
		rdbtn_p3 = new JRadioButton("4 Personen");
		rdbtn_p3.setBounds(290, 290, 100, 23);
		
		rdbtn_p5 = new JRadioButton("6 Personen");
		rdbtn_p5.setBounds(400, 290, 100, 23);
		
		
		//Buttons der ButtonGroup hinzufügen
		bg.add(rdbtn_p1);
		bg.add(rdbtn_p2);
		bg.add(rdbtn_p3);
		bg.add(rdbtn_p4);
		bg.add(rdbtn_p5);
		bg.add(rdbtn_p6);
		bg.add(rdbtn_p7);
		bg.add(rdbtn_p8);
		bg.add(rdbtn_p9);
		bg.add(rdbtn_p10);
		
		
		

		
		//BUTTON zum reserviern eines Bungalows
		JButton btnReserve = new JButton("Reserviere Bungalow");
		btnReserve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				//Versuche die werte zu nutzen
				try {
					reserve(Integer.parseInt(textField_Start.getText()),Integer.parseInt(textField_End.getText()),Integer.parseInt(textField_Person.getText()));
					}
				
				//Fehlermeldung falls Text eingegeben wurde
				catch (NumberFormatException ex) {
					text_knr.setText("Bitte nur Nummern in der Eingabe benutzen!");
				}
				
				
				//TextPanes, Radio Buttons und Reservierungs Button unsichtbar machen
				textPane_B1.setVisible(false);
				textPane_B2.setVisible(false);
				textPane_B3.setVisible(false);
				textPane_B4.setVisible(false);
				textPane_B5.setVisible(false);
				textPane_B6.setVisible(false);
				textPane_B7.setVisible(false);
				textPane_B8.setVisible(false);
				textPane_B9.setVisible(false);
				textPane_B10.setVisible(false);
			
				rdbtn_p1.setVisible(false);
				rdbtn_p2.setVisible(false);
				rdbtn_p3.setVisible(false);
				rdbtn_p4.setVisible(false);
				rdbtn_p5.setVisible(false);
				rdbtn_p6.setVisible(false);
				rdbtn_p7.setVisible(false);
				rdbtn_p8.setVisible(false);
				rdbtn_p9.setVisible(false);
				rdbtn_p10.setVisible(false);
				
				btnReserve.setVisible(false);
			}
		});
		
		
		//Browse und Reserve Button, Textpanes und RadioButtons dem Fenster hinzufügen
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
		
		
		//Browse & Reserve Button, Textpanes und RadioButtons unsichtbar machen
		lblAvailableBungalos.setVisible(false);
		
		textPane_B1.setVisible(false);
		textPane_B2.setVisible(false);
		textPane_B3.setVisible(false);
		textPane_B4.setVisible(false);
		textPane_B5.setVisible(false);
		textPane_B6.setVisible(false);
		textPane_B7.setVisible(false);
		textPane_B8.setVisible(false);
		textPane_B9.setVisible(false);
		textPane_B10.setVisible(false);
	
		rdbtn_p1.setVisible(false);
		rdbtn_p2.setVisible(false);
		rdbtn_p3.setVisible(false);
		rdbtn_p4.setVisible(false);
		rdbtn_p5.setVisible(false);
		rdbtn_p6.setVisible(false);
		rdbtn_p7.setVisible(false);
		rdbtn_p8.setVisible(false);
		rdbtn_p9.setVisible(false);
		rdbtn_p10.setVisible(false);
		
		btnReserve.setVisible(false);
		
		
		
		btnReserve.setFont(new Font("Dialog", Font.ITALIC, 15));
		btnReserve.setBackground(Color.WHITE);
		btnReserve.setBounds(180, 388, 210, 40);
		
		JButton btnBrowse = new JButton("Suche Bungalows");
		btnBrowse.setFont(new Font("Century Gothic", Font.ITALIC, 15));
		btnBrowse.setBackground(Color.WHITE);
		btnBrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Resettet die Kundennummer und Fehlerausgabe
				text_knr.setText(null);
				
				try {
				
				//1-2 Personen
				if(Integer.parseInt(textField_Person.getText())> 0 && Integer.parseInt(textField_Person.getText()) <= 2) {
					textPane_B1.setBackground(Color.GREEN);
					textPane_B2.setBackground(Color.GREEN);
					textPane_B3.setBackground(Color.YELLOW);
					textPane_B4.setBackground(Color.YELLOW);
					textPane_B5.setBackground(Color.YELLOW);
					textPane_B6.setBackground(Color.YELLOW);
					textPane_B7.setBackground(Color.YELLOW);
					textPane_B8.setBackground(Color.YELLOW);
					textPane_B9.setBackground(Color.YELLOW);
					textPane_B10.setBackground(Color.YELLOW);
						
					rdbtn_p1.setEnabled(true);
					rdbtn_p2.setEnabled(true);
					rdbtn_p3.setEnabled(true);
					rdbtn_p4.setEnabled(true);
					rdbtn_p5.setEnabled(true);
					rdbtn_p6.setEnabled(true);
					rdbtn_p7.setEnabled(true);
					rdbtn_p8.setEnabled(true);			
				}	
				
				//3-4 Personen
				if(Integer.parseInt(textField_Person.getText())> 2 && Integer.parseInt(textField_Person.getText()) <= 4) {
					textPane_B1.setBackground(Color.RED);
					textPane_B2.setBackground(Color.RED);
					textPane_B3.setBackground(Color.GREEN);
					textPane_B4.setBackground(Color.GREEN);
					textPane_B5.setBackground(Color.YELLOW);
					textPane_B6.setBackground(Color.YELLOW);
					textPane_B7.setBackground(Color.YELLOW);
					textPane_B8.setBackground(Color.YELLOW);
					textPane_B9.setBackground(Color.YELLOW);
					textPane_B10.setBackground(Color.YELLOW);
					
					rdbtn_p1.setEnabled(false);
					rdbtn_p2.setEnabled(false);
					rdbtn_p3.setEnabled(true);
					rdbtn_p4.setEnabled(true);
					rdbtn_p5.setEnabled(true);
					rdbtn_p6.setEnabled(true);
					rdbtn_p7.setEnabled(true);
					rdbtn_p8.setEnabled(true);

				}
				if(Integer.parseInt(textField_Person.getText())> 4 && Integer.parseInt(textField_Person.getText()) <= 6) {
					textPane_B1.setBackground(Color.RED);
					textPane_B2.setBackground(Color.RED);
					textPane_B3.setBackground(Color.RED);
					textPane_B4.setBackground(Color.RED);
					textPane_B5.setBackground(Color.GREEN);
					textPane_B6.setBackground(Color.GREEN);
					textPane_B7.setBackground(Color.YELLOW);
					textPane_B8.setBackground(Color.YELLOW);
					textPane_B9.setBackground(Color.YELLOW);
					textPane_B10.setBackground(Color.YELLOW);
					
					rdbtn_p1.setEnabled(false);
					rdbtn_p2.setEnabled(false);
					rdbtn_p3.setEnabled(false);
					rdbtn_p4.setEnabled(false);
					rdbtn_p5.setEnabled(true);
					rdbtn_p6.setEnabled(true);
					rdbtn_p7.setEnabled(true);
					rdbtn_p8.setEnabled(true);
				}
				if(Integer.parseInt(textField_Person.getText())> 6 && Integer.parseInt(textField_Person.getText()) <= 8) {
					textPane_B1.setBackground(Color.RED);
					textPane_B2.setBackground(Color.RED);
					textPane_B3.setBackground(Color.RED);
					textPane_B4.setBackground(Color.RED);
					textPane_B5.setBackground(Color.RED);
					textPane_B6.setBackground(Color.RED);
					textPane_B7.setBackground(Color.GREEN);
					textPane_B8.setBackground(Color.GREEN);
					textPane_B9.setBackground(Color.YELLOW);
					textPane_B10.setBackground(Color.YELLOW);
					
					rdbtn_p1.setEnabled(false);
					rdbtn_p2.setEnabled(false);
					rdbtn_p3.setEnabled(false);
					rdbtn_p4.setEnabled(false);
					rdbtn_p5.setEnabled(false);
					rdbtn_p6.setEnabled(false);
					rdbtn_p7.setEnabled(true);
					rdbtn_p8.setEnabled(true);
				}
				if(Integer.parseInt(textField_Person.getText())> 8 && Integer.parseInt(textField_Person.getText()) <= 10) {
					textPane_B1.setBackground(Color.RED);
					textPane_B2.setBackground(Color.RED);
					textPane_B3.setBackground(Color.RED);
					textPane_B4.setBackground(Color.RED);
					textPane_B5.setBackground(Color.RED);
					textPane_B6.setBackground(Color.RED);
					textPane_B7.setBackground(Color.RED);
					textPane_B8.setBackground(Color.RED);
					textPane_B9.setBackground(Color.GREEN);
					textPane_B10.setBackground(Color.GREEN);
					
					rdbtn_p1.setEnabled(false);
					rdbtn_p2.setEnabled(false);
					rdbtn_p3.setEnabled(false);
					rdbtn_p4.setEnabled(false);
					rdbtn_p5.setEnabled(false);
					rdbtn_p6.setEnabled(false);
					rdbtn_p7.setEnabled(false);
					rdbtn_p8.setEnabled(false);
				}
				
					textPane_B1.setVisible(true);
					textPane_B2.setVisible(true);
					textPane_B3.setVisible(true);
					textPane_B4.setVisible(true);
					textPane_B5.setVisible(true);
					textPane_B6.setVisible(true);
					textPane_B7.setVisible(true);
					textPane_B8.setVisible(true);
					textPane_B9.setVisible(true);
					textPane_B10.setVisible(true);
				
					rdbtn_p1.setVisible(true);
					rdbtn_p2.setVisible(true);
					rdbtn_p3.setVisible(true);
					rdbtn_p4.setVisible(true);
					rdbtn_p5.setVisible(true);
					rdbtn_p6.setVisible(true);
					rdbtn_p7.setVisible(true);
					rdbtn_p8.setVisible(true);
					rdbtn_p9.setVisible(true);
					rdbtn_p10.setVisible(true);
					
					btnReserve.setVisible(true);
				
				}
				
				
					//Fehlermeldung falls Text eingegeben wurde
					catch (NumberFormatException ex) {
							text_knr.setText("Bitte nur Nummern in der Eingabe benutzen!");
			}
		}});
		btnBrowse.setBounds(540, 130, 180, 40);
		layeredPane.add(btnBrowse);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(780, 0, 5, 510);
		layeredPane.add(separator);
		
		text_out = new JTextArea();
		text_out.setWrapStyleWord(true);
		text_out.setRows(1000);
		text_out.setEditable(false);
		text_out.setBounds(790, 224, 436, 279);
		layeredPane.add(text_out);
		
		JLabel lblBungalo = new JLabel("Bungalow:");
		lblBungalo.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblBungalo.setBounds(795, 80, 75, 40);
		layeredPane.add(lblBungalo);
		
		JLabel lblCheck = new JLabel("Checken und Stonieren");
		lblCheck.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 30));
		lblCheck.setBounds(795, 11, 471, 40);
		layeredPane.add(lblCheck);
		
		combo_select = new JComboBox();
		combo_select.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		combo_select.setBounds(880, 80, 75, 40);
		layeredPane.add(combo_select);
		
		JButton btnCheck = new JButton("Check Bungalow");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Check Methode aufrufen
				check();
			}
		});
		
		btnCheck.setFont(new Font("Dialog", Font.ITALIC, 15));
		btnCheck.setBackground(Color.WHITE);
		btnCheck.setBounds(795, 130, 160, 40);
		layeredPane.add(btnCheck);
		
		JLabel lblknr = new JLabel("Ausgabe:");
		lblknr.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblknr.setBounds(10, 449, 160, 40);
		layeredPane.add(lblknr);
		
		text_knr = new JTextArea();
		text_knr.setFont(new Font("Bahnschrift", Font.BOLD | Font.ITALIC, 20));
		text_knr.setEditable(false);
		text_knr.setBounds(180, 458, 590, 40);
		layeredPane.add(text_knr);
		
		JLabel lblJahr = new JLabel("Jahr:");
		lblJahr.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblJahr.setBounds(10, 180, 160, 40);
		layeredPane.add(lblJahr);
		
		combo_select_jahr = new JComboBox();
		combo_select_jahr.setModel(new DefaultComboBoxModel(new String[] {"2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032"}));
		combo_select_jahr.setBounds(180, 180, 60, 40);
		layeredPane.add(combo_select_jahr);
		
		JButton btnSwitch = new JButton("Stoniere Reservierung");
		btnSwitch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//stonierung methode aufrufen
				stoniere();
			}
		});
		btnSwitch.setFont(new Font("Dialog", Font.ITALIC, 15));
		btnSwitch.setBackground(Color.WHITE);
		btnSwitch.setBounds(982, 130, 205, 40);
		layeredPane.add(btnSwitch);
		
		textField_stonieren = new JTextField();
		textField_stonieren.setColumns(10);
		textField_stonieren.setBounds(1112, 80, 75, 40);
		layeredPane.add(textField_stonieren);
		
		JLabel lblKundennummer = new JLabel("Kundennummer:");
		lblKundennummer.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblKundennummer.setBounds(982, 80, 120, 40);
		layeredPane.add(lblKundennummer);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(967, 61, 5, 128);
		layeredPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(780, 188, 426, 5);
		layeredPane.add(separator_2);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBounds(780, 61, 426, 5);
		layeredPane.add(separator_2_1);

		frmBlackwaterResortReservation.setBounds(100, 100, 1220, 550);
		frmBlackwaterResortReservation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//reserve um ersten fehler zu korregieren
	public void reserve(int start, int end, int pers) {
		
		//Zahlenfehler bei eingabe erkennen
		if (Integer.parseInt(textField_Start.getText()) < 0 || Integer.parseInt(textField_Start.getText()) > 52) {
			text_knr.setText("Fehler bei Eingabe der Startwoche! [1-52]"); textField_Start.setText(null);
		}

		else if (Integer.parseInt(textField_End.getText()) < 0 || Integer.parseInt(textField_End.getText()) > 52) {
			text_knr.setText("Fehler bei Eingabe der Endwoche! [1-52]"); textField_End.setText(null);
		}
		
		else if (Integer.parseInt(textField_End.getText()) < Integer.parseInt(textField_Start.getText())) {
			text_knr.setText("Endwoche kann nicht vor der Startwoche sein! [SW<EW]"); textField_End.setText(null);
		}
		
		else if (Integer.parseInt(textField_Person.getText()) < 1 || Integer.parseInt(textField_Person.getText()) > 10) {
			text_knr.setText("Fehler bei Eingabe der Anzahl von Personen! [1-10]"); textField_Person.setText(null);
		}
		
		else {
			
			//Gewählter Bungalow in Nummer umwandeln
			if(rdbtn_p1.isSelected()) 
				bnr=1;
			if(rdbtn_p2.isSelected()) 
				bnr=2;
			if(rdbtn_p3.isSelected()) 
				bnr=3;
			if(rdbtn_p4.isSelected()) 
				bnr=4;
			if(rdbtn_p5.isSelected()) 
				bnr=5;
			if(rdbtn_p6.isSelected()) 
				bnr=6;
			if(rdbtn_p7.isSelected()) 
				bnr=7;
			if(rdbtn_p8.isSelected()) 
				bnr=8;
			if(rdbtn_p9.isSelected()) 
				bnr=9;
			if(rdbtn_p10.isSelected()) 
				bnr=10;
			
			//Weitergabe an versuch
			versuch(start, end, pers, Integer.parseInt((String) combo_select_jahr.getSelectedItem()));
	}}
	
	//Reservierung durchführen
	public void versuch(int start, int end, int pers, int jahr) {
		
		for (Reservierung reservierung : reservierungen) {
			 if(reservierung.bnr == bnr) {
				 if(jahr==reservierung.jahr) {
				 if(start >= reservierung.start && start <= reservierung.end || end >= reservierung.start && end <= reservierung.end) {
					 
					 text_knr.setText("Bungalow für den ausgwählten Zeitraum schon besetzt.");
					 textField_Start.setText(null);
					 textField_End.setText(null);
					 return;
					 
				 }
				 
			 }}
			 
			 
			}
		
		
			
			knr = random.nextInt(9999);
		 
			reservierungen.add(new Reservierung(bnr,start,end,pers,knr,jahr));
		
			text_knr.setText("Ihre Kundennummer: " + knr);
		
			textField_Start.setText(null);
			textField_End.setText(null);
			textField_Person.setText(null);
		
	}
	
	//Daten eines Bungalows checken
	public void check() {
		
		text_out.setText(null);
	
		bnr = Integer.parseInt((String) combo_select.getSelectedItem());
		for (Reservierung reservierung : reservierungen) {
			 if(reservierung.bnr == bnr) {
				 
	text_out.setText(text_out.getText()+ "Bungalo Nr." + reservierung.bnr + "\n"
			+ "Reservierungsjahr: " + reservierung.jahr + "\n"
			+ "Startwoche: " + reservierung.start + "\n"
			+ "Endwoche: " + reservierung.end + "\n"
			+ "Anzahl Personen: " + reservierung.pers + "\n"
			+ "Kundennummer: " + reservierung.knr + "\n" + "\n");
	
		}}
		
	}
	
	public void stoniere() {
		
		//Resettet die Kundennummer und Fehlerausgabe
		text_knr.setText(null);
		
		try {
			knr = Integer.parseInt(textField_stonieren.getText());
		} catch (NumberFormatException ex) {
			text_knr.setText("Bitte nur Nummern in der Eingabe benutzen!");
		}
		
//		for (Reservierung reservierung : reservierungen) {
//			if(reservierung.knr == knr) {
//				reservierungen.remove();
				
				for (int i = reservierungen.size() - 1; i >= 0; i--) {
					Reservierung c = reservierungen.get(i);
					if (c.knr == knr) {
						reservierungen.remove(i);
					}}
	}
}
