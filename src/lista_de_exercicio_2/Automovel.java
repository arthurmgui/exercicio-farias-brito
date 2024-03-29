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
		double combustivelGasto; 
		combustivelGasto = _kmPercorridos / 8;
		this.quantCombustivel = this.quantCombustivel - combustivelGasto;
		if(this.quantCombustivel <= 0) {
			System.out.println("COMBUTÍVEL ACABOU!");
			return this.quantCombustivel = 0;
		}
		else {
			return this.quantCombustivel;
		}
	}

	@Override
	public String exibir() {
		
		return "Automóvel [marca=" + marca + ", modelo=" + modelo + ", quilometragem=" + quilometragem
				+ ", capacidadeTanque=" + capacidadeTanque + ", quantCombustivel=" + quantCombustivel + ", placa=" + placa + "]";
	}
	
}
