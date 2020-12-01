package GUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import javax.swing.JFrame;

public class login {

	private JFrame frame;
	private JTextField usernametext;
	private JPasswordField passwdtext;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 747, 485);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("USUARIO");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 65, 97, 29);
		frame.getContentPane().add(lblNewLabel);

		usernametext = new JTextField();
		usernametext.setBounds(150, 70, 160, 22);
		frame.getContentPane().add(usernametext);
		usernametext.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("CONTRASEYIA");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 127, 97, 29);
		frame.getContentPane().add(lblNewLabel_1);

		passwdtext = new JPasswordField();
		passwdtext.setBounds(150, 130, 160, 22);
		frame.getContentPane().add(passwdtext);

		final JButton ver = new JButton("Ver");

		ver.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
				passwdtext.setEchoChar((char) 0);
			}
		});

		ver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (ver.isSelected()) {
					passwdtext.setEchoChar((char) 0);

				} else {
					passwdtext.setEchoChar('*');
				}
			}
		}

		);

		ver.setBounds(335, 130, 108, 22);
		frame.getContentPane().add(ver);

	}

}
