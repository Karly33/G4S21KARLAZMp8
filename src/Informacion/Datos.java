/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Informacion;

/**
 *
 * @author KJS
 */
public class Datos {
 String nombre;
 int edad;
 String correo;

public Datos() {
}

public Datos(String nombre, int edad, String correo) {
this.nombre = nombre;
this.edad = edad;
this.correo = correo;
}
 public String getNombre() {
 return nombre;
 }

public void setNombre(String nombre) {
this.nombre = nombre;
 }

public int getEdad() {
return edad;
 }

public void setEdad(int edad) {
this.edad = edad;
 }

public String getCorreo() {
return correo;
}

public void setCorreo(String correo) {
this.correo = correo;
}

    public String getNOmbre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


 
 
 
 
}
