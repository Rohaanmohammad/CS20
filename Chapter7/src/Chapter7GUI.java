import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Chapter7GUI {

	private JFrame frame;
	private JTextField Fn;
	private JTextField Ln;
	private JTextField M1;
	private JTextField M2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chapter7GUI window = new Chapter7GUI();
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
	public Chapter7GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 355);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 483, 317);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel fn = new JLabel("First name");
		fn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		fn.setBounds(22, 11, 73, 28);
		panel.add(fn);
		
		Fn = new JTextField();
		Fn.setBounds(105, 16, 219, 23);
		panel.add(Fn);
		Fn.setColumns(10);
		
		Ln = new JTextField();
		Ln.setBounds(104, 50, 220, 20);
		panel.add(Ln);
		Ln.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last name");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblLastName.setBounds(22, 50, 73, 23);
		panel.add(lblLastName);
		
		JLabel lblNewLabel = new JLabel("Mark 1");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(22, 84, 73, 23);
		panel.add(lblNewLabel);
		
		M1 = new JTextField();
		M1.setBounds(105, 86, 35, 20);
		panel.add(M1);
		M1.setColumns(10);
		JLabel DS = new JLabel("");
		DS.setFont(new Font("Tahoma", Font.BOLD, 14));
		DS.setBounds(22, 176, 451, 130);
		panel.add(DS);
		JLabel lblMark = new JLabel("Mark 2");
		lblMark.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMark.setBounds(22, 118, 73, 23);
		panel.add(lblMark);
		
		M2 = new JTextField();
		M2.setColumns(10);
		M2.setBounds(105, 117, 35, 20);
		panel.add(M2);
		
		JButton Submit = new JButton("submit");
		Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			String firstN = Fn.getText();	
			String lastN = Ln.getText();	
			
			DS.setText(firstN + "" + lastN); 
			
			double Mark1 = Double.parseDouble(M1.getText());
			double Mark2 = Double.parseDouble(M2.getText());
			double avg = (Mark1 + Mark2) / 2;
			
			DS.setText(firstN + "" + lastN + "and your avrage is: " + avg); 
			}
		});
		Submit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Submit.setBounds(260, 104, 104, 37);
		panel.add(Submit);
		
		
	}
}
