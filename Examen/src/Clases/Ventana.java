package Clases;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	protected static final JOptionPane JOpctionPaneJOptionPane = null;
	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JTextField textFieldApPaterno;
	private JTextField textFieldApMaterno;
	private JTextField textFieldCurp;
	private JTextField textFieldDomicilio;
	private JTextField textField_2;
	private JTextField textFieldCorreo;
	private JTextField textFieldTelefono;
	private JTextField textFieldCP;
	private JTextField textFieldMatricula;
	private JTextField textFieldNacimiento;
	private JComboBox comboBoxNacionalidad , comboBoxGeneros,comboBoxDias,comboBox_1,comboBoxMes,comboBoxAnio,comboBoxEscolaridad,comboBoxStatus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	


	public Ventana() {
	    contentPane = new JPanel();
	    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setSize(1080, 760);
	    setLocationRelativeTo(null);
	    
	    
	    probarComponentes();

	}
	
	public void probarComponentes() {
		this.login();
	}
	
	public void login() {
 
    JPanel login = new JPanel();
    login.setLayout(null);
    login.setBackground(new Color(64, 0, 128));
    
    JLabel loginDentro = new JLabel();
    loginDentro.setLocation(173, 131);
    loginDentro.setLayout(null);
    loginDentro.setBackground(new Color(128, 0, 255));
    loginDentro.setSize(700,500);
    loginDentro.setOpaque(rootPaneCheckingEnabled);
    login.add(loginDentro);

    JLabel loginTag = new JLabel("Inicio De Sesion",0);
    loginTag.setSize(500, 80);
    loginTag.setLocation(271, 40);
    loginTag.setFont(new Font("Arial Black", Font.ITALIC, 48));
    loginTag.setForeground(Color.white);
    login.add(loginTag);
    

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
    			if(usr.length()>0 && pwd.length()>0) {
    				getContentPane().removeAll();
    	    		inicio();
    	    		getContentPane().revalidate();
    	    		getContentPane().repaint();
    			}
    			
    			
    	}
    });

    loginDentro.add(botonAcceder);

    getContentPane().add(login);
    }


	public void inicio() {

		menuInicio();
    	
    	JPanel inicio = new JPanel();
    	inicio .setLayout(null);
    	inicio.setBackground(new Color(128, 0, 255));
      
        JLabel holaTag = new JLabel("Bienvenido!",0);
        holaTag.setSize(560, 80);
        holaTag.setLocation(243, 25);
        holaTag.setFont(new Font("Arial Black", Font.ITALIC, 48));
        holaTag.setForeground(new Color(244, 145, 42));
        holaTag.setBackground(Color.black);
        inicio.add(holaTag);
        

        getContentPane().add(inicio);
        
        JButton docentes = new JButton("Docente");
        docentes.setBounds(281, 251, 171, 171);
        docentes.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        getContentPane().removeAll();
		        panelDocentes();
		        getContentPane().revalidate();
		        getContentPane().repaint(); 
		    }
		});
        inicio.add(docentes);
        
        JButton alumnos = new JButton("Alumno");
        alumnos.setBounds(602, 251, 171, 171);
        alumnos.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        getContentPane().removeAll();
		        panelAlumnos();
		        getContentPane().revalidate();
		        getContentPane().repaint(); 
		    }
		});
        inicio.add(alumnos);
        
    }
	
	public void panelDocentes() {
	
		menuDocentes();
    	
    	JPanel inicio = new JPanel();
    	inicio .setLayout(null);
    	inicio.setBackground(new Color(255, 255, 255));
      
        JLabel holaTag = new JLabel("Seleccione que desea hacer!",0);
        holaTag.setSize(810, 80);
        holaTag.setLocation(124, 26);
        holaTag.setFont(new Font("Arial Black", Font.ITALIC, 48));
        holaTag.setForeground(new Color(244, 145, 42));
        holaTag.setBackground(Color.black);
        inicio.add(holaTag);
        

        getContentPane().add(inicio);
        
        JButton descargarDoce = new JButton("Descargar Informacion");
        descargarDoce.addActionListener(new ActionListener() {
    	    public void actionPerformed(ActionEvent e) {
    	        getContentPane().removeAll();
    	        descargarDoce();
    	        getContentPane().revalidate();
    	        getContentPane().repaint();
    	    }
    	});
        descargarDoce.setBounds(100, 150, 200, 200);
        inicio.add(descargarDoce);
        
        JButton consultarDoce = new JButton("Consultar");
        consultarDoce.addActionListener(new ActionListener() {
    	    public void actionPerformed(ActionEvent e) {
    	        getContentPane().removeAll();
    	        consultarDoce();
    	        getContentPane().revalidate();
    	        getContentPane().repaint();
    	    }
    	});
        consultarDoce.setBounds(400, 150, 200, 200);
        inicio.add(consultarDoce);
        
        JButton crearDoce = new JButton("Crear");
        crearDoce.addActionListener(new ActionListener() {
    	    public void actionPerformed(ActionEvent e) {
    	        getContentPane().removeAll();
    	        crearDoce();
    	        getContentPane().revalidate();
    	        getContentPane().repaint();
    	    }
    	});
        crearDoce.setBounds(700, 150, 200, 200);
        inicio.add(crearDoce);
        
        JButton editarDoce = new JButton("Editar");
        editarDoce.addActionListener(new ActionListener() {
    	    public void actionPerformed(ActionEvent e) {
    	        getContentPane().removeAll();
    	        editarDoce();
    	        getContentPane().revalidate();
    	        getContentPane().repaint();
    	    }
    	});
        editarDoce.setBounds(250, 400, 200, 200);
        inicio.add(editarDoce);
        
        JButton eliminarDoce = new JButton("Eliminar");
        eliminarDoce.addActionListener(new ActionListener() {
    	    public void actionPerformed(ActionEvent e) {
    	        getContentPane().removeAll();
    	        eliminarDoce();
    	        getContentPane().revalidate();
    	        getContentPane().repaint();
    	    }
    	});
        eliminarDoce.setBounds(550, 400, 200, 200);
        inicio.add(eliminarDoce);
        
        
		
	}
	
	public void panelAlumnos() {
	
		menuAlumnos();
    	
    	JPanel inicio = new JPanel();
    	inicio .setLayout(null);
    	inicio.setBackground(new Color(255, 255, 255));
      
        JLabel holaTag = new JLabel("Seleccione que desea hacer!",0);
        holaTag.setSize(810, 80);
        holaTag.setLocation(124, 26);
        holaTag.setFont(new Font("Arial Black", Font.ITALIC, 48));
        holaTag.setForeground(new Color(244, 145, 42));
        holaTag.setBackground(Color.black);
        inicio.add(holaTag);
        

        getContentPane().add(inicio);
        
        JButton descargarAlu = new JButton("Descargar Informacion");
        descargarAlu.addActionListener(new ActionListener() {
    	    public void actionPerformed(ActionEvent e) {
    	        getContentPane().removeAll();
    	        descargarAlu();
    	        getContentPane().revalidate();
    	        getContentPane().repaint();
    	    }
    	});
        descargarAlu.setBounds(100, 150, 200, 200);
        inicio.add(descargarAlu);
        
        JButton consultarAlu = new JButton("Consultar");
        consultarAlu.addActionListener(new ActionListener() {
    	    public void actionPerformed(ActionEvent e) {
    	        getContentPane().removeAll();
    	        consultarAlu();
    	        getContentPane().revalidate();
    	        getContentPane().repaint();
    	    }
    	});
        consultarAlu.setBounds(400, 150, 200, 200);
        inicio.add(consultarAlu);
        
        JButton crearAlu = new JButton("Crear");
        crearAlu.addActionListener(new ActionListener() {
    	    public void actionPerformed(ActionEvent e) {
    	        getContentPane().removeAll();
    	        crearAlu();
    	        getContentPane().revalidate();
    	        getContentPane().repaint();
    	    }
    	});
        crearAlu.setBounds(700, 150, 200, 200);
        inicio.add(crearAlu);
        
        JButton editarAlu = new JButton("Editar");
        editarAlu.addActionListener(new ActionListener() {
    	    public void actionPerformed(ActionEvent e) {
    	        getContentPane().removeAll();
    	        editarAlu();
    	        getContentPane().revalidate();
    	        getContentPane().repaint();
    	    }
    	});
        editarAlu.setBounds(250, 400, 200, 200);
        inicio.add(editarAlu);
        
        JButton eliminarAlu = new JButton("Eliminar");
        eliminarAlu.addActionListener(new ActionListener() {
    	    public void actionPerformed(ActionEvent e) {
    	        getContentPane().removeAll();
    	        eliminarAlu();
    	        getContentPane().revalidate();
    	        getContentPane().repaint();
    	    }
    	});
        eliminarAlu.setBounds(550, 400, 200, 200);
        inicio.add(eliminarAlu);
        
        
		
	}
	
	
	public void descargarAlu() {
		menuAlumnos();
		JPanel consultarAlu = new JPanel();
		consultarAlu.setBackground(Color.GREEN);
		getContentPane().add(consultarAlu);
		
		JLabel lblNewLabel = new JLabel("Descargar");
		consultarAlu.add(lblNewLabel);
		
		
	}
	
	public void consultarAlu() {
		menuAlumnos();
	    JPanel crearAlumno = new JPanel();
	    crearAlumno.setBackground(new Color(255, 255, 255));
	    getContentPane().add(crearAlumno);
	    crearAlumno.setLayout(null);
	    
	    JLabel lbl_altaAlumno = new JLabel("Consultoria");
	    lbl_altaAlumno.setForeground(new Color(0, 0, 128));
	    lbl_altaAlumno.setBounds(33, 34, 182, 25);
	    lbl_altaAlumno.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
	    crearAlumno.add(lbl_altaAlumno);
	    
	    JPanel panel_1 = new JPanel();
	    panel_1.setBackground(new Color(128, 255, 128));
	    panel_1.setBounds(10, 10, 1046, 117);
	    crearAlumno.add(panel_1);
	    panel_1.setLayout(null);
	    
	    JLabel lblNewLabel_1 = new JLabel("Consultar Alumno");
	    lblNewLabel_1.setBounds(420, 40, 195, 25);
	    panel_1.add(lblNewLabel_1);
	    lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));

	    JPanel pnlDatosBasicos = new JPanel();
	    pnlDatosBasicos.setBounds(0, 312, 1064, 28);
	    crearAlumno.add(pnlDatosBasicos);
	    pnlDatosBasicos.setLayout(null);
	    
	    JLabel lblDatosBasicos = new JLabel("Ingresa tu codigo de control");
	    lblDatosBasicos.setFont(new Font("Tahoma", Font.PLAIN, 17));
	    lblDatosBasicos.setBounds(409, 0, 227, 25);
	    pnlDatosBasicos.add(lblDatosBasicos);

	    textFieldNombre = new JTextField();
	    textFieldNombre.setBounds(312, 351, 409, 19);
	    crearAlumno.add(textFieldNombre);
	    textFieldNombre.setColumns(10);
	    
	    JButton btnNewButton = new JButton("Consultar");
	    btnNewButton.setBounds(470, 381, 89, 23);
	    crearAlumno.add(btnNewButton);
	    btnNewButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	if(textFieldNombre.getText().length()!=0) {
		        getContentPane().removeAll();
		        alumnoEncontrado();
		        getContentPane().revalidate();
		        getContentPane().repaint();
		    	}
		    	else {
		    		textFieldNombre.setBorder(new LineBorder(Color.red,2,true));
		    	}
		    }
		});
  
	}
	
	public void crearAlu() {
		menuAlumnos();
	    JPanel crearAlumno = new JPanel();
	    crearAlumno.setBackground(new Color(255, 255, 255));
	    getContentPane().add(crearAlumno);
	    crearAlumno.setLayout(null);
	    
	    JLabel lbl_altaAlumno = new JLabel("Alta de alumnos");
	    lbl_altaAlumno.setForeground(new Color(0, 0, 128));
	    lbl_altaAlumno.setBounds(33, 34, 182, 25);
	    lbl_altaAlumno.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
	    crearAlumno.add(lbl_altaAlumno);
	    
	    JLabel lblNewLabel_1 = new JLabel("Registrar información básica de alumno");
	    lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
	    lblNewLabel_1.setBounds(286, 51, 459, 25);
	    crearAlumno.add(lblNewLabel_1);
	    
	    JPanel panel_1 = new JPanel();
	    panel_1.setBackground(new Color(128, 255, 128));
	    panel_1.setBounds(10, 10, 1046, 117);
	    crearAlumno.add(panel_1);
	    
	    JPanel panel_2 = new JPanel();
	    panel_2.setBackground(new Color(255, 250, 240));
	    panel_2.setBounds(732, 179, 274, 314);
	    crearAlumno.add(panel_2);
	    panel_2.setLayout(null);
	    
	    JPanel panel = new JPanel();
	    panel.setBounds(39, 51, 205, 204);
	    panel_2.add(panel);
	    
	    JLabel lbl_ImagenAlumno = new JLabel("Imagen Alumno");
	    lbl_ImagenAlumno.setBounds(76, 18, 144, 23);
	    panel_2.add(lbl_ImagenAlumno);
	    lbl_ImagenAlumno.setFont(new Font("Tahoma", Font.PLAIN, 18));
	    
	    JButton btnEliminar = new JButton("Eliminar");
	    btnEliminar.setBounds(159, 265, 85, 40);
	    panel_2.add(btnEliminar);
	    
	    JButton btnAgregar = new JButton("Agregar");
	    btnAgregar.setBounds(39, 265, 85, 40);
	    panel_2.add(btnAgregar);
	    
	    JPanel pnlDatosBasicos = new JPanel();
	    pnlDatosBasicos.setBounds(10, 137, 632, 28);
	    crearAlumno.add(pnlDatosBasicos);
	    pnlDatosBasicos.setLayout(null);
	    
	    JLabel lblDatosBasicos = new JLabel("Información General");
	    lblDatosBasicos.setFont(new Font("Tahoma", Font.PLAIN, 17));
	    lblDatosBasicos.setBounds(48, 7, 154, 14);
	    pnlDatosBasicos.add(lblDatosBasicos);
	    
	    JLabel lblNombre = new JLabel("Nombre");
	    lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNombre.setBounds(63, 175, 124, 28);
	    crearAlumno.add(lblNombre);
	    
	    textFieldNombre = new JTextField();
	    textFieldNombre.setBounds(243, 182, 399, 19);
	    crearAlumno.add(textFieldNombre);
	    textFieldNombre.setColumns(10);
	    
	    JLabel lblApPaterno = new JLabel("Apellido Paterno");
	    lblApPaterno.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApPaterno.setBounds(63, 213, 124, 19);
	    crearAlumno.add(lblApPaterno);
	    
	    textFieldApPaterno = new JTextField();
	    textFieldApPaterno.setColumns(10);
	    textFieldApPaterno.setBounds(243, 211, 399, 19);
	    crearAlumno.add(textFieldApPaterno);
	    
	    JLabel lblApellidoMaterno = new JLabel("Apellido Materno");
	    lblApellidoMaterno.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidoMaterno.setBounds(63, 242, 124, 19);
	    crearAlumno.add(lblApellidoMaterno);
	    
	    textFieldApMaterno = new JTextField();
	    textFieldApMaterno.setColumns(10);
	    textFieldApMaterno.setBounds(243, 240, 399, 19);
	    crearAlumno.add(textFieldApMaterno);
	    
	    JLabel lblGenero = new JLabel("Género");
	    lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblGenero.setBounds(63, 271, 124, 19);
	    crearAlumno.add(lblGenero);
	    
	    String genero [] = {"Masculino", "Femenino", "Otro"};
	    
	    comboBoxGeneros = new JComboBox(genero);
	    comboBoxGeneros.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    comboBoxGeneros.setBounds(243, 269, 103, 21);
	    crearAlumno.add(comboBoxGeneros);
	    
	    JLabel lblLugarNacimiento = new JLabel("Lugar de Nacimiento");
	    lblLugarNacimiento.setHorizontalAlignment(SwingConstants.LEFT);
	    lblLugarNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblLugarNacimiento.setBounds(63, 300, 139, 19);
	    crearAlumno.add(lblLugarNacimiento);
	    
	    JLabel lblFechaNacimiento = new JLabel("Fecha/Nacimiento");
	    lblFechaNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblFechaNacimiento.setBounds(356, 269, 124, 21);
	    crearAlumno.add(lblFechaNacimiento);
	    
	    String dias[] = {"DD","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
	    
	    comboBoxDias = new JComboBox(dias);
	    comboBoxDias.setBounds(484, 269, 46, 21);
	    crearAlumno.add(comboBoxDias);
	    
	    String meses[] = {"MM","Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic"};
	    
	    comboBoxMes = new JComboBox(meses);
	    comboBoxMes.setBounds(540, 269, 46, 21);
	    crearAlumno.add(comboBoxMes);
	    
	    String año[] = {"YY","1950","1951","1952","1953","1954","1955","1956","1957","1958","1959","1960","1961",
	            "1962","1963","1964","1965","1966","1967","1968","1969","1970","1971","1972","1973","1974",
	            "1975","1976","1977","1978","1979","1980","1981","1982","1983","1984","1985","1986","1987",
	            "1988","1989","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000",
	            "2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013",
	            "2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024"};
	    
	    comboBoxAnio = new JComboBox(año);
	    comboBoxAnio.setBounds(596, 269, 46, 21);
	    crearAlumno.add(comboBoxAnio);
	    
	    JLabel lblNacionalidad = new JLabel("Nacionalidad");
	    lblNacionalidad.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNacionalidad.setBounds(63, 329, 139, 19);
	    crearAlumno.add(lblNacionalidad);
	    
	    String nacionalidad[] = {"Mexicana","Peruana","Venezolana","Colombiana"};	     
	    comboBoxNacionalidad = new JComboBox(nacionalidad);
	    comboBoxNacionalidad.setBounds(243, 327, 399, 21);
	    crearAlumno.add(comboBoxNacionalidad);
	    
	    JLabel lblCurp = new JLabel("C.U.R.P");
	    lblCurp.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCurp.setBounds(63, 358, 139, 19);
	    crearAlumno.add(lblCurp);
	    
	    textFieldCurp = new JTextField();
	    textFieldCurp.setColumns(10);
	    textFieldCurp.setBounds(243, 360, 399, 19);
	    crearAlumno.add(textFieldCurp);
	    
	    JPanel pnlDatosAdicionales = new JPanel();
	    pnlDatosAdicionales.setLayout(null);
	    pnlDatosAdicionales.setBounds(10, 454, 632, 28);
	    crearAlumno.add(pnlDatosAdicionales);
	    
	    JLabel lblDatosAdicionales = new JLabel("Datos Adicionales");
	    lblDatosAdicionales.setFont(new Font("Tahoma", Font.PLAIN, 17));
	    lblDatosAdicionales.setBounds(48, 7, 154, 13);
	    pnlDatosAdicionales.add(lblDatosAdicionales);
	    
	    JLabel lblDomicilio = new JLabel("Domicilio");
	    lblDomicilio.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblDomicilio.setBounds(63, 503, 139, 19);
	    crearAlumno.add(lblDomicilio);
	    
	    textFieldDomicilio = new JTextField();
	    textFieldDomicilio.setColumns(10);
	    textFieldDomicilio.setBounds(243, 505, 399, 19);
	    crearAlumno.add(textFieldDomicilio);
	    
	    JLabel lblEntreCalles = new JLabel("Entre Calles");
	    lblEntreCalles.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblEntreCalles.setBounds(63, 532, 90, 19);
	    crearAlumno.add(lblEntreCalles);
	    
	    textField_2 = new JTextField();
	    textField_2.setColumns(10);
	    textField_2.setBounds(243, 534, 399, 19);
	    crearAlumno.add(textField_2);
	    
	    JLabel lblCorreoElectronico = new JLabel("Correo Electronico");
	    lblCorreoElectronico.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCorreoElectronico.setBounds(63, 387, 139, 19);
	    crearAlumno.add(lblCorreoElectronico);
	    
	    textFieldCorreo = new JTextField();
	    textFieldCorreo.setColumns(10);
	    textFieldCorreo.setBounds(243, 389, 399, 19);
	    crearAlumno.add(textFieldCorreo);
	    
	    JLabel lblTelefono = new JLabel("Teléfono");
	    lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblTelefono.setBounds(63, 416, 109, 28);
	    crearAlumno.add(lblTelefono);
	    
	    String telefono[] = {"Particular","Teléfono Celular"};
	    
	    comboBox_1 = new JComboBox(telefono);
	    comboBox_1.setBounds(243, 418, 144, 21);
	    crearAlumno.add(comboBox_1);
	    
	    textFieldTelefono = new JTextField();
	    textFieldTelefono.setColumns(10);
	    textFieldTelefono.setBounds(397, 418, 245, 19);
	    crearAlumno.add(textFieldTelefono);
	    
	    JPanel pnlEscolaridad = new JPanel();
	    pnlEscolaridad.setLayout(null);
	    pnlEscolaridad.setBounds(10, 590, 632, 28);
	    crearAlumno.add(pnlEscolaridad);
	    
	    JLabel lblEscolaridad = new JLabel("Escolaridad");
	    lblEscolaridad.setFont(new Font("Tahoma", Font.PLAIN, 17));
	    lblEscolaridad.setBounds(48, 7, 154, 13);
	    pnlEscolaridad.add(lblEscolaridad);
	    
	    JLabel lblCodigoPostal = new JLabel("Codigo Postal");
	    lblCodigoPostal.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCodigoPostal.setBounds(63, 561, 90, 19);
	    crearAlumno.add(lblCodigoPostal);
	    
	    textFieldCP = new JTextField();
	    textFieldCP.setColumns(10);
	    textFieldCP.setBounds(243, 563, 399, 19);
	    crearAlumno.add(textFieldCP);
	    
	    JLabel lblNivelEducativo = new JLabel("Nivel Educativo");
	    lblNivelEducativo.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNivelEducativo.setBounds(63, 628, 139, 19);
	    crearAlumno.add(lblNivelEducativo);
	    
	    String escolaridad[] = {"Primaria","Secundaria","Preparatoria"};
	    
	    comboBoxEscolaridad = new JComboBox(escolaridad);
	    comboBoxEscolaridad.setBounds(243, 628, 144, 21);
	    crearAlumno.add(comboBoxEscolaridad);
	
	    JLabel lblStatusActual = new JLabel("Status actual");
	    lblStatusActual.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblStatusActual.setBounds(397, 628, 139, 19);
	    crearAlumno.add(lblStatusActual);
	    
	    String status[] = {"Activo","Inactivo"};
	    
	    comboBoxStatus = new JComboBox(status);
	    comboBoxStatus.setBounds(496, 628, 146, 21);
	    crearAlumno.add(comboBoxStatus);
	    
	    JButton btnCrearAlumno = new JButton("Crear Perfil");
	    btnCrearAlumno.setBounds(882, 628, 124, 51);
	    crearAlumno.add(btnCrearAlumno);
	    btnCrearAlumno.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	String nombre = textFieldNombre.getText();
        		String apellidoP =textFieldApPaterno.getText();
        		String apellidoM = textFieldApMaterno.getText();      	
		    	
		    	if(nombre.length()>0) {
		    		textFieldNombre.setBorder(new LineBorder(Color.gray,1,true));
		    	}
		    	else {
		    		textFieldNombre.setBorder(new LineBorder(Color.red,2,true));
		    	}
		    	if(apellidoP.length()>0) {
		    		textFieldApPaterno.setBorder(new LineBorder(Color.gray,1,true));
		    	}
		    	else {
		    		textFieldApPaterno.setBorder(new LineBorder(Color.red,2,true));
		    	}
		    	if(apellidoM.length()>0) {
		    		textFieldApMaterno.setBorder(new LineBorder(Color.gray,1,true));
		    	}
		    	else {
		    		textFieldApMaterno.setBorder(new LineBorder(Color.red,2,true));
		    	}
		    	
		    	if(nombre.length()>0 && apellidoP.length()>0 && apellidoM.length()>0)
		    	{
		    		getContentPane().removeAll();
			        alumnoCreado();
			        getContentPane().revalidate();
			        getContentPane().repaint();
		    	}
		    }
		});
	    
	    JButton btnRegresar = new JButton("Regresar");
	    btnRegresar.setBounds(732, 629, 124, 51);
	    crearAlumno.add(btnRegresar);
	   
	    textFieldNacimiento = new JTextField();
	    textFieldNacimiento.setColumns(10);
	    textFieldNacimiento.setBounds(243, 300, 399, 19);
	    crearAlumno.add(textFieldNacimiento);
	}
	
	public void alumnoCreado() {
		menuAlumnos();
	    JPanel alumnoCreado = new JPanel();
	    alumnoCreado.setBackground(new Color(255, 255, 255));
	    getContentPane().add(alumnoCreado);
	    alumnoCreado.setLayout(null);
	    
	    JPanel panel_1 = new JPanel();
	    panel_1.setBackground(new Color(128, 255, 128));
	    panel_1.setBounds(10, 10, 1046, 117);
	    alumnoCreado.add(panel_1);
	    panel_1.setLayout(null);
	    
	    JLabel lblNewLabel = new JLabel("Consultar información de alumnos");
	    lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
	    lblNewLabel.setBounds(326, 21, 460, 61);
	    panel_1.add(lblNewLabel);
	    
	    JPanel panelLogoEscuela = new JPanel();
	    panelLogoEscuela.setBounds(51, 21, 123, 86);
	    panel_1.add(panelLogoEscuela);
	    
	    JPanel panelFoto = new JPanel();
	    panelFoto.setBounds(59, 182, 183, 178);
	    alumnoCreado.add(panelFoto);
	    
	    JLabel lblNombre = new JLabel("Nombre:");
	    lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNombre.setBounds(292, 182, 124, 28);
	    alumnoCreado.add(lblNombre);
	    
	    JLabel lblNombre_1 = new JLabel(textFieldNombre.getText());
	    lblNombre_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNombre_1.setBounds(446, 182, 124, 28);
	    alumnoCreado.add(lblNombre_1);
	    
	    JLabel lblApellidoP = new JLabel("Apellido paterno:");
	    lblApellidoP.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidoP.setBounds(292, 220, 124, 28);
	    alumnoCreado.add(lblApellidoP);
	    
	    JLabel lblApellidoP_1 = new JLabel(textFieldApPaterno.getText());
	    lblApellidoP_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidoP_1.setBounds(446, 220, 124, 28);
	    alumnoCreado.add(lblApellidoP_1);
	    
	    JPanel panelInfoGeneral = new JPanel();
	    panelInfoGeneral.setBounds(59, 433, 511, 179);
	    alumnoCreado.add(panelInfoGeneral);
	    panelInfoGeneral.setLayout(null);
	    
	    JLabel lblGnero = new JLabel("Género:");
	    lblGnero.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblGnero.setBounds(40, 20, 124, 28);
	    panelInfoGeneral.add(lblGnero);
	    
	    JLabel lblLugarDeNacimiento = new JLabel("Lugar de Nacimiento: ");
	    lblLugarDeNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblLugarDeNacimiento.setBounds(40, 60, 161, 28);
	    panelInfoGeneral.add(lblLugarDeNacimiento);
	    
	    JLabel lblNmeroTelefonico = new JLabel("Número telefonico:");
	    lblNmeroTelefonico.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNmeroTelefonico.setBounds(40, 140, 161, 28);
	    panelInfoGeneral.add(lblNmeroTelefonico);
	    
	    JLabel lblNacionalidad_1 = new JLabel("Nacionalidad:");
	    lblNacionalidad_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNacionalidad_1.setBounds(40, 100, 161, 28);
	    panelInfoGeneral.add(lblNacionalidad_1);
	    
	    JLabel lblGenero_1 = new JLabel((String) comboBoxGeneros.getSelectedItem());
	    lblGenero_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblGenero_1.setBounds(233, 20, 124, 28);
	    panelInfoGeneral.add(lblGenero_1);
	    
	    JLabel lblLugarNacimiento = new JLabel(textFieldNacimiento.getText());
	    lblLugarNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblLugarNacimiento.setBounds(233, 60, 124, 28);
	    panelInfoGeneral.add(lblLugarNacimiento);
	    
	    JLabel lblNacionalidad = new JLabel((String) comboBoxNacionalidad.getSelectedItem());
	    lblNacionalidad.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNacionalidad.setBounds(233, 100, 124, 28);
	    panelInfoGeneral.add(lblNacionalidad);
	    
	    JLabel lblTelefono = new JLabel(textFieldTelefono.getText());
	    lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblTelefono.setBounds(233, 140, 124, 28);
	    panelInfoGeneral.add(lblTelefono);
	    
	    JPanel panelAdicionales = new JPanel();
	    panelAdicionales.setBounds(625, 215, 379, 397);
	    alumnoCreado.add(panelAdicionales);
	    panelAdicionales.setLayout(null);
	    
	    JLabel lblDatosDeUbicacin = new JLabel("Datos de Ubicación");
	    lblDatosDeUbicacin.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblDatosDeUbicacin.setBounds(28, 23, 262, 28);
	    panelAdicionales.add(lblDatosDeUbicacin);
	    
	    JLabel lblDomicilio_1 = new JLabel("Domicilio");
	    lblDomicilio_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblDomicilio_1.setBounds(38, 61, 124, 28);
	    panelAdicionales.add(lblDomicilio_1);
	    
	    JLabel lblCalles = new JLabel("Entre Calles");
	    lblCalles.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCalles.setBounds(38, 100, 124, 28);
	    panelAdicionales.add(lblCalles);
	    
	    JLabel lblCdigoPostal = new JLabel("Código Postal");
	    lblCdigoPostal.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCdigoPostal.setBounds(38, 140, 124, 28);
	    panelAdicionales.add(lblCdigoPostal);
	    
	    JLabel lblDatosDeEscolaridad = new JLabel("Datos de escolaridad");
	    lblDatosDeEscolaridad.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblDatosDeEscolaridad.setBounds(28, 192, 262, 28);
	    panelAdicionales.add(lblDatosDeEscolaridad);
	    
	    JLabel lblNivelEducativo_1 = new JLabel("Nivel Educativo");
	    lblNivelEducativo_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNivelEducativo_1.setBounds(38, 230, 124, 28);
	    panelAdicionales.add(lblNivelEducativo_1);
	    
	    JLabel lblStatus = new JLabel("Estatus Actual");
	    lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblStatus.setBounds(38, 270, 124, 28);
	    panelAdicionales.add(lblStatus);
	
	    JLabel lblDomicilio = new JLabel(textFieldDomicilio.getText());
	    lblDomicilio.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblDomicilio.setBounds(179, 61, 124, 28);
	    panelAdicionales.add(lblDomicilio);
	    
	    JLabel lblCalles_1 = new JLabel(textField_2.getText());
	    lblCalles_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCalles_1.setBounds(179, 100, 124, 28);
	    panelAdicionales.add(lblCalles_1);
	    
	    JLabel lblCP_1 = new JLabel(textFieldCP.getText());
	    lblCP_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCP_1.setBounds(179, 140, 124, 28);
	    panelAdicionales.add(lblCP_1);
	    
	    JLabel lblNivelEducativo = new JLabel((String) comboBoxEscolaridad.getSelectedItem());
	    lblNivelEducativo.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNivelEducativo.setBounds(172, 230, 124, 28);
	    panelAdicionales.add(lblNivelEducativo);
	    
	    JLabel lblStatusActual = new JLabel((String) comboBoxStatus.getSelectedItem());
	    lblStatusActual.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblStatusActual.setBounds(172, 270, 124, 28);
	    panelAdicionales.add(lblStatusActual);
	
	    JLabel lblApellidoM = new JLabel("Apellido materno:");
	    lblApellidoM.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidoM.setBounds(292, 258, 124, 28);
	    alumnoCreado.add(lblApellidoM);
	    
	    JLabel lblApellidoM_1 = new JLabel(textFieldApMaterno.getText());
	    lblApellidoM_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidoM_1.setBounds(446, 258, 124, 28);
	    alumnoCreado.add(lblApellidoM_1);
	    
	    JLabel lblCorreo = new JLabel("Correo electronico:");
	    lblCorreo.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCorreo.setBounds(292, 296, 144, 28);
	    alumnoCreado.add(lblCorreo);
	    
	    JLabel lblCorreo_1 = new JLabel(textFieldCorreo.getText());
	    lblCorreo_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCorreo_1.setBounds(446, 296, 124, 28);
	    alumnoCreado.add(lblCorreo_1);
	    
	    JLabel lblInfoGeneral = new JLabel("Información General");
	    lblInfoGeneral.setFont(new Font("Tahoma", Font.PLAIN, 18));
	    lblInfoGeneral.setBounds(59, 398, 262, 28);
	    alumnoCreado.add(lblInfoGeneral);
	    
	    JLabel lblDatosAdicionales = new JLabel("Adicionales");
	    lblDatosAdicionales.setFont(new Font("Tahoma", Font.PLAIN, 18));
	    lblDatosAdicionales.setBounds(625, 182, 262, 28);
	    alumnoCreado.add(lblDatosAdicionales);
	    
	    JButton btnTerminar = new JButton("Finalizar");
	    btnTerminar.setBounds(785, 642, 219, 35);
	    alumnoCreado.add(btnTerminar);
	    btnTerminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {      	
            	JOpctionPaneJOptionPane.showMessageDialog(null, "Alumno creado con exito", "Alumno Creado", JOptionPane.INFORMATION_MESSAGE);
                getContentPane().removeAll();
                panelAlumnos();
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });
	    
	    JLabel lblCurp = new JLabel("C.U.R.P");
	    lblCurp.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCurp.setBounds(292, 334, 144, 28);
	    alumnoCreado.add(lblCurp);
	    
	    JLabel lblCurp_1 = new JLabel(textFieldCurp.getText());
	    lblCurp_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCurp_1.setBounds(446, 334, 124, 28);
	    alumnoCreado.add(lblCurp_1);
	}
	
	public void alumnoEncontrado() {
		menuAlumnos();
	    JPanel panelAlumnoEncontrado = new JPanel();
	    panelAlumnoEncontrado.setBackground(new Color(255, 255, 255));
	    getContentPane().add(panelAlumnoEncontrado);
	    panelAlumnoEncontrado.setLayout(null);

	    JLabel lbl_alumnoEncontrado = new JLabel("Información del alumno");
	    lbl_alumnoEncontrado.setForeground(new Color(0, 0, 128));
	    lbl_alumnoEncontrado.setBounds(33, 34, 250, 25);
	    lbl_alumnoEncontrado.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
	    panelAlumnoEncontrado.add(lbl_alumnoEncontrado);

	    JPanel panelDatos = new JPanel();
	    panelDatos.setBackground(new Color(128, 255, 128));
	    panelDatos.setBounds(10, 10, 1046, 117);
	    panelAlumnoEncontrado.add(panelDatos);

	    JPanel panelImagen = new JPanel();
	    panelImagen.setBackground(new Color(255, 250, 240));
	    panelImagen.setBounds(732, 179, 274, 314);
	    panelAlumnoEncontrado.add(panelImagen);
	    panelImagen.setLayout(null);

	    JPanel panelFoto = new JPanel();
	    panelFoto.setBounds(39, 51, 205, 204);
	    panelImagen.add(panelFoto);

	    JLabel lbl_ImagenAlumno = new JLabel("Imagen del alumno");
	    lbl_ImagenAlumno.setBounds(76, 18, 144, 23);
	    panelImagen.add(lbl_ImagenAlumno);
	    lbl_ImagenAlumno.setFont(new Font("Tahoma", Font.PLAIN, 18));

	    JPanel panelDatosBasicos = new JPanel();
	    panelDatosBasicos.setBounds(10, 137, 632, 28);
	    panelAlumnoEncontrado.add(panelDatosBasicos);
	    panelDatosBasicos.setLayout(null);

	    JLabel lblDatosBasicos = new JLabel("Datos Básicos");
	    lblDatosBasicos.setFont(new Font("Tahoma", Font.PLAIN, 17));
	    lblDatosBasicos.setBounds(48, 7, 154, 14);
	    panelDatosBasicos.add(lblDatosBasicos);

	    JLabel lblNombre = new JLabel("Nombre:");
	    lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNombre.setBounds(63, 175, 124, 28);
	    panelAlumnoEncontrado.add(lblNombre);

	    JLabel lblNombreValor = new JLabel("Juan");
	    lblNombreValor.setBounds(243, 182, 399, 19);
	    panelAlumnoEncontrado.add(lblNombreValor);

	    JLabel lblApPaterno = new JLabel("Apellido Paterno:");
	    lblApPaterno.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApPaterno.setBounds(63, 213, 124, 19);
	    panelAlumnoEncontrado.add(lblApPaterno);

	    JLabel lblApPaternoValor = new JLabel("Pérez");
	    lblApPaternoValor.setBounds(243, 211, 399, 19);
	    panelAlumnoEncontrado.add(lblApPaternoValor);

	    JLabel lblApellidoMaterno = new JLabel("Apellido Materno:");
	    lblApellidoMaterno.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidoMaterno.setBounds(63, 242, 124, 19);
	    panelAlumnoEncontrado.add(lblApellidoMaterno);

	    JLabel lblApellidoMaternoValor = new JLabel("López");
	    lblApellidoMaternoValor.setBounds(243, 240, 399, 19);
	    panelAlumnoEncontrado.add(lblApellidoMaternoValor);

	    JLabel lblGenero = new JLabel("Género:");
	    lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblGenero.setBounds(63, 271, 124, 19);
	    panelAlumnoEncontrado.add(lblGenero);

	    JLabel lblGeneroValor = new JLabel("Masculino");
	    lblGeneroValor.setBounds(243, 269, 103, 21);
	    panelAlumnoEncontrado.add(lblGeneroValor);

	    JLabel lblLugarNacimiento = new JLabel("Lugar de Nacimiento:");
	    lblLugarNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblLugarNacimiento.setBounds(63, 300, 160, 19);
	    panelAlumnoEncontrado.add(lblLugarNacimiento);

	    JLabel lblLugarNacimientoValor = new JLabel("Ciudad de México");
	    lblLugarNacimientoValor.setBounds(243, 300, 399, 19);
	    panelAlumnoEncontrado.add(lblLugarNacimientoValor);

	    JLabel lblFechaNacimiento = new JLabel("Fecha de Nacimiento:");
	    lblFechaNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblFechaNacimiento.setBounds(63, 329, 160, 19);
	    panelAlumnoEncontrado.add(lblFechaNacimiento);

	    JLabel lblFechaNacimientoValor = new JLabel("15 de marzo de 1995");
	    lblFechaNacimientoValor.setBounds(243, 329, 399, 19);
	    panelAlumnoEncontrado.add(lblFechaNacimientoValor);

	    JLabel lblNacionalidad = new JLabel("Nacionalidad:");
	    lblNacionalidad.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNacionalidad.setBounds(63, 358, 124, 19);
	    panelAlumnoEncontrado.add(lblNacionalidad);

	    JLabel lblNacionalidadValor = new JLabel("Mexicana");
	    lblNacionalidadValor.setBounds(243, 358, 399, 19);
	    panelAlumnoEncontrado.add(lblNacionalidadValor);

	    JLabel lblCurp = new JLabel("C.U.R.P:");
	    lblCurp.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCurp.setBounds(63, 387, 124, 19);
	    panelAlumnoEncontrado.add(lblCurp);

	    JLabel lblCurpValor = new JLabel("PEMJ950315HDFLRN01");
	    lblCurpValor.setBounds(243, 387, 399, 19);
	    panelAlumnoEncontrado.add(lblCurpValor);

	    JLabel lblCorreoElectronico = new JLabel("Correo Electrónico:");
	    lblCorreoElectronico.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCorreoElectronico.setBounds(63, 416, 160, 19);
	    panelAlumnoEncontrado.add(lblCorreoElectronico);

	    JLabel lblCorreoElectronicoValor = new JLabel("juan.perez@example.com");
	    lblCorreoElectronicoValor.setBounds(243, 416, 399, 19);
	    panelAlumnoEncontrado.add(lblCorreoElectronicoValor);

	    JLabel lblTelefono = new JLabel("Teléfono:");
	    lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblTelefono.setBounds(63, 445, 124, 19);
	    panelAlumnoEncontrado.add(lblTelefono);

	    JLabel lblTelefonoValor = new JLabel("555-123-4567");
	    lblTelefonoValor.setBounds(243, 445, 399, 19);
	    panelAlumnoEncontrado.add(lblTelefonoValor);
	}

	public void editarAlu() {
		menuAlumnos();
		JPanel editarAlu = new JPanel();
		editarAlu.setBackground(Color.YELLOW);
		getContentPane().add(editarAlu);
		
		
	}
	
	public void eliminarAlu() {
		menuAlumnos();
		JPanel eliminarAlu = new JPanel();
		eliminarAlu.setBackground(Color.CYAN);
		getContentPane().add(eliminarAlu);
		
		
	}
	
	public void descargarDoce() {
		menuDocentes();
	    JPanel descargarDoce = new JPanel();
	    descargarDoce.setBackground(new Color(255, 255, 255));
	    getContentPane().add(descargarDoce);
	    descargarDoce.setLayout(null);
	    
	    JPanel panel_1 = new JPanel();
	    panel_1.setBackground(new Color(250, 128, 114));
	    panel_1.setBounds(10, 10, 1046, 117);
	    descargarDoce.add(panel_1);
	    panel_1.setLayout(null);
	    
	    JLabel lblNewLabel_2 = new JLabel("Descargar informacion");
	    lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
	    lblNewLabel_2.setBounds(249, 34, 419, 42);
	    panel_1.add(lblNewLabel_2);
	    
	    JPanel panel = new JPanel();
	    panel.setBounds(25, 20, 94, 76);
	    panel_1.add(panel);
	    
	    JPanel panel_2 = new JPanel();
	    panel_2.setBounds(42, 148, 980, 472);
	    descargarDoce.add(panel_2);
	    panel_2.setLayout(null);
	    
	    JPanel panel_3 = new JPanel();
	    panel_3.setBackground(new Color(255, 255, 255));
	    panel_3.setBounds(27, 29, 203, 165);
	    panel_2.add(panel_3);
	    
	    JPanel panel_4 = new JPanel();
	    panel_4.setBackground(new Color(204, 255, 255));
	    panel_4.setBounds(288, 29, 640, 26);
	    panel_2.add(panel_4);
	    
	    JPanel panel_5 = new JPanel();
	    panel_5.setBackground(new Color(153, 102, 204));
	    panel_5.setBounds(41, 255, 430, 26);
	    panel_2.add(panel_5);
	    
	    JPanel panel_5_1 = new JPanel();
	    panel_5_1.setBackground(new Color(153, 102, 204));
	    panel_5_1.setBounds(511, 255, 430, 26);
	    panel_2.add(panel_5_1);
	    
	    JLabel lblNombre = new JLabel("Nombre:");
	    lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNombre.setBounds(288, 65, 75, 28);
	    panel_2.add(lblNombre);
	    
	    JLabel lblNombre_1 = new JLabel("\"         \"");
	    lblNombre_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNombre_1.setBounds(379, 65, 124, 28);
	    panel_2.add(lblNombre_1);
	    
	    JLabel lblApellidos = new JLabel("Apellidos:");
	    lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidos.setBounds(288, 103, 75, 28);
	    panel_2.add(lblApellidos);
	    
	    JLabel lblApellidos1 = new JLabel("\"         \"");
	    lblApellidos1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidos1.setBounds(379, 103, 124, 28);
	    panel_2.add(lblApellidos1);
	    
	    JLabel lblEdad = new JLabel("Edad:");
	    lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblEdad.setBounds(288, 141, 75, 28);
	    panel_2.add(lblEdad);
	    
	    JLabel lblApellidos1_1 = new JLabel("\"         \"");
	    lblApellidos1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidos1_1.setBounds(379, 141, 87, 28);
	    panel_2.add(lblApellidos1_1);
	    
	    JLabel lblSexo = new JLabel("Sexo:");
	    lblSexo.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblSexo.setBounds(524, 141, 63, 28);
	    panel_2.add(lblSexo);
	    
	    JLabel lblSexo1 = new JLabel("\"         \"");
	    lblSexo1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblSexo1.setBounds(608, 141, 75, 28);
	    panel_2.add(lblSexo1);
	    
	    JLabel lblCurp_2 = new JLabel("C.U.R.P:");
	    lblCurp_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCurp_2.setBounds(734, 141, 63, 28);
	    panel_2.add(lblCurp_2);
	    
	    JLabel lblSexo1_1 = new JLabel("\"         \"");
	    lblSexo1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblSexo1_1.setBounds(853, 141, 75, 28);
	    panel_2.add(lblSexo1_1);
	    
	    JLabel lblLugarDeNacimiento_1 = new JLabel("Lugar de nacimiento:");
	    lblLugarDeNacimiento_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblLugarDeNacimiento_1.setBounds(288, 179, 163, 28);
	    panel_2.add(lblLugarDeNacimiento_1);
	    
	    JLabel lblNacimiento = new JLabel("\"         \"");
	    lblNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNacimiento.setBounds(472, 179, 87, 28);
	    panel_2.add(lblNacimiento);
	    
	    JLabel lblNacionalidad = new JLabel("Nacionalidad:");
	    lblNacionalidad.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNacionalidad.setBounds(608, 179, 97, 28);
	    panel_2.add(lblNacionalidad);
	    
	    JLabel lblNacimiento_1 = new JLabel("\"         \"");
	    lblNacimiento_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNacimiento_1.setBounds(730, 179, 87, 28);
	    panel_2.add(lblNacimiento_1);
	    
	    JLabel lblCorreo = new JLabel("Correo electrónico:");
	    lblCorreo.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCorreo.setBounds(41, 303, 151, 28);
	    panel_2.add(lblCorreo);
	    
	    JLabel lblNombre_1_1 = new JLabel("\"         \"");
	    lblNombre_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNombre_1_1.setBounds(242, 303, 124, 28);
	    panel_2.add(lblNombre_1_1);
	    
	    JLabel lblTelfono = new JLabel("Teléfono:");
	    lblTelfono.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblTelfono.setBounds(41, 341, 151, 28);
	    panel_2.add(lblTelfono);
	    
	    JLabel lblTelefono_1 = new JLabel("\"         \"");
	    lblTelefono_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblTelefono_1.setBounds(242, 341, 124, 28);
	    panel_2.add(lblTelefono_1);
	    
	    JLabel lblDomicilio = new JLabel("Domicilio:");
	    lblDomicilio.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblDomicilio.setBounds(41, 379, 151, 28);
	    panel_2.add(lblDomicilio);
	    
	    JLabel lblDomicilio_1 = new JLabel("\"         \"");
	    lblDomicilio_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblDomicilio_1.setBounds(242, 379, 124, 28);
	    panel_2.add(lblDomicilio_1);
	    
	    JLabel lblCdigoPostal = new JLabel("Código postal:");
	    lblCdigoPostal.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCdigoPostal.setBounds(41, 417, 151, 28);
	    panel_2.add(lblCdigoPostal);
	    
	    JLabel lblCodigoPostal_1 = new JLabel("\"         \"");
	    lblCodigoPostal_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCodigoPostal_1.setBounds(242, 417, 124, 28);
	    panel_2.add(lblCodigoPostal_1);
	    
	    JLabel lblNivelEducativo = new JLabel("Nivel Educativo:");
	    lblNivelEducativo.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNivelEducativo.setBounds(511, 303, 151, 28);
	    panel_2.add(lblNivelEducativo);
	    
	    JLabel lblNvlEducativo = new JLabel("\"         \"");
	    lblNvlEducativo.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNvlEducativo.setBounds(689, 303, 87, 28);
	    panel_2.add(lblNvlEducativo);
	    
	    JLabel lblStatusActual = new JLabel("Status actual:");
	    lblStatusActual.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblStatusActual.setBounds(511, 341, 151, 28);
	    panel_2.add(lblStatusActual);
	    
	    JLabel lblMatrcula = new JLabel("Matrícula:");
	    lblMatrcula.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblMatrcula.setBounds(511, 379, 151, 28);
	    panel_2.add(lblMatrcula);
	    
	    JLabel lblStatus = new JLabel("\"         \"");
	    lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblStatus.setBounds(689, 341, 87, 28);
	    panel_2.add(lblStatus);
	    
	    JLabel lblMatricula_1 = new JLabel("\"         \"");
	    lblMatricula_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblMatricula_1.setBounds(689, 379, 87, 28);
	    panel_2.add(lblMatricula_1);
	}
	
	public void consultarDoce() {
	    menuDocentes();
	    JPanel consultarDoce = new JPanel();
	    consultarDoce.setBackground(new Color(255, 255, 255));
	    getContentPane().add(consultarDoce);
	    consultarDoce.setLayout(null);
	    
	    JPanel panel_1 = new JPanel();
	    panel_1.setBackground(new Color(250, 128, 114));
	    panel_1.setBounds(10, 10, 1046, 117);
	    consultarDoce.add(panel_1);
	    panel_1.setLayout(null);
	    
	    JLabel lblNewLabel = new JLabel("Consultar información de docentes");
	    lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
	    lblNewLabel.setBounds(326, 21, 460, 61);
	    panel_1.add(lblNewLabel);
	    
	    JPanel panelLogoEscuela = new JPanel();
	    panelLogoEscuela.setBounds(51, 21, 123, 86);
	    panel_1.add(panelLogoEscuela);
	    
	    JPanel panelFoto = new JPanel();
	    panelFoto.setBounds(59, 182, 183, 178);
	    consultarDoce.add(panelFoto);
	    
	    JLabel lblNombre = new JLabel("Nombre:");
	    lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNombre.setBounds(292, 182, 124, 28);
	    consultarDoce.add(lblNombre);
	    
	    JLabel lblNombre_1 = new JLabel("\"         \"");
	    lblNombre_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNombre_1.setBounds(446, 182, 124, 28);
	    consultarDoce.add(lblNombre_1);
	    
	    JLabel lblApellidoP = new JLabel("Apellido paterno:");
	    lblApellidoP.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidoP.setBounds(292, 220, 124, 28);
	    consultarDoce.add(lblApellidoP);
	    
	    JLabel lblApellidoP_1 = new JLabel("\"         \"");
	    lblApellidoP_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidoP_1.setBounds(446, 220, 124, 28);
	    consultarDoce.add(lblApellidoP_1);
	    
	    JPanel panelInfoGeneral = new JPanel();
	    panelInfoGeneral.setBounds(59, 433, 511, 179);
	    consultarDoce.add(panelInfoGeneral);
	    panelInfoGeneral.setLayout(null);
	    
	    JLabel lblGnero = new JLabel("Género:");
	    lblGnero.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblGnero.setBounds(40, 20, 124, 28);
	    panelInfoGeneral.add(lblGnero);
	    
	    JLabel lblLugarDeNacimiento = new JLabel("Lugar de Nacimiento: ");
	    lblLugarDeNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblLugarDeNacimiento.setBounds(40, 60, 161, 28);
	    panelInfoGeneral.add(lblLugarDeNacimiento);
	    
	    JLabel lblNmeroTelefonico = new JLabel("Número telefonico:");
	    lblNmeroTelefonico.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNmeroTelefonico.setBounds(40, 140, 161, 28);
	    panelInfoGeneral.add(lblNmeroTelefonico);
	    
	    JLabel lblNacionalidad_1 = new JLabel("Nacionalidad:");
	    lblNacionalidad_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNacionalidad_1.setBounds(40, 100, 161, 28);
	    panelInfoGeneral.add(lblNacionalidad_1);
	    
	    JLabel lblGenero = new JLabel("\"         \"");
	    lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblGenero.setBounds(233, 20, 124, 28);
	    panelInfoGeneral.add(lblGenero);
	    
	    JLabel lblLugarNacimiento = new JLabel("\"         \"");
	    lblLugarNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblLugarNacimiento.setBounds(233, 60, 124, 28);
	    panelInfoGeneral.add(lblLugarNacimiento);
	    
	    JLabel lblNacionalidad = new JLabel("\"         \"");
	    lblNacionalidad.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNacionalidad.setBounds(233, 100, 124, 28);
	    panelInfoGeneral.add(lblNacionalidad);
	    
	    JLabel lblTelefono = new JLabel("\"         \"");
	    lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblTelefono.setBounds(233, 140, 124, 28);
	    panelInfoGeneral.add(lblTelefono);
	    
	    JPanel PanelXD = new JPanel();
	    PanelXD.setBounds(625, 215, 379, 397);
	    consultarDoce.add(PanelXD);
	    PanelXD.setLayout(null);
	    
	    JLabel lblDatosDeUbicacin = new JLabel("Datos de Ubicación");
	    lblDatosDeUbicacin.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblDatosDeUbicacin.setBounds(28, 23, 262, 28);
	    PanelXD.add(lblDatosDeUbicacin);
	    
	    JLabel lblDomicilio_1 = new JLabel("Domicilio");
	    lblDomicilio_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblDomicilio_1.setBounds(38, 61, 124, 28);
	    PanelXD.add(lblDomicilio_1);
	    
	    JLabel lblCalles = new JLabel("Entre Calles");
	    lblCalles.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCalles.setBounds(38, 100, 124, 28);
	    PanelXD.add(lblCalles);
	    
	    JLabel lblCdigoPostal = new JLabel("Código Postal");
	    lblCdigoPostal.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCdigoPostal.setBounds(38, 140, 124, 28);
	    PanelXD.add(lblCdigoPostal);
	    
	    JLabel lblDatosDeEscolaridad = new JLabel("Datos de escolaridad");
	    lblDatosDeEscolaridad.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblDatosDeEscolaridad.setBounds(28, 192, 262, 28);
	    PanelXD.add(lblDatosDeEscolaridad);
	    
	    JLabel lblNivelEducativo_1 = new JLabel("Nivel Educativo");
	    lblNivelEducativo_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNivelEducativo_1.setBounds(38, 230, 124, 28);
	    PanelXD.add(lblNivelEducativo_1);
	    
	    JLabel lblStatus = new JLabel("Estatus Actual");
	    lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblStatus.setBounds(38, 270, 124, 28);
	    PanelXD.add(lblStatus);
	    
	    JLabel lblMatricula_1 = new JLabel("Matricula");
	    lblMatricula_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblMatricula_1.setBounds(38, 309, 124, 28);
	    PanelXD.add(lblMatricula_1);
	    
	    JLabel lblDomicilio = new JLabel("\"         \"");
	    lblDomicilio.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblDomicilio.setBounds(179, 61, 124, 28);
	    PanelXD.add(lblDomicilio);
	    
	    JLabel lblCalles_1 = new JLabel("\"         \"");
	    lblCalles_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCalles_1.setBounds(179, 100, 124, 28);
	    PanelXD.add(lblCalles_1);
	    
	    JLabel lblCP_1 = new JLabel("\"         \"");
	    lblCP_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCP_1.setBounds(179, 140, 124, 28);
	    PanelXD.add(lblCP_1);
	    
	    JLabel lblNivelEducativo = new JLabel("\"         \"");
	    lblNivelEducativo.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNivelEducativo.setBounds(172, 230, 124, 28);
	    PanelXD.add(lblNivelEducativo);
	    
	    JLabel lblStatusActual = new JLabel("\"         \"");
	    lblStatusActual.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblStatusActual.setBounds(172, 270, 124, 28);
	    PanelXD.add(lblStatusActual);
	    
	    JLabel lblMatricula = new JLabel("\"         \"");
	    lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblMatricula.setBounds(172, 309, 124, 28);
	    PanelXD.add(lblMatricula);
	    
	    JLabel lblApellidoM = new JLabel("Apellido materno:");
	    lblApellidoM.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidoM.setBounds(292, 258, 124, 28);
	    consultarDoce.add(lblApellidoM);
	    
	    JLabel lblApellidoM_1 = new JLabel("\"         \"");
	    lblApellidoM_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidoM_1.setBounds(446, 258, 124, 28);
	    consultarDoce.add(lblApellidoM_1);
	    
	    JLabel lblCorreo = new JLabel("Correo electronico:");
	    lblCorreo.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCorreo.setBounds(292, 296, 144, 28);
	    consultarDoce.add(lblCorreo);
	    
	    JLabel lblCorreo_1 = new JLabel("\"         \"");
	    lblCorreo_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCorreo_1.setBounds(446, 296, 124, 28);
	    consultarDoce.add(lblCorreo_1);
	    
	    JLabel lblInfoGeneral = new JLabel("Información General");
	    lblInfoGeneral.setFont(new Font("Tahoma", Font.PLAIN, 18));
	    lblInfoGeneral.setBounds(59, 398, 262, 28);
	    consultarDoce.add(lblInfoGeneral);
	    
	    JLabel lblDatosAdicionales = new JLabel("Adicionales");
	    lblDatosAdicionales.setFont(new Font("Tahoma", Font.PLAIN, 18));
	    lblDatosAdicionales.setBounds(625, 182, 262, 28);
	    consultarDoce.add(lblDatosAdicionales);
	    
	    JButton btnTerminar = new JButton("Finalizar");
	    btnTerminar.setBounds(785, 642, 219, 35);
	    consultarDoce.add(btnTerminar);
	    
	    JLabel lblCurp = new JLabel("C.U.R.P");
	    lblCurp.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCurp.setBounds(292, 334, 144, 28);
	    consultarDoce.add(lblCurp);
	    
	    JLabel lblCurp_1 = new JLabel("\"         \"");
	    lblCurp_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCurp_1.setBounds(446, 334, 124, 28);
	    consultarDoce.add(lblCurp_1);
	}

	public void crearDoce() {
		menuDocentes();
	    JPanel crearDoce = new JPanel();
	    crearDoce.setBackground(new Color(255, 255, 255));
	    getContentPane().add(crearDoce);
	    crearDoce.setLayout(null);
	    
	    JLabel lbl_altaDocente = new JLabel("Alta de docentes");
	    lbl_altaDocente.setForeground(new Color(65, 105, 225));
	    lbl_altaDocente.setBounds(33, 34, 182, 25);
	    lbl_altaDocente.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
	    crearDoce.add(lbl_altaDocente);
	    
	    JLabel lblNewLabel_1 = new JLabel("1.- Registrar información básica de docente");
	    lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
	    lblNewLabel_1.setBounds(286, 51, 459, 25);
	    crearDoce.add(lblNewLabel_1);
	    
	    JPanel panel_1 = new JPanel();
	    panel_1.setBackground(new Color(250, 128, 114));
	    panel_1.setBounds(10, 10, 1046, 117);
	    crearDoce.add(panel_1);
	    
	    JPanel panel_2 = new JPanel();
	    panel_2.setBackground(new Color(255, 250, 240));
	    panel_2.setBounds(732, 179, 274, 314);
	    crearDoce.add(panel_2);
	    panel_2.setLayout(null);
	    
	    JPanel panel = new JPanel();
	    panel.setBounds(39, 51, 205, 204);
	    panel_2.add(panel);
	    
	    JLabel lbl_ImagenDocente = new JLabel("Imagen Docente");
	    lbl_ImagenDocente.setBounds(76, 18, 144, 23);
	    panel_2.add(lbl_ImagenDocente);
	    lbl_ImagenDocente.setFont(new Font("Tahoma", Font.PLAIN, 18));
	    
	    JButton btnEliminar = new JButton("Eliminar");
	    btnEliminar.setBounds(159, 265, 85, 40);
	    panel_2.add(btnEliminar);
	    
	    JButton btnAgregar = new JButton("Agregar");
	    btnAgregar.setBounds(39, 265, 85, 40);
	    panel_2.add(btnAgregar);
	    
	    JPanel pnlDatosBasicos = new JPanel();
	    pnlDatosBasicos.setBounds(10, 137, 632, 28);
	    crearDoce.add(pnlDatosBasicos);
	    pnlDatosBasicos.setLayout(null);
	    
	    JLabel lblDatosBasicos = new JLabel("Información General");
	    lblDatosBasicos.setFont(new Font("Tahoma", Font.PLAIN, 17));
	    lblDatosBasicos.setBounds(48, 7, 154, 14);
	    pnlDatosBasicos.add(lblDatosBasicos);
	    
	    JLabel lblNombre = new JLabel("Nombre");
	    lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNombre.setBounds(63, 175, 124, 28);
	    crearDoce.add(lblNombre);
	    
	    textFieldNombre = new JTextField();
	    textFieldNombre.setBounds(243, 182, 399, 19);
	    crearDoce.add(textFieldNombre);
	    textFieldNombre.setColumns(10);
	    
	    JLabel lblApPaterno = new JLabel("Apellido Paterno");
	    lblApPaterno.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApPaterno.setBounds(63, 213, 124, 19);
	    crearDoce.add(lblApPaterno);
	    
	    textFieldApPaterno = new JTextField();
	    textFieldApPaterno.setColumns(10);
	    textFieldApPaterno.setBounds(243, 211, 399, 19);
	    crearDoce.add(textFieldApPaterno);
	    
	    JLabel lblApellidoMaterno = new JLabel("Apellido Materno");
	    lblApellidoMaterno.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidoMaterno.setBounds(63, 242, 124, 19);
	    crearDoce.add(lblApellidoMaterno);
	    
	    textFieldApMaterno = new JTextField();
	    textFieldApMaterno.setColumns(10);
	    textFieldApMaterno.setBounds(243, 240, 399, 19);
	    crearDoce.add(textFieldApMaterno);
	    
	    JLabel lblGenero = new JLabel("Género");
	    lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblGenero.setBounds(63, 271, 124, 19);
	    crearDoce.add(lblGenero);
	    
	    String genero [] = {"Masculino", "Femenino", "Otro"};
	    
	    comboBoxGeneros = new JComboBox(genero);
	    comboBoxGeneros.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    comboBoxGeneros.setBounds(243, 269, 103, 21);
	    crearDoce.add(comboBoxGeneros);
	    
	    JLabel lblLugarNacimiento = new JLabel("Lugar de Nacimiento");
	    lblLugarNacimiento.setHorizontalAlignment(SwingConstants.LEFT);
	    lblLugarNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblLugarNacimiento.setBounds(63, 300, 139, 19);
	    crearDoce.add(lblLugarNacimiento);
	    
	    JLabel lblFechaNacimiento = new JLabel("Fecha/Nacimiento");
	    lblFechaNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblFechaNacimiento.setBounds(356, 269, 124, 21);
	    crearDoce.add(lblFechaNacimiento);
	    
	    String dias[] = {"DD","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
	    
	    comboBoxDias = new JComboBox(dias);
	    comboBoxDias.setBounds(484, 269, 46, 21);
	    crearDoce.add(comboBoxDias);
	    
	    String meses[] = {"MM","Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic"};
	    
	    comboBoxMes = new JComboBox(meses);
	    comboBoxMes.setBounds(540, 269, 46, 21);
	    crearDoce.add(comboBoxMes);
	    
	    String año[] = {"YY","1950","1951","1952","1953","1954","1955","1956","1957","1958","1959","1960","1961",
	    		"1962","1963","1964","1965","1966","1967","1968","1969","1970","1971","1972","1973","1974",
	    		"1975","1976","1977","1978","1979","1980","1981","1982","1983","1984","1985","1986","1987",
	    		"1988","1989","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000",
	    		"2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013",
	    		"2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024"};
	    
	    comboBoxAnio = new JComboBox(año);
	    comboBoxAnio.setBounds(596, 269, 46, 21);
	    crearDoce.add(comboBoxAnio);
	    
	    JLabel lblNacionalidad = new JLabel("Nacionalidad");
	    lblNacionalidad.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNacionalidad.setBounds(63, 329, 139, 19);
	    crearDoce.add(lblNacionalidad);
	    
	    String nacionalidad[] = {"Mexicana","Peruana","Venezolana","Colombiana"};	     
	    comboBoxNacionalidad = new JComboBox(nacionalidad);
	    comboBoxNacionalidad.setBounds(243, 327, 399, 21);
	    crearDoce.add(comboBoxNacionalidad);
	    
	    JLabel lblCurp = new JLabel("C.U.R.P");
	    lblCurp.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCurp.setBounds(63, 358, 139, 19);
	    crearDoce.add(lblCurp);
	    
	    textFieldCurp = new JTextField();
	    textFieldCurp.setColumns(10);
	    textFieldCurp.setBounds(243, 360, 399, 19);
	    crearDoce.add(textFieldCurp);
	    
	    JPanel pnlDatosAdicionales = new JPanel();
	    pnlDatosAdicionales.setLayout(null);
	    pnlDatosAdicionales.setBounds(10, 454, 632, 28);
	    crearDoce.add(pnlDatosAdicionales);
	    
	    JLabel lblDatosAdicionales = new JLabel("Datos Adicionales");
	    lblDatosAdicionales.setFont(new Font("Tahoma", Font.PLAIN, 17));
	    lblDatosAdicionales.setBounds(48, 7, 154, 13);
	    pnlDatosAdicionales.add(lblDatosAdicionales);
	    
	    JLabel lblDomicilio = new JLabel("Domicilio");
	    lblDomicilio.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblDomicilio.setBounds(63, 503, 139, 19);
	    crearDoce.add(lblDomicilio);
	    
	    textFieldDomicilio = new JTextField();
	    textFieldDomicilio.setColumns(10);
	    textFieldDomicilio.setBounds(243, 505, 399, 19);
	    crearDoce.add(textFieldDomicilio);
	    
	    JLabel lblEntreCalles = new JLabel("Entre Calles");
	    lblEntreCalles.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblEntreCalles.setBounds(63, 532, 90, 19);
	    crearDoce.add(lblEntreCalles);
	    
	    textField_2 = new JTextField();
	    textField_2.setColumns(10);
	    textField_2.setBounds(243, 534, 399, 19);
	    crearDoce.add(textField_2);
	    
	    JLabel lblCorreoElectronico = new JLabel("Correo Electronico");
	    lblCorreoElectronico.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCorreoElectronico.setBounds(63, 387, 139, 19);
	    crearDoce.add(lblCorreoElectronico);
	    
	    textFieldCorreo = new JTextField();
	    textFieldCorreo.setColumns(10);
	    textFieldCorreo.setBounds(243, 389, 399, 19);
	    crearDoce.add(textFieldCorreo);
	    
	    JLabel lblTelefono = new JLabel("Teléfono");
	    lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblTelefono.setBounds(63, 416, 109, 28);
	    crearDoce.add(lblTelefono);
	    
	    String telefono[] = {"Particular","Teléfono Celular"};
	    
	    comboBox_1 = new JComboBox(telefono);
	    comboBox_1.setBounds(243, 418, 144, 21);
	    crearDoce.add(comboBox_1);
	    
	    textFieldTelefono = new JTextField();
	    textFieldTelefono.setColumns(10);
	    textFieldTelefono.setBounds(397, 418, 245, 19);
	    crearDoce.add(textFieldTelefono);
	    
	    JPanel pnlEscolaridad = new JPanel();
	    pnlEscolaridad.setLayout(null);
	    pnlEscolaridad.setBounds(10, 590, 632, 28);
	    crearDoce.add(pnlEscolaridad);
	    
	    JLabel lblEscolaridad = new JLabel("Escolaridad");
	    lblEscolaridad.setFont(new Font("Tahoma", Font.PLAIN, 17));
	    lblEscolaridad.setBounds(48, 7, 154, 13);
	    pnlEscolaridad.add(lblEscolaridad);
	    
	    JLabel lblCodigoPostal = new JLabel("Codigo Postal");
	    lblCodigoPostal.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCodigoPostal.setBounds(63, 561, 90, 19);
	    crearDoce.add(lblCodigoPostal);
	    
	    textFieldCP = new JTextField();
	    textFieldCP.setColumns(10);
	    textFieldCP.setBounds(243, 563, 399, 19);
	    crearDoce.add(textFieldCP);
	    
	    JLabel lblNivelEducativo = new JLabel("Nivel Educativo");
	    lblNivelEducativo.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNivelEducativo.setBounds(63, 628, 139, 19);
	    crearDoce.add(lblNivelEducativo);
	    
	    String escolaridad[] = {"Licenciatura","Ingenieria","Maestria","Doctorado"};
	    
	    comboBoxEscolaridad = new JComboBox(escolaridad);
	    comboBoxEscolaridad.setBounds(243, 628, 144, 21);
	    crearDoce.add(comboBoxEscolaridad);
	    
	    JLabel lblMatricula = new JLabel("Matricula");
	    lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblMatricula.setBounds(63, 657, 139, 19);
	    crearDoce.add(lblMatricula);
	    
	    textFieldMatricula = new JTextField();
	    textFieldMatricula.setColumns(10);
	    textFieldMatricula.setBounds(243, 659, 399, 19);
	    crearDoce.add(textFieldMatricula);
	    
	    JLabel lblStatusActual = new JLabel("Status actual");
	    lblStatusActual.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblStatusActual.setBounds(397, 628, 139, 19);
	    crearDoce.add(lblStatusActual);
	    
	    String status[] = {"Activo","Innactivo"};
	    
	    comboBoxStatus = new JComboBox(status);
	    comboBoxStatus.setBounds(496, 628, 146, 21);
	    crearDoce.add(comboBoxStatus);
	    
	    JButton btnCrearDocente = new JButton("Crear Perfil");
	    btnCrearDocente.setBounds(882, 628, 124, 51);
	    crearDoce.add(btnCrearDocente);
	    
	    btnCrearDocente.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String nombre = textFieldNombre.getText();
        		String apellidoP =textFieldApPaterno.getText();
        		String apellidoM = textFieldApMaterno.getText();      	
		    	
		    	if(nombre.length()>0) {
		    		textFieldNombre.setBorder(new LineBorder(Color.gray,1,true));
		    	}
		    	else {
		    		textFieldNombre.setBorder(new LineBorder(Color.red,2,true));
		    	}
		    	if(apellidoP.length()>0) {
		    		textFieldApPaterno.setBorder(new LineBorder(Color.gray,1,true));
		    	}
		    	else {
		    		textFieldApPaterno.setBorder(new LineBorder(Color.red,2,true));
		    	}
		    	if(apellidoM.length()>0) {
		    		textFieldApMaterno.setBorder(new LineBorder(Color.gray,1,true));
		    	}
		    	else {
		    		textFieldApMaterno.setBorder(new LineBorder(Color.red,2,true));
		    	}
		    	
		    	if(nombre.length()>0 && apellidoP.length()>0 && apellidoM.length()>0)
		    	{
		    		getContentPane().removeAll();
			        docenteCreado();
			        getContentPane().revalidate();
			        getContentPane().repaint();
		    	}
		    
			}
	    	
	    });
	    
	    JButton btnRegresar = new JButton("Regresar");
	    btnRegresar.setBounds(732, 629, 124, 51);
	    crearDoce.add(btnRegresar);
	    
	    btnRegresar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				getContentPane().removeAll();
		        panelDocentes();
		        getContentPane().revalidate();
		        getContentPane().repaint();
			}
	    	
	    });
	    
	    textFieldNacimiento = new JTextField();
	    textFieldNacimiento.setColumns(10);
	    textFieldNacimiento.setBounds(243, 300, 399, 19);
	    crearDoce.add(textFieldNacimiento);
	  
	}
	
	public void docenteCreado() {
		menuDocentes();
	    JPanel docenteCreado = new JPanel();
	    docenteCreado.setBackground(new Color(255, 255, 255));
	    getContentPane().add(docenteCreado);
	    docenteCreado.setLayout(null);
	    
	    JPanel panel_1 = new JPanel();
	    panel_1.setBackground(new Color(250, 128, 114));
	    panel_1.setBounds(10, 10, 1046, 117);
	    docenteCreado.add(panel_1);
	    panel_1.setLayout(null);
	    
	    JLabel lblNewLabel = new JLabel("Consultar información de docentes");
	    lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
	    lblNewLabel.setBounds(326, 21, 460, 61);
	    panel_1.add(lblNewLabel);
	    
	    JPanel panelLogoEscuela = new JPanel();
	    panelLogoEscuela.setBounds(51, 21, 123, 86);
	    panel_1.add(panelLogoEscuela);
	    
	    JPanel panelFoto = new JPanel();
	    panelFoto.setBounds(59, 182, 183, 178);
	    docenteCreado.add(panelFoto);
	    
	    JLabel lblNombre = new JLabel("Nombre:");
	    lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNombre.setBounds(292, 182, 124, 28);
	    docenteCreado.add(lblNombre);
	    
	    JLabel lblNombre_1 = new JLabel(textFieldNombre.getText());
	    lblNombre_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNombre_1.setBounds(446, 182, 124, 28);
	    docenteCreado.add(lblNombre_1);
	    
	    JLabel lblApellidoP = new JLabel("Apellido paterno:");
	    lblApellidoP.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidoP.setBounds(292, 220, 124, 28);
	    docenteCreado.add(lblApellidoP);
	    
	    JLabel lblApellidoP_1 = new JLabel(textFieldApPaterno.getText());
	    lblApellidoP_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidoP_1.setBounds(446, 220, 124, 28);
	    docenteCreado.add(lblApellidoP_1);
	    
	    JPanel panelInfoGeneral = new JPanel();
	    panelInfoGeneral.setBounds(59, 433, 511, 179);
	    docenteCreado.add(panelInfoGeneral);
	    panelInfoGeneral.setLayout(null);
	    
	    JLabel lblGnero = new JLabel("Género:");
	    lblGnero.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblGnero.setBounds(40, 20, 124, 28);
	    panelInfoGeneral.add(lblGnero);
	    
	    JLabel lblLugarDeNacimiento = new JLabel("Lugar de Nacimiento: ");
	    lblLugarDeNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblLugarDeNacimiento.setBounds(40, 60, 161, 28);
	    panelInfoGeneral.add(lblLugarDeNacimiento);
	    
	    JLabel lblNmeroTelefonico = new JLabel("Número telefonico:");
	    lblNmeroTelefonico.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNmeroTelefonico.setBounds(40, 140, 161, 28);
	    panelInfoGeneral.add(lblNmeroTelefonico);
	    
	    JLabel lblNacionalidad_1 = new JLabel("Nacionalidad:");
	    lblNacionalidad_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNacionalidad_1.setBounds(40, 100, 161, 28);
	    panelInfoGeneral.add(lblNacionalidad_1);
	    
	    JLabel lblGenero_1 = new JLabel((String) comboBoxGeneros.getSelectedItem());
	    lblGenero_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblGenero_1.setBounds(233, 20, 124, 28);
	    panelInfoGeneral.add(lblGenero_1);
	    
	    JLabel lblLugarNacimiento = new JLabel(textFieldNacimiento.getText());
	    lblLugarNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblLugarNacimiento.setBounds(233, 60, 124, 28);
	    panelInfoGeneral.add(lblLugarNacimiento);
	    
	    JLabel lblNacionalidad = new JLabel((String) comboBoxNacionalidad.getSelectedItem());
	    lblNacionalidad.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNacionalidad.setBounds(233, 100, 124, 28);
	    panelInfoGeneral.add(lblNacionalidad);
	    
	    JLabel lblTelefono = new JLabel(textFieldTelefono.getText());
	    lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblTelefono.setBounds(233, 140, 124, 28);
	    panelInfoGeneral.add(lblTelefono);
	    
	    JPanel PanelXD = new JPanel();
	    PanelXD.setBounds(625, 215, 379, 397);
	    docenteCreado.add(PanelXD);
	    PanelXD.setLayout(null);
	    
	    JLabel lblDatosDeUbicacin = new JLabel("Datos de Ubicación");
	    lblDatosDeUbicacin.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblDatosDeUbicacin.setBounds(28, 23, 262, 28);
	    PanelXD.add(lblDatosDeUbicacin);
	    
	    JLabel lblDomicilio_1 = new JLabel("Domicilio");
	    lblDomicilio_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblDomicilio_1.setBounds(38, 61, 124, 28);
	    PanelXD.add(lblDomicilio_1);
	    
	    JLabel lblCalles = new JLabel("Entre Calles");
	    lblCalles.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCalles.setBounds(38, 100, 124, 28);
	    PanelXD.add(lblCalles);
	    
	    JLabel lblCdigoPostal = new JLabel("Código Postal");
	    lblCdigoPostal.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCdigoPostal.setBounds(38, 140, 124, 28);
	    PanelXD.add(lblCdigoPostal);
	    
	    JLabel lblDatosDeEscolaridad = new JLabel("Datos de escolaridad");
	    lblDatosDeEscolaridad.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblDatosDeEscolaridad.setBounds(28, 192, 262, 28);
	    PanelXD.add(lblDatosDeEscolaridad);
	    
	    JLabel lblNivelEducativo_1 = new JLabel("Nivel Educativo");
	    lblNivelEducativo_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNivelEducativo_1.setBounds(38, 230, 124, 28);
	    PanelXD.add(lblNivelEducativo_1);
	    
	    JLabel lblStatus = new JLabel("Estatus Actual");
	    lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblStatus.setBounds(38, 270, 124, 28);
	    PanelXD.add(lblStatus);
	    
	    JLabel lblMatricula_1 = new JLabel("Matricula");
	    lblMatricula_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblMatricula_1.setBounds(38, 309, 124, 28);
	    PanelXD.add(lblMatricula_1);
	    
	    JLabel lblDomicilio = new JLabel(textFieldDomicilio.getText());
	    lblDomicilio.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblDomicilio.setBounds(179, 61, 124, 28);
	    PanelXD.add(lblDomicilio);
	    
	    JLabel lblCalles_1 = new JLabel(textField_2.getText());
	    lblCalles_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCalles_1.setBounds(179, 100, 124, 28);
	    PanelXD.add(lblCalles_1);
	    
	    JLabel lblCP_1 = new JLabel(textFieldCP.getText());
	    lblCP_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCP_1.setBounds(179, 140, 124, 28);
	    PanelXD.add(lblCP_1);
	    
	    JLabel lblNivelEducativo = new JLabel((String) comboBoxEscolaridad.getSelectedItem());
	    lblNivelEducativo.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblNivelEducativo.setBounds(172, 230, 124, 28);
	    PanelXD.add(lblNivelEducativo);
	    
	    JLabel lblStatusActual = new JLabel((String) comboBoxStatus.getSelectedItem());
	    lblStatusActual.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblStatusActual.setBounds(172, 270, 124, 28);
	    PanelXD.add(lblStatusActual);
	    
	    JLabel lblMatricula = new JLabel(textFieldMatricula.getText());
	    lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblMatricula.setBounds(172, 309, 124, 28);
	    PanelXD.add(lblMatricula);
	    
	    JLabel lblApellidoM = new JLabel("Apellido materno:");
	    lblApellidoM.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidoM.setBounds(292, 258, 124, 28);
	    docenteCreado.add(lblApellidoM);
	    
	    JLabel lblApellidoM_1 = new JLabel(textFieldApMaterno.getText());
	    lblApellidoM_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblApellidoM_1.setBounds(446, 258, 124, 28);
	    docenteCreado.add(lblApellidoM_1);
	    
	    JLabel lblCorreo = new JLabel("Correo electronico:");
	    lblCorreo.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCorreo.setBounds(292, 296, 144, 28);
	    docenteCreado.add(lblCorreo);
	    
	    JLabel lblCorreo_1 = new JLabel(textFieldCorreo.getText());
	    lblCorreo_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCorreo_1.setBounds(446, 296, 124, 28);
	    docenteCreado.add(lblCorreo_1);
	    
	    JLabel lblInfoGeneral = new JLabel("Información General");
	    lblInfoGeneral.setFont(new Font("Tahoma", Font.PLAIN, 18));
	    lblInfoGeneral.setBounds(59, 398, 262, 28);
	    docenteCreado.add(lblInfoGeneral);
	    
	    JLabel lblDatosAdicionales = new JLabel("Adicionales");
	    lblDatosAdicionales.setFont(new Font("Tahoma", Font.PLAIN, 18));
	    lblDatosAdicionales.setBounds(625, 182, 262, 28);
	    docenteCreado.add(lblDatosAdicionales);
	    
	    JButton btnTerminar = new JButton("Finalizar");
	    btnTerminar.setBounds(785, 642, 219, 35);
	    docenteCreado.add(btnTerminar);
	    
	    JLabel lblCurp = new JLabel("C.U.R.P");
	    lblCurp.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCurp.setBounds(292, 334, 144, 28);
	    docenteCreado.add(lblCurp);
	    
	    JLabel lblCurp_1 = new JLabel(textFieldCurp.getText());
	    lblCurp_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblCurp_1.setBounds(446, 334, 124, 28);
	    docenteCreado.add(lblCurp_1);
	}
	
	public void editarDoce() {
		menuDocentes();
	    JPanel editarDoce = new JPanel();
	    editarDoce.setBackground(Color.LIGHT_GRAY);
	    getContentPane().add(editarDoce);
	    
	    JLabel lblNewLabel = new JLabel("Editar información de docentes");
	    editarDoce.add(lblNewLabel);
	}

	public void eliminarDoce() {
		menuDocentes();
	    JPanel eliminarDoce = new JPanel();
	    eliminarDoce.setBackground(Color.DARK_GRAY);
	    getContentPane().add(eliminarDoce);
	    
	    JLabel lblNewLabel = new JLabel("Eliminar docente");
	    eliminarDoce.add(lblNewLabel);
	}
	
	public void menuInicio() {
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Cuenta");
		menuBar.add(mnNewMenu);

		
		JMenuItem volverPanel = new JMenuItem("Cerrar Sesion");
		mnNewMenu.add(volverPanel);
		volverPanel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	menuBar.setVisible(false);
            	JOpctionPaneJOptionPane.showMessageDialog(null, "Sesion cerrada correctamente", "Sesion Cerrada", JOptionPane.INFORMATION_MESSAGE);
                getContentPane().removeAll();
                login();
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });
		

        
}
	
	public void menuAlumnos() {
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Acceso");
		menuBar.add(mnNewMenu);
		
		JMenuItem volverInicio = new JMenuItem("Volver a inicio");
		mnNewMenu.add(volverInicio);
		volverInicio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	menuBar.setVisible(false);
                getContentPane().removeAll();
                inicio();
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });
		
		JMenuItem volverPanel = new JMenuItem("Volver al panel de alumnos");
		mnNewMenu.add(volverPanel);
		volverPanel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
                getContentPane().removeAll();
                panelAlumnos();
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });
		
		JMenuItem cerrarSesion = new JMenuItem("Cerrar Sesion");
		mnNewMenu.add(cerrarSesion);
		cerrarSesion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	JOpctionPaneJOptionPane.showMessageDialog(null, "Sesion cerrada correctamente", "Sesion Cerrada", JOptionPane.INFORMATION_MESSAGE);
            	menuBar.setVisible(false);
                getContentPane().removeAll();
                login();
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });
		
		JMenu alumnos = new JMenu("Alumnos");
		menuBar.add(alumnos);
		
		JMenuItem descargaAlu = new JMenuItem("Descargar informacion\r\n");
		alumnos.add(descargaAlu);
		descargaAlu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                descargarAlu();
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });
		
		JMenuItem consultarAlu = new JMenuItem("Consultar");
		alumnos.add(consultarAlu);
		consultarAlu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                consultarAlu();
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });
		
		JMenuItem crearAlu = new JMenuItem("Crear");
		alumnos.add(crearAlu);
		crearAlu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                crearAlu();
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });
		
		JMenuItem editarAlu = new JMenuItem("Editar");
		alumnos.add(editarAlu);
		editarAlu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                editarAlu();
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });
		
		
		JMenuItem eliminarAlu = new JMenuItem("Eliminar");
		alumnos.add(eliminarAlu);
		eliminarAlu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                eliminarAlu();
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });	
}
	
	public void menuDocentes() {
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Menu");
		menuBar.add(mnNewMenu);
		
		JMenuItem volverInicio = new JMenuItem("Volver a inicio");
		mnNewMenu.add(volverInicio);
		volverInicio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	menuBar.setVisible(false);
                getContentPane().removeAll();
                inicio();
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });
		
		JMenuItem volverPanel = new JMenuItem("Volver al panel de docentes");
		mnNewMenu.add(volverPanel);
		volverPanel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                panelDocentes();
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });
		
		JMenuItem cerrarSesion = new JMenuItem("Cerrar Sesion");
		mnNewMenu.add(cerrarSesion);
		cerrarSesion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	JOpctionPaneJOptionPane.showMessageDialog(null, "Sesion cerrada correctamente", "Sesion Cerrada", JOptionPane.INFORMATION_MESSAGE);
            	menuBar.setVisible(false);
                getContentPane().removeAll();
                login();
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });
		
		JMenu alumnos = new JMenu("Docentes");
		menuBar.add(alumnos);
		
		JMenuItem descargaDoce = new JMenuItem("Descargar informacion\r\n");
		alumnos.add(descargaDoce);
		descargaDoce.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                descargarDoce();
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });
		
		JMenuItem consultarDoce = new JMenuItem("Consultar");
		alumnos.add(consultarDoce);
		consultarDoce.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                consultarDoce();
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });
		
		JMenuItem crearDoce = new JMenuItem("Crear");
		alumnos.add(crearDoce);
		crearDoce.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                crearDoce();
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });
		
		JMenuItem editarDoce = new JMenuItem("Editar");
		alumnos.add(editarDoce);
		editarDoce.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                editarDoce();
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });
		
		
		JMenuItem eliminarDoce = new JMenuItem("Eliminar");
		alumnos.add(eliminarDoce);
		eliminarDoce.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                eliminarDoce();
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        });
		
		
		
	
		
}
}