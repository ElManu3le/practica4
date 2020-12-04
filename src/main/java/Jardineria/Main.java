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
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clientes.setEnabled(true);
				
				
			}
		});
		btnNewButton_1.setBounds(165, 37, 126, 30);
		frame.getContentPane().add(btnNewButton_1);
		
		final JButton btnNewButton_2 = new JButton("Borrar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btnNewButton_2.isSelected())
				{
					
				}
			}
		});
		btnNewButton_2.setBounds(330, 37, 126, 30);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton ExitBoton = new JButton("X");
		ExitBoton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame frame = new JFrame("Atras");
				if(JOptionPane.showConfirmDialog(frame, "¿Seguro que quieres volver atras?", "SI", 
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					//new createUser().frame.setVisible(false);
					//new Main().frame.setVisible(true);
				}
			}
		});
		ExitBoton.setBounds(691, 42, 85, 30);
		frame.getContentPane().add(ExitBoton);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 94, 679, 442);
		frame.getContentPane().add(tabbedPane);
		
		JScrollPane clienetsTableScroll = new JScrollPane();
		tabbedPane.addTab("Clientes", null, clienetsTableScroll, null);
		
		clientes = new JTable();
		clientes.setModel(new DefaultTableModel(
			new Object[][] {
				{1, "Manuel", "741589P", "nosequeponer69", "gacintoperez@hotmail.com"},
				{2, "Juan", "123456K", "intento90", "juancada@gmail.com"},
				{3, "Emma", "2345678J", "dametodoloquequieras", "emmamiedes@yahoo.es"},
				{4, "Papa_Dario", "01837456D", "nomedesnada", "espapá@hotmail.com"},
			},
			new String[] {
				"Codigo cliente", "Nombre cliente", "Numero de Identidad", "Contraseyia", "correo Electronico"
			}
		));
		clienetsTableScroll.setViewportView(clientes);
		
		JScrollPane pedidosScrollTable = new JScrollPane();
		tabbedPane.addTab("Pedidos", null, pedidosScrollTable, null);
		
		pedisos = new JTable();
		pedisos.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"cosa5", "cosa4", "New column", "cosa2", "cosa1"
			}
		));
		pedidosScrollTable.setViewportView(pedisos);
		
		
	}
}
