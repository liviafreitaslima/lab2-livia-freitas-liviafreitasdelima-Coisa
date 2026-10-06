package lab2;

public class RegistroResumos {
    private int iResumos;
    private Resumo[] resumos;

    // Embora ainda não implementado,
    // os atributos da classe RegistroResumos indica que a implementação será usando uma matriz para armazenar conteúdo + tema.
    // Em vez disso, eu indicaria a criação de uma classe Resumos. E aí, o armazenamento seria feito através de um array de Resumos[].

    public RegistroResumos(int maxresumos){
        this.resumos = new Resumo[maxresumos];
        this.iResumos = 0;
    }

    public void adicionaResumo(String tema, String conteudo){
        if (iResumos==(this.resumos).length){
            iResumos = 0;
        }
        this.resumos[iResumos] = new Resumo(tema, conteudo);
        iResumos++;
    }

    public String[] pegaResumos(){
    }

    public String imprimeResumos(){

    }

    public int contaResumos(){
        int numresumos = 0;
        for (int i = 0; i < resumos.length; i++) {
            if (resumos[i] != null) {
                numresumos++;
            }
        }
        return numresumos;
    }

    public boolean temResumo(String tema){
        for (int i = 0; i < resumos.length; i++){
            if (resumos[i].getTema().equalsIgnoreCase(tema)){

            }
        }
    }

}
