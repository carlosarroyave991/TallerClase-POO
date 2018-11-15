import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana {

	private JFrame frame;
	private JTextField textvalor1;
	private JTextField textvalor2;
	private JTextField textresultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
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
	public Ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblIngreseElPrimer = new JLabel("ingrese el segundo valor");
		lblIngreseElPrimer.setBounds(21, 44, 117, 29);
		frame.getContentPane().add(lblIngreseElPrimer);
		
		textvalor1 = new JTextField();
		textvalor1.setBounds(179, 13, 177, 20);
		frame.getContentPane().add(textvalor1);
		textvalor1.setColumns(10);
		
		JLabel label = new JLabel("ingrese el primer valor");
		label.setBounds(32, 4, 106, 29);
		frame.getContentPane().add(label);
		
		textvalor2 = new JTextField();
		textvalor2.setColumns(10);
		textvalor2.setBounds(179, 48, 177, 20);
		frame.getContentPane().add(textvalor2);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(79, 95, 48, 29);
		frame.getContentPane().add(lblResultado);
		
		textresultado = new JTextField();
		textresultado.setEditable(false);
		textresultado.setColumns(10);
		textresultado.setBounds(179, 99, 177, 20);
		frame.getContentPane().add(textresultado);
		
		JButton btnSumar = new JButton("Sumar");
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int v1 = Integer.parseInt(textvalor1.getText());
				int v2 = Integer.parseInt(textvalor2.getText());
				int suma=v1+v2;
				textresultado.setText(String.valueOf(suma));
			}
		});
		btnSumar.setBounds(267, 140, 89, 23);
		frame.getContentPane().add(btnSumar);
	}
}
