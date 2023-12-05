package Principal;

import Controller.UniversidadController;
import model.Universidad;
import Ventana.VentanaMenuBienvenida;

import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        Universidad universidad = new Universidad("Universidad de Chile", Arrays.asList("Av. Libertador Bernardo O'Higgins 1058, Santiago, Región Metropolitana"), "Estatal");
        UniversidadController controller = new UniversidadController(universidad);
        new VentanaMenuBienvenida(universidad);
    }
}