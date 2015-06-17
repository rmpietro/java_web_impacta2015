package datasource;

import java.util.ArrayList;
import java.util.List;

public class Dados {

	private List<Aluno> alunos;
	
	public List<Aluno> getDados() {
		this.populaLista();
		return alunos;
	}
	
	private void populaLista() {
		if (this.alunos == null) {
			alunos = new ArrayList<>();
		}
		alunos.add(new Aluno("João Antonio da Luz", "joao", "joao@glol.com.br", 18));
		alunos.add(new Aluno("Maria Antonia Vieira", "maria", "maria@email.com.br", 23));
		alunos.add(new Aluno("Gleice Amaral", "gleice", "gleice@impacta.com.br", 32));
		alunos.add(new Aluno("Mariana Vilela Passos", "mariana", "mariana@uol.com.br", 16));
		alunos.add(new Aluno("Fernando Abraão", "fernando", "fernando@ig.com.br", 28));
	}
	
}
