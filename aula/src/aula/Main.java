package aula;

public class Main {
	public int indice;
	
	
	public static void main(String[] args) {
		Vetor v = new Vetor();
		
		v.add(6);
		v.add(2);
		v.add(1);
		v.add(1);
		v.imprimir();
		int pos = v.valor_posicao(3);
		System.out.println(pos);
		
		boolean contem = v.valor_contem(7);
		System.out.println(contem);
	}
}
