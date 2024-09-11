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

import controle.UsuarioDAO;
import modelo.Usuario;

import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.DefaultComboBoxModel;

public class TelaCadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txtNome;
	private JTextField txtCPF;
	private JTextField txtEmail;
	private JTextField txtSenha;
	private static UsuarioDAO uDAO = UsuarioDAO.getInstancia();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
					frame.setLocationRelativeTo(null); 
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

		PicPanel panel = new PicPanel("src//IMG/BackgroundCompleto.png");
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(1, 0, 0, 0));

		JPanel PainelKSF = new JPanel();
		panel.add(PainelKSF);

		JPanel PainelCadastro = new JPanel();
		PainelCadastro.setBorder(null);
		panel.add(PainelCadastro);

		PainelCadastro.setOpaque(false);
		PainelCadastro
				.setLayout(new MigLayout("", "[grow][533px][grow]", "[50px][136px][300px][80px][100px][20px][50px]"));

		JPanel painelTitulo = new JPanel();
		painelTitulo.setOpaque(false);
		PainelCadastro.add(painelTitulo, "cell 1 1,grow");
		painelTitulo.setLayout(null);

		JLabel lblNewLabel = new JLabel("Crie uma conta");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("/Fontes/Roboto-Black.ttf", Font.PLAIN, 50));
		lblNewLabel.setBounds(10, 11, 513, 114);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		painelTitulo.add(lblNewLabel);

		JPanel PainelInfo = new JPanel();
		PainelInfo.setBorder(new EmptyBorder(0, 60, 0, 50));
		PainelCadastro.add(PainelInfo, "cell 1 2,grow");
		PainelInfo.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		PainelInfo.add(panel_1);
		panel_1.setLayout(new MigLayout("", "[][][]", "[]"));

		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setFont(new Font("/Fontes/Roboto-Black.ttf", Font.PLAIN, 13));
		panel_1.add(lblNewLabel_1, "cell 0 0");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));

		JLabel lblNewLabel_7 = new JLabel("*");
		lblNewLabel_7.setForeground(new Color(255, 0, 0));
		panel_1.add(lblNewLabel_7, "cell 1 0");

		txtNome = new JTextField();
		txtNome.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		txtNome.setBackground(new Color(255, 255, 255));
		txtNome.setForeground(new Color(0, 0, 0));
		PainelInfo.add(txtNome);
		txtNome.setColumns(10);

		JPanel panel_2 = new JPanel();
		panel_2.setOpaque(false);
		PainelInfo.add(panel_2);
		panel_2.setLayout(new MigLayout("", "[][]", "[]"));

		JLabel lblNewLabel_2 = new JLabel("CPF");
		lblNewLabel_2.setFont(new Font("/Fontes/Roboto-Black.ttf", Font.PLAIN, 13));
		panel_2.add(lblNewLabel_2, "cell 0 0");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));

		JLabel lblNewLabel_7_1 = new JLabel("*");
		lblNewLabel_7_1.setForeground(Color.RED);
		panel_2.add(lblNewLabel_7_1, "cell 1 0");

		txtCPF = new JTextField();
		txtCPF.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		PainelInfo.add(txtCPF);
		txtCPF.setColumns(10);

		JPanel panel_3 = new JPanel();
		panel_3.setOpaque(false);
		PainelInfo.add(panel_3);
		panel_3.setLayout(new MigLayout("", "[][]", "[]"));

		JLabel lblNewLabel_3 = new JLabel("Email");
		lblNewLabel_3.setFont(new Font("/Fontes/Roboto-Black.ttf", Font.PLAIN, 13));
		panel_3.add(lblNewLabel_3, "cell 0 0");
		lblNewLabel_3.setForeground(new Color(0, 0, 0));

		JLabel lblNewLabel_7_2 = new JLabel("*");
		lblNewLabel_7_2.setForeground(Color.RED);
		panel_3.add(lblNewLabel_7_2, "cell 1 0");

		txtEmail = new JTextField();
		txtEmail.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		PainelInfo.add(txtEmail);
		txtEmail.setColumns(10);

		JPanel panel_4 = new JPanel();
		panel_4.setOpaque(false);
		PainelInfo.add(panel_4);
		panel_4.setLayout(new MigLayout("", "[][]", "[]"));

		JLabel lblNewLabel_4 = new JLabel("Senha");
		lblNewLabel_4.setFont(new Font("/Fontes/Roboto-Black.ttf", Font.PLAIN, 13));
		panel_4.add(lblNewLabel_4, "cell 0 0");
		lblNewLabel_4.setForeground(new Color(0, 0, 0));

		JLabel lblNewLabel_7_3 = new JLabel("*");
		lblNewLabel_7_3.setForeground(Color.RED);
		panel_4.add(lblNewLabel_7_3, "cell 1 0");

		txtSenha = new JTextField();
		txtSenha.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		PainelInfo.add(txtSenha);
		txtSenha.setColumns(10);

		JPanel PainelOpcao = new JPanel();
		PainelOpcao.setBorder(new EmptyBorder(0, 60, 0, 50));
		PainelCadastro.add(PainelOpcao, "cell 1 3,grow");
		PainelOpcao.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panel_5 = new JPanel();
		panel_5.setOpaque(false);
		PainelOpcao.add(panel_5);
		panel_5.setLayout(new MigLayout("", "[][]", "[][]"));

		JLabel lblNewLabel_5 = new JLabel("Selecione uma opção de usuario");
		lblNewLabel_5.setFont(new Font("/Fontes/Roboto-Black.ttf", Font.PLAIN, 13));
		lblNewLabel_5.setForeground(new Color(0, 0, 0));
		panel_5.add(lblNewLabel_5, "cell 0 0,alignx left,aligny bottom");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5.setVerticalAlignment(SwingConstants.BOTTOM);

		JLabel lblNewLabel_7_3_1 = new JLabel("*");
		lblNewLabel_7_3_1.setForeground(Color.RED);
		panel_5.add(lblNewLabel_7_3_1, "cell 1 0");

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"tst1", "tst2", "tste3"}));
		comboBox.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_5.add(comboBox, "cell 0 1");
		comboBox.setBackground(new Color(154, 205, 217));

		JPanel PainelConfirm = new JPanel();
		PainelConfirm.setBorder(new EmptyBorder(0, 60, 0, 50));
		PainelCadastro.add(PainelConfirm, "cell 1 4,grow");
		PainelConfirm.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel PainelBTN = new JPanel();
		PainelConfirm.add(PainelBTN);

		painelTitulo.setOpaque(false);
		PainelInfo.setOpaque(false);
		PainelOpcao.setOpaque(false);
		PainelConfirm.setOpaque(false);
		PainelBTN.setOpaque(false);

		txtNome.setOpaque(false);
		txtCPF.setOpaque(false);
		txtEmail.setOpaque(false);
		txtSenha.setOpaque(false);

		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setFont(new Font("/Fontes/Roboto-Black.ttf", Font.PLAIN, 13));
		btnNewButton.setBackground(new Color(8, 127, 140));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario user = new Usuario();
				
				String Nome = txtNome.getText();
				String CPF = txtCPF.getText();
				String Email = txtEmail.getText();
				String Senha = txtSenha.getText();

				if (!Nome.isEmpty() || !CPF.isEmpty() || !Email.isEmpty() || !Senha.isEmpty()) {
					
					user.setNome(Nome);
					user.setCpf(CPF);
					user.setEmail(Email);
					user.setSenha(Senha);
					uDAO.inserirUsuario(user);
					System.out.println("User inserido!");

				} else {
					//TelaError erro = new TelaError();
					
					System.out.println("Campo vazio");
					//erro.setLocationRelativeTo(null);
					//erro.setVisible(true);
				}

			}
		});

		JLabel lblNewLabel_6 = new JLabel("Já tem uma conta? Acesse Aqui.");
		lblNewLabel_6.setFont(new Font("/Fontes/Roboto-Black.ttf", Font.PLAIN, 13));
		lblNewLabel_6.setForeground(new Color(0, 92, 214));
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaLogin frame = new TelaLogin();

				setVisible(false);				 
				frame.setVisible(true);

			}
		});
		GroupLayout gl_PainelBTN = new GroupLayout(PainelBTN);
		gl_PainelBTN.setHorizontalGroup(gl_PainelBTN.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
				gl_PainelBTN.createSequentialGroup().addContainerGap(143, Short.MAX_VALUE)
						.addGroup(gl_PainelBTN.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnNewButton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblNewLabel_6, Alignment.TRAILING))
						.addGap(130)));
		gl_PainelBTN.setVerticalGroup(gl_PainelBTN.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_PainelBTN.createSequentialGroup().addGap(31)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_6).addContainerGap()));
		PainelBTN.setLayout(gl_PainelBTN);
		PainelKSF.setOpaque(false);
		PainelKSF.setLayout(null);

	}
}
