public class Main {
    public static void main(String[] args) {
        
        Pessoa pai = new Pessoa("Jooj", 21);
        Pessoa mae = new Pessoa("Mai", 24);
        Pessoa avo = new Pessoa("Matheus", 91);
        Pessoa p = new Pessoa("Joao", 18, pai, mae, avo, "04/09/2003");

        String printT = p.toString();

        System.out.println(printT);

        //p.setDataDeNacimento("04/09/2000");
        System.out.println(p.dataDeNacimento);

        String idade = p.pegarIdade(p.dataDeNacimento);
        System.out.println("Essa pessoa tem " + idade + " anos.");
    }     
}
