import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame implements KeyListener {

    private JPanel panelPaDibujar;
    private JButton reset;
    private Jugador cubito;
    private int largo = 1064, ancho = 600;
    Obstaculo obstaculos[]= {
    		new Obstaculo(300, 300, 200, 200),
    		new Obstaculo(100, 300, 200, 200),
    		new Obstaculo(500, 300, 200, 200)
    		
    };

    public Ventana() {
        this.setSize(1080, 720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panelPaDibujar = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                
                g.setColor(Color.BLUE);
                g.fillRect(cubito.getX(), cubito.getY(), cubito.getAnchura(), cubito.getAltura());

                g.setColor(Color.RED);
                for (Obstaculo obstaculo : obstaculos) {
                g.fillRect(obstaculo.obstucalo().x, obstaculo.obstucalo().y,
                        obstaculo.obstucalo().width, obstaculo.obstucalo().height);
                }
              
            }
        };
        panelPaDibujar.setLocation(0, 0);
        panelPaDibujar.setSize(largo, ancho);
        panelPaDibujar.setBackground(Color.BLACK);
        getContentPane().add(panelPaDibujar);

        reset = new JButton("Reiniciar");
        reset.setBounds(476, 623, 100, 30);
        getContentPane().add(reset, BorderLayout.SOUTH);

        cubito = new Jugador(100, 100, 50, 50);


        this.addKeyListener(this);
        this.setFocusable(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int tecla = e.getKeyCode();

        int x = cubito.getX();
        int y = cubito.getY();
        boolean movimiento=true;
        

        switch (tecla) {
            case KeyEvent.VK_D:
                x += 5;
                break;
            case KeyEvent.VK_A:
                x -= 5;
                break;
            case KeyEvent.VK_S:
                y += 5;
                break;
            case KeyEvent.VK_W:
                y -= 5;
                break;
        }

        
        Rectangle posicion = new Rectangle(x, y, cubito.getAnchura(), cubito.getAltura());
        boolean colision = false;
        for (Obstaculo obstaculo : obstaculos) {
        if(posicion.intersects(obstaculo.obstucalo())) {
        	colision=true;
        }
        }

        if (!colision) {
            cubito.setX(x);
            cubito.setY(y);
        }
        else {
        	System.out.println("andas pegando con algo");
        }
        

        repaint();
    }

    
    

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
