import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
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

public class TelaLista extends JFrame{
	
	List<Livro> livros;

	DefaultListModel<String> listaModeloDados;
	
	TelaLista telaLista=this;
	
	public TelaLista(List<Livro> livros) {
		
		this.livros=livros;

		setLayout(new BorderLayout());

		listaModeloDados= new DefaultListModel<>();

		for(Livro l:livros) {
			listaModeloDados.addElement("Título: "+l.getTitulo()+", Quantidade: "+l.getQuantidade());
		}

		JList<String> listaGrafica=new JList<>(listaModeloDados);


		JLabel etiqueta=new JLabel("Lista de livros");
		this.add(etiqueta, BorderLayout.NORTH);

		add(listaGrafica,BorderLayout.CENTER);

				
		JButton botaoDetalhes=new JButton("Detalhes");

		botaoDetalhes.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if(listaGrafica.getSelectedIndex()!=-1) {
					int indiceSelecionado=listaGrafica.getSelectedIndex();
					
					Livro l = livros.get(indiceSelecionado);
					new TelaEdita(l, indiceSelecionado, telaLista );
					
				}
			}
		});


		JButton botaoExportar=new JButton("Exportar");
		botaoExportar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				LivrosCSV.escreveArquivoCSV("livros.txt", livros);
				JOptionPane.showMessageDialog(null, "Concluído",
				          "Livros exportados para CSV", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		
		JPanel painelBotoesInferior = new JPanel();
		painelBotoesInferior.add(botaoDetalhes);
		painelBotoesInferior.add(botaoExportar);
		
		this.add(painelBotoesInferior,BorderLayout.SOUTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setSize(500,500);
		setVisible(true);
	}
	
	void atualizaLista(Livro l, int i){
		
		livros.get(i).setId(l.getId());
		livros.get(i).setTitulo(l.getTitulo());
		livros.get(i).setPreco(l.getPreco());
		livros.get(i).setAutor(l.getAutor());
		livros.get(i).setQuantidade(l.getQuantidade());
		
		
		listaModeloDados.set(i, "Título: "+l.getTitulo()+", Quantidade: "+l.getQuantidade());
		
	}



}
