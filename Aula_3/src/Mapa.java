import java.util.ArrayList;

public class Mapa {
	ArrayList<Cidade> Cidades;
	
	
	Mapa(){
		Cidades = new ArrayList<>();
	}
	
	public void Imprimir() {
		for(Cidade Item: Cidades) {
			Item.Imprimir();
		}
	}
	
	public void AddCidade(String nome) {
		Cidades.add(new Cidade(nome));
	}
	
	public Cidade Buscar(String nome) {
		Cidade valorRetorno = null;
		
		for(Cidade Item: Cidades) {
			if(Item.Nome.equals(nome)){
				valorRetorno = Item;
				break;
			}
		}
		
		return valorRetorno;
	}
	
	public void addCaminho(String origem,String destino, int distancia) {
		Cidade Origem = Buscar(origem);
		Cidade Destino = Buscar(destino);
		
		if(Origem != null && Destino != null) {
			 Origem.addCaminho(Destino, distancia);
			 Destino.addCaminho(Origem, distancia);
		}
	}
}
