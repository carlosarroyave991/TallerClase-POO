import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;

public class calc {
	
	String memoria1;
	String signo;
	String memoria2;

	private JFrame frame;
	private JTextField textresultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calc window = new calc();
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
	public calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	public static boolean existepunto(String cadena){
		boolean resultado;
		resultado=false;
		
		for(int i=0;i<cadena.length(); i++) {
			if(cadena.substring(i, i+1).equals(".")) {
				resultado=true;
				break;
			}
			
		}
		
		return resultado;
	}
	
	public static String calculadora(String memoria1, String memoria2, String signo) {
		Double resultado=0.0;
		String respuesta;
		
		if(signo.equals("-")) {
			resultado=Double.parseDouble(memoria1)-Double.parseDouble(memoria2);
		}
		
		if(signo.equals("+")) {
			resultado=Double.parseDouble(memoria1)+Double.parseDouble(memoria2);
		}
		if(signo.equals("*")) {
			resultado=Double.parseDouble(memoria1)*Double.parseDouble(memoria2);
		}
		if(signo.equals("/")) {
			resultado=Double.parseDouble(memoria1)/Double.parseDouble(memoria2);
		}
		
		respuesta=resultado.toString();
		return respuesta;
		
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textresultado.setText(textresultado.getText()+"1");
			}
		});
		button1.setBackground(new Color(102, 153, 255));
		button1.setForeground(Color.WHITE);
		button1.setBounds(198, 182, 48, 23);
		frame.getContentPane().add(button1);
		
		JButton button2 = new JButton("2");
		button2.setBackground(new Color(102, 153, 255));
		button2.setForeground(Color.WHITE);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textresultado.setText(textresultado.getText()+"2");
			}
		});
		button2.setBounds(126, 182, 48, 23);
		frame.getContentPane().add(button2);
		
		JButton button3 = new JButton("3");
		button3.setBackground(new Color(102, 153, 255));
		button3.setForeground(Color.WHITE);
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textresultado.setText(textresultado.getText()+"3");
			}
		});
		button3.setBounds(55, 182, 48, 23);
		frame.getContentPane().add(button3);
		
		JButton button4 = new JButton("4");
		button4.setBackground(new Color(102, 153, 255));
		button4.setForeground(Color.WHITE);
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textresultado.setText(textresultado.getText()+"4");
			}
		});
		button4.setBounds(198, 148, 48, 23);
		frame.getContentPane().add(button4);
		
		JButton button5 = new JButton("5");
		button5.setBackground(new Color(102, 153, 255));
		button5.setForeground(Color.WHITE);
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textresultado.setText(textresultado.getText()+"5");
			}
		});
		button5.setBounds(126, 148, 48, 23);
		frame.getContentPane().add(button5);
		
		JButton button6 = new JButton("6");
		button6.setBackground(new Color(102, 153, 255));
		button6.setForeground(Color.WHITE);
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textresultado.setText(textresultado.getText()+"6");
			}
		});
		button6.setBounds(55, 148, 48, 23);
		frame.getContentPane().add(button6);
		
		JButton button7 = new JButton("7");
		button7.setBackground(new Color(102, 153, 255));
		button7.setForeground(Color.WHITE);
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textresultado.setText(textresultado.getText()+"7");
			}
		});
		button7.setBounds(198, 114, 48, 23);
		frame.getContentPane().add(button7);
		
		JButton button8 = new JButton("8");
		button8.setBackground(new Color(102, 153, 255));
		button8.setForeground(Color.WHITE);
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textresultado.setText(textresultado.getText()+"8");
			}
		});
		button8.setBounds(126, 114, 48, 23);
		frame.getContentPane().add(button8);
		
		JButton button9 = new JButton("9");
		button9.setBackground(new Color(102, 153, 255));
		button9.setForeground(Color.WHITE);
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textresultado.setText(textresultado.getText()+"9");
			}
		});
		button9.setBounds(55, 114, 48, 23);
		frame.getContentPane().add(button9);
		
		JButton button0 = new JButton("0");
		button0.setBackground(new Color(102, 153, 255));
		button0.setForeground(Color.WHITE);
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textresultado.setText(textresultado.getText()+"0");
			}
		});
		button0.setBounds(55, 214, 119, 23);
		frame.getContentPane().add(button0);
		
		JButton button_igual = new JButton("=");
		button_igual.setBackground(new Color(102, 153, 255));
		button_igual.setForeground(Color.WHITE);
		button_igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String resultado;
				memoria2=textresultado.getText();
				
				if(!memoria2.equals("")) {
					resultado=calculadora(memoria1, memoria2, signo);
					textresultado.setText(resultado);
					
				}
			}
		});
		button_igual.setBounds(314, 182, 48, 55);
		frame.getContentPane().add(button_igual);
		
		JButton button_div = new JButton("/");
		button_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!textresultado.getText().equals("")) {
					memoria1=textresultado.getText();
					signo="/";
					textresultado.setText("");
				}
				
			}
		});
		button_div.setBackground(new Color(102, 153, 255));
		button_div.setForeground(Color.WHITE);
		button_div.setBounds(256, 214, 54, 23);
		frame.getContentPane().add(button_div);
		
		JButton button_mult = new JButton("*");
		button_mult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!textresultado.getText().equals("")) {
					memoria1=textresultado.getText();
					signo="*";
					textresultado.setText("");
				}
			}
		});
		button_mult.setBackground(new Color(102, 153, 255));
		button_mult.setForeground(Color.WHITE);
		button_mult.setBounds(256, 182, 54, 23);
		frame.getContentPane().add(button_mult);
		
		JButton button_punto = new JButton(".");
		button_punto.setBackground(new Color(102, 153, 255));
		button_punto.setForeground(Color.WHITE);
		button_punto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String cadena;
				cadena=textresultado.getText();
				
				if(cadena.length()<=0) {
					textresultado.setText("0.");
				}
				else {
					if(!existepunto(textresultado.getText())) {
						textresultado.setText(textresultado.getText()+".");
					}
				}
			}
		});
		
		
		button_punto.setBounds(198, 214, 48, 23);
		frame.getContentPane().add(button_punto);
		
		JButton button_suma = new JButton("+");
		button_suma.setBackground(new Color(102, 153, 255));
		button_suma.setForeground(Color.WHITE);
		button_suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!textresultado.getText().equals("")) {
					memoria1=textresultado.getText();
					signo="+";
					textresultado.setText("");
				}
			}
		});
		button_suma.setBounds(256, 148, 54, 23);
		frame.getContentPane().add(button_suma);
		
		textresultado = new JTextField();
		textresultado.setEditable(false);
		textresultado.setBounds(55, 62, 307, 32);
		frame.getContentPane().add(textresultado);
		textresultado.setColumns(10);
		
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textresultado.setText("");
			}
		});
		btnCe.setBackground(new Color(102, 153, 255));
		btnCe.setForeground(Color.WHITE);
		btnCe.setBounds(256, 114, 54, 23);
		frame.getContentPane().add(btnCe);
		
		JButton btnC = new JButton("C");
		btnC.setBackground(new Color(102, 153, 255));
		btnC.setForeground(Color.WHITE);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String cadena;
				cadena=textresultado.getText();
				
				if(cadena.length()>0) {
					cadena=cadena.substring(0, cadena.length()-1);
					textresultado.setText(cadena);
				}
			}
		});
		btnC.setBounds(314, 114, 48, 23);
		frame.getContentPane().add(btnC);
		
		JButton button_resta = new JButton("-");
		button_resta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!textresultado.getText().equals("")) {
					memoria1=textresultado.getText();
					signo="-";
					textresultado.setText("");
				}
			}
		});
		button_resta.setBackground(new Color(102, 153, 255));
		button_resta.setForeground(Color.WHITE);
		button_resta.setBounds(314, 148, 48, 23);
		frame.getContentPane().add(button_resta);
	}

}
