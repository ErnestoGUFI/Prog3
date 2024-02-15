
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame{
	
	public Ventana() {
		
		//modifica el tamaño
		this.setSize(800,800);
		
		//modifica la visibilidad
		this.setVisible(true);
		
		//cierra ventana
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//ubicacion de la ventana
		this.setLocation(300,100);
				
				
		//desactiva o activa el cambio de tamaño de la ventana
		this.setResizable(true);
		
		//cambia el nombre de la ventana
		this.setTitle("ventana");
		;
		//limita el cambio de tamaño
		this.setMinimumSize(new Dimension(250,250));
		
		this.setMaximumSize(new Dimension(750,750));
		
		//Centrar la ventana
		this.setLocationRelativeTo(null);
		
		//Llamo la funcion para iniciar el panel
		this.iniciarComponentes();
		
	}
	
	//Metodo para crear el panel
	public void iniciarComponentes() {
		JPanel login = new JPanel();
		login.setSize(this.getWidth(),this.getHeight());
		login.setBackground(Color.GREEN);
		this.add(login);
	}
}
