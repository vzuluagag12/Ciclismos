package Ciclismo;

public class Escalador extends Ciclista {
    private float aceleracionPromedio;
    private float gradoRampaSoportada;

    public Escalador(int identificador, String nombre, float aceleracionPromedio, float gradoRampaSoportada) {
        super(identificador, nombre);
        this.aceleracionPromedio = aceleracionPromedio;
        this.gradoRampaSoportada = gradoRampaSoportada;
    }

    @Override
    public String imprimirTipo() {
        return "Escalador (Aceleración promedio: " + aceleracionPromedio + ", Grado de rampa soportada: " + gradoRampaSoportada + ")";
    }

    @Override
    public void registrarTiempo(int tiempo) {
        tiempoAcumulado += tiempo;
    }
}
