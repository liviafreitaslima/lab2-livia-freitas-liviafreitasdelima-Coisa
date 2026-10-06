package lab2;
import java.util.*;

public class Disciplina {
    private String nomeDisciplina;
    private int horasDeEstudo;
    private double[] notas;
    private double media;

    public Disciplina(String disciplina){
        this.nomeDisciplina = disciplina;
        this.notas = new double[4];
        this.horasDeEstudo = 0;
    }

    public void cadastraHoras(int horas){
        this.horasDeEstudo += horas;
    }

    public void cadastraNota(int nota, double valorNota){
        this.notas[nota-1] = valorNota;
    }

    public boolean aprovado(){
        double soma = 0;
        for (double nota:notas){
            soma += nota;
        }
        // essas quebras de linha mais soltam alguns casos pode dificultar a leitura  do codigo (nao foi o caso desse)
        this.media = soma/4;

        return media >= 7;
    }


    @Override
    public String toString(){
        // é uma boa pratica dar espaço entre esses operadores matematicos e em casos de atribuicao como em (soma+=nota;) logo acima,
        // pois facilita a legebilidade no refatoramento. em alguns casos, voce nao quebrar a linha vai confundir na concatenacao
        return this.nomeDisciplina + " " + this.horasDeEstudo + " " + this.media + " " + Arrays.toString(notas);
    }
}
