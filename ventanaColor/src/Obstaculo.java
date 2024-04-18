import java.awt.Rectangle;

public class Obstaculo {
    private int x;
    private int y;
    private int ancho;
    private int alto;
    private Rectangle boundingBox;

    public Obstaculo(int x, int y, int ancho, int alto) {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
        this.boundingBox = new Rectangle(x, y, ancho, alto);
    }

    public Rectangle getBoundingBox() {
        return boundingBox;
    }
}