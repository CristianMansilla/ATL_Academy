package Clase10_Ejercicios;

import java.util.Date;

public class Persona {
    private int id;
    private String nombre;
    private int edad;
    private Date fechaNacimiento;
    private String dni;

    public Persona(){

    }

    public Persona(int id, String nombre, int edad, Date fechaNacimiento, String dni) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }

    public boolean esMayorDeEdad(){
        boolean mayorDeEdad;
        if(edad>=18){
            mayorDeEdad = true;
        }else {
            mayorDeEdad = false;
        }

        return mayorDeEdad;
    }
}
