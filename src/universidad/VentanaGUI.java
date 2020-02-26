package universidad;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class VentanaGUI {

	private JFrame frmModuloAlumnos;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaGUI window = new VentanaGUI();
					window.frmModuloAlumnos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmModuloAlumnos = new JFrame();
		frmModuloAlumnos.setTitle("MODULO ALUMNOS");
		frmModuloAlumnos.setBounds(100, 100, 988, 586);
		frmModuloAlumnos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmModuloAlumnos.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Matricula");
		lblNewLabel.setBounds(79, 52, 56, 16);
		frmModuloAlumnos.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(90, 113, 45, 16);
		frmModuloAlumnos.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Grado");
		lblNewLabel_2.setBounds(95, 177, 40, 16);
		frmModuloAlumnos.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Telefono");
		lblNewLabel_3.setBounds(79, 242, 56, 16);
		frmModuloAlumnos.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Direcccion");
		lblNewLabel_4.setBounds(77, 307, 58, 16);
		frmModuloAlumnos.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Nacionalidad");
		lblNewLabel_5.setBounds(63, 372, 72, 16);
		frmModuloAlumnos.getContentPane().add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(193, 49, 373, 22);
		frmModuloAlumnos.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(193, 110, 373, 22);
		frmModuloAlumnos.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(193, 174, 373, 22);
		frmModuloAlumnos.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(193, 239, 373, 22);
		frmModuloAlumnos.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(193, 304, 373, 22);
		frmModuloAlumnos.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(193, 369, 373, 22);
		frmModuloAlumnos.getContentPane().add(textField_5);
		
		JButton btnNewButton = new JButton("GUARDAR");
		btnNewButton.setBounds(255, 459, 97, 25);
		frmModuloAlumnos.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ELIMINAR");
		btnNewButton_1.setBounds(436, 459, 97, 25);
		frmModuloAlumnos.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_6 = new JLabel("Buscar");
		lblNewLabel_6.setBounds(647, 113, 56, 16);
		frmModuloAlumnos.getContentPane().add(lblNewLabel_6);
		
		textField_6 = new JTextField();
		textField_6.setBounds(702, 110, 183, 22);
		frmModuloAlumnos.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("BUSCAR");
		btnNewButton_2.setBounds(750, 145, 97, 25);
		frmModuloAlumnos.getContentPane().add(btnNewButton_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(647, 266, 285, 71);
		frmModuloAlumnos.getContentPane().add(textArea);
		
		JLabel lblNewLabel_7 = new JLabel("Resultado");
		lblNewLabel_7.setBounds(647, 242, 56, 16);
		frmModuloAlumnos.getContentPane().add(lblNewLabel_7);
	}
}
