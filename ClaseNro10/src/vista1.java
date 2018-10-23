import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vista1 {

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
					vista1 window = new vista1();
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
	public vista1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 611, 439);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblIngreseElPrimer = new JLabel("Ingrese el primer valor:");
		lblIngreseElPrimer.setBounds(22, 11, 128, 14);
		frame.getContentPane().add(lblIngreseElPrimer);
		
		textvalor1 = new JTextField();
		textvalor1.setBounds(150, 8, 77, 20);
		frame.getContentPane().add(textvalor1);
		textvalor1.setColumns(10);
		
		JLabel lblIngreseElSegundo = new JLabel("Ingrese el segundo valor:");
		lblIngreseElSegundo.setBounds(10, 53, 128, 14);
		frame.getContentPane().add(lblIngreseElSegundo);
		
		textvalor2 = new JTextField();
		textvalor2.setBounds(150, 50, 77, 20);
		frame.getContentPane().add(textvalor2);
		textvalor2.setColumns(10);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(233, 29, 86, 14);
		frame.getContentPane().add(lblResultado);
		
		textresultado = new JTextField();
		textresultado.setEditable(false);
		textresultado.setBounds(294, 26, 86, 20);
		frame.getContentPane().add(textresultado);
		textresultado.setColumns(10);
		
		JButton btnSumar = new JButton("sumar");
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int v1=Integer.parseInt(textvalor1.getText());
				int v2=Integer.parseInt(textvalor2.getText());
				int suma= v1+v2;
				textresultado.setText(String.valueOf(suma));
			}
		});
		btnSumar.setBounds(138, 81, 89, 23);
		frame.getContentPane().add(btnSumar);
	}
}
