package Ciclismo;

import java.util.Scanner;

public class PruebaCiclismo {
    public static void main(String[] args) {
        Equipo equipo = new Equipo("Aztra", "Colombia");

        // Creación de instancias de ciclistas con los constructores adecuados
        Velocista ciclistaVelocista = new Velocista(1, "Juan", 100.0, 30.0);
        Escalador ciclistaEscalador = new Escalador(2, "Pedro", 4.5f, 20.0f);
        Contrarrelojista ciclistaContrarrelojista = new Contrarrelojista(3, "María", 40.0);

        // Agregar ciclistas al equipo
        equipo.agregarCiclista(ciclistaVelocista);
        equipo.agregarCiclista(ciclistaEscalador);
        equipo.agregarCiclista(ciclistaContrarrelojista);

        // Mostrar nombres de los ciclistas del equipo
        equipo.listarNombresCiclistas();
        
        // Calcular tiempo total del equipo
        equipo.calcularTotalTiempos(); // Actualizar el tiempo total del equipo
        int tiempoTotal = Equipo.getTiempoTotal(); // Obtener el tiempo total del equipo
        System.out.println("Tiempo total del equipo: " + tiempoTotal + " minutos");

        // Búsqueda de un ciclista por identificador
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el identificador del ciclista que desea buscar: ");
        int idBusqueda = scanner.nextInt();
        equipo.buscarCiclistaPorIdentificador(idBusqueda);

        scanner.close(); // Cerrar el Scanner al finalizar su uso
    }
}
