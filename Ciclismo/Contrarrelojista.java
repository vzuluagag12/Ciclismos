package Ciclismo;

public class Contrarrelojista extends Ciclista {
    private double velocidadMaxima;

    public Contrarrelojista(int identificador, String nombre, double velocidadMaxima) {
        super(identificador, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }

    // Getters y setters para velocidadMaxima

    @Override
    public String imprimirTipo() {
        return "Contrarrelojista (Velocidad máxima: " + velocidadMaxima + ")";
    }

    // Método para actualizar el tiempo acumulado
    @Override
    public void registrarTiempo(int tiempo) {
        // Actualizar el tiempo acumulado con el tiempo registrado
        tiempoAcumulado += tiempo;
    }
}
