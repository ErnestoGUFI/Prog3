package Ventana;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame ventana= new JFrame("ejemplo");
		ventana.setSize(600,600);
		ventana.setVisible(true);
		ventana.setLocation(100,100);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setResizable(false);
		

	}

}
