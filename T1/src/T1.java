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

public class T1 {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;

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
		lblEndWoche.setBounds(10, 131, 160, 40);
		layeredPane.add(lblEndWoche);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(180, 134, 164, 40);
		layeredPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(180, 81, 164, 40);
		layeredPane.add(textField_2);
		
		JLabel lblTheFlyingDuchman = new JLabel("Blackwater Resort");
		lblTheFlyingDuchman.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 30));
		lblTheFlyingDuchman.setBounds(10, 11, 471, 40);
		layeredPane.add(lblTheFlyingDuchman);
		
		JButton btnNewButton = new JButton("Browse Bungalos");
		btnNewButton.setFont(new Font("Century Gothic", Font.ITALIC, 15));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(180, 185, 164, 40);
		layeredPane.add(btnNewButton);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBackground(Color.CYAN);
		progressBar.setForeground(Color.CYAN);
		progressBar.setBounds(0, 497, 784, 14);
		layeredPane.add(progressBar);
		
		JLabel lblAvailableBungalos = new JLabel("Available Bungalos:");
		lblAvailableBungalos.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblAvailableBungalos.setBounds(354, 80, 160, 40);
		layeredPane.add(lblAvailableBungalos);
		frame.setBounds(100, 100, 800, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
