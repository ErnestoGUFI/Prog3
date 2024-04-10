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
	    this.login();
	    this.registro();
	    //this.admin();
	    //this.calculadora();
	    //this.interes();
	    //this.botones();
    	//this.juegoNumbers();
    	
    }
    /*
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        
        //fondo
        g2d.setColor(Color.decode("#0665C0"));
        g2d.fillRect(0, 10, 1280, 720);
        
        
        g2d.setColor(Color.decode("#95C1C7"));
        g2d.fillRoundRect(400, 300, 175, 1000,200,200);
        g2d.setColor(Color.decode("#C6E3E7"));
        g2d.fillRoundRect(380, 300, 175, 1000,200,200);
        
        g2d.setColor(Color.decode("#95C1C7"));
        g2d.fillRoundRect(40, 300, 175, 1000,200,200);
        g2d.setColor(Color.decode("#C6E3E7"));
        g2d.fillRoundRect(20, 300, 175, 1000,200,200);
        
        
        g2d.setColor(Color.decode("#95C1C7"));
        g2d.fillRoundRect(596, 150, 175, 1000,200,200);
        g2d.setColor(Color.decode("#C6E3E7"));
        g2d.fillRoundRect(576, 150, 175, 1000,200,200);
        
       
        g2d.setColor(Color.decode("#125175"));
        g2d.fillRoundRect(650, 425, 200, 700,200,200);
        g2d.setColor(Color.decode("#71c2ff"));
        g2d.fillRoundRect(630, 425, 200, 700,200,200);
       
        g2d.setColor(Color.decode("#125175"));
        g2d.fillRoundRect(430, 550, 200, 700,200,200);
        g2d.setColor(Color.decode("#71c2ff"));
        g2d.fillRoundRect(410, 550, 200, 700,200,200);
        
        g2d.setColor(Color.decode("#FFC0B5"));
        g2d.fillRoundRect(-50, 550, 200, 700,250,200);
        
        
     	// Nubes
        g2d.setColor(Color.white);
        g2d.fillRoundRect(50, 200, 140, 60, 80, 80);   // Ajustado para no pasar la coordenada x máxima de la tubería morada
        g2d.fillRoundRect(250, 300, 180, 80, 100, 100);
        g2d.fillRoundRect(350, 230, 220, 90, 120, 120);  // Ajustado para no sobrepasar la tubería morada
        g2d.fillRoundRect(550, 350, 200, 70, 100, 100);  // Ajustado para no sobrepasar la tubería morada
        g2d.fillRoundRect(750, 290, 240, 80, 120, 120);  // Ajustado para no sobrepasar la tubería morada
        g2d.fillRoundRect(950, 220, 180, 60, 80, 80);
        
        //tuberia
        g2d.setColor(Color.black);
        g2d.fillRoundRect(497, 603, 80, 145,10,10);
        g2d.setPaint(new GradientPaint(500, 445, Color.decode("#E4E9FE"), 680, 545, Color.decode("#4C4993")));
        g2d.fillRoundRect(500, 605, 75, 140,10,10);
        
        g2d.setColor(Color.black);
        g2d.fillRoundRect(492, 575, 90, 30,10,10);
        g2d.setPaint(new GradientPaint(500, 445, Color.decode("#E4E9FE"), 680, 545, Color.decode("#4C4993")));
        g2d.fillRoundRect(494, 577, 85, 25,10,10);
        
        g2d.setColor(Color.black);
        g2d.fillRoundRect(897, 693, 80, 145,10,10);
        g2d.setPaint(new GradientPaint(500, 445, Color.decode("#E4E9FE"), 680, 545, Color.decode("#4C4993")));
        g2d.fillRoundRect(900, 695, 75, 140,10,10);
        
        g2d.setColor(Color.black);
        g2d.fillRoundRect(892, 665, 90, 30,10,10);
        g2d.setPaint(new GradientPaint(500, 445, Color.decode("#E4E9FE"), 680, 545, Color.decode("#4C4993")));
        g2d.fillRoundRect(894, 667, 85, 25,10,10);
  
        //suelo
        g2d.setColor(Color.black);
        g2d.fillRect(0, 727, 1000, 3);
        
        g2d.setColor(Color.decode("#0A7811"));
        g2d.fillRect(0, 730, 1000, 50);

        g2d.setColor(Color.decode("#D29B67"));
        g2d.fillRect(0, 750, 1000, 50);
        
        g2d.setColor(Color.black);
        g2d.fillRect(0, 750, 1000, 3);
   
        }
        */    

    
    public void registroDeUsuarios() {
    	JPanel panelCentral = new JPanel(); 
        panelCentral.setLayout(new BorderLayout());

        JLabel titulo = new JLabel("Registro De Usuarios");
        panelCentral.add(titulo,BorderLayout.NORTH);
        
        JLabel panelNuevo = new JLabel();
        panelNuevo.setLayout(new GridLayout(2, 2)); 
        panelNuevo.setOpaque(true);
        panelCentral.add(panelNuevo,BorderLayout.CENTER);

        //PANEL DE DATOS GENERALES
        JLabel datosGenerales = new JLabel();
        datosGenerales.setLayout(null);
        datosGenerales.setOpaque(true);
        datosGenerales.setBackground(Color.decode("#A1F375"));
        datosGenerales.setBorder(BorderFactory.createLineBorder(Color.white,10));
        panelNuevo.add(datosGenerales);
        
        JLabel tituloDatos = new JLabel("Datos Generales");
        tituloDatos.setBounds(20,-30,100,100);
        datosGenerales.add(tituloDatos,BorderLayout.NORTH);
        
        //RELACIONADO A NOMBRE
        JLabel nombresLabel = new JLabel("Nombres:");
        nombresLabel.setBounds(50,40,100,100); 
        datosGenerales.add(nombresLabel);
        
	        JTextField nombresText = new JTextField();
	        nombresText.setBounds(200,75,150,30); 
	        datosGenerales.add(nombresText);
        
        //RELACIONADO A APELLIDO PATERNO
        JLabel apellidoPLabel = new JLabel("Apellido Paterno:");
        apellidoPLabel.setBounds(50,80,100,100); 
        datosGenerales.add(apellidoPLabel);
        
	        JTextField apellidoPText = new JTextField();
	        apellidoPText.setBounds(200,115,150,30); 
	        datosGenerales.add(apellidoPText);
        
        //RELACIONADO A APELLIDO MATERNO
        JLabel apellidoMLabel = new JLabel("Apellido Materno:");
        apellidoMLabel.setBounds(50,120,150,100); 
        datosGenerales.add(apellidoMLabel);
        
	        JTextField apellidoMText = new JTextField();
	        apellidoMText.setBounds(200,155,150,30); 
	        datosGenerales.add(apellidoMText);
	        
	     //RELACIONADO A FECHA DE NACIMIENTO
	     JLabel fechaNacimieto = new JLabel("Fecha de nacimiento:");
	     fechaNacimieto.setBounds(50,160,150,100); 
	     datosGenerales.add(fechaNacimieto);
	        	
	        JTextField fechaNacimientoText = new JTextField();
	        fechaNacimientoText.setBounds(200,195,100,30); 
	        datosGenerales.add(fechaNacimientoText);
        
        //RELACIONADO A SEXO
        JLabel sexo = new JLabel("Sexo:");
        sexo.setBounds(50,200,100,100); 
        datosGenerales.add(sexo);
        
	        JRadioButton masculinoRadioButton = new JRadioButton("Masculino");
	        masculinoRadioButton.setBounds(150, 235, 100, 30);
	        masculinoRadioButton.setOpaque(false);
	        datosGenerales.add(masculinoRadioButton);
	
	        JRadioButton femeninoRadioButton = new JRadioButton("Femenino");
	        femeninoRadioButton.setBounds(150, 265, 100, 30); 
	        femeninoRadioButton.setOpaque(false);
	        datosGenerales.add(femeninoRadioButton);
	        
	        ButtonGroup grupoSexo = new ButtonGroup();
	        grupoSexo.add(masculinoRadioButton);
	        grupoSexo.add(femeninoRadioButton);
        
        //RELACIONADO A NACIONALIDAD
        JLabel nacionalidad = new JLabel("Nacionalidad:");
        nacionalidad.setBounds(50,290,100,100); 
        datosGenerales.add(nacionalidad);
        
	        String[] nacionalidades = {"Mexicana", "Estadounidense", "Canadiense", "Española", "Colombiana"};
	        JComboBox nacionalidadComboBox = new JComboBox(nacionalidades);
	        nacionalidadComboBox.setBounds(200, 325, 150, 30); 
	        datosGenerales.add(nacionalidadComboBox); 

        
        JLabel perfilDeUsuario = new JLabel();
        perfilDeUsuario.setOpaque(true);
        perfilDeUsuario.setBackground(Color.decode("#F18888"));
        perfilDeUsuario.setBorder(BorderFactory.createLineBorder(Color.white,10));
        
        JLabel tituloPerfil = new JLabel("Perfil De Usuario");
        tituloPerfil.setBounds(20,-30,100,100);
        perfilDeUsuario.add(tituloPerfil,BorderLayout.NORTH);
        
	        //IMAGEN DE PERFIL
	        ImageIcon foto = new ImageIcon(getClass().getResource("profile.png"));
	        JLabel fotoLabel = new JLabel(foto);
	        fotoLabel.setBounds(175,70,128,128);
	        fotoLabel.setOpaque(false);
	        perfilDeUsuario.add(fotoLabel);
	
	        //CHECKBOXES
	        JCheckBox mostrarFecha = new JCheckBox("Mostrar fecha de nacimiento");
	        mostrarFecha.setBounds(150,250,250,10);
	        mostrarFecha.setOpaque(false);
	        perfilDeUsuario.add(mostrarFecha);
	        
	        JCheckBox fotoMostrar = new JCheckBox("Mostrar foto de perfil");
	        fotoMostrar.setBounds(150,280,250,10);
	        fotoMostrar.setOpaque(false);
	        perfilDeUsuario.add(fotoMostrar);

	        panelNuevo.add(perfilDeUsuario);

        JLabel datosOpcionales = new JLabel();
        datosOpcionales.setOpaque(true);
        datosOpcionales.setBackground(Color.YELLOW);
        datosOpcionales.setBorder(BorderFactory.createLineBorder(Color.white,10));
        
        JLabel tituloOpcionales = new JLabel("Datos Opcionales");
        tituloOpcionales.setBounds(20,-30,100,100);
        datosOpcionales.add(tituloOpcionales,BorderLayout.NORTH);
       
        String[] columnas = {"Preferencia"};
        Object[][] datos = {
            {"Preferencia 1"},
            {"Preferencia 2"},
            {"Preferencia 3"},
            {"Preferencia 4"},
            {"Preferencia 5"},
            {"Preferencia 6"},
            {"Preferencia 7"},
            {"Preferencia 8"},
        };
        
        JTable tablaPref = new JTable(datos,columnas);
        JScrollPane tablaScroll = new JScrollPane(tablaPref);
        tablaScroll.setBounds(300, 150, 100, 100);
        tablaScroll.setOpaque(true);
        datosOpcionales.add(tablaScroll);
       
       JTextField descripcion = new JTextField();
       JScrollPane scrollDescripcion = new JScrollPane(descripcion);
       scrollDescripcion.setBounds(100, 150, 100, 100);
       scrollDescripcion.setOpaque(true);
       datosOpcionales.add(scrollDescripcion);

       panelNuevo.add(datosOpcionales);
 

        JLabel botones = new JLabel();
        botones.setOpaque(true);
        botones.setBackground(Color.ORANGE);
        botones.setBorder(BorderFactory.createLineBorder(Color.white,10));
        
        JButton nuevo = new JButton("Nuevo");
        nuevo.setBounds(200,100,100,30);
        botones.add(nuevo);
        
        JButton guardar = new JButton("Guardar");
        guardar.setBounds(200,150,100,30);
        botones.add(guardar);
        
        JButton salir = new JButton("Salir");
        salir.setBounds(200,200,100,30);
        botones.add(salir);
        		
        

        
      
        panelNuevo.add(botones);

       
        getContentPane().add(panelCentral);
    }

    public void interes()
    {
    JPanel panel = new JPanel();
		panel.setSize(this.getWidth(),this.getHeight());
		panel.setBackground(Color.white);
		panel.setLayout( new BorderLayout());
		
		//panel de datos verde
		JLabel verde = new JLabel();
		verde.setOpaque(true);
		verde.setPreferredSize(new Dimension(200,300));
		verde.setBackground(Color.decode("#7DDA58"));
		verde.setFont(new Font ("calibri",Font.BOLD,30));
		verde.setBorder(BorderFactory.createLineBorder(Color.white,20));
		panel.add(verde, BorderLayout.CENTER);
		
		//panel de datos rojo
		JLabel rojo = new JLabel();
		rojo.setOpaque(true);
		rojo.setPreferredSize(new Dimension(200,300));
		rojo.setBackground(Color.red);
		rojo.setBorder(BorderFactory.createLineBorder(Color.white,20));
		panel.add(rojo, BorderLayout.SOUTH);
		
		//Calcular interes Label
		JLabel calcularInteres = new JLabel("Calcular interés: ");
		calcularInteres.setBounds(325,25,350,50);
		calcularInteres.setForeground(Color.WHITE);
		calcularInteres.setFont(new Font ("Arial Black", Font.ITALIC, 36));
		
		verde.add(calcularInteres);
		
		//Capital Label
		JLabel capital = new JLabel("Capital: ");
		capital.setBounds(70,80,180,40);
		capital.setFont(new Font ("Arial Black", Font.BOLD, 24));
		capital.setForeground(Color.black);
		verde.add(capital);
		
		//textfield de capital
		JTextField escribeCapital = new JTextField();
		escribeCapital.setBounds(350,90,200,25);
		escribeCapital.setOpaque(true);
		escribeCapital.setBackground(Color.white);
		verde.add(escribeCapital);
		
		//label de tiempo
		JLabel tiempo = new JLabel("Tiempo: ");
		tiempo.setBounds(70,140,180,40);
		tiempo.setFont(new Font ("Arial Black", Font.ITALIC, 24));
		tiempo.setForeground(Color.black);
		verde.add(tiempo);
		
		//textfield de tiempo
		JTextField typeTime = new JTextField();
		typeTime.setBounds(350,150,200,25);
		typeTime.setOpaque(true);
		typeTime.setBackground(Color.white);
		verde.add(typeTime);
		
		//tasa de interes label
		JLabel tasaInteres = new JLabel("Tasa de interés: ");
		tasaInteres.setBounds(70,200,300,40);
		tasaInteres.setFont(new Font ("Arial Black",Font.ITALIC,24));
		tasaInteres.setForeground(Color.black);
		verde.add(tasaInteres);
		
		//textfield de interes
		JTextField interes = new JTextField();
		interes.setBounds(350,210,200,25);
		interes.setOpaque(true);
		interes.setBackground(Color.white);
		verde.add(interes);
		
		//InterestText Label
		JLabel textoInteres = new JLabel("INTERES",0);
		textoInteres.setFont(new Font ("Arial Black",Font.ITALIC,48));
		textoInteres.setForeground(Color.cyan);
		textoInteres.setBounds(100,100,100,100);
		panel.add(textoInteres, BorderLayout.NORTH);
		
		//Boton de calcular
		JButton calcular = new JButton("Calcular");
		calcular.setBounds(300, 300, 150, 40);
		verde.add(calcular);
		
		//Boton de cancelar
		JButton cancelar = new JButton("Cancelar");
		cancelar.setOpaque(true);
		cancelar.setBounds(500, 300, 150, 40);
		verde.add(cancelar);
		
		//label de interes
		JLabel interes2 = new JLabel("Interés: ");
		interes2.setBounds(70,80,180,40);
		interes2.setFont(new Font ("Arial Black", Font.ITALIC, 24));
		interes2.setForeground(Color.black);
		rojo.add(interes2);
		
		//textfield de interes
		JTextField textInteres = new JTextField();
		textInteres.setBounds(350,90,200,25);
		textInteres.setOpaque(true);
		textInteres.setBackground(Color.white);
		rojo.add(textInteres);
		
		//label de monto
		JLabel monto = new JLabel("Monto: ");
		monto.setBounds(70,140,180,40);
		monto.setFont(new Font ("Arial Black", Font.ITALIC, 24));
		monto.setForeground(Color.black);
		rojo.add(monto);
		
		//textfield de cantidad
		JTextField cantidad = new JTextField();
		cantidad.setBounds(350,150,200,25);
		cantidad.setOpaque(true);
		cantidad.setBackground(Color.white);
		rojo.add(cantidad);
		
		getContentPane().add(panel);
    }

    public void calculadora() {
       
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());
        panelPrincipal.setSize(this.getWidth(), this.getHeight());
        panelPrincipal.setBackground(Color.blue);

        
        JPanel panelSuperior = new JPanel();
        panelSuperior.setLayout(new BorderLayout());

        
        JTextField display = new JTextField();
        display.setFont(new Font("Arial", Font.PLAIN, 48));
        panelSuperior.add(display, BorderLayout.NORTH);

        
        JPanel panelFlow = new JPanel();
        panelFlow.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));

        String btnsFlow[] = {"MC", "M+", "/", "*"};
        for (int i = 0; i < 4; i++) {
            JButton boton = new JButton(btnsFlow[i]); 
            boton.setPreferredSize(new Dimension(246, 50));
            boton.setBackground(Color.BLACK);
            boton.setForeground(Color.WHITE);
            panelFlow.add(boton);
        }
        panelSuperior.add(panelFlow, BorderLayout.CENTER);

        panelPrincipal.add(panelSuperior, BorderLayout.NORTH);

        
       
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(4, 3, 0, 0));

        String btns[] = {"7", "8", "9", "6", "5", "4", "3", "2", "1", "0", ".", "/"};
        for (int i = 0; i < 12; i++) {
            JButton boton = new JButton(btns[i]);
            boton.setBackground(Color.gray);
            boton.setForeground(Color.WHITE);
            panelBotones.add(boton);
        }
        panelPrincipal.add(panelBotones, BorderLayout.CENTER);
        
        
        
        JPanel panelVerticalDerecha = new JPanel();
        panelVerticalDerecha.setLayout(new BoxLayout(panelVerticalDerecha, BoxLayout.Y_AXIS));

        
        String btnsBox[] = {"+", "-", "=", "="};
        for (int i = 0; i < 4; i++) {
            JButton boton = new JButton(btnsFlow[i]);
            boton.setPreferredSize(new Dimension(75,200));
            panelVerticalDerecha.add(boton);
        }

        panelPrincipal.add(panelSuperior, BorderLayout.NORTH);
        panelPrincipal.add(panelVerticalDerecha, BorderLayout.EAST);
        getContentPane().add(panelPrincipal);
    }
 
    public void login() {
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
        	
				registro();
    			login.setVisible(false);
			
        
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

    public void admin() {
   
    //
    JPanel admin_panel = new JPanel();
    admin_panel.setLayout(null);
    admin_panel.setSize(getWidth() / 2, getHeight());
    admin_panel.setBackground(Color.decode("#FFEF5E"));
   
    //menu
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
   
    JLabel users_tag = new JLabel("Usuarios",0);
    users_tag.setSize(300, 80);
    users_tag.setLocation(350,20);
    users_tag.setFont(new Font("Arial", Font.BOLD, 24));
    users_tag.setForeground(Color.white);
    users_tag.setOpaque(true);
    users_tag.setBackground(Color.black);
    admin_panel.add(users_tag);
       
       
        //widget y datos de el widget
        JLabel title_widget = new JLabel("Total de Usuarios",0);
        title_widget.setBounds(40,130,300,40);
        title_widget.setFont(new Font("Arial", Font.BOLD, 16));
        title_widget.setForeground(Color.white);
        title_widget.setOpaque(true);
        title_widget.setBackground(Color.black);
        admin_panel.add(title_widget);
   
        JLabel number_widget = new JLabel("100",0);
        number_widget.setBounds(40,170,300,40);
        number_widget.setFont(new Font("Arial", Font.BOLD, 32));
        number_widget.setForeground(Color.white);
        number_widget.setOpaque(true);
        number_widget.setBackground(Color.black);
        admin_panel.add(number_widget);
       
        JLabel widget = new JLabel(" ");
        widget.setBounds(40,120,300,100);
        widget.setOpaque(true);
        widget.setBackground(Color.black);
        admin_panel.add(widget);
       
        //botones
        JButton download = new JButton("Descargar");
        download.setBounds(700, 240, 100, 40);
        admin_panel.add(download);
        JButton add_user = new JButton("Agregar Usuario");
        add_user.setBounds(810, 240, 150, 40);
        admin_panel.add(add_user);
       
     
   
    String titulos[]= {"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"};
    String table_data[][]= {{"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
    {"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
    {"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
    {"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
    {"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
    {"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
    {"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
    {"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
    {"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
    {"No.Control","Nombre","Apellidos","Semestre","Promedio","Acciones"},
    };
   
   

   
    JTable table_users = new JTable(table_data,titulos);
    JScrollPane table_scroll = new JScrollPane(table_users);
    table_scroll.setBounds(40, 280, 920, 100);
    table_scroll.setOpaque(true);
    admin_panel.add(table_scroll);
   
   
   
   
    this.setJMenuBar(barra);
   
    getContentPane().add(admin_panel);
    }
    
    public void registro() {

        JPanel registro = new JPanel();
        registro.setLayout(null);
        registro.setSize(getWidth(), getHeight());
        registro.setLocation(0, 0);
        registro.setBackground(Color.pink);
       
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
        
        textField = new JTextField();
        textField.setBounds(249, 291, 500, 40);
        registro.add(textField);
        
        JLabel contrasena = new JLabel("Contraseña", SwingConstants.CENTER);
        contrasena.setFont(new Font("Arial", Font.BOLD, 24));
        contrasena.setBackground(Color.YELLOW);
        contrasena.setBounds(249, 342, 172, 30);
        registro.add(contrasena);
        
        textField_1 = new JPasswordField();
        textField_1.setBounds(249, 373, 500, 40);
        registro.add(textField_1);
        
        JLabel confirmarContrasena = new JLabel("Confirmar contraseña", SwingConstants.CENTER);
        confirmarContrasena.setFont(new Font("Arial", Font.BOLD, 24));
        confirmarContrasena.setBackground(Color.YELLOW);
        confirmarContrasena.setBounds(233, 424, 326, 30);
        registro.add(confirmarContrasena);
        
        textField_2 = new JPasswordField();
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
        	
				login();
    			registro.setVisible(false);
			
        
        }
        });
    
    		
    			
   
       
        getContentPane().add(registro);
        
        
        

       
       
       
    }

    public void botones() {
        this.setSize(500, 750);

        JPanel botonesPanel = new JPanel();
        botonesPanel.setLayout(null);
        botonesPanel.setSize(getWidth(), getHeight());
        botonesPanel.setLocation(100, 100);
        botonesPanel.setFocusable(true);
        botonesPanel.requestFocusInWindow();
        botonesPanel.setBackground(Color.pink);

        botonesPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);

                int x = e.getX();
                int y = e.getY();

                int w = (int) Math.floor(Math.random() * 120 + 1);
                int h = (int) Math.floor(Math.random() * 120 + 1);

                Random rand = new Random();

                float r = rand.nextFloat();
                float g = rand.nextFloat();
                float b = rand.nextFloat();

                JButton otroBoton = new JButton(r + "" + g + "" + b);
                otroBoton.setBounds(x, y, w, h);
                otroBoton.setBackground(new Color(r, g, b));
                otroBoton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(botonesPanel, r + "" + g + "" + b);
                        otroBoton.setVisible(false);
                    }
                });

                botonesPanel.add(otroBoton);
                getContentPane().repaint();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                Random rand = new Random();
                float r = rand.nextFloat();
                float g = rand.nextFloat();
                float b = rand.nextFloat();

                botonesPanel.setBackground(new Color(r, g, b));
            }
        });

        botonesPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int aumento = 10;
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_DELETE:
                    case KeyEvent.VK_BACK_SPACE:
                        botonesPanel.removeAll();
                        botonesPanel.repaint();
                        break;
                    case KeyEvent.VK_W:
                        moverBotones(0, -aumento);
                        break;
                    case KeyEvent.VK_S:
                        moverBotones(0, aumento);
                        break;
                    case KeyEvent.VK_A:
                        moverBotones(-aumento, 0);
                        break;
                    case KeyEvent.VK_D:
                        moverBotones(aumento, 0);
                        break;
                    case KeyEvent.VK_E:
                        cambiarTamano(aumento);
                        break;
                }
            }

            private void moverBotones(int deltaX, int deltaY) {
                Component[] components = botonesPanel.getComponents();
                for (Component component : components) {
                    if (component instanceof JButton) {
                        JButton button = (JButton) component;
                        button.setLocation(button.getX() + deltaX, button.getY() + deltaY);
                    }
                }
            }

            private void cambiarTamano(int deltaSize) {
                Component[] components = botonesPanel.getComponents();
                for (Component component : components) {
                    if (component instanceof JButton) {
                        JButton button = (JButton) component;
                        button.setSize(button.getWidth() + deltaSize, button.getHeight() + deltaSize);
                    }
                }
            }
        });

        JButton superBoton = new JButton("Probar Inicio de sesion");
        superBoton.setBounds(500, 600, 200, 20);
        botonesPanel.add(superBoton);

        getContentPane().add(botonesPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void juegoNumbers() {
        setSize(1080, 720);
        setLocationRelativeTo(null);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());
        panelPrincipal.setBackground(Color.blue);

        JPanel panelBotones = new JPanel();
        panelBotones.setBorder(new LineBorder(Color.black, 60, false));
        panelBotones.setLayout(new GridLayout(4, 4, 10, 10));

        String btns[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"};

        List<String> listaNumeros = Arrays.asList(btns);
        Collections.shuffle(listaNumeros);

        JButton[] botones = new JButton[btns.length];
        final JButton[] botonVacio = new JButton[1];

        for (int i = 0; i < 15; i++) {
            JButton boton = new JButton(btns[i]);
            boton.setBackground(Color.gray);
            boton.setForeground(Color.WHITE);
            boton.setFont(new Font("Arial", Font.BOLD, 48));
            botones[i] = boton;
            panelBotones.add(boton);

            boton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (esAdyacenteVacio(boton, botonVacio[0])) {
                        String textoBoton = boton.getText();
                        boton.setText("");
                        botonVacio[0].setText(textoBoton);
                        botonVacio[0].setBackground(Color.gray);
                        botonVacio[0].setForeground(Color.WHITE);
                        botonVacio[0] = boton;
                    }
                }
            });

            if (i == 14) {
                botonVacio[0] = new JButton("");
                botonVacio[0].setBackground(Color.gray);
                botonVacio[0].setForeground(Color.WHITE);
                botonVacio[0].setFont(new Font("Arial", Font.BOLD, 48));
                panelBotones.add(botonVacio[0]);
            }
        }

        panelPrincipal.add(panelBotones, BorderLayout.CENTER);

        // Agregar botones de pausa y reanudación
        JButton pausaButton = new JButton("Pausar");
        JButton reanudarButton = new JButton("Reanudar");

        pausaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pausarJuego();
            }
        });

        reanudarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reanudarJuego();
            }
        });

        JButton reiniciarButton = new JButton("Reiniciar");
        reiniciarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	segundos = 0;
                pausado = false;
                remove(panelPrincipal);
                juegoNumbers();
            }
        });

        JPanel panelEste = new JPanel();
        panelEste.setLayout(new GridLayout(4, 1));
        panelEste.add(pausaButton);
        panelEste.add(reanudarButton);
        panelEste.add(reiniciarButton);

        // Agregar temporizador
        JLabel tiempoLabel = new JLabel("Tiempo: 00:00");
        panelEste.add(tiempoLabel);
        iniciarTemporizador(tiempoLabel);

        panelPrincipal.add(panelEste, BorderLayout.EAST);

        getContentPane().add(panelPrincipal);
        setVisible(true);
    }

    private Timer timer;
    private int segundos;
    private boolean pausado;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;

    private void iniciarTemporizador(JLabel tiempoLabel) {
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!pausado) { // Solo actualiza el tiempo si no está pausado
                    segundos++;
                    int minutos = segundos / 60;
                    int segundosRestantes = segundos % 60;
                    tiempoLabel.setText(String.format("Tiempo: %02d:%02d", minutos, segundosRestantes));
                }
            }
        });
        timer.start();
    }

    private void pausarJuego() {
        pausado = true;
    }

    private void reanudarJuego() {
        pausado = false;
    }

   

    private boolean esAdyacenteVacio(JButton boton, JButton botonVacio) {
        Point posicionBoton = obtenerPosicionBoton(boton);
        Point posicionVacio = obtenerPosicionBoton(botonVacio);
        return Math.abs(posicionBoton.getX() - posicionVacio.getX()) +
                Math.abs(posicionBoton.getY() - posicionVacio.getY()) == 1;
    }

    private Point obtenerPosicionBoton(JButton boton) {
        Point posicion = new Point();
        Component[] componentes = ((JPanel) boton.getParent()).getComponents();
        for (int i = 0; i < componentes.length; i++) {
            if (componentes[i] == boton) {
                posicion.setLocation(i % 4, i / 4);
                break;
            }
        }
        return posicion;
    }
}


