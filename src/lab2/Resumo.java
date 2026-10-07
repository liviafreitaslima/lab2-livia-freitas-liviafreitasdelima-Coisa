package lab2;
/**
 * Laboratório de Programação 2 - Lab 2
 *
 * @author Lívia Freitas de Lima - 20260005900
 */

/**
 * A classe Resumo é utilizada junto ao RegistroResumos para armazenar o tema e conteudo de cada instância de Resumo.
 */
public class Resumo {
    private String tema;
    private String conteudo;

    /**
     * Construtor de Resumo. Cria um objeto de Resumo e define seu tema e conteudo.
     * @param tema tema do resumo
     * @param conteudo conteudo do resumo
     */
    public Resumo(String tema, String conteudo){
        this.tema = tema;
        this.conteudo = conteudo;
    }

    /**
     * Mostra o tema em Resumo
     * @return tema registrado
     */
    public String getTema() {
        return tema;
    }

    /**
     * Mostra o conteudo em Resumo
     * @return conteudo registrado
     */
    public String getConteudo(){
        return conteudo;
    }
}