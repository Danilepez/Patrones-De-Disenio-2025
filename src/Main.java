import java.io.BufferedReader;
import java.util.Scanner;

public class Main {
    public static void suma(int a, int b) {
        int resultado = a + b;
        System.out.println("La suma de " + a + " y " + b + " es: " + resultado);
    }


    public static void resta(int a, int b) {
        int resultado = a - b;
        System.out.println("La resta de " + a + " y " + b + " es: " + resultado);
    }


    public static void multiplicacion(int a, int b) {
        int resultado = a * b;
        System.out.println("La multiplicación de " + a + " y " + b + " es: " + resultado);
    }


    public static void division(int a, int b) {
        if (b != 0) {
            int resultado = a / b;
            System.out.println("La división de " + a + " entre " + b + " es: " + resultado);
        } else {
            System.out.println("No se puede dividir por cero.");
        }
    }

    public static void imprimiResultado(int x){
        System.out.println("El resultado es: " + x);
    }

    public static void calculadora (int a, int b, int c) {
        switch (c){
            case 1:
                imprimiResultado(a+b);
                break;

            case 2:
                imprimiResultado(a-b);
                break;

            case 3:
                imprimiResultado(a*b);
                break;

            case 4:
                if (b!=0)
                    imprimiResultado(a/b);
                break;
        }
    }


    public static String duplicar (String texto, int num_rep){
        String textoActual = "";
        if (num_rep < 0){
            throw new IllegalArgumentException("El numero debe ser positivo");
        }
        for (int i = 0; i < num_rep; i++){
            textoActual += texto;
        }
        return textoActual;
    }

    public static void main(String[] args) {
        /*int x,y,z;
        System.out.println("UPB Calculadora!!");
        Scanner leer = new Scanner(System.in);

        System.out.println("1. Suma \n 2. Resta \n 3. Multiplicacion \n 4. Division");

        System.out.println("Ingrese la operacion a realizar:");
        while(!leer.hasNextInt()) ej: System.out.println("Ingrese la operacion a realizar:");
        z = leer.nextInt();

        System.out.println("Ingrese un numero:");
        while(!leer.hasNextInt()) System.out.println("Ingrese un numero:");
        x = leer.nextInt();

        System.out.println("Ingrese otro numero:");
        while(!leer.hasNextInt()) System.out.println("Ingrese otro numero:");
        y = leer.nextInt();

        calculadora(x,y,z);*/

        System.out.println(duplicar("Hola", 5));

    }
}
