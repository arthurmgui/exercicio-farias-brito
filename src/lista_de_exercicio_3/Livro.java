package lista_de_exercicio_3;

public class Livro {
	private int identificador;
	private String nome;
	private String editora;
	
	public Livro(int _identificador, String _nome, String _editora) {
		this.identificador = _identificador;
		this.nome = _nome;
		this.editora = _editora;		
	}

	public String toString() {
		return "Livro [identificador=" + identificador + ", nome=" + nome + ", editora=" + editora + "]";
	}
	
}
