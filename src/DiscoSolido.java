import java.util.Date;

public class DiscoSolido extends Tecnologico {
    private int capacida;

    public DiscoSolido(String codigo , String modelo , String paisOrigen, Date fechaFabricacion,Empresa fabricante, int capacidad){
        super(codigo,modelo,paisOrigen,fechaFabricacion,fabricante);

        this.setCapacida(capacidad);

    }


    public int getCapacida() {
        return capacida;
    }

    public void setCapacida(int capacida) {
        this.capacida = capacida;
    }
}
