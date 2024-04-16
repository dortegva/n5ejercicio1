package ex1;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;


public class OrdenDirectorio {
    public static void main (String [ ] args) {



        ordenaDirectori(pideString("Cual es la ruta del directorio?"));}




     private static void ordenaDirectori(String ruta)  {
        File[] directori = new File(ruta).listFiles();


        Arrays.sort(directori);

        for (File archivo: directori) {
            System.out.println(archivo);
        ;}
}
     private static String pideString(String pregunta){
        System.out.println(pregunta);
        Scanner sc = new Scanner(System.in);
        String resposta=sc.nextLine();
        return resposta;
    }
}
