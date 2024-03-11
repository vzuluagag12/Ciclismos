package Ciclismo;

public class Velocista extends Ciclista {
    private double potenciaPromedio;
    private double velocidadSprintPromedio;

    public Velocista(int identificador, String nombre, double potenciaPromedio, double velocidadSprintPromedio) {
        super(identificador, nombre);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadSprintPromedio = velocidadSprintPromedio;
    }

    // Getters y setters para potenciaPromedio y velocidadSprintPromedio

    @Override
    public String imprimirTipo() {
        return "Velocista (Potencia promedio: " + potenciaPromedio + ", Velocidad de sprint promedio: " + velocidadSprintPromedio + ")";
    }

    // Método para actualizar el tiempo acumulado
    @Override
    public void registrarTiempo(int tiempo) {
        // Actualizar el tiempo acumulado con el tiempo registrado
        tiempoAcumulado += tiempo;
    }
}
