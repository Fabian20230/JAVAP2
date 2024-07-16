
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void holaMundo(){
        System.out.println("Mira mamá");
        System.out.println("Holaaaa");
        System.out.println(" ");
    }

    public static void suma(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int a =  sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int b =  sc.nextInt();
        int c = a + b ;
        System.out.println("El resultado de la suma es: "+ c);
        System.out.println(" ");
    }

public static void par(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num =  sc.nextInt();
        if (num % 2 == 0){
            System.out.println("El resultado es par");
        }else
            System.out.println("El resultado es impar");
    System.out.println(" ");

}
public static void facto(){
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese un numero facto");
    long num =  sc.nextInt();

     int factorial = 1;

    for (int i = 2; i <= num ; i++){
        factorial = factorial * i;
    }

    System.out.println("El factorial de: "+ num + "es: "+ factorial);
}

public static void tabla (){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero para la tabla");
        int num =  sc.nextInt();

    System.out.println("La tabla de multiplicar ascendente es: ");
        for (int i = 1; i <= 10 ; i++){
            System.out.println(num +" X " + i + " = " + (num * i));
        }
    System.out.println(" ");

    System.out.println("La tabla de multiplicar descendente es: ");
    for (int i = 10; i >= 1 ; i--){
        System.out.println(num +" X " + i + " = " + (num * i));
    }
    System.out.println(" ");
}

public static void mayor(){
        Scanner sc = new Scanner(System.in);
int num = 0, mayor = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
    System.out.println("INGRESE UNA SECUENCIA DE NUMEROS Y TERMINARÁ DE ALMACENAR CUANDO SE INGRESE UN NUMERO NEGATIVO");
do {
   try {

       num = sc.nextInt();
       if (num >= 0) {
           if (num > mayor) {
               mayor = num;
           }
           if (num < menor) {
               menor = num;
           }
       }
   }catch (Exception e){
       System.out.println("No es un numero");
    sc.next();
   }
}while (num >=0);
    System.out.println("El numero mayor es: "+ mayor);
    System.out.println(" ");
    System.out.println("El numero menor es: "+ menor);
    System.out.println(" ");
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int opcion;
        System.out.println("Menu de opciones");
        System.out.println("Que desea hacer?");
        System.out.println(" ");
        do {
            System.out.println("1. Hola mundo");

            System.out.println("2. Sumar dos numeros");

            System.out.println("3. Determinar si un numero es par o impar");

            System.out.println("4. Calcular el factorial de un numero");

            System.out.println("5. Crear una tabla de multiplicar ascendente y descendente");

            System.out.println("96. Determinar si un numero es mayor y/o menor de una secuencia");

            System.out.println("6. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    holaMundo();
                    break;
                case 2:
                    suma();
                    break;
                case 3:
                    par();
                    break;
                case 4:
                    facto();
                    break;
                    case 5:
                    tabla();
                    break;
                case 6:
                    System.out.println("Saliendo orale....");
                    break;
                case 96:
                    mayor();
                    break;
                default:
                    System.out.println("Esta opcion no existe");
                    System.out.println(" ");
                    break;

            }
        }while (opcion !=6);
        sc.close();
    }

}
