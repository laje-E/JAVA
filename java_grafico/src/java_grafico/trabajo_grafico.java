package java_grafico;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class trabajo_grafico {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtNum1;
	private JTextField txtNum2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					trabajo_grafico window = new trabajo_grafico();
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
	public trabajo_grafico() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSuma = new JButton("SUMA");
		btnSuma.setBounds(167, 28, 89, 23);
		frame.getContentPane().add(btnSuma);
		
		JButton btnResta = new JButton("RESTA");
		btnResta.setBounds(32, 28, 89, 23);
		frame.getContentPane().add(btnResta);
		
		JButton btnMult = new JButton("MULT");
		btnMult.setBounds(309, 28, 89, 23);
		frame.getContentPane().add(btnMult);
		
		JButton btnDiv = new JButton("DIV");
		btnDiv.setBounds(309, 82, 89, 23);
		frame.getContentPane().add(btnDiv);
		
		txtNum1 = new JTextField();
		txtNum1.setHorizontalAlignment (SwingConstants.RIGHT);
		txtNum1.setText ("0");
		txtNum1.setBounds(54, 134, 86, 20);
		frame.getContentPane().add(txtNum1);
		txtNum1.setColumns(10);
		
		txtNum2 = new JTextField();
		txtNum2.setHorizontalAlignment (SwingConstants.RIGHT);
		txtNum2.setText ("0");
		txtNum2.setBounds(54, 165, 86, 20);
		frame.getContentPane().add(txtNum2);
		txtNum2.setColumns(10); 
		
		JLabel lblNum1 = new JLabel("Numero 1");
		lblNum1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNum1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNum1.setBounds(167, 137, 197, 14);
		frame.getContentPane().add(lblNum1);
		
		JLabel lblNum2 = new JLabel("Numero 2");
		lblNum2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNum2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNum2.setBounds(167, 168, 197, 14);
		frame.getContentPane().add(lblNum2);
		
		JLabel lblResul = new JLabel("Resultado");
		lblResul.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblResul.setHorizontalAlignment(SwingConstants.CENTER);
		lblResul.setBounds(167, 220, 197, 14);
		frame.getContentPane().add(lblResul);
		
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(txtNum1.getText());
				int num2 = Integer.parseInt(txtNum2.getText());
				int suma = num1 + num2;
				lblResul.setText(String.valueOf(suma));
				lblNum1.setText(String.valueOf(num1));
				lblNum2.setText(String.valueOf(num2));
			}
		});
		
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(txtNum1.getText());
				int num2 = Integer.parseInt(txtNum2.getText());
				int resta = num1 - num2;
				lblResul.setText(String.valueOf(resta));
				lblNum1.setText(String.valueOf(num1));
				lblNum2.setText(String.valueOf(num2));
			}
		});
		
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(txtNum1.getText());
				int num2 = Integer.parseInt(txtNum2.getText());
				int mult = num1 * num2;
				lblResul.setText(String.valueOf(mult));
				lblNum1.setText(String.valueOf(num1));
				lblNum2.setText(String.valueOf(num2));
			}
		});
		
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(txtNum1.getText());
				int num2 = Integer.parseInt(txtNum2.getText());
				int Div = num1 / num2;
				lblResul.setText(String.valueOf(Div));
				lblNum1.setText(String.valueOf(num1));
				lblNum2.setText(String.valueOf(num2));
			}
		});
		
	}
}
