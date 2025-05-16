public class Luchador extends Personaje {
    public Luchador(String nombre) {
        super(nombre, new AtaqueBasico());
        this.vida = 120;
    }

    public void mostrarHabilidadEspecial() {
        System.out.println(nombre + " usa 'Golpe de Espada' para intimidar al enemigo.");
    }

    @Override
    public String mostrar() {
        return "⚔️ " + nombre + " [Luchador] - Vida: " + vida;
    }
}
