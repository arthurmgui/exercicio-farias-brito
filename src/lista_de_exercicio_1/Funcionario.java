package lista_de_exercicio_1;

public class Funcionario {
	private String nome;
	private String funcao;
	private double salario;
	private static int numFuncionario;
	
	public Funcionario(String _nome, String _funcao, double _salario) {
		this.nome = _nome;
		this.funcao = _funcao;
		this.salario = _salario;
	}
	
	public void aumentarSalario(double percentAumento) {
		this.salario += ((this.salario * percentAumento) / 100);
	}

	public String exibir() {
		return "Funcionario [nome=" + nome + ", funcao=" + funcao + ", salario=" + salario + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
