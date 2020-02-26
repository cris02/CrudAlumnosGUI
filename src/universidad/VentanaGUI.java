package universidad;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;

public class VentanaGUI {

	private JFrame frmModuloAlumnos;
	private JTextField textMatricula;
	private JTextField texNombre;
	private JTextField textGrado;
	private JTextField textTelefono;
	private JTextField textDireccion;
	private JTextField textNacionalidad;
	private JTextField textBuscar;
	
	//variables para la conexion a la base de datos
	private Connection connection;
	private final String dbname = "universidad", user = "cristian", pass = "am09069*";
	private Statement st;
	
	
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
		frmModuloAlumnos.setBackground(new Color(70, 130, 180));
		frmModuloAlumnos.getContentPane().setForeground(new Color(70, 130, 180));
		frmModuloAlumnos.setTitle("MODULO ALUMNOS");
		frmModuloAlumnos.setBounds(100, 100, 988, 586);
		frmModuloAlumnos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmModuloAlumnos.getContentPane().setLayout(null);
		
		JLabel lblMatricula = new JLabel("Matricula");
		lblMatricula.setBounds(80, 65, 56, 16);
		frmModuloAlumnos.getContentPane().add(lblMatricula);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(91, 126, 45, 16);
		frmModuloAlumnos.getContentPane().add(lblNombre);
		
		JLabel lblGrado = new JLabel("Grado");
		lblGrado.setBounds(96, 190, 40, 16);
		frmModuloAlumnos.getContentPane().add(lblGrado);
		
		JLabel lbltelefono = new JLabel("Telefono");
		lbltelefono.setBounds(80, 255, 56, 16);
		frmModuloAlumnos.getContentPane().add(lbltelefono);
		
		JLabel lblDescripcion = new JLabel("Direcccion");
		lblDescripcion.setBounds(78, 320, 58, 16);
		frmModuloAlumnos.getContentPane().add(lblDescripcion);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setBounds(64, 385, 72, 16);
		frmModuloAlumnos.getContentPane().add(lblNacionalidad);
		
		textMatricula = new JTextField();
		textMatricula.setBounds(193, 49, 373, 32);
		frmModuloAlumnos.getContentPane().add(textMatricula);
		textMatricula.setColumns(10);
		
		texNombre = new JTextField();
		texNombre.setColumns(10);
		texNombre.setBounds(193, 110, 373, 32);
		frmModuloAlumnos.getContentPane().add(texNombre);
		
		textGrado = new JTextField();
		textGrado.setColumns(10);
		textGrado.setBounds(193, 174, 373, 32);
		frmModuloAlumnos.getContentPane().add(textGrado);
		
		textTelefono = new JTextField();
		textTelefono.setColumns(10);
		textTelefono.setBounds(193, 239, 373, 32);
		frmModuloAlumnos.getContentPane().add(textTelefono);
		
		textDireccion = new JTextField();
		textDireccion.setColumns(10);
		textDireccion.setBounds(193, 304, 373, 32);
		frmModuloAlumnos.getContentPane().add(textDireccion);
		
		textNacionalidad = new JTextField();
		textNacionalidad.setColumns(10);
		textNacionalidad.setBounds(193, 369, 373, 32);
		frmModuloAlumnos.getContentPane().add(textNacionalidad);
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.setBounds(255, 459, 97, 25);
		frmModuloAlumnos.getContentPane().add(btnGuardar);
		
		JButton btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setBounds(436, 459, 97, 25);
		frmModuloAlumnos.getContentPane().add(btnEliminar);
		
		JLabel lblBuscar = new JLabel("Buscar por matricula");
		lblBuscar.setBounds(606, 108, 127, 16);
		frmModuloAlumnos.getContentPane().add(lblBuscar);
		
		textBuscar = new JTextField();
		textBuscar.setBounds(734, 100, 183, 32);
		frmModuloAlumnos.getContentPane().add(textBuscar);
		textBuscar.setColumns(10);
		
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.setBounds(782, 145, 97, 25);
		frmModuloAlumnos.getContentPane().add(btnBuscar);
		
		JTextArea textAreaResultado = new JTextArea();
		textAreaResultado.setBounds(647, 266, 285, 71);
		frmModuloAlumnos.getContentPane().add(textAreaResultado);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(647, 242, 56, 16);
		frmModuloAlumnos.getContentPane().add(lblResultado);
	} //fin de la clase initialize
	
	
	//metodo para crear la conexion a la base de datos
	public void crearConexion() {
		String url = "jdbc:mariadb://localhost:3306/";
		String driver = "org.mariadb.jdbc.Driver";
		
		try {
			Class.forName(driver).newInstance();
			connection = DriverManager.getConnection(url + dbname, user, pass);
			
			if (!connection.isClosed()) {
				System.out.println("La conexion con la DB se ha realizado con exito");
			}
			
			st = connection.createStatement();
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
