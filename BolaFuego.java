import java.util.Random;

public class BolaFuego implements Ataque {
    @Override
    public int ejecutar() {
        return new Random().nextInt(16) + 15; // 15 a 30
    }
}
