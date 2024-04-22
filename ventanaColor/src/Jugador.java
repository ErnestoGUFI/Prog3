import java.awt.Rectangle;

public class Jugador {
    private int x;
    private int y;
    private int ancho;
    private int alto;
    private Rectangle rectangulo;

    public Jugador(int x, int y, int ancho, int alto) {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
        this.rectangulo = new Rectangle(x, y, ancho, alto);
    }
    
    public void setX(int x) {
        this.x = x;
        rectangulo.x = x;
    }

    public void setY(int y) {
        this.y = y;
        rectangulo.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getAnchura() {
        return ancho;
    }

    public int getAltura() {
        return alto;
    }

    public Rectangle getBoundingBox() {
        return rectangulo;
    }

    public void derecha() {
        x += 5;
        rectangulo.x = x;
    }

    public void izquierda() {
        x -= 5;
        rectangulo.x = x;
    }

    public void abajo() {
        y += 5;
        rectangulo.y = y;
    }

    public void arriba() {
        y -= 5;
        rectangulo.y = y;
    }
    
    
}