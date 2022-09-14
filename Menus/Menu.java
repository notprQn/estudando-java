import java.util.*;

public class Menu{   
    String Titulo;
    ArrayList<String> parametros;

    Main main = new Main();

    Menu(){
        Titulo = "Titulo";
        main.opicao.add("Menu Vazio");
    }

    Menu(String titulo){
        Titulo = titulo;
        for(int i = 0; i < 3; i++){
            main.opicao.add(i,"Menu " + i);
        }
    }

    Menu(String titulo, ArrayList<String> parametros){
        Titulo = titulo;
        main.opicao.addAll(parametros);
    }

    public int DesenharMenu(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(Titulo);
            for(int i = 0; i < main.opicao.size(); i++){
                System.out.print(i+1 + " - "  + main.opicao.get(i) + "\n");
            }
            System.out.println("Escoha sua opção: ");

            int escolheu = sc.nextInt();

            for(int i = 0; i < main.opicao.size(); i++){
                if(escolheu == i + 1){
                    System.out.println("Você escolheu o menu de: " + main.opicao.get(escolheu - 1));
                }
            }
            return escolheu;
        }
    }
}
