package Clase15_Ejercicios.FigurasGeometricas;

import java.util.Scanner;

public abstract class PoligonoRegular extends Figura {
    protected double base;
    protected double altura;

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void cargarDatos(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingresa la altura en cm.");
        base = reader.nextDouble();
        System.out.println("Ingresa la base en cm.");
        altura = reader.nextDouble();
    }
    public abstract double calcularArea();
}
