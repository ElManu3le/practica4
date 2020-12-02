package Jardineria;

import java.awt.EventQueue;
import Jardineria.PatronBuilder.*;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class createUser {

	public JFrame frame;
	private JTextField codclienteText;
	private JTextField nombretText;
	private JTextField numIdentidad;
	private JTextField correoText;
	private JPasswordField contraseniaText;
	
	ArrayList<JTextField> clientesList = new ArrayList<>();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					createUser window = new createUser();
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
	public createUser() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 608, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Codigo Cliente");
		lblNewLabel.setBounds(30, 49, 89, 19);
		frame.getContentPane().add(lblNewLabel);
		
		codclienteText = new JTextField();
		codclienteText.setBounds(121, 49, 96, 19);
		frame.getContentPane().add(codclienteText);
		codclienteText.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre Cliente");
		lblNewLabel_1.setBounds(30, 78, 89, 19);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tipo de Documento de Identidad");
		lblNewLabel_2.setBounds(30, 118, 187, 19);
		frame.getContentPane().add(lblNewLabel_2);
		
		nombretText = new JTextField();
		nombretText.setBounds(121, 78, 96, 19);
		frame.getContentPane().add(nombretText);
		nombretText.setColumns(10);
		
		JCheckBox dniOp = new JCheckBox("DNI");
		dniOp.setBounds(30, 143, 93, 21);
		frame.getContentPane().add(dniOp);
		
		JCheckBox nieOp = new JCheckBox("NIE");
		nieOp.setBounds(121, 143, 93, 21);
		frame.getContentPane().add(nieOp);
		
		numIdentidad = new JTextField();
		numIdentidad.setBounds(40, 170, 121, 19);
		frame.getContentPane().add(numIdentidad);
		numIdentidad.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Sexo");
		lblNewLabel_3.setBounds(30, 199, 65, 23);
		frame.getContentPane().add(lblNewLabel_3);
		
		JCheckBox hombre = new JCheckBox("HOMBRE");
		hombre.setBounds(30, 228, 93, 21);
		frame.getContentPane().add(hombre);
		
		JCheckBox mujer = new JCheckBox("MUJER");
		mujer.setBounds(125, 228, 93, 21);
		frame.getContentPane().add(mujer);
		
		JLabel lblNewLabel_4 = new JLabel("Correo Electronico");
		lblNewLabel_4.setBounds(30, 275, 93, 13);
		frame.getContentPane().add(lblNewLabel_4);
		
		correoText = new JTextField();
		correoText.setBounds(121, 272, 96, 19);
		frame.getContentPane().add(correoText);
		correoText.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Contraseña");
		lblNewLabel_5.setBounds(30, 318, 89, 13);
		frame.getContentPane().add(lblNewLabel_5);
		
		contraseniaText = new JPasswordField();
		contraseniaText.setBounds(121, 315, 96, 19);
		frame.getContentPane().add(contraseniaText);
		
		final JButton OkBoton = new JButton("ACEPTAR");
		OkBoton.setForeground(Color.BLACK);
		OkBoton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				clientesList.addAll(Arrays.asList(codclienteText, nombretText, numIdentidad, correoText, contraseniaText) );
				//Guarda todas las variables con comas usando el Arrays.asList()
				
				//System.out.println(codclienteText.getText());
			}
		});
		OkBoton.addMouseListener(new MouseAdapter() {
			
		});
		OkBoton.setBounds(79, 386, 140, 36);
		frame.getContentPane().add(OkBoton);
		
		JButton RestBoton = new JButton("RESET");
		RestBoton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent arg0) {
			 codclienteText.setText(null);
				nombretText.setText(null);
				numIdentidad.setText(null);
				correoText.setText(null);
				contraseniaText.setText(null);	
				
				
				
			}
		});
		RestBoton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
			}
		});
		RestBoton.setBounds(276, 386, 140, 36);
		frame.getContentPane().add(RestBoton);
	}
}
