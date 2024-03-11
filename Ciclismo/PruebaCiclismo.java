package Ciclismo;

import java.util.Scanner;

public class PruebaCiclismo {
    public static void main(String[] args) {
        Equipo equipo = new Equipo("Aztra", "Colombia");

        Velocista ciclistaVelocista = new Velocista(1, "Juan", 100.0, 30.0);
        Escalador ciclistaEscalador = new Escalador(2, "Pedro", 4.5f, 20.0f);
        Contrarrelojista ciclistaContrarrelojista = new Contrarrelojista(3, "María", 40.0);
  
        equipo.agregarCiclista(ciclistaVelocista);
        equipo.agregarCiclista(ciclistaEscalador);
        equipo.agregarCiclista(ciclistaContrarrelojista);

        equipo.listarNombresCiclistas();

        equipo.calcularTotalTiempos(); 
        int tiempoTotal = Equipo.getTiempoTotal();
        System.out.println("Tiempo total del equipo: " + tiempoTotal + " minutos");

        // Búsqueda de un ciclista por identificador
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el identificador del ciclista que desea buscar: ");
        int idBusqueda = scanner.nextInt();
        equipo.buscarCiclistaPorIdentificador(idBusqueda);

        scanner.close(); 
    }
}
