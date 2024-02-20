
import java.awt.Color;

import java.awt.Dimension;
import java.awt.Font;


import javax.swing.JFrame;
import javax.swing.JLabel;
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
		this.setMinimumSize(new Dimension(1000,250));
		
		this.setMaximumSize(new Dimension(1000,250));
		
		//Centrar la ventana
		this.setLocationRelativeTo(null);
		
		//Llamo la funcion para iniciar el panel
		this.iniciarComponentes();
		
	}
	
	
	
	
	
	//REGLAS
	//size
	//location
	//background - opaque
	//string constructor
	
	//Metodo para crear el panel
	public void iniciarComponentes() {
		JPanel login = new JPanel();
		login.setSize(this.getWidth()/2,this.getHeight());
		login.setBackground(Color.GRAY);
		JPanel registro = new JPanel();
		registro.setSize(this.getWidth()/2,this.getHeight());
		registro.setLocation(500, 0);
		registro.setBackground(Color.GREEN);
		this.add(login);
		this.add(registro);
		
		JLabel loginTag = new JLabel("Acceder");
		loginTag.setSize(100,20);
		loginTag.setLocation(100,20);
		loginTag.setFont(new Font("Arial",Font.BOLD,24));
		loginTag.setOpaque(true);
		loginTag.setBackground(Color.red);
		login.add(loginTag);
	}
}
