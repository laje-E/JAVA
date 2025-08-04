import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Component;
import javax.swing.Box;
import java.awt.BorderLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PONG extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PONG frame = new PONG();
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
	public PONG() {
		contentPane = new JPanel(null);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
	//	int cont = 0;
		
		JPanel barrita1 = new JPanel();
		barrita1.setBounds(30, 73, 10, 66);
		
		
		setFocusable(true);
		requestFocusInWindow();		
		
		barrita1.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				barrita1.setLocation(0, 20);
				System.out.println("funciona todo pipi cucu");
			}
		});
		barrita1.setBackground(new Color(0, 0, 0));
		contentPane.add(barrita1);
		
		
		
		JPanel barrita2 = new JPanel();
		barrita2.setBackground(Color.BLACK);
		barrita2.setBounds(386, 73, 10, 66);
		contentPane.add(barrita2);
		
		


	}
}
