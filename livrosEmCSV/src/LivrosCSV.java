import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LivrosCSV {

	
	public static List<Livro> lerLivroArquivoCSV(String nomeArquivo) {
		// metodo para ler arquivo csv e retornar lista de livros
		
		List<Livro> livros= new ArrayList<>();
		
		Path caminhoDoArquivo=Paths.get(nomeArquivo);
		
		try (BufferedReader leitorArquivo=Files.newBufferedReader(caminhoDoArquivo)) 
		{
		
			String linha=leitorArquivo.readLine();
			
			
			while(linha!=null) {
				
				String[] campos=linha.split(",");
				
				int id=Integer.parseInt(campos[0]);
				String nome=campos[1];
				int valor=Integer.parseInt(campos[2]);
				String autor=campos[3];
				int qtd=Integer.parseInt(campos[4]);
				Livro li=new Livro(id,nome,valor,autor, qtd);
				
				livros.add(li);
				//System.out.println(linha);
				
				linha=leitorArquivo.readLine();
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return livros;
	}
	
	public static void escreveArquivoCSV(String nomeArquivo,  List<Livro> livros) {
		
		try (PrintWriter writer = new PrintWriter(new File(nomeArquivo))) {

		      StringBuilder sb = new StringBuilder();

		      for(int i=0; i<livros.size(); i++) {
		    	  Livro l=livros.get(i);
		    	  sb.append(l.getId());
			      sb.append(',');
			      sb.append(l.getTitulo());
			      sb.append(',');
			      sb.append(l.getPreco());
			      sb.append(',');
			      sb.append(l.getAutor());
			      sb.append(',');
			      sb.append(l.getQuantidade());
			      if(i < livros.size()-1) {
			    	  sb.append('\n');
			      }
		      } 
		      

		      writer.write(sb.toString());

		      System.out.println("exportação concluida!");

		    } catch (FileNotFoundException e) {
		      System.out.println(e.getMessage());
		    }
		
	}
	
	
	
	
	
}
