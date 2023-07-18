package Clase10_Ejercicios;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Principal {
    public static void main(String[] args) {
        Persona persona1 = new Persona(1, "Cristian", 18, new GregorianCalendar(2000, Calendar.JANUARY, 01).getTime(), "39.456.789");
        System.out.println(persona1.toString());
        System.out.println("La persona es mayor de edad: "+persona1.esMayorDeEdad());

        System.out.println("--------");

        Cuenta cuenta1 = new Cuenta("Cristian", 10000);
        System.out.println(cuenta1.toString());
        System.out.println("Ingreso dinero:");
        cuenta1.ingresar(100);
        System.out.println(cuenta1.toString());
        System.out.println("Retiro dinero:");
        cuenta1.retirar(10200);
        System.out.println(cuenta1.toString());
    }
}
