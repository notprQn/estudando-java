import java.util.*;
import java.util.Scanner;

public class Produtos {
    String Nome;
    double Preco;

    Produtos(){
        Nome = null;
        Preco = 0;
    }

    Produtos(String nome, double preco){
        Nome = nome;
        Preco = preco;
    }

    public Produtos cadastra(){
        Scanner scn = new Scanner(System.in);

        System.out.println("Escreva um produto que você quer cadastrar no sistema.[Nome]");
        String produtoCadastradoNome = scn.nextLine();
        System.out.println("Agora o preço deste produto.[Preço]");
        double produtoCadastradoPreco = scn.nextDouble();
        Produtos p = new Produtos(produtoCadastradoNome, produtoCadastradoPreco);
        
        List<Produtos> produtoLista = new ArrayList<Produtos>();
        produtoLista.add(p);
        return p;
    }
}
