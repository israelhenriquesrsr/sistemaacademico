package modelo;

import java.util.Date;

public class Aluno extends Pessoa{

	private Date data_nascimento;

	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Aluno(Date data_nascimento) {
		super();
		this.data_nascimento = data_nascimento;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	
	
	
	
	
	
}
