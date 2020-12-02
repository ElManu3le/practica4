package Jardineria;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Jardineria.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class Main {

	private JFrame frame;
	private JTable clientes;
	private JTable pedisos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Crear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new createUser().frame.setVisible(true);//Abre la ventana de create user
				//Hay que hacer public el frame de la clase de JFrame para que funcione. 
				
			}
		});
		btnNewButton.setBounds(10, 37, 126, 30);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Modificar");
		btnNewButton_1.setBounds(165, 37, 126, 30);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Borrar");
		btnNewButton_2.setBounds(330, 37, 126, 30);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("X");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame frame = new JFrame("Salir");
				if(JOptionPane.showConfirmDialog(frame, "¿Seguro que quieres salir?", "SALIR", 
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnNewButton_3.setBounds(691, 42, 85, 30);
		frame.getContentPane().add(btnNewButton_3);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 94, 679, 442);
		frame.getContentPane().add(tabbedPane);
		
		JScrollPane clienetsTableScroll = new JScrollPane();
		tabbedPane.addTab("Clientes", null, clienetsTableScroll, null);
		
		clientes = new JTable();
		clientes.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
			},
			new String[] {
				"Codigo cliente", "Nombre cliente", "Numero de Identidad", "Numero de Identidad", "Contrase\u00F1a", "correo Electronico"
			}
		));
		clienetsTableScroll.setViewportView(clientes);
		
		JScrollPane pedidosScrollTable = new JScrollPane();
		tabbedPane.addTab("Pedidos", null, pedidosScrollTable, null);
		
		pedisos = new JTable();
		pedidosScrollTable.setViewportView(pedisos);
		
		
	}
}
