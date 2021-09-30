package lista_de_exercicio_2;

public class Transporte {
	protected String marca;
	protected String modelo;
	protected double quilometragem;
	protected double capacidadeTanque;
	protected double quantCombustivel;
	
	public Transporte(String _marca, String _modelo, double _quilometragem, double _capacidadeTanque, double _quantCombustivel) {
		this.marca = _marca;
		this.modelo = _modelo;
		this.quilometragem = _quilometragem;
		this.capacidadeTanque = _capacidadeTanque;
		this.quantCombustivel = _quantCombustivel;
	}
	public double mover(double _kmPercorridos) {
		return this.quilometragem += _kmPercorridos;
	}
	public double abastecer(double _litros) {
		
		if (capacidadeTanque > (quantCombustivel + _litros) ){
			this.quantCombustivel += _litros;
		}else if(capacidadeTanque <= (quantCombustivel + _litros) ) {
			System.out.println("INCAPAZ DE ABASTECER! QUANTIDADE DE COMBUSTÍVEL EXCEDE A CAPACIDADE DO TANQUE.");
		}
		return this.quantCombustivel;
	}

	public String exibir() {
		return "Transporte [marca=" + marca + ", modelo=" + modelo + ", quilometragem=" + quilometragem
				+ ", capacidadeTanque=" + capacidadeTanque + ", quantCombustivel=" + quantCombustivel + "]";
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getQuilometragem() {
		return quilometragem;
	}
	public void setQuilometragem(double quilometragem) {
		this.quilometragem = quilometragem;
	}
	public double getCapacidadeTanque() {
		return capacidadeTanque;
	}
	public void setCapacidadeTanque(double capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
	public double getQuantCombustivel() {
		return quantCombustivel;
	}
	public void setQuantCombustivel(double quantCombustivel) {
		this.quantCombustivel = quantCombustivel;
	}
	
}
