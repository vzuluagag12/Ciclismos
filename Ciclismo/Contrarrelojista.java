package Ciclismo;

public class Contrarrelojista extends Ciclista {
    private double velocidadMaxima;

    public Contrarrelojista(int identificador, String nombre, double velocidadMaxima) {
        super(identificador, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public String imprimirTipo() {
        return "Contrarrelojista (Velocidad máxima: " + velocidadMaxima + ")";
    }

    @Override
    public void registrarTiempo(int tiempo) {
        tiempoAcumulado += tiempo;
    }
}
