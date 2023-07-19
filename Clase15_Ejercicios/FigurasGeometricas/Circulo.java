package Clase15_Ejercicios.FigurasGeometricas;

import java.util.Scanner;

public class Circulo extends Figura {
    private double radio;

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void cargarDatos(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingresa el radio en cm.");
        radio = reader.nextDouble();
    }

    public double calcularArea(){
        double area = Math.PI * (radio*radio);
        return area;
    }
}
