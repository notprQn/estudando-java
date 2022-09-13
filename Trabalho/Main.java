import java.util.Scanner;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            Produtos p = new Produtos("Coca-Cola", 18.99);

            

                List<Produtos> listaDeProdutos = new ArrayList<Produtos>();
                listaDeProdutos.add(p);

            
                System.out.println("------------------------------");
                System.out.println("Bem-vindo a Loja do João Pedro");

                while(true){
                System.out.println("------------------------------");
                System.out.println("Oque você deseja fazer?");
                System.out.println("1 - Listar");
                System.out.println("2 - Cadastrar");
                System.out.println("3 - Editar");
                System.out.println("4 - Sair");

                int num = scn.nextInt();

                switch(num){
                    case 1:
                        System.out.println("------------------------------");
                        System.out.println("Listar");
                        System.out.println("------------------------------");
                        System.out.println("Oque você deseja listar?");
                        System.out.println("1 - Nomes");
                        System.out.println("2 - Preços");
                        System.out.println("3 - Sair");
                        int resultado = scn.nextInt();
                        switch(resultado){
                            case 1:
                                int n = listaDeProdutos.size();
                                for (int i = 0; i < n; i++) {
                                
                                    Produtos lista = listaDeProdutos.get(i);
                     
                                    System.out.println("Nome: "+ lista.Nome);
                                }
                                break;
                        }
                        break;
    
                    case 2:
                        System.out.println("------------------------------");
                        System.out.println("Cadastro");
                        System.out.println("------------------------------");
                        Produtos novoItem = p.cadastra();
                        listaDeProdutos.add(novoItem);
                        
                        int n = listaDeProdutos.size();
                        for (int i = 0; i < n; i++) {
                            
                            Produtos lista = listaDeProdutos.get(i);
                 
                            System.out.println("Nome: "+ lista.Nome + " / " + "Preço: " + lista.Preco);
                        }
                        break;
    
                    case 3:
                        System.out.println("------------------------------");
                        System.out.println("Editar");
                        System.out.println("------------------------------");
                        break;
    
                    case 4:
                        System.out.println("Obrigado por usar este programa.");
                        System.exit(0);
                        break;
                }
            }
        }
    }
}