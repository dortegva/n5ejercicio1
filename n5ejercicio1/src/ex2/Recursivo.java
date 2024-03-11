package ex2;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;


public class Recursivo {
    public static void main (String [ ] args) {


        ordenaDirectori(pideString("Cual es la ruta del directorio?"));

    }


    static void ordenaDirectori(String ruta)  {
        File[] directori = new File(ruta).listFiles();
        SimpleDateFormat fecha = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");

        Arrays.sort(directori);
        for (File archivo: directori) {

            if (archivo.isDirectory()) {

                    System.out.println("D:" + archivo.getName() + " "
                            + "Última modificación: " + fecha.format(archivo.lastModified()));
                    ordenaDirectori(archivo.getAbsolutePath());
                }

            else {System.out.println("F:" + archivo.getName() + " "
                        + ("Última modificación: " + fecha.format(archivo.lastModified())));}
            }
        }


        static String pideString(String pregunta){
        System.out.println(pregunta);
        Scanner sc = new Scanner(System.in);
        String resposta=sc.nextLine();
        return resposta;
    }
}
