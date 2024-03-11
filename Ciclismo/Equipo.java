package Ciclismo;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombreEquipo;
    private String paisEquipo;
    private static int tiempoTotal;
    private List<Ciclista> ciclistas;

    public Equipo(String nombreEquipo, String paisEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.paisEquipo = paisEquipo;
        this.ciclistas = new ArrayList<>();
    }

    public void agregarCiclista(Ciclista ciclista) {
        ciclistas.add(ciclista);
    }

    public void listarNombresCiclistas() {
        System.out.println("Nombres de los ciclistas en el equipo \"" + nombreEquipo + "\", País del equipo: " + paisEquipo + ":");
        for (Ciclista ciclista : ciclistas) {
            System.out.println("- " + ciclista.getNombre() + " (" + ciclista.imprimirTipo() + ")");
        }
    }

    public void calcularTotalTiempos() {
        tiempoTotal = 0;
        for (Ciclista ciclista : ciclistas) {
            tiempoTotal += ciclista.getTiempoAcumulado();
        }
    }

    public static int getTiempoTotal() {
        return tiempoTotal;
    }

    public void buscarCiclistaPorIdentificador(int identificador) {
        for (Ciclista ciclista : ciclistas) {
            if (ciclista.getIdentificador() == identificador) {
                System.out.println("Ciclista encontrado:");
                System.out.println("Tipo: " + ciclista.imprimirTipo());
                System.out.println("Datos del ciclista:");
                System.out.println("Identificador: " + ciclista.getIdentificador());
                System.out.println("Nombre: " + ciclista.getNombre());
                System.out.println("Tiempo acumulado: " + ciclista.getTiempoAcumulado() + " minutos");
                return;
            }
        }
        System.out.println("Ciclista no encontrado.");
    }
}
