
public class Main {

	public static void main(String[] args) {
		Mapa m = new Mapa();
		
		m.AddCidade("Uberlandia");
		m.AddCidade("Prata");
		m.AddCidade("Uberaba");
		m.AddCidade("Monte Alegre");
		m.AddCidade("Huiutaba");
		m.AddCidade("Araguari");
		
		m.addCaminho("Uberlandia", "Monte Alegre", 30);
		m.addCaminho("Uberaba", "Monte Alegre", 45);
		m.addCaminho("Ituitaba", "Uberlandia", 30);
		m.addCaminho("Uberlandia", "Monte Alegre", 55);
		
		Cidade u = m.Buscar("Monte Alegre");
		u.Imprimir();
	}

}
