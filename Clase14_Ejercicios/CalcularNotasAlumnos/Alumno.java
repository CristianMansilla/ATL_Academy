package Clase14_Ejercicios.CalcularNotasAlumnos;

import java.util.List;

public class Alumno {
    private String nombre;
    private String apellido;
    private List<Double> notas;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    public double calcularPromedio(){
        double sumaNotas = 0;
        double promedio;
        for(double nota:notas){
            sumaNotas += nota;
        }
        promedio = sumaNotas/notas.size();
        return promedio;
    }

    public void imprimirMensajePromedio(){
        System.out.println("El alumno " + nombre + ", obtuvo un promedio de: " + calcularPromedio());
    }

}
