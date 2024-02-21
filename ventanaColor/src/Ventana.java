import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
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

    // Método para crear el panel
    public void iniciarComponentes() {
        JPanel login = new JPanel();
        login.setLayout(null);
        login.setSize(getWidth() / 2, getHeight());
        login.setBackground(Color.GRAY);

        JPanel registro = new JPanel();
        registro.setLayout(null);
        registro.setSize(getWidth() / 2, getHeight());
        registro.setLocation(500, 0);
        registro.setBackground(Color.GREEN);
        
        add(login);
        add(registro);

        
        JLabel loginTag = new JLabel("Acceder");
        loginTag.setSize(100, 20);
        loginTag.setLocation(200, 20);
        loginTag.setFont(new Font("Arial", Font.BOLD, 24));
        loginTag.setOpaque(true);
        loginTag.setBackground(Color.RED);
        login.add(loginTag);

        //texto de usuario
        JLabel usuario = new JLabel("Usuario");
        usuario.setSize(100, 20);
        usuario.setLocation(10, 100);
        usuario.setFont(new Font("Arial", Font.BOLD, 24));
        usuario.setBackground(Color.GRAY);
        login.add(usuario);

        //ingresar usuario
        JTextField usuarioTexto = new JTextField();
        usuarioTexto.setSize(400, 40);
        usuarioTexto.setLocation(10, 130);
        login.add(usuarioTexto);

        //texto de contraseña
        JLabel contrasena = new JLabel("Contraseña");
        contrasena.setSize(150, 20);
        contrasena.setLocation(10, 200);
        contrasena.setFont(new Font("Arial", Font.BOLD, 24));
        contrasena.setBackground(Color.GRAY);
        login.add(contrasena);

        //ingresar contraseña
        JPasswordField contrasenaTexto = new JPasswordField();
        contrasenaTexto.setSize(400, 40);
        contrasenaTexto.setLocation(10, 230);
        login.add(contrasenaTexto);

        // Checkbox para recordar usuario
        JCheckBox recordarme = new JCheckBox("Recordarme");
        recordarme.setOpaque(false);
        recordarme.setSize(150, 20);
        recordarme.setLocation(10, 280);
        login.add(recordarme);

        // Botón de Acceder
        JButton boton = new JButton("Acceder");
        boton.setSize(150, 40);
        boton.setLocation(135, 320);
        login.add(boton);
        
        
    }

}

