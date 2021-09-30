package lista_de_exercicio_2;

public class Boot {

	public static void main(String[] args) {
		Transporte t1 = new Transporte("honda", "civic", 10000, 400, 200);
		
//		t1.mover(20);
//		System.out.println(t1.exibir());
//		t1.abastecer(50);
//		System.out.println(t1.exibir());
//		t1.abastecer(151);
		
		Automovel a1 = new Automovel("honda", "city", 0, 300, 0, "ART1998");
		
		System.out.println(a1.exibir());
		a1.abastecer(50);
		System.out.println(a1.exibir());
		a1.mover(16);
		System.out.println(a1.exibir());
	}

}
