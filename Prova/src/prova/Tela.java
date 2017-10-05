package prova;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Tela extends JFrame{

	private static final long serialVersionUID = 6239363574615996906L;
	
	private JPanel contentPane;
	
	public Tela(){
		this.setTitle("Prova");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 450);
		this.setLocationRelativeTo(null);
		addComponents();
	}
	
	public void addComponents(){
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		this.setContentPane(contentPane);
		
		//=================== WEST PANEL =================================
		JPanel westPanel = new JPanel();
		westPanel.setBackground(Color.GRAY);
		westPanel.setPreferredSize(new Dimension(150,0));
		westPanel.setLayout(new GridBagLayout());
		contentPane.add(westPanel, BorderLayout.WEST);
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		//Botao1
		JButton botao1 = new JButton();
		botao1.setText("Bot�o 1");
		botao1.setPreferredSize(new Dimension(90, 30));
		gbc.gridx = 0;
		gbc.gridy = 0;
		botao1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				click();
				
			}
		});
		westPanel.add(botao1,gbc);
		
		//Botao2
		JButton botao2 = new JButton();
		botao2.setText("Bot�o 2");
		botao2.setPreferredSize(new Dimension(90, 30));
		gbc.gridx = 0;
		gbc.gridy = 1;
		botao2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				click();
				
			}
		});
		westPanel.add(botao2,gbc);
		
		//Botao3
		JButton botao3 = new JButton();
		botao3.setText("Bot�o 3");
		botao3.setPreferredSize(new Dimension(90, 30));
		gbc.gridx = 0;
		gbc.gridy = 2;
		botao3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				click();
				
			}
		});
		westPanel.add(botao3,gbc);
				
		//Botao4
		JButton botao4 = new JButton();
		botao4.setText("Bot�o 4");
		botao4.setPreferredSize(new Dimension(90, 30));
		gbc.gridx = 0;
		gbc.gridy = 3;
		botao4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				click();
				
			}
		});
		westPanel.add(botao4,gbc);
				
		//Botao5
		JButton botao5 = new JButton();
		botao5.setText("Bot�o 5");
		botao5.setPreferredSize(new Dimension(90, 30));
		gbc.gridx = 0;
		gbc.gridy = 4;
		botao5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				click();
				
			}
		});
		westPanel.add(botao5,gbc);
				
		//Botao6
		JButton botao6 = new JButton();
		botao6.setText("Bot�o 6");
		botao6.setPreferredSize(new Dimension(90, 30));
		gbc.gridx = 0;
		gbc.gridy = 5;
		botao6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				click();
				
			}
		});
		westPanel.add(botao6,gbc);
				
		//Botao7
		JButton botao7 = new JButton();
		botao7.setText("Bot�o 7");
		botao7.setPreferredSize(new Dimension(90, 30));
		gbc.gridx = 0;
		gbc.gridy = 6;
		botao7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				click();
				
			}
		});
		westPanel.add(botao7,gbc);
				
		//Botao8
		JButton botao8 = new JButton();
		botao8.setText("Bot�o 8");
		botao8.setPreferredSize(new Dimension(90, 30));
		gbc.gridx = 0;
		gbc.gridy = 7;
		botao8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				click();
				
			}
		});
		westPanel.add(botao8,gbc);
				
		//Botao9
		JButton botao9 = new JButton();
		botao9.setText("Bot�o 9");
		botao9.setPreferredSize(new Dimension(90, 30));
		gbc.gridx = 0;
		gbc.gridy = 8;
		botao9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				click();
				
			}
		});
		westPanel.add(botao9,gbc);
				
		//Botao10
		JButton botao10 = new JButton();
		botao10.setText("Bot�o 10");
		botao10.setPreferredSize(new Dimension(90, 30));
		gbc.gridx = 0;
		gbc.gridy = 9;
		botao10.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				click();
				
			}
		});
		westPanel.add(botao10,gbc);
		
		//================= CENTER PANEL =====================
		JPanel centerPanel = new JPanel();
		centerPanel.setPreferredSize(new Dimension(200,200));
		centerPanel.setLayout(new GridBagLayout());
		contentPane.add(centerPanel, BorderLayout.CENTER);
		
		//GridBagConstraints gbc = new GridBagConstraints();
		
		//Nome
		JLabel nome = new JLabel();
		nome.setText("Nome: ");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.LINE_END;
		gbc.insets = new Insets(15, 15, 10, 15);
		centerPanel.add(nome,gbc);
		
		//Nome Text
		JTextField txtNome = new JTextField();
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.weightx = 1.0;
		gbc.insets = new Insets(15,0,10,15);
		gbc.anchor = GridBagConstraints.LINE_START;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		centerPanel.add(txtNome,gbc);
		
		//E-mail
		JLabel email = new JLabel();
		email.setText("E-mail: ");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.weightx = 0.0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.LINE_END;
		gbc.insets = new Insets(15, 15, 10, 15);
		centerPanel.add(email,gbc);
		
		//Email Text
		JTextField txtemail = new JTextField();
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.weightx = 1.0;
		gbc.insets = new Insets(15,0,10,15);
		gbc.anchor = GridBagConstraints.LINE_START;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		centerPanel.add(txtemail,gbc);
		
		//Salvar
		JButton salvar = new JButton();
		salvar.setText("Salvar");
		salvar.setPreferredSize(new Dimension(70, 20));
		gbc.weightx = 0.0;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.NONE;
		gbc.gridx = 1;
		gbc.gridy = 2;
		centerPanel.add(salvar,gbc);
		
		//TABELA
		Object[][] data = {
				{"Jo�o", "111.111.111-11", "joao@gmail.com"},
				{"Maria", "222.222.222-22", "maria@gmail.com"},	
				{"Jos�", "333.333.333-33", "jose@gmail.com"}
		};
		Object[] columnNames = {
			"Nome", "CPF", "E-mail"	
		};
		JTable dataTable = new JTable(data, columnNames);
		dataTable.setFillsViewportHeight(true);
		JScrollPane tableScrollPane = new JScrollPane(dataTable);
		tableScrollPane.setMinimumSize(new Dimension(100, 100));
		tableScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		tableScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.gridwidth = 2;
		gbc.weightx = 1.0;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.CENTER;
		centerPanel.add(tableScrollPane, gbc);
	}
	
	private void click(){
		JOptionPane.showMessageDialog(this, "Eu sou o respons�vel pelo meu futuro!");
	}

}
