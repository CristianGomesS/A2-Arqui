package TrabalhoAv2;

public class Usuario {
	private int id;
	private int idade;
	private String Nome;
	private String Sobrenome;
	private String Cargo;
	private String Descricao;
	private String Tipo;
	private String Senha;
	private String Login;
	
	
	public Usuario(int id, String Nome, String Sobrenome, String Cargo, int Idade, String Descricao, String Tipo,String Login, String Senha) {
	this.Cargo = Cargo;
	this.Descricao = Descricao;
	this.Nome = Nome;
	this.Sobrenome =Sobrenome;
	this.idade = Idade;
	this.id = id;
	this.Tipo = Tipo;
	this.Senha = Senha;
	this.Login = Login;
	
	
	}
	public String getSenha() {
		return Senha;
	}
	public void setSenha(String senha) {
		Senha = senha;
	}
	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo( String Tipo) {
		this.Tipo = Tipo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		this.Nome = nome;
	}
	public String getSobrenome() {
		return Sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.Sobrenome = sobrenome;
	}
	public String getCargo() {
		return Cargo;
	}
	public void setCargo(String cargo) {
		this.Cargo = cargo;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		this.Descricao = descricao;
	}
	
	
	public String toString() {
	return "Usuario= id="+ id+ ", Nome= " + Nome + ", Sobrenome= " +Sobrenome+", Cargo= "+ Cargo+", Idade= "+idade+", Login= "+Login+",Senha= "+Senha;
	}
	}
	
	
