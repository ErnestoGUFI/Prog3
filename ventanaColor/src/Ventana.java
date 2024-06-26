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
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
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
import javax.swing.JFileChooser;
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

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

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
	   
	   this.inicio();
	 
	  
    	
    }
    
    
    

    
    

    

    
 
    public void login() {
    	
    	menu();
    	
    JPanel login = new JPanel();
    login.setLayout(null);
    login.setBackground(Color.decode("#3F66B0"));
    
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

    	menu();
    	
    	JPanel registro = new JPanel();
    	registro .setLayout(null);
        registro.setBackground(new Color(128, 0, 128));
      
        JLabel registerTag = new JLabel("Registrate con nosotros!",0);
        registerTag.setSize(700, 80);
        registerTag.setLocation(130, 60);
        registerTag.setFont(new Font("Arial Black", Font.ITALIC, 48));
        registerTag.setForeground(new Color(244, 145, 42));
        registerTag.setBackground(Color.black);
        registro.add(registerTag);
       
       
        //Nombre de usuario
        JLabel nombreUsuario = new JLabel("Ingresa Tu Nombre",0);
        nombreUsuario.setForeground(new Color(0, 0, 0));
        nombreUsuario.setSize(302, 30);
        nombreUsuario.setLocation(33, 168);
        nombreUsuario.setFont(new Font("Arial Black", Font.ITALIC, 24));
        nombreUsuario.setBackground(Color.yellow);
        registro.add(nombreUsuario);
       
        //ingresar usuario
        JTextField ingresarUsuario = new JTextField();
        ingresarUsuario.setSize(400, 40);
        ingresarUsuario.setLocation(52, 199);
        registro.add(ingresarUsuario);
       
       
        //ingrese biografia
        JTextField ingresarApellido= new JTextField();
        ingresarApellido.setSize(400, 40);
        ingresarApellido.setLocation(527, 199);
        registro.add(ingresarApellido);
       
     
        JLabel lblIngresaTuApellido = new JLabel("Ingresa tu apellido", SwingConstants.CENTER);
        lblIngresaTuApellido.setForeground(new Color(0, 0, 0));
        lblIngresaTuApellido.setFont(new Font("Arial Black", Font.ITALIC, 24));
        lblIngresaTuApellido.setBackground(Color.YELLOW);
        lblIngresaTuApellido.setBounds(666, 168, 267, 30);
        registro.add(lblIngresaTuApellido);
        
        JLabel correo = new JLabel("Correo Electronico", SwingConstants.CENTER);
        correo.setForeground(new Color(0, 0, 0));
        correo.setFont(new Font("Arial Black", Font.ITALIC, 24));
        correo.setBackground(Color.YELLOW);
        correo.setBounds(240, 261, 260, 30);
        registro.add(correo);
        
        JTextField textField = new JTextField();
        textField.setBounds(249, 291, 500, 40);
        registro.add(textField);
        
        JLabel contrasena = new JLabel("Contraseña", SwingConstants.CENTER);
        contrasena.setForeground(new Color(0, 0, 0));
        contrasena.setFont(new Font("Arial Black", Font.ITALIC, 24));
        contrasena.setBounds(239, 342, 172, 30);
        registro.add(contrasena);
        
        JPasswordField textField_1 = new JPasswordField();
        textField_1.setBounds(249, 373, 500, 40);
        registro.add(textField_1);
        
        JLabel confirmarContrasena = new JLabel("Confirmar contraseña", SwingConstants.CENTER);
        confirmarContrasena.setForeground(new Color(0, 0, 0));
        confirmarContrasena.setFont(new Font("Arial Black", Font.ITALIC, 24));
        confirmarContrasena.setBackground(Color.YELLOW);
        confirmarContrasena.setBounds(230, 424, 326, 30);
        registro.add(confirmarContrasena);
        
        JPasswordField textField_2 = new JPasswordField();
        textField_2.setBounds(249, 454, 500, 40);
        registro.add(textField_2);
        
        JCheckBox aceptarCondiciones = new JCheckBox("Aceptar terminos y condiciones");
        aceptarCondiciones.setForeground(new Color(0, 0, 0));
        aceptarCondiciones.setFont(new Font("Arial Black", Font.ITALIC, 16));
        aceptarCondiciones.setBounds(330, 557, 350, 23);
        aceptarCondiciones.setOpaque(false);
        registro.add(aceptarCondiciones);
        
        JButton acceder = new JButton("Acceder");
        acceder.setFont(new Font("Arial Black", Font.ITALIC, 16));
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
        
        
        
     
        
        getContentPane().add(registro);
        
    }
    
    public void recover() {

    	menu();
    	
    	JPanel recuperar = new JPanel();
    	recuperar .setLayout(null);
    	recuperar.setBackground(new Color(128, 0, 255));
      
        JLabel recoverTag = new JLabel("Recupera tu cuenta",0);
        recoverTag.setSize(560, 80);
        recoverTag.setLocation(206, 60);
        recoverTag.setFont(new Font("Arial Black", Font.ITALIC, 48));
        recoverTag.setForeground(new Color(244, 145, 42));
        recoverTag.setBackground(Color.black);
        recuperar.add(recoverTag);
        
        JLabel correo = new JLabel("Correo Electronico", SwingConstants.CENTER);
        correo.setForeground(new Color(0, 0, 0));
        correo.setFont(new Font("Arial Black", Font.ITALIC, 24));
        correo.setBackground(Color.YELLOW);
        correo.setBounds(240, 261, 260, 30);
        recuperar.add(correo);
        
        JTextField textField = new JTextField();
        textField.setBounds(249, 291, 500, 40);
        recuperar.add(textField);
        
        JButton acceder = new JButton("Recuperar");
        acceder.setFont(new Font("Arial Black", Font.ITALIC, 16));
        acceder.setBounds(385,611,200,20);
        recuperar.add(acceder);
        

        
        getContentPane().add(recuperar);
        
    }
    
    public void inicio() {

    	menu();
    	
    	JPanel inicio = new JPanel();
    	inicio .setLayout(null);
    	inicio.setBackground(new Color(128, 0, 255));
      
        JLabel recoverTag = new JLabel("Bienvenido!",0);
        recoverTag.setSize(560, 80);
        recoverTag.setLocation(206, 280);
        recoverTag.setFont(new Font("Arial Black", Font.ITALIC, 48));
        recoverTag.setForeground(new Color(244, 145, 42));
        recoverTag.setBackground(Color.black);
        inicio.add(recoverTag);
        
        JLabel correo = new JLabel("Acceda a todos nuestros servicios arriba a la izquierda", SwingConstants.CENTER);
        correo.setForeground(new Color(0, 0, 0));
        correo.setFont(new Font("Arial Black", Font.ITALIC, 24));
        correo.setBackground(Color.YELLOW);
        correo.setBounds(100, 350, 800, 30);
        inicio.add(correo);
        

        
        getContentPane().add(inicio);
        
        JButton btnNewButton = new JButton("LEER JSON");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Leer el archivo JSON como un recurso del proyecto
                    InputStream inputStream = getClass().getResourceAsStream("/users.json");
                    ObjectMapper objectMapper = new ObjectMapper();
                    JsonNode rootNode = objectMapper.readTree(inputStream);

                    // Mostrar el contenido en la consola
                    System.out.println(rootNode.toPrettyString());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        btnNewButton.setBounds(405, 482, 162, 56);
        inicio.add(btnNewButton);
        
    }
    
    public void comoCrear() {

    	menu();
    	
    	JPanel registro = new JPanel();
    	registro .setLayout(null);
        registro.setBackground(new Color(128, 0, 128));
      
        JLabel registerTag = new JLabel("Registrate con nosotros!",0);
        registerTag.setSize(700, 80);
        registerTag.setLocation(130, 60);
        registerTag.setFont(new Font("Arial Black", Font.ITALIC, 48));
        registerTag.setForeground(new Color(244, 145, 42));
        registerTag.setBackground(Color.black);
        registro.add(registerTag);
       
       
        //Nombre de usuario
        JLabel nombreUsuario = new JLabel("Ingresa Tu Nombre",0);
        nombreUsuario.setForeground(new Color(0, 0, 0));
        nombreUsuario.setSize(302, 30);
        nombreUsuario.setLocation(33, 168);
        nombreUsuario.setFont(new Font("Arial Black", Font.ITALIC, 24));
        nombreUsuario.setBackground(Color.yellow);
        registro.add(nombreUsuario);
       
        //ingresar usuario
        JTextField ingresarUsuario = new JTextField();
        ingresarUsuario.setSize(400, 40);
        ingresarUsuario.setLocation(52, 199);
        registro.add(ingresarUsuario);
       
       
        //ingrese biografia
        JTextField ingresarApellido= new JTextField();
        ingresarApellido.setSize(400, 40);
        ingresarApellido.setLocation(527, 199);
        registro.add(ingresarApellido);
       
     
        JLabel lblIngresaTuApellido = new JLabel("Ingresa tu apellido", SwingConstants.CENTER);
        lblIngresaTuApellido.setForeground(new Color(0, 0, 0));
        lblIngresaTuApellido.setFont(new Font("Arial Black", Font.ITALIC, 24));
        lblIngresaTuApellido.setBackground(Color.YELLOW);
        lblIngresaTuApellido.setBounds(666, 168, 267, 30);
        registro.add(lblIngresaTuApellido);
        
        JLabel correo = new JLabel("Correo Electronico", SwingConstants.CENTER);
        correo.setForeground(new Color(0, 0, 0));
        correo.setFont(new Font("Arial Black", Font.ITALIC, 24));
        correo.setBackground(Color.YELLOW);
        correo.setBounds(240, 261, 260, 30);
        registro.add(correo);
        
        JTextField textField = new JTextField();
        textField.setBounds(249, 291, 500, 40);
        registro.add(textField);
        
        JLabel contrasena = new JLabel("Contraseña", SwingConstants.CENTER);
        contrasena.setForeground(new Color(0, 0, 0));
        contrasena.setFont(new Font("Arial Black", Font.ITALIC, 24));
        contrasena.setBounds(239, 342, 172, 30);
        registro.add(contrasena);
        
        JPasswordField textField_1 = new JPasswordField();
        textField_1.setBounds(249, 373, 500, 40);
        registro.add(textField_1);
        
        JLabel confirmarContrasena = new JLabel("Confirmar contraseña", SwingConstants.CENTER);
        confirmarContrasena.setForeground(new Color(0, 0, 0));
        confirmarContrasena.setFont(new Font("Arial Black", Font.ITALIC, 24));
        confirmarContrasena.setBackground(Color.YELLOW);
        confirmarContrasena.setBounds(230, 424, 326, 30);
        registro.add(confirmarContrasena);
        
        JPasswordField textField_2 = new JPasswordField();
        textField_2.setBounds(249, 454, 500, 40);
        registro.add(textField_2);
        
        JCheckBox aceptarCondiciones = new JCheckBox("Aceptar terminos y condiciones");
        aceptarCondiciones.setForeground(new Color(0, 0, 0));
        aceptarCondiciones.setFont(new Font("Arial Black", Font.ITALIC, 16));
        aceptarCondiciones.setBounds(330, 557, 350, 23);
        aceptarCondiciones.setOpaque(false);
        registro.add(aceptarCondiciones);
        
        JButton acceder = new JButton("Acceder");
        acceder.setFont(new Font("Arial Black", Font.ITALIC, 16));
        acceder.setBounds(385,611,200,20);
        registro.add(acceder);
        
     
        

        
        getContentPane().add(registro);
        
    }
    
    
	public void comoIngresar() {
	    	
	    	menu();
	    	
	    JPanel login = new JPanel();
	    login.setLayout(null);
	    login.setBackground(Color.decode("#3F66B0"));
	    
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
	
	  
	    
	    loginDentro.add(botonAcceder);
	    
	    //boton de creacion de cuenta
	   
	    
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
    	
    
    
    
    private void menu() {
        JMenuBar barra = new JMenuBar();
        
        JMenu inicio = new JMenu("Inicio");
        barra.add(inicio);
        
        JMenuItem inicioOpcion = new JMenuItem("ir");
        inicioOpcion.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				getContentPane().removeAll();
                inicio();
                getContentPane().revalidate();
                getContentPane().repaint();
				
			}
        
        	
        });
        
        inicio.add(inicioOpcion);
        
        JMenu cuenta = new JMenu("Cuenta");
        barra.add(cuenta);
        
        JMenuItem login = new JMenuItem("Login");
        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                login();
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });

        JMenuItem registro = new JMenuItem("Registro");
        registro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                registro();
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });
        
        JMenuItem recuperar = new JMenuItem("Recuperar Cuenta");
        recuperar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                recover();
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });
        
        cuenta.add(login);
        cuenta.add(registro);
        cuenta.add(recuperar);
        
        JMenu usuarios = new JMenu("Usuarios");
        barra.add(usuarios);
        
        JMenuItem alta = new JMenuItem("Dar de alta");
        
        JMenuItem baja = new JMenuItem("Dar de baja");
        
        JMenuItem consultar = new JMenuItem("Consultar");
        
        usuarios.add(alta);
        usuarios.add(baja);
        usuarios.add(consultar);
        
        
        
        JMenu ayuda = new JMenu("Ayuda");
        barra.add(ayuda);
        
        JMenuItem crearUser = new JMenuItem("¿Cómo crear un usuario?");
        crearUser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				getContentPane().removeAll();
                comoCrear();
                getContentPane().revalidate();
                getContentPane().repaint();
				
			}
        	
        });
        
        JMenuItem accederSistema = new JMenuItem("¿Cómo acceder al sistema?");
        
        accederSistema.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				getContentPane().removeAll();
                comoIngresar();
                getContentPane().revalidate();
                getContentPane().repaint();
				
			}
        	
        });
        
        JMenuItem olvide = new JMenuItem("¿Qué pasa si olvidé mi contraseña?");
        
        ayuda.add(crearUser);
        ayuda.add(accederSistema);
        ayuda.add(olvide);

        getContentPane().add(barra, BorderLayout.NORTH);
    }
}
