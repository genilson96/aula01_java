
public class ProjetoLivro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("Pedro", "M", 22);
		p[1] = new Pessoa("Maria", "F", 25);
		
		l[0] = new Livro("Aprendendo Java ", "Jos� da Silva ", 300, p[0]);
		l[1] = new Livro("POO para Iniciantes", "Pedro Paulo", 500, p[1]);
		l[2] = new Livro("Java Avan�ado", "Maria Candido", 800, p[0]);
		
		l[0].abrir();
		l[0].folhear(100);
		l[0].avancarPag();
		
		System.out.println(l[0].detalhes());
		
	}

}
