import java.awt.Rectangle;

public class Obstaculo {
    private int x;
    private int y;
    private int ancho;
    private int alto;
    private Rectangle obstucalo;

    public Obstaculo(int x, int y, int ancho, int alto) {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
        this.obstucalo = new Rectangle(x, y, ancho, alto);
    }

    public Rectangle obstucalo() {
        return obstucalo;
    }
}