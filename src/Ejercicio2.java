
import java.lang.String;

public class Ejercicio2 {
    public static void main(String[] args) {
        //imprimo numeros del 1 al 100//

        //Primera manera//
        /*int num = 1;
        //String str;

        for (int i = 0; i < 100; i++) {
            //Puedo utilizar un if anidado que me permita evaluar condiciones en simultáneo//

            if (num % 3 == 0)
                System.out.println("do");
            if (num % 5 == 0)
                System.out.println("re");
            if (num % 5 == 0 && num % 3 == 0)
                System.out.println("mi");
            else {
                System.out.println("" + num);
            }
            num++;

        }*/

        //Segunda manera//

        int[] arrayEnteros;
        arrayEnteros = new int[100]; //Declaro un vector de 100 elementos//

        for (int i = 1; i <= arrayEnteros.length; i++) {
            //String arrayToString = Arrays.toString(arrayEnteros);
             String vari=String.valueOf(i);

            if (i % 3 == 0)
                vari = "do";
               if (i % 5 == 0)
                vari = "re";
               if (i % 5 == 0 && i % 3 == 0)
                vari = "mi";
               System.out.println(vari);



        }

    }

}







