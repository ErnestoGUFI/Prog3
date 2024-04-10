import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

public class Ventana extends JFrame {
   
    public Ventana() {
        // Modifica el tamaño
        this.setSize(800, 800);

        // Cierra ventana
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Ubicación de la ventana
        this.setLocation(300, 100);

        // Desactiva o activa el cambio de tamaño de la ventana
        this.setResizable(true);

        // Cambia el nombre de la ventana
        this.setTitle("ventana");

        // Limita el cambio de tamaño
        this.setMinimumSize(new Dimension(1000, 250));
        this.setMaximumSize(new Dimension(1000, 250));

        // Centrar la ventana
        this.setLocationRelativeTo(null);

        // Llamo la función para iniciar el panel
        this.iniciarComponentes();

        
        
       
     // Modifica la visibilidad
        this.setVisible(true);
    }
   
   
   
    public void iniciarComponentes() {
	    //this.login();
	    this.registro();
	    //this.admin();
	    //this.calculadora();
	    //this.interes();
	    //this.botones();
    	//this.juegoNumbers();
    	
    }
    
    
    

    
    

    

    
 
    public void login() {
    JPanel login = new JPanel();
    login.setLayout(null);
    login.setBackground(Color.decode("#3F66B0"));
    
    //barra
    JMenuBar barra = new JMenuBar();
    //texto que se muestra en la opcion de el menu
    JMenu menu_file = new JMenu("Archivo");    
    //opciones que se muestran en el menu
    JMenuItem open_item = new JMenuItem("abrir archivo...");
    JMenuItem create_item = new JMenuItem("crear archivo...");
   
    //añadir cada cosa correspondiente al menu
    barra.add(menu_file);
    menu_file.add(open_item);
    menu_file.add(create_item);
  
   getContentPane().add(barra, BorderLayout.NORTH);
    
    JLabel loginDentro = new JLabel();
    loginDentro.setLocation(140, 150);
    loginDentro.setLayout(null);
    loginDentro.setBackground(Color.decode("#2B4582"));
    loginDentro.setSize(700,500);
    loginDentro.setOpaque(rootPaneCheckingEnabled);
    login.add(loginDentro);
    
   
    
    JLabel loginTag = new JLabel("Inicio De Sesion",0);
    loginTag.setSize(500, 80);
    loginTag.setLocation(240, 40);
    loginTag.setFont(new Font("Arial Black", Font.ITALIC, 48));
    loginTag.setForeground(Color.white);
    login.add(loginTag);
    
    JLabel sinCuenta = new JLabel("No tienes una cuenta?",0);
    sinCuenta.setSize(500, 80);
    sinCuenta.setLocation(235, 640);
    sinCuenta.setFont(new Font("Arial Black", Font.ITALIC, 16));
    sinCuenta.setForeground(Color.white);
    login.add(sinCuenta);
    
    JLabel loginTag2 = new JLabel("Mi Cuenta",0);
    loginTag2.setSize(300, 80);
    loginTag2.setLocation(200, 10);
    loginTag2.setFont(new Font("Arial Black", Font.ITALIC, 48));
    loginTag2.setForeground(Color.decode("#FFCC00"));
    loginDentro.add(loginTag2);
    
    


   
    

    //texto de usuario
    JLabel usuario = new JLabel("INGRESA TU USUARIO");
    usuario.setSize(400, 20);
    usuario.setLocation(250, 150);
    usuario.setFont(new Font("Arial Black", Font.ITALIC, 16));
    usuario.setForeground(Color.WHITE);
    loginDentro.add(usuario);

    //ingresar usuario
    JTextField usuarioTexto = new JTextField();
    usuarioTexto.setSize(400, 50);
    usuarioTexto.setLocation(150, 180);
    usuarioTexto.setBorder(new LineBorder(Color.black,2,true));
    loginDentro.add(usuarioTexto);

    //texto de contraseña
    JLabel contrasena = new JLabel("INGRESA TU CONTRASEÑA");
    contrasena.setSize(400, 20);
    contrasena.setLocation(220, 250);
    contrasena.setFont(new Font("Arial Black", Font.ITALIC, 16));
    contrasena.setForeground(Color.WHITE);
    loginDentro.add(contrasena);

    //ingresar contraseña
    JPasswordField contrasenaTexto = new JPasswordField();
    contrasenaTexto.setSize(400, 50);
    contrasenaTexto.setLocation(150, 280);
    loginDentro.add(contrasenaTexto);

    // Checkbox para recordar usuario
    JCheckBox recordarme = new JCheckBox("Recordarme");
    recordarme.setOpaque(false);
    recordarme.setSize(150, 20);
    recordarme.setLocation(150, 340);
    recordarme.setForeground(Color.WHITE);
    recordarme.setFont(new Font("Arial Black", Font.ITALIC, 16));
    loginDentro.add(recordarme);
   

    // Botón de Acceder
    JButton botonAcceder = new JButton("Acceder");
    botonAcceder.setSize(150, 40);
    botonAcceder.setLocation(270, 400);
    botonAcceder.setBackground(Color.decode("#FFCC00"));
    botonAcceder.setFont(new Font("Arial Black", Font.ITALIC, 24));
    botonAcceder.addActionListener(new ActionListener(){
    	
    	
    	public void actionPerformed(ActionEvent e) {
    		String usr = usuarioTexto.getText();
    		String pwd = new String(contrasenaTexto.getPassword());
    		
    		if (usr.length()<=0) {
        		usuarioTexto.setBorder(new LineBorder(Color.red,2,true));
        		System.out.println("no jala");
        	
    		}else {
    			usuarioTexto.setBorder(new LineBorder(Color.green,2,true));
    		}
    			if(pwd.length()<=0) {
    				contrasenaTexto.setBorder(new LineBorder(Color.red,2,true));
    				System.out.println("Bienvenido");
    			}else {
    				contrasenaTexto.setBorder(new LineBorder(Color.green,2,true));
    			}
    			
    			JOptionPane.showMessageDialog(null, "Todavia no se agrega la funcionalidad para verificar si tu usuario existe previamente, adios", "Alto ahi", JOptionPane.INFORMATION_MESSAGE);
    	}
    });
 
    		
  
    
    loginDentro.add(botonAcceder);
    
    //boton de creacion de cuenta
    JButton botonCrear = new JButton("Crear Cuenta");
    botonCrear.setSize(250, 40);
    botonCrear.setLocation(360, 700);
    botonCrear.setBackground(Color.decode("#FFCC00"));
    botonCrear.setFont(new Font("Arial Black", Font.ITALIC, 24));
    login.add(botonCrear);
    
    botonCrear.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        	
        	getContentPane().removeAll();
    		registro();
    		getContentPane().revalidate();
    		getContentPane().repaint();
			
        
        }
        });
    
    //icono de perfil
    ImageIcon imagen = new ImageIcon (getClass().getResource("icon.png"));
    JLabel label = new JLabel(imagen);
    label.setSize(32, 32);
    label.setLocation(110, 188);
    label.setOpaque(false);
    loginDentro.add(label);
    //icono de candado
    ImageIcon imagen2 = new ImageIcon (getClass().getResource("lock.png"));
    JLabel label2 = new JLabel(imagen2);
    label2.setSize(32, 32);
    label2.setLocation(110, 290);
    label2.setOpaque(false);
    loginDentro.add(label2);
    
    
    
   
   
   
   
    getContentPane().add(login);
   
    }

    
    
    public void registro() {

        JPanel registro = new JPanel();
        registro.setLayout(null);
        registro.setSize(getWidth(), getHeight());
        registro.setLocation(0, 0);
        registro.setBackground(Color.pink);
        
      //barra
        JMenuBar barra = new JMenuBar();
        //texto que se muestra en la opcion de el menu
        JMenu menu_file = new JMenu("Archivo");    
        //opciones que se muestran en el menu
        JMenuItem open_item = new JMenuItem("abrir archivo...");
        JMenuItem create_item = new JMenuItem("crear archivo...");
       
        //añadir cada cosa correspondiente al menu
        barra.add(menu_file);
        menu_file.add(open_item);
        menu_file.add(create_item);
      
       getContentPane().add(barra, BorderLayout.NORTH);
       
        JLabel registerTag = new JLabel("Registrarse",0);
        registerTag.setSize(200, 80);
        registerTag.setLocation(385, 60);
        registerTag.setFont(new Font("Arial", Font.BOLD, 24));
        registerTag.setForeground(Color.white);
        registerTag.setBackground(Color.black);
        registro.add(registerTag);
       
       
        //Nombre de usuario
        JLabel nombreUsuario = new JLabel("Ingresa Tu Nombre",0);
        nombreUsuario.setSize(226, 30);
        nombreUsuario.setLocation(52, 168);
        nombreUsuario.setFont(new Font("Arial", Font.BOLD, 24));
        nombreUsuario.setBackground(Color.yellow);
        registro.add(nombreUsuario);
       
        //ingresar usuario
        JTextField ingresarUsuario = new JTextField();
        ingresarUsuario.setSize(400, 40);
        ingresarUsuario.setLocation(52, 199);
        registro.add(ingresarUsuario);
       
       
        //ingrese biografia
        JTextArea ingresarApellido= new JTextArea();
        ingresarApellido.setSize(400, 40);
        ingresarApellido.setLocation(527, 199);
        registro.add(ingresarApellido);
       
     
        JLabel lblIngresaTuApellido = new JLabel("Ingresa tu apellido", SwingConstants.CENTER);
        lblIngresaTuApellido.setFont(new Font("Arial", Font.BOLD, 24));
        lblIngresaTuApellido.setBackground(Color.YELLOW);
        lblIngresaTuApellido.setBounds(683, 168, 267, 30);
        registro.add(lblIngresaTuApellido);
        
        JLabel correo = new JLabel("Correo Electronico", SwingConstants.CENTER);
        correo.setFont(new Font("Arial", Font.BOLD, 24));
        correo.setBackground(Color.YELLOW);
        correo.setBounds(264, 261, 226, 30);
        registro.add(correo);
        
        JTextField textField = new JTextField();
        textField.setBounds(249, 291, 500, 40);
        registro.add(textField);
        
        JLabel contrasena = new JLabel("Contraseña", SwingConstants.CENTER);
        contrasena.setFont(new Font("Arial", Font.BOLD, 24));
        contrasena.setBackground(Color.YELLOW);
        contrasena.setBounds(249, 342, 172, 30);
        registro.add(contrasena);
        
        JPasswordField textField_1 = new JPasswordField();
        textField_1.setBounds(249, 373, 500, 40);
        registro.add(textField_1);
        
        JLabel confirmarContrasena = new JLabel("Confirmar contraseña", SwingConstants.CENTER);
        confirmarContrasena.setFont(new Font("Arial", Font.BOLD, 24));
        confirmarContrasena.setBackground(Color.YELLOW);
        confirmarContrasena.setBounds(233, 424, 326, 30);
        registro.add(confirmarContrasena);
        
        JPasswordField textField_2 = new JPasswordField();
        textField_2.setBounds(249, 454, 500, 40);
        registro.add(textField_2);
        
        JCheckBox aceptarCondiciones = new JCheckBox("Aceptar terminos y condiciones");
        aceptarCondiciones.setBounds(393, 556, 192, 23);
        aceptarCondiciones.setOpaque(false);
        registro.add(aceptarCondiciones);
        
        JButton acceder = new JButton("ACCEDER");
        acceder.setBounds(385,611,200,20);
        registro.add(acceder);
        
     
        
        acceder.addActionListener(new ActionListener(){
        	
        	
        	public void actionPerformed(ActionEvent e) {
        		String usr = ingresarUsuario.getText();
        		String apellido =ingresarApellido.getText();
        		String correoCheck = textField.getText();
        		String contra = textField_1.getText();
        		String confirmar = textField_2.getText();
        		
        		if (usr.length()<=0) {
        			
        			ingresarUsuario.setBorder(new LineBorder(Color.red,2,true));
        			
        		}else {
        			ingresarUsuario.setBorder(new LineBorder(Color.green,2,true));
        			
        			}
        		if(apellido.length()<=0) {
        			
        			ingresarApellido.setBorder(new LineBorder(Color.red,2,true));
        			

        		}else {
        			ingresarApellido.setBorder(new LineBorder(Color.green,2,true));
        			}
        		
        		if (correoCheck.length()<=0)
        		{
        			textField.setBorder(new LineBorder(Color.red,2,true));
        		}else {
        			textField.setBorder(new LineBorder(Color.green,2,true));
        		}
        		
        		if(contra.length()>0 && contra.equals(confirmar))
        		{
        			textField_1.setBorder(new LineBorder(Color.green,2,true));
        			textField_2.setBorder(new LineBorder(Color.green,2,true));
        		}
        		else
        		{
        			textField_1.setBorder(new LineBorder(Color.red,2,true));
        			textField_2.setBorder(new LineBorder(Color.red,2,true));
        		}
        		
        		if (usr.length() > 0 && apellido.length() > 0 && correoCheck.length() > 0 && contra.length() > 0 && contra.equals(confirmar)) {
        		    JOptionPane.showMessageDialog(null, "¡Registro exitoso!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        		} else {
        		    JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos correctamente.", "Error", JOptionPane.ERROR_MESSAGE);
        		}
        			
        	}
        });
        
        JButton probar = new JButton("Probar Inicio de sesion");
        probar.setBounds(385,642,200,20);
        registro.add(probar);
        
        probar.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        	
        		getContentPane().removeAll();
        		login();
        		getContentPane().revalidate();
        		getContentPane().repaint();
        		
			
    			
			
        
        }
        });
    
    		
    			
   
       
        getContentPane().add(registro);
        
        
        

       
       
       
    }
}

    

            

   

   

    



