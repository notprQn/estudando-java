import java.time.*;
import java.time.format.DateTimeFormatter;

public class Pessoa {
    private String Nome;
    private int Idade;
    Familia familia;
    String dataDeNacimento;

    Pessoa(String nome, int idade, Pessoa pai, Pessoa mae, Pessoa avo, String date){
        this(nome, idade);
        this.familia = new Familia(pai, mae, avo);
        setDataDeNacimentoNormal(date);
    }

    Pessoa(String nome, int idade, Pessoa pai, Pessoa mae, Pessoa avo){
        this(nome, idade);
        this.familia = new Familia(pai, mae, avo);
    }

    Pessoa(String nome, int idade, Familia familia){
        this(nome, idade);
        setFamilia(familia);
    }

    Pessoa(String nome, int idade){
        this(nome);
        setIdade(idade);
    }

    Pessoa(String nome){
        this();
        setNome(nome);
    }

    Pessoa(){
        setNome("");
        setIdade(0);
    }

    public String getNome() {
        return Nome;
    }
    public int getIdade() {
        return Idade;
    }
    public String getDataDeNacimento() {
        return dataDeNacimento;
    }


    public void setNome(String nomeNovo){
        this.Nome = nomeNovo;
    }
    public void setIdade(int idadeNovo){
        this.Idade = idadeNovo;
    }
    public void setFamilia(Familia familia){
        this.familia = familia;
    }
    
    public void setDataDeNacimentoNormal(String dataDeNacimento) {
        this.dataDeNacimento = dataDeNacimento;
    }

    public LocalDate setDataDeNacimento(String dataDeNacimento){   
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(dataDeNacimento, formatter);
        this.dataDeNacimento = dataDeNacimento;
        return localDate;
    }

    public String pegarIdade(String dataDeNacimento){
        LocalDate hj = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(dataDeNacimento, formatter);

        Period periodo = Period.between(localDate, hj);
        long meses = periodo.toTotalMonths();
        long resultadoLong = meses / 12;

        String resultados = Long.toString(resultadoLong);

        return resultados;
    }

    public String toString(){
        String textoReturn = "";

        textoReturn += "Nome: " + Nome + "\n";
        textoReturn += "Idade: " + Idade + "\n";
    

        if(familia.getPai() != null){
            textoReturn += "Nome do Pai: " + familia.getPai().getNome() + "\n";
        } else {
            textoReturn += "Sem Pai" + "\n";
        }

        if(familia.getMae() != null){
            textoReturn += "Nome da Mãe: " + familia.getMae().getNome() + "\n";
        } else {
            textoReturn += "Sem Mae" + "\n";
        }

        if(familia.getAvo() != null){
            textoReturn += "Nome do Avô: " + familia.getAvo().getNome() + "\n";
        } else {
            textoReturn += "Sem Avo" + "\n";
        }

        return textoReturn;
    }
}
