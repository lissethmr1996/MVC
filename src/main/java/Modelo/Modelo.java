/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.swing.DefaultListModel;

/**
 * Clase donde se crean las propiedades del modelo. Variables de entrada y salida de datos.
 * @author Lisseth Dahianna Martinez Rodiguez
 * @version 1.0.0
 */
public class Modelo {
    
    private String texto;
    DefaultListModel lista = new DefaultListModel();
    
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    /*
    * Metodo donde se listaran en el jList los datos ingresados en el jTextField de la vista
    */
    public DefaultListModel listar(){
        lista.addElement(this.texto);
        return lista;
    }
}
