package Clase14_Ejercicios;

import java.util.Scanner;

public class CalculadoraCambio {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingresar el costo del producto:");
        float costoProducto = reader.nextFloat();

        System.out.println("Ingresa la cantidad pagada:");
        float cantidadPagada = reader.nextFloat();

        if(cantidadPagada<costoProducto){
            float cantidadFaltante = costoProducto - cantidadPagada;
            System.out.println("Falta abonar: $" + cantidadFaltante);
        }else{
            float cambioTotal = cantidadPagada - costoProducto;
            System.out.println("La persona recibe de cambio: $" + cambioTotal);
        }
    }
}
