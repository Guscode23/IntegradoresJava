import java.lang.String;


public class Ejercicio4 {
    public static void main(String[] args)
    {
        //Invertir un string//

        String hl= "hello world";

        String newhl="hello world"; //Tengo una "copia del string"//



         //Hago un loop inverso//

        for(int i=8;i>=0; i--)
        {
            char aux=hl.charAt(i);  //¿Por que no decrementa la variable contadora?//

            for(int j=0;j<=hl.length()-1;j++)
            {
                aux=newhl.charAt(j);
            }

            System.out.println(aux);
        }
    }


}
