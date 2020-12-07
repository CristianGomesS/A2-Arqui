package TrabalhoAv2;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
//import javax.swing.ListModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ListaUsuario extends JFrame{
	
	List<Usuario> usuarios;
	
	DefaultListModel<String> listaModeloDados;
	
	ListaUsuario listaUsuario = this;
	
	public ListaUsuario(List<Usuario>usuarios) {
			// TODO Auto-generated constructor stub
		this.usuarios=usuarios;
		
		setLayout(new BorderLayout());
		
		
		listaModeloDados= new DefaultListModel<>();
		
		for(Usuario U:usuarios) {
			listaModeloDados.addElement("Nome:  "+U.getNome()+" "+U.getSobrenome()+"  >Cargo:  "+U.getCargo()+"   Tipo:  "+U.getTipo());
		}
		
		JList<String> listaGraficaUsuario = new JList<>(listaModeloDados);
		
		JLabel etiqueta = new JLabel("Lista de Usuarios Cadastrados");
		this.add(etiqueta,BorderLayout.NORTH);
		
		add(listaGraficaUsuario, BorderLayout.CENTER);
		
		JButton botaoDetalhes = new JButton("Editar");
		
		botaoDetalhes.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent a) {
				// TODO Auto-generated method stub
				if (listaGraficaUsuario.getSelectedIndex()!=-1) {
				int indiceSelecionadoUsuario=listaGraficaUsuario.getSelectedIndex();
				
				Usuario U = usuarios.get(indiceSelecionadoUsuario);
				new EditaUsuario(U, indiceSelecionadoUsuario, listaUsuario);
				}
		}		
		});
		
		JButton botaoExportar = new JButton("Exportar");
		botaoExportar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				UsuarioCSV.escreverArquivoCSV("usuarios.txt", usuarios);
		int	select = JOptionPane.showConfirmDialog(null, "Deseja Exportar?");
			if(select == JOptionPane.YES_OPTION) { 
				JOptionPane.showMessageDialog(null, "Concluido");
				}else {
				
					JOptionPane.showMessageDialog(null, "Envio Cancelado");
				}	
				
			}
			
		});
		JPanel PainelBotoesInferior = new JPanel();
		PainelBotoesInferior.add(botaoDetalhes);
		PainelBotoesInferior.add(botaoExportar);
		
		this.add(PainelBotoesInferior,BorderLayout.SOUTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(500,500);
		setVisible(true);
	}
	
	void atualizaLista(Usuario U,int i) {
		
		usuarios.get(i).setId(U.getId());
		usuarios.get(i).setNome(U.getNome());
		usuarios.get(i).setSobrenome(U.getSobrenome());
		usuarios.get(i).setIdade(U.getIdade());
		usuarios.get(i).setCargo(U.getCargo());
		usuarios.get(i).setDescricao(U.getDescricao());
		usuarios.get(i).setTipo(U.getTipo());
		
		listaModeloDados.set(i, "Nome:  "+U.getNome()+" "+U.getSobrenome()+"  Cargo:  "+U.getCargo()+" Tipo:  "+U.getTipo());

	
	}
	
	
	

}
