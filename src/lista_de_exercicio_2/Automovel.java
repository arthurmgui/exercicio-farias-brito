package lista_de_exercicio_2;

public class Automovel extends Transporte {
	
	private String placa;
	
	public Automovel(String _marca, String _modelo, double _quilometragem, double _capacidadeTanque,
			double _quantCombustivel, String _placa) {
		super(_marca, _modelo, _quilometragem, _capacidadeTanque, _quantCombustivel);
		
		this.placa = _placa;
	}
	
	@Override
	public double mover(double _kmPercorridos) {
		super.mover(_kmPercorridos);
		return this.quantCombustivel = ((_kmPercorridos / 8) - this.quantCombustivel);
	}

	@Override
	public String exibir() {
		return "Automóvel [marca=" + marca + ", modelo=" + modelo + ", quilometragem=" + quilometragem
				+ ", capacidadeTanque=" + capacidadeTanque + ", quantCombustivel=" + quantCombustivel + ", placa=" + placa + "]";
	}
	
}
