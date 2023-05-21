import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JProgressBar;

public class MarketPage3 {

	private JFrame frame;
	private GameHandler gameHandler;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameHandler gameHandler = new GameHandler();
					MarketPage3 window = new MarketPage3(gameHandler);
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

	public MarketPage3(GameHandler gameHandler) {
		// TODO Auto-generated constructor stub
		this.gameHandler = gameHandler;
		initialize();
	}
	public void hidePage() {
		frame.setVisible(false);
	}
	public void showPage() {
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(176, 196, 222));
		frame.setBounds(100, 100, 639, 477);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBounds(521, 6, 112, 28);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_3 = new JLabel("$....123");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Futura", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(16, 6, 90, 16);
		panel.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.setFont(new Font("Futura", Font.PLAIN, 12));
		btnNewButton.setBounds(6, 6, 86, 28);
		frame.getContentPane().add(btnNewButton);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_1.setBackground(new Color(250, 250, 210));
		panel_1_1.setBounds(115, 91, 307, 339);
		frame.getContentPane().add(panel_1_1);
		
		JLabel lblNewLabel_6 = new JLabel("A T H L E T E S");
		lblNewLabel_6.setForeground(new Color(100, 149, 237));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_6.setFont(new Font("Futura", Font.ITALIC, 30));
		lblNewLabel_6.setBounds(6, 22, 276, 52);
		panel_1_1.add(lblNewLabel_6);
		
		JButton btnNewButton_1_2_1 = new JButton("100ZZ");
		btnNewButton_1_2_1.setFont(new Font("Futura", Font.PLAIN, 12));
		btnNewButton_1_2_1.setBounds(17, 86, 129, 103);
		panel_1_1.add(btnNewButton_1_2_1);
		
		JButton btnNewButton_1_2_1_1 = new JButton("100ZZ");
		btnNewButton_1_2_1_1.setFont(new Font("Futura", Font.PLAIN, 12));
		btnNewButton_1_2_1_1.setBounds(153, 86, 129, 103);
		panel_1_1.add(btnNewButton_1_2_1_1);
		
		JButton btnNewButton_1_2_2 = new JButton("100ZZ");
		btnNewButton_1_2_2.setFont(new Font("Futura", Font.PLAIN, 12));
		btnNewButton_1_2_2.setBounds(153, 207, 129, 103);
		panel_1_1.add(btnNewButton_1_2_2);
		
		JButton btnNewButton_1_2_3 = new JButton("100ZZ");
		btnNewButton_1_2_3.setFont(new Font("Futura", Font.PLAIN, 12));
		btnNewButton_1_2_3.setBounds(17, 207, 129, 103);
		panel_1_1.add(btnNewButton_1_2_3);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setForeground(new Color(238, 130, 238));
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_2.setBackground(new Color(250, 250, 210));
		panel_1_2.setBounds(14, 88, 86, 339);
		frame.getContentPane().add(panel_1_2);
		
		JLabel lblCategory_1 = new JLabel("Catalog:");
		lblCategory_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCategory_1.setBounds(17, 22, 52, 16);
		panel_1_2.add(lblCategory_1);
		
		JButton btnNewButton_1 = new JButton("Rackets");
		btnNewButton_1.setBounds(-15, 71, 119, 41);
		panel_1_2.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Shoes");
		btnNewButton_1_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1_1.setBackground(new Color(152, 251, 152));
		btnNewButton_1_1.setBounds(-15, 124, 119, 41);
		panel_1_2.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_3_2 = new JButton("Athletes");
		btnNewButton_1_3_2.setForeground(new Color(210, 180, 140));
		btnNewButton_1_3_2.setBounds(-15, 176, 119, 41);
		panel_1_2.add(btnNewButton_1_3_2);
		
		JInternalFrame internalFrame = new JInternalFrame("P R O F I L E");
		internalFrame.getContentPane().setBackground(new Color(240, 230, 140));
		internalFrame.setBounds(430, 57, 200, 388);
		frame.getContentPane().add(internalFrame);
		internalFrame.getContentPane().setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(16, 37, 145, 129);
		internalFrame.getContentPane().add(panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Height:");
		lblNewLabel_1.setBounds(16, 230, 54, 16);
		internalFrame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Price:");
		lblNewLabel_1_3.setBounds(16, 258, 61, 16);
		internalFrame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_2 = new JLabel("Defense: ");
		lblNewLabel_1_2.setBounds(16, 286, 73, 16);
		internalFrame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_4 = new JLabel("Offense:");
		lblNewLabel_4.setBounds(16, 307, 61, 16);
		internalFrame.getContentPane().add(lblNewLabel_4);
		
		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setBounds(79, 307, 82, 20);
		internalFrame.getContentPane().add(progressBar_1);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setForeground(new Color(250, 128, 114));
		progressBar.setBackground(new Color(255, 182, 193));
		progressBar.setBounds(79, 286, 82, 20);
		internalFrame.getContentPane().add(progressBar);
		
		JLabel lblNewLabel_2_1 = new JLabel("$ 123");
		lblNewLabel_2_1.setBounds(79, 258, 61, 16);
		internalFrame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2 = new JLabel("180");
		lblNewLabel_2.setBounds(82, 230, 61, 16);
		internalFrame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton_2 = new JButton("Buy");
		btnNewButton_2.setBounds(98, 6, 72, 29);
		internalFrame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setBounds(16, 178, 54, 16);
		internalFrame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(79, 178, 61, 16);
		internalFrame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_7 = new JLabel("Age:");
		lblNewLabel_7.setBounds(16, 206, 46, 16);
		internalFrame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBounds(79, 206, 61, 16);
		internalFrame.getContentPane().add(lblNewLabel_8);
		internalFrame.setVisible(true);
	}

}
