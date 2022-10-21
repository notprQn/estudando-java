package aula;

import java.util.ArrayList;

public class Vetor {
	ArrayList<Integer> valor = new ArrayList<Integer>(4);
	public int indice = 0;
	
	void add(int i) {
		if(indice >= 4) {
			System.out.println("Array cheio");
			
		}else {
			valor.add(i);
			indice++;
		}
	}
	
	void add_at(int p, int i) {
		valor.add(p, i);
	}
	
	int valor_posicao(int i) {
		if(i >= valor.size() || i < 0) {
			return 0;
		} else {
			return valor.get(i);
		}
	}
	
	boolean valor_contem(int index) {
		boolean retorno = false;
		
		for(int i = 0; i < valor.size(); i++) {
			if(valor.contains(index)) {
				retorno = true;
			} else {
				retorno = false;
			}
		}
		return retorno;
	}
	
	void imprimir(){
		System.out.println(valor);
	}
	
}
