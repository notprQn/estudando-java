import java.util.*;

public class Main{
    List<String> opicao = new ArrayList<String>();
    
    public static void main(String[] args) {
        
        Main main = new Main();

        Menu menu = new Menu("Menu da Loja", new ArrayList<>(Arrays.asList("Admin", "Cliente", "Comprador", "Vendedor")));

        System.out.println(main.opicao);

        menu.DesenharMenu();
    }    
}
