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
    private boolean ehPonderada;
    private int[] pesos;
    private double media;

    /**
     * Construtor de Disciplina. Cria um objeto com o nome da disciplina, um array de 4 notas inicializadas em 0 e define a quantidade de horas de estudo inicial como 0. Também define que o calculo da média dessa disciplina não será ponderado.
     * @param disciplina nome da disciplina
     */
    public Disciplina(String disciplina){
        this.nomeDisciplina = disciplina;
        this.notas = new double[4];
        this.ehPonderada = false;
        this.horasDeEstudo = 0;
    }

    /**
     * Construtor de Disciplina. Cria um objeto com o nome da disciplina, um array de uma certa quantidade de notas inicializadas em 0 e define a quantidade de horas de estudo inicial como 0. Também define que o calculo da média dessa disciplina não será ponderado.
     * @param disciplina nome da disciplina
     * @param numnotas quantidade de notas a serem armazenadas
     */
    public Disciplina(String disciplina, int numnotas){
        this(disciplina);
        this.notas = new double[numnotas];
    }

    /**
     * onstrutor de Disciplina. Cria um objeto com o nome da disciplina, um array de uma certa quantidade de notas inicializadas em 0, define o peso de cada nota, e define a quantidade de horas de estudo inicial como 0. Também define que o calculo da média dessa disciplina será ponderado.
     * @param disciplina nome da disciplina
     * @param numnotas quantidade de notas a serem armazenadas
     * @param pesos peso atribuido para cada nota a ser armazenada
     */
    public Disciplina(String disciplina, int numnotas, int[] pesos){
        this(disciplina,numnotas);
        this.pesos = pesos;
        this.ehPonderada = true;
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
        if (nota >= 1 && nota <= notas.length) {
            notas[nota - 1] = valorNota;
        }
    }

    /**
     * Define se o aluno foi aprovado ou não com base no valor da média. O calculo da média pode ser ponderado ou não.
     * @return se a media for maior ou igual a 7, o método retorna true (ou seja, o aluno foi aprovado). Caso contrario, o metódo retorna false (ou seja, o aluno não foi aprovado).
     */
    public boolean aprovado(){
        if (!this.ehPonderada){
            double soma = 0;
            for (double nota:notas) {
                soma += nota;
            }
            this.media = soma/notas.length;
        }

        else{
            double soma = 0;
            double divisor = 0;
            for (int i = 0; i<notas.length;i++){
                soma += notas[i]*pesos[i];
                divisor += pesos[i];
            }
            if(divisor!=0){this.media = soma/divisor;}
            else{this.media = 0;}
        }

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
        return this.nomeDisciplina + " " + this.horasDeEstudo + " " + this.media + " " + Arrays.toString(notas);
    }
}
