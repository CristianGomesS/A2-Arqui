package TrabalhoAv2;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaEdita extends JFrame{

	TelaEdita telaEdita=this;

	JLabel labelTitulo;
	JLabel labelAutor;
	JLabel labelPreco;
	JLabel labelQuantidade;

	JTextField campoTitulo;
	JTextField campoAutor;
	JTextField campoPreco;
	JTextField campoQuantidade;

	JButton botaoSalvar;


	public TelaEdita(Livro l, int selecionado, TelaLista telaLista) {
		setLayout(new FlowLayout());

		labelTitulo=new JLabel("Titulo");
		labelAutor=new JLabel("Autor");
		labelPreco=new JLabel("Preço");
		labelQuantidade=new JLabel("Quantidade");

		campoTitulo = new JTextField(30);
		campoAutor = new JTextField(20);
		campoPreco = new JTextField(10);
		campoQuantidade = new JTextField(5);
		
		campoTitulo.setText(l.getTitulo());
		campoAutor.setText(l.getAutor());
		campoPreco.setText(String.valueOf(l.getPreco()));
		campoQuantidade.setText(String.valueOf(l.getQuantidade()));
		
		
		
		add(labelTitulo);
		add(campoTitulo);

		add(labelAutor);
		add(campoAutor);

		add(labelPreco);
		add(campoPreco);

		add(labelQuantidade);
		add(campoQuantidade);


		botaoSalvar = new JButton("Salvar");

		botaoSalvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				l.setAutor(campoAutor.getText());
				l.setTitulo(campoTitulo.getText());
				l.setPreco(Integer.parseInt(campoPreco.getText()));
				l.setQuantidade(Integer.parseInt(campoQuantidade.getText()));
				telaLista.atualizaLista(l, selecionado);
				telaEdita.dispatchEvent(new WindowEvent(telaEdita, WindowEvent.WINDOW_CLOSING));
			}

		});

		add(botaoSalvar);
		


		setSize(500,300);
		setVisible(true);



	}
	

}
