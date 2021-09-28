package lista_de_exercicio_1;

public class Funcionario {
	private String nome;
	private String funcionario;
	private double salario;
	private static int numFuncionario;
	
	public void funcionario(String _nome, String _funcionario, double _salario) {
		this.nome = _nome;
		this.funcionario = _funcionario;
		this.salario = _salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(String funcionario) {
		this.funcionario = funcionario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
