import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

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
    	//login();
    	//registro();
    	admin();
    }

    // Método para crear el panel
    public void registro() {
        

        JPanel registro = new JPanel();
        registro.setLayout(null);
        registro.setSize(getWidth() / 2, getHeight());
        registro.setLocation(500, 0);
        registro.setBackground(Color.pink);
        
        JLabel registerTag = new JLabel("Registro",0);
        registerTag.setSize(200, 80);
        registerTag.setLocation(640, 20);
        registerTag.setFont(new Font("Arial", Font.BOLD, 24));
        registerTag.setForeground(Color.white);
        registerTag.setOpaque(true);
        registerTag.setBackground(Color.black);
        registro.add(registerTag);
        
        
        //Nombre de usuario
        JLabel nombreUsuario = new JLabel("Nombre de usuario",0);
        nombreUsuario.setSize(400, 40);
        nombreUsuario.setLocation(540, 150);
        nombreUsuario.setFont(new Font("Arial", Font.BOLD, 24));
        nombreUsuario.setBackground(Color.yellow);
        nombreUsuario.setOpaque(true);
        registro.add(nombreUsuario);
        
        //ingresar usuario
        JTextField ingresarUsuario = new JTextField();
        ingresarUsuario.setSize(400, 40);
        ingresarUsuario.setLocation(540, 200);
        registro.add(ingresarUsuario);
        
        //texto biografia
        JLabel biografia = new JLabel("Biografia",0);
        biografia.setSize(350, 40);
        biografia.setLocation(560, 250);
        biografia.setFont(new Font("Arial", Font.BOLD, 24));
        biografia.setBackground(Color.green);
        biografia.setOpaque(true);
        registro.add(biografia);
        
        
        //ingrese biografia
        JTextArea textoBio= new JTextArea();
        textoBio.setSize(400, 80);
        textoBio.setLocation(535, 300);
        registro.add(textoBio);
        
      //texto preferencias
        JLabel preferencias = new JLabel("Preferencias",0);
        preferencias.setSize(350, 40);
        preferencias.setLocation(560,390);
        preferencias.setFont(new Font("Arial", Font.BOLD, 24));
        preferencias.setBackground(Color.red);
        preferencias.setOpaque(true);
        registro.add(preferencias);
        
        // Checkbox para prefrencias 1
        JCheckBox preferencia1 = new JCheckBox("Hombres");
        preferencia1.setOpaque(false);
        preferencia1.setSize(150, 20);
        preferencia1.setLocation(550, 450);
        registro.add(preferencia1);
        // Checkbox para prefrencias 2
        JCheckBox preferencia2 = new JCheckBox("Mujeres");
        preferencia2.setOpaque(false);
        preferencia2.setSize(150, 20);
        preferencia2.setLocation(700, 450);
        registro.add(preferencia2);
        // Checkbox para prefrencias 3
        JCheckBox preferencia3 = new JCheckBox("Otros");
        preferencia3.setOpaque(false);
        preferencia3.setSize(150, 20);
        preferencia3.setLocation(850, 450);
        registro.add(preferencia3);
        
        //texto de terminos
        JLabel terminos = new JLabel("Terminos",0);
        terminos.setSize(200, 40);
        terminos.setLocation(640, 500);
        terminos.setFont(new Font("Arial", Font.BOLD, 24));
        terminos.setForeground(Color.white);
        terminos.setOpaque(true);
        terminos.setBackground(Color.blue);
        registro.add(terminos);
        
        
        
        //boton aceptar terminos
        JRadioButton botonAceptar = new JRadioButton("Acepto");
        botonAceptar.setBounds(550,600, 150, 20);
        botonAceptar.setFont(new Font("Arial", Font.BOLD, 24));
        botonAceptar.setOpaque(false);
        registro.add(botonAceptar);
        
        //boton denegar terminos
        JRadioButton botonDenegar = new JRadioButton("Deniego");
        botonDenegar.setBounds(800,600, 150, 20);
        botonDenegar.setFont(new Font("Arial", Font.BOLD, 24));
        botonDenegar.setOpaque(false);
        registro.add(botonDenegar);
        
        //botones de preferencia
        ButtonGroup terminosBoton = new ButtonGroup();
        terminosBoton.add(botonAceptar);
        terminosBoton.add(botonDenegar);
        
        //arreglo de locaciones y combobox
        String locacionesArreglo[]={"Centro","Camino Real","Pedregal"};
        JComboBox locaciones = new JComboBox(locacionesArreglo);
        locaciones.setBounds(650,650,150,20);
        registro.add(locaciones);
        

        
        this.add(registro);

        
        
        
    }
    
    public void login() {
    JPanel login = new JPanel();
    login.setLayout(null);
    login.setSize(getWidth() / 2, getHeight());
    login.setBackground(Color.GRAY);
    	
    JLabel loginTag = new JLabel("Acceder",0);
    loginTag.setSize(200, 80);
    loginTag.setLocation(130, 20);
    loginTag.setFont(new Font("Arial", Font.BOLD, 24));
    loginTag.setOpaque(true);
    loginTag.setBackground(Color.RED);
    login.add(loginTag);

    //texto de usuario
    JLabel usuario = new JLabel("Usuario");
    usuario.setSize(100, 20);
    usuario.setLocation(10, 150);
    usuario.setFont(new Font("Arial", Font.BOLD, 24));
    usuario.setBackground(Color.GRAY);
    login.add(usuario);

    //ingresar usuario
    JTextField usuarioTexto = new JTextField();
    usuarioTexto.setSize(400, 40);
    usuarioTexto.setLocation(10, 180);
    login.add(usuarioTexto);

    //texto de contraseña
    JLabel contrasena = new JLabel("Contraseña");
    contrasena.setSize(150, 20);
    contrasena.setLocation(10, 250);
    contrasena.setFont(new Font("Arial", Font.BOLD, 24));
    contrasena.setBackground(Color.GRAY);
    login.add(contrasena);

    //ingresar contraseña
    JPasswordField contrasenaTexto = new JPasswordField();
    contrasenaTexto.setSize(400, 40);
    contrasenaTexto.setLocation(10, 280);
    login.add(contrasenaTexto);

    // Checkbox para recordar usuario
    JCheckBox recordarme = new JCheckBox("Recordarme");
    recordarme.setOpaque(false);
    recordarme.setSize(150, 20);
    recordarme.setLocation(10, 330);
    login.add(recordarme);
    

    // Botón de Acceder
    JButton boton = new JButton("Acceder");
    boton.setSize(150, 40);
    boton.setLocation(135, 350);
    login.add(boton);
    
    this.add(login);
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
    	
    	this.add(admin_panel);
    }
}

