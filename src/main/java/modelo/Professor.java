package modelo;

import java.util.List;

public class Professor extends Pessoa{
	
	private String cpf;
	private List<Disciplina> disciplina;
	
	public Professor() {
		
	}
	
	
	public Professor(String cpf, List<Disciplina> disciplina) {
		super();
		this.cpf = cpf;
		this.disciplina = disciplina;
	}


	public Professor(int id, String nome, String email, TipoUsuario tipoUsuario) {
		super(id, nome, email, tipoUsuario);
		// TODO Auto-generated constructor stub
	}





	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public List<Disciplina> getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(List<Disciplina> disciplina) {
		this.disciplina = disciplina;
	}
	
	
	
	
	
	

}
