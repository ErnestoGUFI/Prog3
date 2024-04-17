import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
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
    private int x,y;

    public Ventana() {
        this.setSize(1080, 720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panelPaDibujar = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLUE);
                g.fillRect(x, y, 200, 200); 
            }
        };
        panelPaDibujar.setLocation(0, 0);
        panelPaDibujar.setSize(1064, 600);
        panelPaDibujar.setBackground(Color.BLACK);
        getContentPane().add(panelPaDibujar,BorderLayout.CENTER);

        reset = new JButton("Reiniciar");
        reset.setBounds(476, 623, 100, 30);
        getContentPane().add(reset,BorderLayout.SOUTH);

        this.addKeyListener(this);
        this.setFocusable(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Tecla presionada: " + e.getKeyCode());
        int tecla= e.getKeyCode();
       
        switch (tecla){
        
	        case 68 :
	    	x=x+5;
	    	repaint();
	    	break;
	    	
	        
		    case 65 :
		    	x=x-5;
		    	repaint();
		    	break;
		    	
		    
			case 83 :
				y=y+5;
				repaint();
				break;
				
			
			case 87 :
				y=y-5;
				repaint();
				break;
		
		
        }
		
        
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    
}
    

            

   

   

    



