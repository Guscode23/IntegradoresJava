import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        //Utilizo la clase scanner para permitir el ingreso de datos//


        Scanner ingreso = new Scanner(System.in);

        System.out.println("Ingrese la medida del lado 1:");
        int lado1 = ingreso.nextInt(); //El buffer toma el valor ingresado por teclado//

        System.out.println("Ingrese la medida del lado 2:");
        int lado2 = ingreso.nextInt();

        System.out.println("Ingrese la media del lado 3:");
        int lado3 = ingreso.nextInt();

        if ((lado1 == lado2) && (lado2 == lado3)) {
            System.out.println("El tringulo es equilatero");
        } else if((lado1!=lado2) && (lado1!=lado3)) {
            System.out.println("El triangulo es escaleno");}

          else if(lado2!=lado3){
             System.out.println("El triangulo es isosceles");}

    }
}


