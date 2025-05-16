import java.util.Scanner;

public class Main {
    private Personaje jugador1;
    private Personaje jugador2;

    public void iniciar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al Juego de Lucha por Turnos ⚔");

        jugador1 = seleccionarPersonaje(sc, 1);
        jugador2 = seleccionarPersonaje(sc, 2);

        System.out.println("\n--- ¡Empieza la batalla! ---\n");
        System.out.println(jugador1.mostrar());
        System.out.println(jugador2.mostrar());

        while (jugador1.estaVivo() && jugador2.estaVivo()) {
            turno(jugador1, jugador2);
            if (jugador2.estaVivo()) {
                turno(jugador2, jugador1);
            }
        }

        System.out.println("\n--- FIN DE LA PELEA ---");
        if (jugador1.estaVivo()) {
            System.out.println("🏆 " + jugador1.getNombre() + " ha ganado.");
        } else {
            System.out.println("🏆 " + jugador2.getNombre() + " ha ganado.");
        }

        sc.close();
    }

    private void turno(Personaje atacante, Personaje defensor) {
        System.out.println("\nTurno de " + atacante.getNombre());
        atacante.atacar(defensor);
        System.out.println(defensor.mostrar());
    }

    private Personaje seleccionarPersonaje(Scanner sc, int numero) {
        System.out.print("Nombre del Jugador " + numero + ": ");
        String nombre = sc.nextLine();

        System.out.println("Elige clase para " + nombre + ":");
        System.out.println("1. Guerrero 🛡");
        System.out.println("2. Enemigo 🔥");
        int opcion = Integer.parseInt(sc.nextLine());

        FabricaPersonaje fabrica;
        if (opcion == 1) {
            fabrica = new FabricaGuerrero();
        } else {
            fabrica = new FabricaEnemigo();
        }

        return fabrica.crearPersonaje(nombre);
    }

    public static void main(String[] args) {
        new Main().iniciar();
    }
}