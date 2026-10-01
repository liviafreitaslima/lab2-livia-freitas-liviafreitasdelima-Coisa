package lab2;

public class Descanso {
    private int horasDescanso;
    private int numerosDaSemana;

    public Descanso(){
        this.horasDescanso= 0;
        this.numerosDaSemana = 1;
    }
    public void defineHorasDescanso(int valor){
        this.horasDescanso = valor;
    }
    public void defineNumeroSemanas(int num){
        if (num<=0){
            System.out.println("Numero Inválido! Escolha um número maior que 0.");
        }
        else this.numerosDaSemana = num;
    }

    public String getStatusGeral(){
        int horasPorSemana = this.horasDescanso/this.numerosDaSemana;
        String status = "Cansado";
        if (horasPorSemana>=26) status = "Descansado";
        return status;
    }
}
