package TrabalhoAv2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.*;
import javax.swing.*;


public class EscolherListas extends JFrame{

	JButton LProduto;
	JButton LUsuario;
	
	public EscolherListas() {
		
		
		setLayout(new FlowLayout());
		
		LProduto = new JButton("Produtos");
		LUsuario =new JButton("Usuarios");
		
		LUsuario.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String nomeArquivoUsuario="usuarios.txt";
						
				List<Usuario>usuario= UsuarioCSV.lerUsuarioArquivoCSV(nomeArquivoUsuario);
				
				ListaUsuario ListUsuario =new ListaUsuario(usuario);
				ListUsuario.setSize(550, 500); 
				ListUsuario.setVisible(true); 
				
			}
		});
		
		LProduto.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent a) {
				
				String nomeArquivo="livros.txt";
				
				List<Livro> livros= LivrosCSV.lerLivroArquivoCSV(nomeArquivo);
				
				TelaLista ListProduto=new TelaLista(livros);
				ListProduto.setSize(550, 500); 
				ListProduto.setVisible(true); 
				
			}
		});
		
	JPanel painelBotoesInferior =new JPanel();
	painelBotoesInferior.add(LProduto);
	painelBotoesInferior.add(LUsuario);
	
	this.add(painelBotoesInferior,BorderLayout.NORTH);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	}
