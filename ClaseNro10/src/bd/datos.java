package bd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class datos {

	private JFrame frame;
	private JTextField txtnombre;
	private JTextField txtmatricula;
	private JLabel lblN;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					datos window = new datos();
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
	public datos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 462, 359);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtnombre = new JTextField();
		txtnombre.setBounds(123, 62, 230, 32);
		frame.getContentPane().add(txtnombre);
		txtnombre.setColumns(10);
		
		JButton btnConectar = new JButton("Conectar");
		btnConectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					Class . forName ("com.mysql.jdbc.Driver");
					java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/universidad", "root", "");
					
					if (conexion != null) {
						Statement st = conexion.createStatement();
						
						lblN.setText("conexion bn");
					}else 
						System.out.println("falla. ");
					}
					
					catch (SQLException e) {e .printStackTrace();}
					catch (ClassNotFoundException e) {e .printStackTrace();}
					catch (Exception e ) {e .printStackTrace();
				}
			}
		});
		btnConectar.setBounds(57, 160, 89, 23);
		frame.getContentPane().add(btnConectar);
		
		JButton btnAgregar = new JButton("agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/universidad", "root", "");
					
					Statement statement = conexion.createStatement();
					
					String nombre = txtnombre.getText();
					((java.sql.Statement)statement).executeUpdate("insert into alumnos(nombre) values ('"+nombre+"')");
					conexion.close();
					
					}
				 catch (ClassNotFoundException o) {
					o.printStackTrace();
				} catch (SQLException l) {
					l.printStackTrace();
				}
			}
		});
		btnAgregar.setBounds(156, 160, 89, 23);
		frame.getContentPane().add(btnAgregar);
		
		JButton btnBuscar = new JButton("buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int id= Integer.parseInt(txtmatricula.getText());
				try {
					Class.forName("com.mysql.jdbc.Driver");
					java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/universidad","root","");
					Statement statement = conexion.createStatement();
					ResultSet resultSet = statement.executeQuery("Select nombre  from alumnos where matricula="+id);
					
					if(resultSet.next() == true) {
						lblN.setText(resultSet.getString("nombre"));
					}
					conexion.close();
				} catch (ClassNotFoundException el) {
					//TODO Auto-generated catch block 
					el.printStackTrace();
					
				} catch (SQLException el) {
					//TODO Auto-generated catch block 
					el.printStackTrace();
				}
			}
		});
		btnBuscar.setBounds(57, 194, 89, 23);
		frame.getContentPane().add(btnBuscar);
		
		JButton btnBorrar = new JButton("borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int id = Integer.parseInt(txtmatricula.getText());
				 try {
					 Class.forName("com.msql.jdbc.Driver");
				
					 java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/universidad","root","");
					 
					 String query = "Delete from alumnos Where matricula="+id;
					statement.executeUpdate(query);
					 
					 conexion.close();
				 }
				 catch (ClassNotFoundException el) {
					 el.printStackTrace();
				 }catch (SQLException el) {
					 el.printStackTrace();
				 }
			}
		});
		btnBorrar.setBounds(156, 194, 89, 23);
		frame.getContentPane().add(btnBorrar);
		
		txtmatricula = new JTextField();
		txtmatricula.setBounds(126, 105, 227, 32);
		frame.getContentPane().add(txtmatricula);
		txtmatricula.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(39, 71, 46, 14);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblMatricula = new JLabel("matricula");
		lblMatricula.setBounds(49, 114, 46, 14);
		frame.getContentPane().add(lblMatricula);
		
		lblN = new JLabel("New label");
		lblN.setBounds(126, 239, 227, 70);
		frame.getContentPane().add(lblN);
	}
}
