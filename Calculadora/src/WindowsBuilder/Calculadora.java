package WindowsBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.Color;

public class Calculadora {

	private String resultado = "";
	private String resultado2;
	private String bt;
	private JFrame frame;
	private JTextField pantalla;

	private void mas_menos() {
		double a;
		if (resultado2 == null)
			resultado2 = "0";
		if (bt == "mas_menos" || bt == null) {
			resultado = pantalla.getText();
			a = -(Double.valueOf(resultado));
			resultado = "";
			resultado2 = String.valueOf(a);
			pantalla.setText(resultado2);
		} else if (bt == "multiplica")
			multiplica();
		else if (bt == "resta")
			resta();
		else if (bt == "divide")
			divide();
		else if (bt == "suma")
			suma();

	}

	private void suma() {
		double a;
		if (resultado2 == null)
			resultado2 = "0";
		if (bt == "suma" || bt == null) {
			resultado = pantalla.getText();
			a = Double.valueOf(resultado) + Double.valueOf(resultado2);
			resultado = "";
			resultado2 = String.valueOf(a);
			pantalla.setText(resultado2);
		} else if (bt == "multiplica")
			multiplica();
		else if (bt == "resta")
			resta();
		else if (bt == "divide")
			divide();

	}

	private void resta() {
		double a;
		if (resultado2 == null) {
			resultado2 = resultado;
			pantalla.setText(resultado);
			resultado = "";
		} else if (bt == "resta" || bt == null) {
			resultado = pantalla.getText();
			a = -((Double.valueOf(resultado)) - (Double.valueOf(resultado2)));
			resultado = "";
			resultado2 = String.valueOf(a);
			pantalla.setText(resultado2);
		} else if (bt == "multiplica")
			multiplica();
		else if (bt == "suma")
			suma();
		else if (bt == "divide")
			divide();

	}
	private void divide() {
		double a;

		if (bt == "divide" || bt == null) {
			resultado = pantalla.getText();
			if (resultado2 == null) {
				resultado2 = "1";
				a = Double.valueOf(resultado) / Double.valueOf(resultado2);
			} else
				a = Double.valueOf(resultado2) / Double.valueOf(resultado);
			resultado = "";
			resultado2 = String.valueOf(a);
			pantalla.setText(resultado2);
		} else if (bt == "suma")
			suma();
		else if (bt == "resta")
			resta();
		else if (bt == "multiplica")
			multiplica();

	}

	private void multiplica() {
		double a;
		if (resultado2 == null)
			resultado2 = "1";
		if (bt == "multiplica" || bt == null) {
			resultado = pantalla.getText();
			a = Double.valueOf(resultado) * Double.valueOf(resultado2);
			resultado = "";
			resultado2 = String.valueOf(a);
			pantalla.setText(resultado2);
		} else if (bt == "suma")
			suma();
		else if (bt == "resta")
			resta();
		else if (bt == "divide")
			divide();

	}

	private void igual() {
		if (bt == "suma")
			suma();
		else if (bt == "resta")
			resta();
		else if (bt == "multiplica")
			multiplica();
		else if (bt == "divide")
			divide();
		resultado2=null;
		bt = null;
		
		
	}

	private void btn(String a) {
		resultado += a;
		pantalla.setText(resultado);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
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
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 475, 454);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		pantalla = new JTextField();
		pantalla.setFont(new Font("Tahoma", Font.BOLD, 28));
		pantalla.setHorizontalAlignment(SwingConstants.RIGHT);
		pantalla.setBackground(SystemColor.menu);
		pantalla.setText("0");
		pantalla.setBounds(37, 28, 390, 28);
		frame.getContentPane().add(pantalla);
		pantalla.setColumns(10);

		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn("7");
			}
		});
		btn7.setBounds(37, 67, 70, 70);
		frame.getContentPane().add(btn7);

		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn("4");
			}
		});
		btn4.setBounds(37, 148, 70, 70);
		frame.getContentPane().add(btn4);

		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn("8");
			}
		});
		btn8.setBounds(117, 67, 70, 70);
		frame.getContentPane().add(btn8);

		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn("5");
			}
		});
		btn5.setBounds(117, 148, 70, 70);
		frame.getContentPane().add(btn5);

		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn("1");
			}
		});
		btn1.setBounds(37, 229, 70, 70);
		frame.getContentPane().add(btn1);

		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn("0");
			}
		});
		btn0.setBounds(117, 310, 70, 70);
		frame.getContentPane().add(btn0);

		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn("2");
			}
		});
		btn2.setBounds(117, 229, 70, 70);
		frame.getContentPane().add(btn2);

		JButton btn_coma = new JButton(".");
		btn_coma.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_coma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn(".");
			}
		});
		btn_coma.setBounds(197, 310, 70, 70);
		frame.getContentPane().add(btn_coma);

		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn("9");
			}
		});
		btn9.setBounds(197, 67, 70, 70);
		frame.getContentPane().add(btn9);

		JButton btnX = new JButton("X");
		btnX.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				multiplica();
				bt = "multiplica";
			}
		});
		btnX.setBounds(277, 148, 70, 70);
		frame.getContentPane().add(btnX);

		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn("6");
			}
		});
		btn6.setBounds(197, 148, 70, 70);
		frame.getContentPane().add(btn6);

		JButton btn_menos = new JButton("-");
		btn_menos.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_menos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resta();
				bt = "resta";
			}
		});
		btn_menos.setBounds(357, 229, 70, 70);
		frame.getContentPane().add(btn_menos);

		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn("3");
			}
		});
		btn3.setBounds(197, 229, 70, 70);
		frame.getContentPane().add(btn3);

		JButton btn_mas = new JButton("+");
		btn_mas.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_mas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				suma();
				bt = "suma";
			}
		});
		btn_mas.setBounds(277, 229, 70, 70);
		frame.getContentPane().add(btn_mas);

		JButton btn_division = new JButton("\u00F7");
		btn_division.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				divide();
				bt = "divide";
			}
		});
		btn_division.setBounds(357, 148, 70, 70);
		frame.getContentPane().add(btn_division);

		JButton btn_masmenos = new JButton("+/-");
		btn_masmenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mas_menos();
				bt = "mas_menos";
			}
		});
		btn_masmenos.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_masmenos.setBounds(37, 310, 70, 70);
		frame.getContentPane().add(btn_masmenos);

		JButton btn_igual = new JButton("=");
		btn_igual.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				igual();

			}
		});
		btn_igual.setBounds(277, 310, 150, 70);
		frame.getContentPane().add(btn_igual);

		JButton btnCe = new JButton("CE");
		btnCe.setForeground(new Color(255, 102, 51));
		btnCe.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado = "";
				resultado2 = "";
				pantalla.setText("0");
			}
		});
		btnCe.setBounds(277, 67, 150, 70);
		frame.getContentPane().add(btnCe);
	}
}
