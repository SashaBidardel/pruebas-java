
import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        String nombre="Pepe";
        String nombre2="Ana";
        Integer va=3;
        Integer vari;
        System.out.println("Hello, World!");
        System.out.println("luser");
        System.out.println(nombre);
        System.out.println(nombre + nombre2+va);
        vari=va%2;
        System.out.println(vari);
        if(va==0){
            System.out.println(va+ " es par"); 
        }
            else{
            System.out.println(va+ " es impar");
        }
    Scanner leer=new Scanner(System.in);
    System.out.println("Introduzca su edad:");
    Integer edad=leer.nextInt();
    System.out.println(edad);
    if (edad >=18){
        System.out.println("Usted es mayor de edad");
    }
    else{
        System.out.println("Usted es un menor");
    }
    Scanner nume1=new Scanner(System.in);
    System.out.println("Introduzca un número:");
    Integer num1=nume1.nextInt();
    Scanner nume2=new Scanner(System.in);
    System.out.println("Introduzca un número:");
    Integer num2=nume2.nextInt();
    Scanner nume3=new Scanner(System.in);
    System.out.println("Introduzca un número:");
    Integer num3=nume3.nextInt();
    int intArray[]=new int[] {num1,num2,num3 };
    int mayor = intArray[0];
    for (int x = 1; x < intArray.length; x++) {
        if (intArray[x] > mayor) {
            mayor = intArray[x];
        }
    }
    System.out.println("El mayor es: " + mayor);
    }
    
}
