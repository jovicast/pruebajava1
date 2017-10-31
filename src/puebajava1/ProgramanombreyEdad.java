/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puebajava1;

import javax.swing.JOptionPane;

/************************************
 * Myriam Castillo Zavala;
 * @author LAB07
 * Fecha: Octubre 30 de 2017
 * Programa: Clase3Myriam
 * Responsabilidad: Clase Principal
 ************************************/
public class ProgramanombreyEdad 
        
{
 public static void main(String[] args)
 { 
  String Nombre;
  int Edad = 0;
  Nombre =(JOptionPane.showInputDialog("Ingrese Edad, Nombre"));
  JOptionPane.showMessageDialog(null, "Bienvenido "+(Nombre));
  JOptionPane.showMessageDialog(null, "En 20 años tendra "+(Edad+20));
  
  
 }  
}

