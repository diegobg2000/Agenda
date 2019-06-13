package Agenda;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JScrollBar;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;




public class Teste extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField_1;
	private JLabel lblConsola;
	private JLabel lblInstrucciones;
	private JLabel lblParaAadirContacto;
	private JLabel lblConsultarContacto;
	private JLabel lblCerrarAgenda;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teste frame = new Teste();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Teste() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 600, 450, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 205));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		


		
		textField_1 = new JTextField();/*El de la parte de la consola*/
		textField_1.setBounds(26, 375, 384, 20);
		textField_1.setForeground(new Color(173, 255, 47));
		textField_1.setBackground(new Color(0, 0, 0));
		textField_1.setColumns(10);
		
		lblConsola = new JLabel("Consola");
		lblConsola.setBounds(26, 350, 46, 14);
		lblConsola.setForeground(new Color(173, 255, 47));
		
		lblInstrucciones = new JLabel("Instrucciones:");
		lblInstrucciones.setBounds(26, 227, 85, 14);
		lblInstrucciones.setForeground(new Color(255, 255, 255));
		
		lblParaAadirContacto = new JLabel("Para a\u00F1adir contacto --> Nombre - Numero Telefono");
		lblParaAadirContacto.setBounds(54, 246, 325, 14);
		lblParaAadirContacto.setForeground(new Color(255, 255, 255));
		
		lblConsultarContacto = new JLabel("Consultar contacto --> buscar:Nombre");
		lblConsultarContacto.setBounds(54, 273, 249, 14);
		lblConsultarContacto.setForeground(new Color(255, 255, 255));
		
		lblCerrarAgenda = new JLabel("Cerrar agenda --> fin");
		lblCerrarAgenda.setBounds(54, 298, 136, 14);
		lblCerrarAgenda.setForeground(new Color(255, 255, 255));
		
		textField = new JTextField();/*El TextFiel de arriba*/
		textField.setBounds(10, 11, 414, 205);
		textField.setColumns(20);
		contentPane.setLayout(null);
		contentPane.add(textField_1);
		contentPane.add(lblConsola);
		contentPane.add(lblInstrucciones);
		contentPane.add(lblParaAadirContacto);
		contentPane.add(lblConsultarContacto);
		contentPane.add(lblCerrarAgenda);
		contentPane.add(textField); 
		
	}
	public void Escribir(){
		
	}


	@Override
	public void actionPerformed(ActionEvent evento) {
		
		        
		       
	}
	}

	

