package lista_de_exercicio_2;

public class Aviao extends Transporte {
	
	private String codigo;
	
	public Aviao(String _marca, String _modelo, double _quilometragem, double _capacidadeTanque,
			double _quantCombustivel, String _codigo) {
		super(_marca, _modelo, _quilometragem, _capacidadeTanque, _quantCombustivel);
		
		this.codigo = _codigo;
	}
	
	@Override
	public double mover(double _kmPercorridos) {
		super.mover(_kmPercorridos);
		double combustivelGasto; 
		combustivelGasto = _kmPercorridos / 10;
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
		return "Avião [marca=" + marca + ", modelo=" + modelo + ", quilometragem=" + quilometragem
				+ ", capacidadeTanque=" + capacidadeTanque + ", quantCombustivel=" + quantCombustivel + ", Código=" + codigo + "]";
	}
}
