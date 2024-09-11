package visao;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TelaPerfil extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPerfil frame = new TelaPerfil();
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
	public TelaPerfil() {
		
		setResizable(false);
		setLocationByPlatform(true);
		setMinimumSize(new Dimension(1176, 664));
		setMaximumSize(new Dimension(1920, 1080));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 472);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(1, 0, 0, 0));
		
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		PicPanel panel = new PicPanel("src//IMG/Perfil.png");
		contentPane.add(panel, BorderLayout.CENTER);
		
	}

}
