package TrabalhoAv2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.List;

import javax.swing.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EditaUsuario extends JFrame{

	EditaUsuario EditarUsuario=this;

	JLabel labelNome;
	JLabel labelSobrenome;
	JLabel labelIdade;
	JLabel labelCargo;
	JLabel labelDescricao;
	JLabel	labelTipo;
	
	
	JTextField campoNome;
	JTextField campoSobrenome;
	JTextField campoIdade;
	JTextField campoCargo;
	JTextField campoDescricao;
	JTextField campoTipo;
	JButton botaoSalvar;


	public EditaUsuario(Usuario U, int selecionado, ListaUsuario listaUsuario) {

		setLayout(new FlowLayout());

		labelNome=new JLabel("Nome");
		labelSobrenome=new JLabel("Sobrenome");
		labelIdade=new JLabel("Idade");
		labelCargo=new JLabel("Cargo");
		labelDescricao = new JLabel("Descrição");
		labelTipo =new JLabel ("Tipo Usuario");
		
		
		campoNome = new JTextField(30);
		campoSobrenome = new JTextField(20);
		campoIdade = new JTextField(10);
		campoCargo = new JTextField(10);
		campoDescricao = new JTextField(30);
		campoTipo = new JTextField(10);
		
		
		campoNome.setText(U.getNome());
		campoSobrenome.setText(U.getSobrenome());
		campoIdade.setText(String.valueOf(U.getIdade()));
		campoCargo.setText(String.valueOf(U.getCargo()));
		campoDescricao.setText(String.valueOf(U.getDescricao()));
		campoTipo.setText(U.getTipo());
		
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
		
		
		botaoSalvar = new JButton("Salvar");

		botaoSalvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				U.setNome(campoNome.getText());
				U.setSobrenome(campoSobrenome.getText());
				U.setIdade(Integer.parseInt(campoIdade.getText()));
				U.setCargo(campoCargo.getText());
				U.setDescricao(campoDescricao.getText());
				U.setTipo(campoTipo.getText());
				listaUsuario.atualizaLista(U, selecionado );
				EditarUsuario.dispatchEvent(new WindowEvent(EditarUsuario, WindowEvent.WINDOW_CLOSING));
			}

		});

		add(botaoSalvar);
		


		setSize(300,300);
		setVisible(true);



	}
	

}

