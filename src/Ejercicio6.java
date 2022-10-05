import java.lang.String;
public class Ejercicio6 {
    public static void main(String[] args) {
        String frase = "Holaa";
        int contLetrep =0,lenght=frase.length();
        char auxLetra = frase.charAt(0);


        for (int i = 0; i <=lenght-1; i++) {

            for (int j =i+1 ; j <=lenght-1; j++) {


                if(auxLetra != ';' && auxLetra!='.' && auxLetra!= ' ') //Detallo caracteres que no evalúo//
                    if (frase.charAt(i) == frase.charAt(j)) {
                    auxLetra = frase.charAt(j);
                    contLetrep++; //Revisar contador//
                }
            }
        }
            System.out.println("El caracter que mas se repite es:" + auxLetra);
            //System.out.println("El caracter se repite " + contLetrep + " veces");
    }
}
