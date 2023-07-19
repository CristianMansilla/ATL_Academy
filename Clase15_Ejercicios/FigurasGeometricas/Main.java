package Clase15_Ejercicios.FigurasGeometricas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Figura> figuras = new ArrayList<>();
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        boolean mostrarMenu = true;

        do{
            System.out.println("\n***** MENÚ *****");
            System.out.println("1) Crear Figura");
            System.out.println("2) Mostrar sumatoria de áreas de todas las figuras");
            System.out.println("3) Salir");
            int respuestaUsuario = reader.nextInt();
            switch (respuestaUsuario){
                case 1:
                    crearFigura();
                    break;
                case 2:
                    mostrarSumatoriaFiguras();
                    break;
                case 3:
                    mostrarMenu = false;
                    break;
                default:
                    System.out.println("Opción ingresa incorrecta!!!");
            }
        }while (mostrarMenu);

    }

    private static void mostrarSumatoriaFiguras(){
        double sumatoriaAreas = 0;
        for(Figura figura:figuras){
            sumatoriaAreas += figura.calcularArea();
        }
        System.out.println("La sumatoria de todas las áreas es: " + sumatoriaAreas + "cm");
    }

    private static void crearFigura() {
        Scanner reader = new Scanner(System.in);

        System.out.println("¿Que figura geométrica desea crear?");
        System.out.println("1) Círculo");
        System.out.println("2) Cuadrado");
        System.out.println("3) Triangulo");
        int respuestaUsuario = reader.nextInt();

        switch (respuestaUsuario){
            case 1:
                Circulo circulo1 = new Circulo();
                circulo1.cargarDatos();
                System.out.println("El área total es: " + circulo1.calcularArea());
                figuras.add(circulo1);
                break;
            case 2:
                Cuadrado cuadrado1 = new Cuadrado();
                cuadrado1.cargarDatos();
                System.out.println("El área total es: " + cuadrado1.calcularArea());
                figuras.add(cuadrado1);
                break;
            case 3:
                Triangulo triangulo1 = new Triangulo();
                triangulo1.cargarDatos();
                System.out.println("El área total es: " + triangulo1.calcularArea());
                figuras.add(triangulo1);
                break;
            default:
                System.out.println("Opcion ingresa incorrecta!!!");
        }
    }
}
