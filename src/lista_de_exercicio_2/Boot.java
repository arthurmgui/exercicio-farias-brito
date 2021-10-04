package lista_de_exercicio_2;

public class Boot {

	public static void main(String[] args) {
		Transporte t1 = new Transporte("honda", "civic", 10000, 400, 200);
		t1.mover(20);
		System.out.println(t1.exibir());
		t1.abastecer(50);
		System.out.println(t1.exibir());
		t1.abastecer(151);
		
		
		System.out.println("====================================================");
		Automovel au1 = new Automovel("honda", "city", 0, 300, 0, "ART1998");
		System.out.println("comprei o carro----------------------");
		System.out.println(au1.exibir());
		System.out.println("vou abastecer-------------------");
		au1.abastecer(50);
		System.out.println(au1.exibir());
		System.out.println("vou dirigir---------------");
		au1.mover(1);
		System.out.println(au1.exibir());
		
		
		System.out.println("====================================================");
		Aviao av1 = new Aviao("Azul", "Boeging 3344", 1000000, 20000, 0, "3344");
		System.out.println(av1.exibir());
		av1.abastecer(300);
		System.out.println(av1.exibir());
		av1.mover(6000);
		System.out.println(av1.exibir());
	}

}
