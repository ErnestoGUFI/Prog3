import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ventana extends JFrame {
    private JTextField display;
    private JPanel panel_botones;

    public Ventana() {
        setTitle("Calculadora");
        setLocation(300, 100);
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setResizable(true);
        componentes();
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    private void componentes()
    {
    	 JTextField display = new JTextField();
         display.setFont(new Font("Arial", Font.PLAIN, 24));
         add(display, BorderLayout.NORTH);

         panel_botones = new JPanel();
         //layout para columnas y filas
         panel_botones.setLayout(new GridLayout(4, 4, 5, 5)); 
         botones();
         add(panel_botones, BorderLayout.CENTER);
    }

    private void botones() {


        JButton boton7 = new JButton("7");
        boton7.setFont(new Font("Arial", Font.PLAIN, 20));
        panel_botones.add(boton7);

        JButton boton8 = new JButton("8");
        boton8.setFont(new Font("Arial", Font.PLAIN, 20));
        panel_botones.add(boton8);

        JButton boton9 = new JButton("9");
        boton9.setFont(new Font("Arial", Font.PLAIN, 20));
        panel_botones.add(boton9);

        JButton botonDividir = new JButton("/");
        botonDividir.setFont(new Font("Arial", Font.PLAIN, 20));
        panel_botones.add(botonDividir);

        JButton boton4 = new JButton("4");
        boton4.setFont(new Font("Arial", Font.PLAIN, 20));
        panel_botones.add(boton4);

        JButton boton5 = new JButton("5");
        boton5.setFont(new Font("Arial", Font.PLAIN, 20));
        panel_botones.add(boton5);

        JButton boton6 = new JButton("6");
        boton6.setFont(new Font("Arial", Font.PLAIN, 20));
        panel_botones.add(boton6);

        JButton botonMultiplicar = new JButton("*");
        botonMultiplicar.setFont(new Font("Arial", Font.PLAIN, 20));
        panel_botones.add(botonMultiplicar);

        JButton boton1 = new JButton("1");
        boton1.setFont(new Font("Arial", Font.PLAIN, 20));
        panel_botones.add(boton1);

        JButton boton2 = new JButton("2");
        boton2.setFont(new Font("Arial", Font.PLAIN, 20));
        panel_botones.add(boton2);

        JButton boton3 = new JButton("3");
        boton3.setFont(new Font("Arial", Font.PLAIN, 20));
        panel_botones.add(boton3);

        JButton botonRestar = new JButton("-");
        botonRestar.setFont(new Font("Arial", Font.PLAIN, 20));
        panel_botones.add(botonRestar);

        JButton botonLimpiar = new JButton("C");
        botonLimpiar.setFont(new Font("Arial", Font.PLAIN, 20));
        panel_botones.add(botonLimpiar);

        JButton boton0 = new JButton("0");
        boton0.setFont(new Font("Arial", Font.PLAIN, 20));
        panel_botones.add(boton0);

        JButton botonIgual = new JButton("=");
        botonIgual.setFont(new Font("Arial", Font.PLAIN, 20));
        panel_botones.add(botonIgual);

        JButton botonSumar = new JButton("+");
        botonSumar.setFont(new Font("Arial", Font.PLAIN, 20));
        panel_botones.add(botonSumar);
    }


    
    }

