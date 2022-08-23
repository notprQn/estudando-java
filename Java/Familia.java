public class Familia {
    private Pessoa pai;
    private Pessoa mae;
    private Pessoa avo;

    Familia(Pessoa pai, Pessoa mae, Pessoa avo){
        setPai(pai);
        setMae(mae);
        setAvo(avo);
    }

    public Pessoa getMae() {
        return mae;
    }
    public Pessoa getAvo() {
        return avo;
    }
    public Pessoa getPai() {
        return pai;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
    }
    public void setAvo(Pessoa avo) {
        this.avo = avo;
    }
    public void setPai(Pessoa pai) {
        this.pai = pai;
    }
}
