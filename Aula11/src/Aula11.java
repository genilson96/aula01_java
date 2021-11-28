
public class Aula11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Visitante v1 = new Visitante();
		//v1.setNome("juvenal");
		//v1.setIdade(22);
		//v1.setSexo("Masculino");
		//System.out.println(v1.toString());
		Aluno a1 = new Aluno();
		a1.setNome("Cláudio");
		a1.setMatricula(1111);
		a1.setCurso("Informática");
		a1.setIdade(16);
		a1.setSexo("Masculino");
		a1.PagarMensalidade();
		System.out.println(a1.toString());
		System.out.println("--------------------------------------");
		Bolsista b1 = new Bolsista();
		b1.setMatricula(1112);
		b1.setNome("Jubileu");
		b1.setBolsa(12.2f);
		b1.setIdade(32);
		b1.setSexo("Masculino");
		b1.pagarMensalidade();
		System.out.println(b1.toString());
		System.out.println("-------------------------------------");
		Tecnico t1 = new Tecnico ();
		t1.setMatricula(224);
		t1.setNome("Genilson");
		t1.setIdade(25);
		t1.setRegistroProfissional("tecnico em software");
		t1.setSexo("Masculino");
		t1.praticar();
		System.out.println(t1.toString());
	}

}
