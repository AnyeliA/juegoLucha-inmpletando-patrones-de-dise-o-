import java.util.Random;

public class AtaqueBasico implements Ataque {
    private final Random rand = new Random();

    @Override
    public int ejecutar() {
        return rand.nextInt(21) + 10; // 10 a 30
    }
}
