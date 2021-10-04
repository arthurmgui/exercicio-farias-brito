package lista_de_exercicio_3;

import java.util.ArrayList;

public class Biblioteca {
	
	private ArrayList<Livro> livros;

	public Biblioteca() {
		this.livros = new ArrayList<Livro>();
	}

	public void cadastrarLivros(Livro _livros) {
		this.livros.add(_livros);
	}
	
	public void listarLivros() {
        for (int i = 0; i < this.livros.size(); i++)
            System.out.println(this.livros.get(i));
    }
	
}
