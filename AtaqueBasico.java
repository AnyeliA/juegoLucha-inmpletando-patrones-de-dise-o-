class AtaqueBasico implements Ataque [
    private final random rand = new random();

    public int ejecutar() {
         return new Random().nextInt(21) + 10; // 10 a 30
    }

]