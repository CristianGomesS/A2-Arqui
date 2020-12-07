package TrabalhoAv2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.awt.*;
import javax.swing.*;

public class Login<LoginSenha> extends JFrame{
	
	JLabel labelUsuario;
	JLabel labelSenha;
	
	JTextField campoUsuario;
	JTextField campoSenha;
	
	
	JButton botaoLogar;
	JButton botaoCadastrar;
	
	public Login () {
		
		setLayout(new BorderLayout());

		setLayout(new FlowLayout(20,30,20));
		
		labelUsuario= new JLabel("Usuario");
		labelSenha= new JLabel("Senha");
		
		campoSenha = new JTextField(10);
		campoUsuario= new JTextField(20);
		
		botaoLogar= new JButton("Login");
		botaoCadastrar= new JButton("Cadastrar");
		
		add(labelUsuario);
		add(campoUsuario);
		
		add(labelSenha);
		add(campoSenha);
		
		botaoLogar.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String nomeArquivoUsuario="usuarios.txt";
				
				List<Usuario>usuario= UsuarioCSV.lerUsuarioArquivoCSV(nomeArquivoUsuario);
				
				
				String login = campoUsuario.getText();
				String senha = campoSenha.getText();
				
				for(Usuario U:usuario) {
					String senha1 = U.getSenha();
					String login1 = U.getLogin();
				
					System.out.println(senha1);
				
				
				if (login==login1&&senha==senha1) {
						
					 	EscolherListas tela1 = new EscolherListas();
					 	tela1.setSize(200,200);
						tela1.setVisible(true);
						setVisible(false);
					}else {
						System.out.println("Usuario nao cadastrado");
						
					}
					
				}
			
				
			}});
		
		botaoCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent a) {
				
			Cadastrar cadastro = new Cadastrar();
			cadastro.setSize(400,300);
			cadastro.setVisible(true);
			}
		});
		
		JPanel painelBotoesInferior = new JPanel();
		painelBotoesInferior.add(botaoLogar);
		painelBotoesInferior.add(botaoCadastrar);
		
		this.add(painelBotoesInferior,BorderLayout.SOUTH);
		
		
		
	}

}
