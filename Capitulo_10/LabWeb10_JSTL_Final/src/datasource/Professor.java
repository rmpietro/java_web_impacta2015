package datasource;
public class Professor {
	private String nome;
	private String disciplina;
	private String email;
	
	public Professor() {}
	
	public Professor(String nome, String disciplina, String email) {
		super();
		this.nome = nome;
		this.disciplina = disciplina;
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
