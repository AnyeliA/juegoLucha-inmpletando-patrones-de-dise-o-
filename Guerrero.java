// Subclases concretas
class Guerrero extends Personaje {
    public Guerrero(String nombre) {
        super(nombre, 120, new AtaqueBasico());
    }

    
    public void mostrarHabilidadEspecial() {
        System.out.println(nombre + " usa 'Golpe de Espada' para intimidar al enemigo.");
    }
}