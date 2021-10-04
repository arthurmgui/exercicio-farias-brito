package lista_de_exercicio_3;

public class Monitor extends Usuario{
	private double bolsaDeEstudos;
	
	public Monitor(int _codigo, String _nome, long _cpf, double _bolsaDeEstudos) {
		super(_codigo, _nome, _cpf);
		this.bolsaDeEstudos = _bolsaDeEstudos;
	}
	
	@Override
	public double alugarLivro(int _diasDeAluguel) {
		int quantDiasExcedidos;
		quantDiasExcedidos = _diasDeAluguel - 30;
		if(quantDiasExcedidos <= 0) {
			multa = 0;
		}
		else if(quantDiasExcedidos > 0) {
			multa = quantDiasExcedidos * 1.00;
		}
		return this.multa;
	}

	public double getBolsaDeEstudos() {
		return bolsaDeEstudos;
	}

	public void setBolsaDeEstudos(double bolsaDeEstudos) {
		this.bolsaDeEstudos = bolsaDeEstudos;
	}
	
}
