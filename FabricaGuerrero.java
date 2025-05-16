public class FabricaLuchador extends FabricaPersonaje {
    @Override
    public Personaje crearPersonaje(String nombre) {
        return new Luchador(nombre);
    }
}
