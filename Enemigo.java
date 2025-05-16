// Mago.java
public class Enemigo extends Personaje {
    public Enemigo(String nombre) {
        super(nombre, new BolaFuego());
    }

    @Override
    public String mostrar() {
        return "🧙 " + nombre + " [Enemigo] - Vida: " + vida;
    }
}
