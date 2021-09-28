package lista_de_exercicio_1;

public class Escola {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Mick Hill", "Diretor", 5000);
		Professor p1 = new Professor("Arthur Motta", "Professor", 2000, 2);
		System.out.println("-----------ANTES DO AUMENTO-----------");
		System.out.println(f1.exibir());
		System.out.println(p1.exibir());
		System.out.println("-----------DEPOIS DO AUMENTO-----------");
		f1.aumentarSalario(12);
		p1.aumentarSalario(10);
		System.out.println(f1.exibir());
		System.out.println(p1.exibir());
	}

}
