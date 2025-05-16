public class FabricaGuerrero extends FabricaPersonaje {
    @Override
    public Personaje crearPersonaje(String nombre) {
        return new Guerrero(nombre);
    }
}
