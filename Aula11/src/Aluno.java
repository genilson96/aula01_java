
public  class  Aluno extends Pessoa {
	private int matricula;
	private String curso;
	
	public  void PagarMensalidade() {
		System.out.println("pagando mensalidade de aluno " + this.nome);
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public void pagarMensalidade() {
		// TODO Auto-generated method stub
		
	}
	
}
