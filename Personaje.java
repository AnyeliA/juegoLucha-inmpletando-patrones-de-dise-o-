public abstract class Personaje {
    protected String nombre;
    protected int vida = 100;
    protected Ataque ataque;

    public Personaje(String nombre, Ataque ataque) {
        this.nombre = nombre;
        this.ataque = ataque;
    }

    public void atacar(Personaje oponente) {
        int dano = ataque.ejecutar();
        oponente.recibirDano(dano);
        System.out.println(nombre + " ataca a " + oponente.getNombre() + " causando " + dano + " de daño.");
    }

    public void recibirDano(int dano) {
        vida = Math.max(vida - dano, 0);
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public abstract String mostrar();
}
