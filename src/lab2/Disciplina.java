package lab2;
import java.util.*;
/**
 * Laboratório de Programação 2 - Lab 2
 *
 * @author Lívia Freitas de Lima - 20260005900
 */

/**
 * A classe Disciplina é responsável pelo registro de disciplinas, horas de estudos e notas.
 * Ela também calcula a média do estudante e, com base nela, determina se o aluno está aprovado.
 */

public class Disciplina {
    private String nomeDisciplina;
    private int horasDeEstudo;
    private double[] notas;
    private double media;

    /**
     * Construtor de Disciplina. Cria um objeto com o nome da disciplina, um array de 4 notas inicializadas em 0 e define a quantidade de horas de estudo inicial como 0.
     * @param disciplina nome da disciplina
     */
    public Disciplina(String disciplina){
        this.nomeDisciplina = disciplina;
        this.notas = new double[4];
        this.horasDeEstudo = 0;
    }

    /**
     * Adiciona a quantidade de horas de estudos ao que já esta armazenados.
     * @param horas é quantidade a ser somada.
     */
    public void cadastraHoras(int horas){
        this.horasDeEstudo += horas;
    }

    /**
     * Define uma nota no array notas
     * @param nota posição da nota
     * @param valorNota valor da nota
     */
    public void cadastraNota(int nota, double valorNota){
        this.notas[nota-1] = valorNota;
    }

    /**
     * Define se o aluno foi aprovado ou não com base no valor da média
     * @return se a media for maior ou igual a 7, o método retorna true (ou seja, o aluno foi aprovado). Caso contrario, o metódo retorna false (ou seja, o aluno não foi aprovado).
     */
    public boolean aprovado(){
        double soma = 0;
        for (double nota:notas){
            soma += nota;
        }
        // essas quebras de linha mais soltam alguns casos pode dificultar a leitura  do codigo (nao foi o caso desse)
        this.media = soma/4;

        return media >= 7;
    }

    /**
     * Representação textual da disciplina.
     * Essa representação contém o nome, horas de estudo, média e notas do aluno.
     *
     * @return representação textual da disciplina.
     */
    @Override
    public String toString(){
        // é uma boa pratica dar espaço entre esses operadores matematicos e em casos de atribuicao como em (soma+=nota;) logo acima,
        // pois facilita a legebilidade no refatoramento. em alguns casos, voce nao quebrar a linha vai confundir na concatenacao
        return this.nomeDisciplina + " " + this.horasDeEstudo + " " + this.media + " " + Arrays.toString(notas);
    }
}
