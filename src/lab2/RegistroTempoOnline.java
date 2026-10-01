package lab2;

public class RegistroTempoOnline {
    private String nomeDaDisciplina;
    private int tempoInvestidoOnline;
    private int tempoOnlineEsperado;

    public RegistroTempoOnline(String disciplina){
        this.nomeDaDisciplina = disciplina;
        this.tempoInvestidoOnline = 0;
        this.tempoOnlineEsperado = 120;
    }

    public RegistroTempoOnline(String disciplina, int meta){
        this(disciplina); //Chamada de construtor dentro do outro :0
        this.tempoOnlineEsperado = meta;
    }

    public void adicionaTempoOnline(int tempo){
        this.tempoInvestidoOnline += tempo;
    }

    public boolean atingiuMetaTempoOnline(){
        return this.tempoInvestidoOnline >= this.tempoOnlineEsperado;
    }

    @Override
    public String toString(){
        return this.nomeDaDisciplina + " " + this.tempoInvestidoOnline + "/" + this.tempoOnlineEsperado;
    }
}
