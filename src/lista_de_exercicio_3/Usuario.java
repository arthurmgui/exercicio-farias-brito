package lista_de_exercicio_3;

public class Usuario {
	private int codigo;
	private String nome;
	private long cpf;
	protected double multa;
	
	
	public Usuario(int _codigo, String _nome, long _cpf) {
		this.codigo = _codigo;
		this.nome = _nome;
		this.cpf = _cpf;
	}
	
	public double alugarLivro(int _diasDeAluguel) {
		int quantDiasExcedidos;
		quantDiasExcedidos = _diasDeAluguel - 15;
		if(quantDiasExcedidos <= 0) {
			multa = 0;
		}
		else if(quantDiasExcedidos > 0) {
			multa = quantDiasExcedidos * 1.00;
		}
		return this.multa;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
}
