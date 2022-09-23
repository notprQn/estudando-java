import java.util.ArrayList;

public class Cidade {
	public String Nome;
	public ArrayList<Caminho> Caminhos;
	
	
	Cidade(){
		Nome = "";
		Caminhos = new ArrayList<>();
	}
	
	Cidade(String nome){
		Nome = nome;
		Caminhos = new ArrayList<>();
	}
	
	public void Imprimir() {
		for(Caminho Item: Caminhos) {
			Item.Imprimir();
		}
	}
	
	public void addCaminho(Cidade destino, int distancia) {
		Caminhos.add(new Caminho(this, destino, distancia));
	}
}
