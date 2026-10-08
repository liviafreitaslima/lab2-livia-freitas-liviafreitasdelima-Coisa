package lab2;
/**
 * Laboratório de Programação 2 - Lab 2
 *
 * @author Lívia Freitas de Lima - 20260005900
 */

/**
 * A classe RegistroResumos é responsável por armazenar e gerenciar os resumos feitos pelo aluno.
 */

public class RegistroResumos{
    private int iResumos;
    private Resumo[] resumos;

    /**
     * Construtor do RegistroResumos. Define o array resumos  com o tamanho fornecido.
     * @param maxresumos define o tamanho de resumos
     */
    public RegistroResumos(int maxresumos){
        this.resumos = new Resumo[maxresumos];
        this.iResumos = 0;
    }

    /**
     * Adiciona um objeto da classe Resumo ao array.
     * @param tema tema do resumo
     * @param conteudo conteudo do resumo
     */
    public void adicionaResumo(String tema, String conteudo){
        for (int i = 0; i < resumos.length; i++) {
            if (resumos[i] != null && resumos[i].getTema().equalsIgnoreCase(tema)) {
                return;
            }
        }

        if (iResumos==(this.resumos).length){
            iResumos = 0;
        }
        this.resumos[iResumos] = new Resumo(tema, conteudo);
        iResumos++;
    }

    /**
     * Registra os resumos realizados em um array de String.
     * @return retorna o array de String que armazena os resumos até então guardados.
     */
    public String[] pegaResumos(){
        String[] resumospegados = new String[this.contaResumos()];
        for (int i = 0; i<resumos.length; i++) {
            if (resumos[i] != null) {
                resumospegados[i] = resumos[i].getTema() + ": " + resumos[i].getConteudo();
            }
        }
        return resumospegados;
    }

    /**
     * Cria uma String que mostra a quantidade de resumos armazenados e o tema deles.
     * @return retorna a String com as informações mencionadas.
     */
    public String imprimeResumos(){
        String resultado = "- " + this.contaResumos() + " resumo(s) cadastrado(s)\n- ";
        boolean primeiro = true;

        for (int i = 0; i < resumos.length; i++) {
            if (resumos[i] != null) {
                if (!primeiro) {
                    resultado += " | ";
                }
                resultado += resumos[i].getTema();
                primeiro = false;
            }
        }

        return resultado;
    }

    /**
     * Conta quantos resumos estão armazenados.
     * @return retorna a quantidade de resumos armazenados.
     */
    public int contaResumos(){
        int numresumos = 0;
        for (int i = 0; i < resumos.length; i++) {
            if (resumos[i] != null) {
                numresumos++;
            }
        }
        return numresumos;
    }

    /**
     * Confere se existe algum resumo de certo tema armazenado.
     * @param tema informa o tema de interesse.
     * @return retorna se existe resumo nesse tema (true) ou nao (false)
     */
    public boolean temResumo(String tema){
        for (int i = 0; i < resumos.length; i++){
            if (resumos[i] != null && resumos[i].getTema().equalsIgnoreCase(tema)){
                return true;
            }
        }
        return false;
    }

    /**
     * Confere se existe algum resumo de algum tema que possua certo valor em seu contéudo.
     * @param chaveDeBusca valor a ser procurado
     * @return temas dos resumos nos quais a chave de busca está presente em seus respectivos conteúdos.
     */
    public String[] busca(String chaveDeBusca){
        String [] temasencontrados = new String[resumos.length];
        for (int i=0; i<resumos.length; i++){
            if (resumos[i] != null && resumos[i].getConteudo().contains(chaveDeBusca)){
                temasencontrados[i] = this.resumos[i].getTema();
            }
        }
        return temasencontrados;
    }
}
