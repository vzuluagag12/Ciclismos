package Ciclismo;

public class Escalador extends Ciclista {
    private float aceleracionPromedio;
    private float gradoRampaSoportada;

    public Escalador(int identificador, String nombre, float aceleracionPromedio, float gradoRampaSoportada) {
        super(identificador, nombre);
        this.aceleracionPromedio = aceleracionPromedio;
        this.gradoRampaSoportada = gradoRampaSoportada;
    }

    // Getters y setters para aceleracionPromedio y gradoRampaSoportada

    @Override
    public String imprimirTipo() {
        return "Escalador (Aceleración promedio: " + aceleracionPromedio + ", Grado de rampa soportada: " + gradoRampaSoportada + ")";
    }

    // Método para actualizar el tiempo acumulado
    @Override
    public void registrarTiempo(int tiempo) {
        // Actualizar el tiempo acumulado con el tiempo registrado
        tiempoAcumulado += tiempo;
    }
}
