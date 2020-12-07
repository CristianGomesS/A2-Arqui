package TrabalhoAv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;


public class UsuarioCSV {
	
	public static List<Usuario> lerUsuarioArquivoCSV(String nomeArquivo){
		
		List<Usuario> usuarios =new ArrayList<>();
		
		Path caminhoDoArquivo =Paths.get(nomeArquivo);
		
		try (BufferedReader leitorArquivo = Files.newBufferedReader(caminhoDoArquivo))
		{
				
			String linha = leitorArquivo.readLine();
			
			
			while(linha!=null) {
				
				String [] campos=linha.split(",");
				
				int id = Integer.parseInt(campos[0]);
				String Nome = campos[1];
				int idade = Integer.parseInt(campos[2]);
				String Sobrenome = campos[3];
				String Cargo = campos[4];
				String Descricao = campos[5];
				String Tipo = campos[6];
				String Login = campos[7];
				String Senha = campos[8];
				Usuario Usu=new Usuario(id,Nome,Sobrenome,Cargo,idade,Descricao,Tipo,Login, Senha);
				
				usuarios.add(Usu);
				
				linha=leitorArquivo.readLine();
				
			}
			
		}catch(IOException e) {
			//TODO Auto-generated catch block
		e.printStackTrace();
	}
		return usuarios;
	}
	
	
	
	public static void escreverArquivoCSV(String nomeArquivo, List<Usuario> usuarios) {
		try (PrintWriter writer = new PrintWriter(new File(nomeArquivo))){
			
			StringBuilder us=new StringBuilder();
			
			for (int i=0;i<usuarios.size();i++) {
				Usuario U=usuarios.get(i);
				us.append(U.getId());
				us.append(",");
				us.append(U.getNome());
				us.append(",");
				us.append(U.getIdade());
				us.append(",");
				us.append(U.getSobrenome());
				us.append(",");
				us.append(U.getCargo());
				us.append(",");
				us.append(U.getDescricao());
				us.append(",");
				us.append(U.getTipo());
				us.append(",");
				us.append(U.getLogin());
				us.append(",");
				us.append(U.getSenha());			
				if (i<usuarios.size()-1) {
					us.append('\n');
				}
			}
			writer.write(us.toString());
			
			//JOptionPane.showMessageDialog(null,"Exportação concluida");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
}

