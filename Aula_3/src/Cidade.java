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
	public boolean Vizinho(String a) {
		boolean retorno = false;
		
		for(Caminho Item: Caminhos) {
			if(Item.Destino.Nome.equals(a)) {
				retorno = true;
				break;
			}
		}
		
		return retorno;
	}
}
