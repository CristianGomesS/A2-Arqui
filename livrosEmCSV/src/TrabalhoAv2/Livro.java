package TrabalhoAv2;

public class Livro {
	
	private int id;
	private String titulo;
	private int preco;
	private String autor;
	private int quantidade;
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Livro(int id, String titulo, int preco, String autor, int quantidade) {
		this.id=id;
		this.titulo = titulo;
		this.preco = preco;
		this.autor = autor;
		this.quantidade=quantidade;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	@Override
	public String toString() {
		return "Livro[id=" + id+ ", titulo=" + titulo + ", valor=" +preco+", autor="+autor+", quantidade="+quantidade+"]";
	}
	
	

}
