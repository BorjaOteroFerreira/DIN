/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados;

/**
 *
 * @author usuario
 */
public class Empleado {
    String dni, nombre, apelido1, apelido2, profesion, provincia;
    
    public Empleado(String dni, String nombre, String apelido1, String apelido2,  String provincia, String profesion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apelido1 = apelido1;
        this.apelido2 = apelido2;
        this.profesion = profesion;
        this.provincia = provincia;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelido1() {
        return apelido1;
    }

    public void setApelido1(String apelido1) {
        this.apelido1 = apelido1;
    }

    public String getApelido2() {
        return apelido2;
    }

    public void setApelido2(String apelido2) {
        this.apelido2 = apelido2;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
    @Override 
    public String toString(){
        return nombre+ " " + apelido1 + " " + apelido2;
    
    }
    
    
    
    
}
