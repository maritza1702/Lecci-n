/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.vista.Formulario;

/**
 *
 * @author Jhon
 */
public class Controlador {
   
    Formulario formulario=new Formulario(this);
    
   public void showFormulario (){
       formulario.setVisible(true);
   }
    
    
}
