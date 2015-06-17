package datasource;

import java.util.ArrayList;
import java.util.List;

public class Dados {

	private List<Aluno> alunos;
	
	
	private List<Professor> professores;
	
	public List<Aluno> getDadosAlunos() {
		this.populaListaAlunos();
		return alunos;
	}
	
	public List<Professor> getDadosProfessores() {
		this.populaListaProfessores();
		return professores;
	}
	
	private void populaListaAlunos() {
		if (this.alunos == null) {
			alunos = new ArrayList<>();
		}
		alunos.add(new Aluno("João Antonio da Luz", "joao", "joao@glol.com.br", 18));
		alunos.add(new Aluno("Maria Antonia Vieira", "maria", "maria@email.com.br", 23));
		alunos.add(new Aluno("Gleice Amaral", "gleice", "gleice@impacta.com.br", 32));
		alunos.add(new Aluno("Mariana Vilela Passos", "mariana", "mariana@uol.com.br", 16));
		alunos.add(new Aluno("Fernando Abraão", "fernando", "fernando@ig.com.br", 28));
	}
	
	private void populaListaProfessores() {
		if (this.professores == null) {
			professores = new ArrayList<>();
		}
		professores.add(new Professor("Nicolau Copernico", "Astronomia", "copernico@email.com"));
		professores.add(new Professor("Albert Einstein", "Física", "einstein@email.com"));
		professores.add(new Professor("Isaac Newton", "Matemática", "newton@email.com"));
		professores.add(new Professor("James Gosling", "Programação Java", "gosling@email.com"));
		professores.add(new Professor("Marie Curie", "Química", "mcurie@email.com"));
		professores.add(new Professor("Charles Darwin", "Biologia", "darwin@email.com"));
	}
	
}
