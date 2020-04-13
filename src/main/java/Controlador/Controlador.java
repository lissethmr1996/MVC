/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Modelo;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Clase donde se realiza la conexión de la vista con el modelo. Donde el controlador pueda escuchar 
 * los eventos del boton de la vista.
 * @author Lisseth Dahianna Martinez Rodiguez
 * @version 1.0.0
 */
public class Controlador implements ActionListener {
    
    private Vista view;
    private Modelo model;
    
    public Controlador(Vista view, Modelo model) {
        this.view = view;
        this.model = model;
        this.view.btnInsertar.addActionListener(this);
    }
    /*
    * Metodo para iniciar la vista
    */
    public void mostrar(){
        view.setTitle("MVC");
        view.setLocationRelativeTo(null);
    }
    /*
    * Metodo de la función que va a realizar el boton.
    * Enviar y mostrar los datos en los campos de texto de la vista.
    */
    public void actionPerformed(ActionEvent e){
        model.setTexto(view.txtInfo.getText());
        view.list.setModel(model.listar());
    }
}
