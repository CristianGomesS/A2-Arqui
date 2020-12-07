package TrabalhoAv2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.List;

import javax.swing.*;
import java.awt.*;

public class Cadastrar extends JFrame {


	
	JLabel labelNome;
	JLabel labelSobrenome;
	JLabel labelIdade;
	JLabel labelCargo;
	JLabel labelDescricao;
	JLabel	labelTipo;
	JLabel labelLogin;
	JLabel labelSenha;
	
	
	JTextField campoNome;
	JTextField campoSobrenome;
	JTextField campoIdade;
	JTextField campoCargo;
	JTextField campoDescricao;
	JTextField campoTipo;
	JTextField campoLogin;
	JTextField campoSenha;
	JButton botaoCadastrar;
	

	public Cadastrar() {

		setLayout(new FlowLayout(10,30,0));

		labelNome=new JLabel("Nome");
	
		labelSobrenome=new JLabel("Sobrenome");
		labelIdade=new JLabel("Idade");
		labelCargo=new JLabel("Cargo");
		labelDescricao = new JLabel("Descrição");
		labelTipo =new JLabel ("Tipo Usuario");
		labelLogin = new JLabel("Login");
		labelSenha = new JLabel("Senha");
			
		campoNome = new JTextField(30);
		campoSobrenome = new JTextField(20);
		campoIdade = new JTextField(10);
		campoCargo = new JTextField(10);
		campoDescricao = new JTextField(30);
		campoTipo = new JTextField(10);
		campoLogin = new JTextField(20);
		campoSenha = new JTextField(10);
		
		
		
		add(labelNome);
		add(campoNome);

		add(labelSobrenome);
		add(campoSobrenome);

		add(labelIdade);
		add(campoIdade);

		add(labelCargo);
		add(campoCargo);

		add(labelDescricao);
		add(campoDescricao);

		add(labelTipo);
		add(campoTipo);
		
		
		botaoCadastrar = new JButton("Salvar");

		botaoCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});

		
		JPanel painelBotoesInferior = new JPanel();
		painelBotoesInferior.add(botaoCadastrar);
		
		this.add(painelBotoesInferior,BorderLayout.SOUTH);



	}
	

}
	

