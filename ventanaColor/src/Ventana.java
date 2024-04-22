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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Font;

public class Ventana extends JFrame implements KeyListener {

    private JPanel panelPaDibujar;
    private JButton reset;
    private JLabel tiempoLabel;
    private Jugador cubito;
    private int largo = 800, ancho = 600;
    private long tiempoInicio;
    private boolean llegoMeta;
    private Rectangle meta;
    private Timer timer;

    Obstaculo obstaculos[]= {
        //bordes
        new Obstaculo(0, 0, 1, 600),
        new Obstaculo(799, 0, 1, 700),
        new Obstaculo(0, 0, 800, 1),
        new Obstaculo(0, 599, 800, 1),
        
        new Obstaculo(100,100, 50, 5), 
        new Obstaculo(150,50, 150, 5),
        new Obstaculo(300,50, 5, 50), 
        new Obstaculo(300,50, 5, 50),
        new Obstaculo(300,100, 100, 5),
        new Obstaculo(50,150, 50, 5),
        new Obstaculo(0,350, 100, 5),
        new Obstaculo(50,200, 50, 5),
        new Obstaculo(100,250, 50, 5),
        new Obstaculo(150,200, 100, 5),

        new Obstaculo(0, 0, 1080, 5), 
        new Obstaculo(0, 50, 50, 5), 
        new Obstaculo(50, 50, 5, 50), 
        new Obstaculo(100, 0, 5, 150),
        new Obstaculo(200,50, 5, 100), 
        new Obstaculo(350,50, 5, 50), 
        new Obstaculo(400,0, 5, 50), 
        new Obstaculo(400,0, 5, 50),
        new Obstaculo(50,150, 5, 150),
        new Obstaculo(100,250, 5, 100),
        new Obstaculo(100,250, 5, 100),
        new Obstaculo(200,250, 100, 5),
        new Obstaculo(300,250, 5, 150),
        new Obstaculo(200,250, 5, 150),
        new Obstaculo(150,250, 5, 150),
        new Obstaculo(150,250, 5, 150),
        new Obstaculo(0,400, 100, 5),
        new Obstaculo(50,450, 300, 5),
        new Obstaculo(0,500, 100, 5),
        new Obstaculo(50,550, 100, 5),
        new Obstaculo(150,450, 5, 100),
        new Obstaculo(200,500, 5, 100),
        new Obstaculo(250,450, 5, 100),
        new Obstaculo(300,500, 5, 100),
        new Obstaculo(350,450, 5, 100),
        new Obstaculo(350,550, 200, 5),
        new Obstaculo(350,550, 200, 5),
        new Obstaculo(400,500, 200, 5),
        new Obstaculo(350,450, 200, 5),
        new Obstaculo(550,300, 200, 5),
        new Obstaculo(550,350, 200, 5),
        new Obstaculo(600,350, 5, 200),
        new Obstaculo(650,400, 5, 200),
        new Obstaculo(700,350, 5, 200),
        new Obstaculo(500,250, 5, 200),
        new Obstaculo(450,300, 5, 200),
        new Obstaculo(550,200, 5, 200),
        new Obstaculo(750,400, 5, 200),
        new Obstaculo(750,105, 5, 200),
        new Obstaculo(450,100,300, 5),
        new Obstaculo(450,50,350, 5),
        new Obstaculo(450,150,400, 5),
        new Obstaculo(550,200,150, 5),
        new Obstaculo(600,250,150, 5),
        new Obstaculo(400,200,150, 5),
        new Obstaculo(400,200,5, 200),
        new Obstaculo(400,100,5, 300),
        new Obstaculo(350,150,5, 300),
        new Obstaculo(300,150,5, 300),
        new Obstaculo(250,300,5, 200),
    };

    public Ventana() {
    	getContentPane().setBackground(new Color(128, 0, 255));
        this.setSize(816, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panelPaDibujar = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.setColor(Color.CYAN);
                g.fillRect(cubito.getX(), cubito.getY(), cubito.getAnchura(), cubito.getAltura());

                g.setColor(Color.pink);
                for (Obstaculo obstaculo : obstaculos) {
                    g.fillRect(obstaculo.obstucalo().x, obstaculo.obstucalo().y, obstaculo.obstucalo().width,
                            obstaculo.obstucalo().height);
                }

                if (!llegoMeta) {
                    g.setColor(Color.GREEN);
                    g.fillRect(meta.x, meta.y, meta.width, meta.height);
                }
            }
        };
        panelPaDibujar.setLocation(0, 0);
        panelPaDibujar.setSize(largo, ancho);
        panelPaDibujar.setBackground(Color.BLACK);
        getContentPane().add(panelPaDibujar);

        reset = new JButton("Reiniciar");
        reset.setBackground(new Color(0, 0, 64));
        reset.setForeground(new Color(255, 255, 255));
        reset.setFont(new Font("Agency FB", Font.PLAIN, 48));
        reset.setBounds(20, 611, 367, 139);
        getContentPane().add(reset, BorderLayout.SOUTH);
        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cubito.setX(10);
                cubito.setY(10);
                llegoMeta = false;
                tiempoInicio = System.currentTimeMillis();
                repaint();
                requestFocus();
            }
        });
        
        tiempoLabel = new JLabel("Tiempo: 0 segundos");
        tiempoLabel.setForeground(new Color(255, 255, 255));
        tiempoLabel.setFont(new Font("Agency FB", Font.PLAIN, 48));
        tiempoLabel.setBounds(408, 617, 382, 127);
        getContentPane().add(tiempoLabel, BorderLayout.SOUTH);

        cubito = new Jugador(10, 10, 10, 10);
        tiempoInicio = System.currentTimeMillis();

        this.addKeyListener(this);
        this.setFocusable(true);

        meta = new Rectangle(755,580, 45, 30);

        // Configuración del timer para actualizar el tiempo cada segundo
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!llegoMeta) {
                    long tiempoTranscurrido = (System.currentTimeMillis() - tiempoInicio) / 1000;
                    tiempoLabel.setText("Tiempo: " + tiempoTranscurrido + " segundos");
                }
            }
        });
        timer.start();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (!llegoMeta) {
            int tecla = e.getKeyCode();

            int x = cubito.getX();
            int y = cubito.getY();
            boolean movimiento = true;

            switch (tecla) {
                case KeyEvent.VK_D:
                    x += 10;
                    break;
                case KeyEvent.VK_A:
                    x -= 10;
                    break;
                case KeyEvent.VK_S:
                    y += 10;
                    break;
                case KeyEvent.VK_W:
                    y -= 10;
                    break;
            }

            Rectangle posicion = new Rectangle(x, y, cubito.getAnchura(), cubito.getAltura());
            boolean colision = false;
            for (Obstaculo obstaculo : obstaculos) {
                if (posicion.intersects(obstaculo.obstucalo())) {
                    colision = true;
                }
            }

            if (!colision) {
                cubito.setX(x);
                cubito.setY(y);
            } else {
                System.out.println("Andas pegando con algo");
            }

            if (posicion.intersects(meta)) {
                llegoMeta = true;
                long tiempo = System.currentTimeMillis() - tiempoInicio;
                double tiempoSegundos = tiempo / 1000.0; 
                JOptionPane.showMessageDialog(this, "¡Has llegado a la meta en " + tiempoSegundos + " segundos!");
            }

            repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
