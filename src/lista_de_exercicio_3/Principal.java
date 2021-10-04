package lista_de_exercicio_3;

public class Principal {

	public static void main(String[] args) {
		
		Livro l1 = new Livro(01, "Harry Potter e a Pedra Filosofal", "Bloomsbury Publishing");
		Livro l2 = new Livro(02, "Harry Potter e a Câmara Secreta", "Bloomsbury Publishing");
		Livro l3 = new Livro(03, "Harry Potter e o Prisioneiro de Azkaban", "Presença");
		Livro l4 = new Livro(04, "Harry Potter e o Cálice de Fogo", "Bloomsbury Publishing");
		Livro l5 = new Livro(05, "Harry Potter e a Ordem da Fênix", "Bloomsbury Publishing");
		Livro l6 = new Livro(06, "Harry Potter e o Enigma do Príncipe", "Bloomsbury Publishing");
		Livro l7 = new Livro(07, "Harry Potter e as Relíquias da Morte", "Bloomsbury Publishing");
		
		Biblioteca biblioteca = new Biblioteca();
		biblioteca.cadastrarLivros(l1);
		biblioteca.cadastrarLivros(l2);
		biblioteca.cadastrarLivros(l3);
		biblioteca.cadastrarLivros(l4);
		biblioteca.cadastrarLivros(l5);
		biblioteca.cadastrarLivros(l6);
		biblioteca.cadastrarLivros(l7);
		
		biblioteca.listarLivros();
		
		Usuario usuario1 = new Usuario(001, "Arthur", 61696348390L);
		System.out.println("MULTA DE ALUGUEL DO LIVRO: R$ " + usuario1.alugarLivro(40));
		
		Usuario usuario2 = new Usuario(002, "Everton", 61696348390L);
		System.out.println("MULTA DE ALUGUEL DO LIVRO: R$ " + usuario2.alugarLivro(12));
		
		Monitor monitor1 = new Monitor(003, "Mick", 89827788888L, 500.50);
		System.out.println("MULTA DE ALUGUEL DO LIVRO: R$ " + monitor1.alugarLivro(40));
		
		Monitor monitor2 = new Monitor(004, "Priscila", 89827788888L, 500.50);
		System.out.println("MULTA DE ALUGUEL DO LIVRO: R$ " + monitor2.alugarLivro(12));
	}

}
