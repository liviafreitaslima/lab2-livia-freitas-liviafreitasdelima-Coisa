package lab2;

public class Descanso {
    private int horasDescanso;
    private int numerosDaSemana;

    public void defineHorasDescanso(int valor){
        this.horasDescanso = valor;
    }

    public void defineNumeroSemanas(int num){
        this.numerosDaSemana = num;
    }

    public String getStatusGeral(){
        int horasPorSemana = this.horasDescanso/this.numerosDaSemana;
        String status = "Cansado";
        if (horasPorSemana>=26){
            status = "Descansado";
        }
        return status;
    }
}
