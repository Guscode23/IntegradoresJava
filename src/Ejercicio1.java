import java.util.Scanner;

public class Ejercicio1 {
     public static void main(String[] args)
     {
         //Creación de objeto de la clase Scanner//

         String stringNum;


         Scanner lectura=new Scanner(System.in);
         System.out.println("Ingrese un numero del 0 al 15:");
         int numero=lectura.nextInt(); //El buffer toma el valor ingresado por teclado//

         //Codifico un switch para identificar qué palabra repesenta a cada número//
         //Evalúo cada uno de los casos//

         switch(numero) {
             case 0:
                 stringNum="Cero";
                 break;
             case 1:
                 stringNum = "Uno";
                 break;
             case 2:
                 stringNum = "Dos";
                 break;
             case 3:
                 stringNum = "Tres";
                 break;
             case 4:
                 stringNum = "Cuatro";
                 break;
             case 5:
                 stringNum = "Cinco";
                 break;
             case 6:
                 stringNum = "Seis";
                 break;
             case 7:
                 stringNum = "Siete";
                 break;
             case 8:
                 stringNum = "Ocho";
                 break;
             case 9:
                 stringNum = "Nueve";
                 break;
             case 10:
                 stringNum = "Diez";
                 break;
             case 11:
                 stringNum = "Once";
                 break;
             case 12:
                 stringNum = "Doce";
                 break;
             case 13:
                 stringNum = "Trece";
                 break;
             case 14:
                 stringNum = "Catorce";
                 break;
             case 15:
                 stringNum = "Quince";
                 break;
             default:
                 stringNum = "Unkown";
         }

         System.out.println("El numero ingresado en letras es:" + stringNum);
     }

}



