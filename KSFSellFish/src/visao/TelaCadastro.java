package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.Dimension;

import javax.swing.SpringLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.SwingConstants;

public class TelaCadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
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
	public TelaCadastro() {
		setResizable(false);
		setLocationByPlatform(true);
		setMinimumSize(new Dimension(1176, 664));
		setMaximumSize(new Dimension(1920, 1080));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 768);
		getContentPane().setLayout(new BorderLayout(0, 0));
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		
		
		PicPanel panel = new PicPanel("src//IMG/Background.png");
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel PainelKSF = new JPanel();
		panel.add(PainelKSF);
		
		JPanel PainelCadastro = new JPanel();
		panel.add(PainelCadastro);
		
		PainelCadastro.setOpaque(false);
		PainelCadastro.setLayout(new MigLayout("", "[grow][533px][grow]", "[50px][136px][300px][80px][100px][20px][50px]"));
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		PainelCadastro.add(panel_1, "cell 1 1,grow");
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Crie uma conta");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblNewLabel.setBounds(10, 11, 513, 114);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		PainelCadastro.add(panel_2, "cell 1 2,grow");
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Nome Completo");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		panel_2.add(lblNewLabel_1);
		
		textField = new JTextField();
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("CPF");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setVerticalAlignment(SwingConstants.BOTTOM);
		panel_2.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Email");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setVerticalAlignment(SwingConstants.BOTTOM);
		panel_2.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Senha");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setVerticalAlignment(SwingConstants.BOTTOM);
		panel_2.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		PainelCadastro.add(panel_3, "cell 1 3,grow");
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_5 = new JLabel("Selecione uma opção de usuario");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5.setVerticalAlignment(SwingConstants.BOTTOM);
		panel_3.add(lblNewLabel_5);
		
		JPanel panel_7 = new JPanel();
		panel_3.add(panel_7);
		panel_7.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 11, 66, 22);
		panel_7.add(comboBox);
		
		JPanel panel_4 = new JPanel();
		PainelCadastro.add(panel_4, "cell 1 4,grow");
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_4.add(panel_6);
		panel_6.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(197, 36, 136, 37);
		panel_6.add(btnNewButton);
		
		JPanel panel_5 = new JPanel();
		PainelCadastro.add(panel_5, "cell 1 5,grow");
		panel_5.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		panel_5.add(lblNewLabel_6);
		PainelKSF.setOpaque(false);
		PainelKSF.setLayout(null);
		
	}
}
