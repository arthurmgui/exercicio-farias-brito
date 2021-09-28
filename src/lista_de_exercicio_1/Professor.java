package lista_de_exercicio_1;

public class Professor extends Funcionario {
	private int disciplinas;
	
	public Professor(String _nome, String _funcao, double _salario, int _disciplinas) {
		super(_nome, _funcao, _salario);
		this.disciplinas = _disciplinas;
	}
	
	@Override
	public void aumentarSalario(double percentAumento) {
		double aumento = ( ( (this.getSalario() * percentAumento) / 100) + 100 * this.disciplinas);
		this.setSalario(this.getSalario() + aumento);
	}
	
	@Override
	public String exibir() {
		return "Professor " +
		"[nome=" + getNome() + ", funcao=" + getFuncao() + ", salario=" + getSalario() + ", disciplinas=" +  disciplinas + "]";
	}
}
