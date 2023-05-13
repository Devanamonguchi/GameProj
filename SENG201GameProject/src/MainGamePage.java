import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class MainGamePage {

	private JFrame frmBadmintonTournamentMain;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGamePage window = new MainGamePage();
					window.frmBadmintonTournamentMain.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainGamePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBadmintonTournamentMain = new JFrame();
		frmBadmintonTournamentMain.setTitle("Badminton Tournament Main Game Page");
		frmBadmintonTournamentMain.setBounds(100, 100, 530, 497);
		frmBadmintonTournamentMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBadmintonTournamentMain.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Balance:");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel.setBounds(28, 27, 61, 16);
		frmBadmintonTournamentMain.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Current Season:");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(352, 27, 126, 16);
		frmBadmintonTournamentMain.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Remaining Week:");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(352, 55, 142, 16);
		frmBadmintonTournamentMain.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("C L U B");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(18, 136, 155, 147);
		frmBadmintonTournamentMain.getContentPane().add(btnNewButton);
		
		JButton btnSTA = new JButton("S T A D I U M");
		btnSTA.setBounds(185, 136, 155, 147);
		frmBadmintonTournamentMain.getContentPane().add(btnSTA);
		
		JButton btnRES = new JButton("M A R K E T");
		btnRES.setBounds(352, 136, 155, 147);
		frmBadmintonTournamentMain.getContentPane().add(btnRES);
		
		JButton btnMAR = new JButton("S A V E  G A M E");
		btnMAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMAR.setBounds(18, 300, 155, 147);
		frmBadmintonTournamentMain.getContentPane().add(btnMAR);
		
		JButton btnSAV = new JButton("L O A D  G A M E");
		btnSAV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSAV.setBounds(185, 300, 155, 147);
		frmBadmintonTournamentMain.getContentPane().add(btnSAV);
		
		JButton btnSKI = new JButton("S K I P  W E E K");
		btnSKI.setBounds(352, 300, 155, 147);
		frmBadmintonTournamentMain.getContentPane().add(btnSKI);
		
		JLabel lblNewLabel_3 = new JLabel("Points:");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(28, 55, 61, 16);
		frmBadmintonTournamentMain.getContentPane().add(lblNewLabel_3);
	}

}