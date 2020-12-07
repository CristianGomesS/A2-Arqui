import java.util.List;

import javax.swing.JFrame;

/**
 * @author Dell
 *
 */
public class Principal {

	public static void main(String[] args) {

		String nomeArquivo="livros.txt";
		
		List<Livro> livros= LivrosCSV.lerLivroArquivoCSV(nomeArquivo);

		TelaLista tela=new TelaLista(livros);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setSize(550, 500); 
		tela.setVisible(true); 

	}
}
