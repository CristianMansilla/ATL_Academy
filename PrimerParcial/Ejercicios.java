package PrimerParcial;

public class Ejercicios {
        public static void main(String[] args) {
            int resultado1 = suma();
            int resultado2 = sumaCombi();
            System.out.println("La primera suma es  " + resultado1);
            System.out.println("La suma combinada es " + resultado2);
        }

        public static int suma(){
            int num = 0;
            for(int i = 2; i<1000; i+=2 ){
                num+=i;
            }
            return num;
        }

        public static int sumaCombi(){
            int suma = 0;
            for(int i=0; i < 1000;i++){
                if(i%3 == 0 || i%5==0)
                    suma +=i;
            }
            return suma;
        }
}
