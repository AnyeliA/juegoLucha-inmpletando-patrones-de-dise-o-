//creaPersonaje.java
public class crearPersonaje extends FabricaPersonaje {
    @Override
    public Personaje crearPersonaje(String nombre) {
        return new Guerrero(nombre);
    }
}
