// Paquete principal
package Ventana;

import Controller.UniversidadController;
import model.Universidad;

import javax.swing.*;
import java.awt.event.*;
import java.util.Arrays;

public class VentanaMenuBienvenida extends JFrame implements ActionListener {

    private JLabel textoMenu;
    private JButton botonRegistrarFacultad;
    private JButton botonRegistrarTrabajador;
    private JButton botonSalir;
    private Universidad universidad;

    public VentanaMenuBienvenida(Universidad universidad) {
        super("Menu Universidad");
        this.universidad = universidad;
        setSize(500, 520);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        textoMenu = new JLabel("Sistema de Gestión de Universidad");
        textoMenu.setBounds(20, 30, 500, 30);
        add(textoMenu);

        botonRegistrarFacultad = new JButton("Registrar Facultad");
        botonRegistrarFacultad.setBounds(175, 100, 150, 40);
        add(botonRegistrarFacultad);
        botonRegistrarFacultad.addActionListener(this);

        botonRegistrarTrabajador = new JButton("Registrar Trabajador");
        botonRegistrarTrabajador.setBounds(175, 150, 150, 40);
        add(botonRegistrarTrabajador);
        botonRegistrarTrabajador.addActionListener(this);

        botonSalir = new JButton("Salir");
        botonSalir.setBounds(175, 420, 150, 40);
        add(botonSalir);
        botonSalir.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonRegistrarFacultad) {
            // Aquí puedes abrir una nueva ventana para registrar una facultad
            // Por ejemplo: new VentanaRegistrarFacultad(universidad);
        } else if (e.getSource() == botonRegistrarTrabajador) {
            // Aquí puedes abrir una nueva ventana para registrar un trabajador
            // Por ejemplo: new VentanaRegistrarTrabajador(universidad);
        } else if (e.getSource() == botonSalir) {
            // Aquí puedes guardar los datos de la universidad antes de salir
            // Por ejemplo: UniversidadController.guardarDatos(universidad);
            System.exit(0);
        }
    }
}




