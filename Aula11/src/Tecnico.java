
public class Tecnico extends Aluno {
	private String registroProfissional;
	
	public void praticar() {
		System.out.println(this.nome + " est� praticando sua fun��o tecnica: " + this.registroProfissional);
		
	}

	public String getRegistroProfissional() {
		return registroProfissional;
	}

	public void setRegistroProfissional(String registroProfissional) {
		this.registroProfissional = registroProfissional;
	}

	
	}
	
	
	
	

