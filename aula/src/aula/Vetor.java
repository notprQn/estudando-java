package aula;

import java.util.ArrayList;

public class Vetor {
	ArrayList<Integer> valor;
	public int valor_max = 0;
	
	Vetor(){
		valor = new ArrayList<Integer>(4);
		valor_max = 4;
	}

	Vetor(int tamanho){
		valor = new ArrayList<Integer>(tamanho);
		valor_max = tamanho;
	}

	void add(int num) {
		if(valor.size() < valor_max) {
			valor.add(num);		
		}else {
			System.out.println("Esse array chegou na sua capacidade maxima de " + valor_max);
		}
	}
	
	void add_at(int pos, int num) {
		if(pos < valor.size()){
			if(valor.get(pos) != null){
				valor.set(pos, num);
			} else {
				valor.add(pos, num);
			}
		} else {
			System.out.println("Essa posicao nao existe.");
		}	
	}
	
	int valor_posicao(int num) {
		if(num >= valor.size() || num < 0) {
			return 0;
		} else {
			return valor.get(num);
		}
	}
	
	boolean valor_contem(int pos) {
		boolean retorno = false;
		
		for(int i = 0; i < valor.size(); i++) {
			if(valor.contains(pos)) {
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
