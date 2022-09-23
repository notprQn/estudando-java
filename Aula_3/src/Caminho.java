
public class Caminho {
	public Cidade Origem;
	public Cidade Destino;
	public int Distancia;
	
	Caminho(){
		Origem = null;
		Destino = null;
		Distancia = 0;
	}
	
	Caminho(Cidade origem, Cidade destino, int distancia){
		Origem = origem;
		Destino = destino;
		Distancia = distancia;
	}
	
	public void Imprimir() {
		System.out.println("-> Origem: " + Origem.Nome + 
				"\n-> Destino: " + Destino.Nome
				+ "\n-> Distancia: " + Distancia + "Km\n");
	}
}
