package lab2;
/**
 * Laboratório de Programação 2 - Lab 2
 *
 * @author Lívia Freitas de Lima - 20260005900
 */

/**
 * A classe Descanso é responsável por fazer o registro de horas descansadas ao longo de uma certa quantidade de semanas.
 * Ela também pode determinar se o aluno, com base nesses registros, esta cansado ou não.
 */

public class Descanso {
    private int horasDescanso;
    private int numerosDaSemana;

    /**
     * Construtor de descanso. Define os valores padrões horasDescanso = 0 e numerosDaSemana = 1. O valor padrão de numerosDaSemana é 1 para evitar divisões por 0.
     */
    public Descanso(){
        this.horasDescanso= 0;
        this.numerosDaSemana = 1;
    }

    /**
     * Define a quantidade de horas de descanso.
     * @param valor quantidade de horas de descanso.
     */
    public void defineHorasDescanso(int valor){
        this.horasDescanso = valor;
    }

    /**
     * Define a quantidade de semanas. Apenas recebe valores maiores que 0.
     * @param num quantidade de semanas.
     */
    public void defineNumeroSemanas(int num){
        if (num>0) this.numerosDaSemana = num;
    }

    /**
     * Determina se o aluno está descansado ou não com base na média de horas de descanso por semana
     * @return "Descansado" se a média for maior ou igual a 26, e cansado se for menor.
     */
    public String getStatusGeral(){
        int horasPorSemana = this.horasDescanso/this.numerosDaSemana;
        String status = "Cansado";
        if (horasPorSemana>=26) status = "Descansado";
        return status;
    }
}
