/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import Controlador.Controlador;
import Modelo.Modelo;
import Vista.Vista;

/**
 * Clase principal
 * @author Lisseth Dahianna Martinez Rodiguez
 * @version 1.0.0
 */
public class Main {
    
    /**
     * Clase Main donde se ejecuta el programa
     * @param args matriz de argumentos de línea de comando pasados ​​a este método
     */
    
    public static void main(String[] args) {
        
        Modelo model = new Modelo();
        Vista view = new Vista();
        Controlador cont = new Controlador(view, model);
        cont.mostrar();
        view.setVisible(true);
        
    }
}


