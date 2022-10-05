public class Ejercicio3 {
    public static void main (String[] args)
    {
        int[] arrayEnteros={9,8,6,7,10,8,8,5,6,7,8,7,9,6,10};
        float promedio,suma=0;

        for(int i=0;i<arrayEnteros.length;i++)
        {
            suma+=arrayEnteros[i];
        }

        promedio=suma/ arrayEnteros.length;

        System.out.println("El promedio resultante es:" + promedio);
       }


}
