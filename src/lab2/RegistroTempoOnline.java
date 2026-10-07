package lab2;
/**
 * Laboratório de Programação 2 - Lab 2
 *
 * @author Lívia Freitas de Lima - 20260005900
 */

/**
 * A classe RegistroTempoOnline registra quanto tempo de estudo foi investido em certa disciplina, e se esse tempo bate com a quantidade esperada.
 */

public class RegistroTempoOnline {
    private String nomeDaDisciplina;
    private int tempoInvestidoOnline;
    private int tempoOnlineEsperado;

    /**
     * Construtor de RegistroTempoOnline. Cria um objeto com o nome fornecido e define os valores padrões (tempo investido online = 0, tempo online esperado = 120).
     * @param disciplina nome da disciplina.
     */
    public RegistroTempoOnline(String disciplina){
        this.nomeDaDisciplina = disciplina;
        this.tempoInvestidoOnline = 0;
        this.tempoOnlineEsperado = 120;
    }

    /**
     * Construtor de RegistroTempoOnline, mas que define uma meta diferente da padrão.
     * @param disciplina nome da disciplina.
     * @param meta quantidade de horas que o aluno tem como meta.
     */
    public RegistroTempoOnline(String disciplina, int meta){
        this(disciplina); //Chamada de construtor dentro do outro
        this.tempoOnlineEsperado = meta;
    }

    /**
     * Adiciona tempo estudado ao tempo padrão.
     * @param tempo quantidade de tempo estudado.
     */
    public void adicionaTempoOnline(int tempo){
        this.tempoInvestidoOnline += tempo;
    }

    /**
     * Verifica se atingiu o tempo meta.
     * @return se o tempo investido for maior ou igual a meta, retorna true (ou seja, o aluno atingiu). Caso contrário, retorna false (ou seja, o aluno não atingiu).
     */
    public boolean atingiuMetaTempoOnline(){
        return this.tempoInvestidoOnline >= this.tempoOnlineEsperado;
    }

    /**
     * Representação textual do registro de tempo online.
     * Contem o nome da disciplina e informa o tempo realmente investido e a meta.
     * @return representação textual do registro de tempo online.
     */
    @Override
    public String toString(){
        return this.nomeDaDisciplina + " " + this.tempoInvestidoOnline + "/" + this.tempoOnlineEsperado;
    }
}
