package Ciclismo;

public abstract class Ciclista {
    private int identificador;
    private String nombre;
    protected int tiempoAcumulado;

    public Ciclista(int identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.tiempoAcumulado = 0;
    }

    protected abstract String imprimirTipo();

    protected int getIdentificador() {
        return identificador;
    }

    protected String getNombre() {
        return nombre;
    }

    protected int getTiempoAcumulado() {
        return tiempoAcumulado;
    }

    public void registrarTiempo(int tiempo) {
        tiempoAcumulado += tiempo;
    }

    protected void imprimirDatos() {
        System.out.println("Identificador: " + identificador);
        System.out.println("Nombre: " + nombre);
        System.out.println("Tiempo acumulado: " + tiempoAcumulado + " minutos");
    }
}

