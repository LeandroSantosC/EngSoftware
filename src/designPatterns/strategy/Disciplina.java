package designPatterns.strategy;

public class Disciplina {
    ICalcMedia CalcMedia;
    double media;
    String nome;
    double p1;
    double p2;
    String situacao;

    public Disciplina(ICalcMedia estrategia){
        this.CalcMedia = estrategia;
    }

    public void CalcularMedia(){
        this.media = CalcMedia.calcularMedia(p1, p2);
        this.situacao = CalcMedia.situacao(media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }


    public void setP2(double p2) {
        this.p2 = p2;
    }
    
    public double getMedia() {
        return media;
    }

    public String getNome() {
        return nome;
    }

    public double getP1() {
        return p1;
    }

    public double getP2() {
        return p2;
    }

    public String getSituacao() {
        return situacao;
    }


    
}
