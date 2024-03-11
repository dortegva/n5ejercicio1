package ex3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;




    public class FitxerTXT {
        public static void main (String [ ] args) {



            ordenaDirectori(pideString("Cual es la ruta del directorio?"));}




        static void ordenaDirectori(String ruta)  {
            File[] directori = new File(ruta).listFiles();
            SimpleDateFormat fecha = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");

            Arrays.sort(directori);
            for (File archivo: directori) {

                if (archivo.isDirectory()) {

                    guardaRutesDir("D:" + archivo.getName() + " "
                            + "Última modificación: " + fecha.format(archivo.lastModified())+"\n");
                    ordenaDirectori(archivo.getAbsolutePath());
                }

                else {guardaRutesDir("F:" + archivo.getName() + " "
                        + "Última modificación: " + fecha.format(archivo.lastModified())+"\n");
                }
            }
        }

        private static void guardaRutesDir(String guardadoTXT) {

            try (FileWriter directori = new FileWriter("GuardadoDir.txt", true)) {

                directori.write(guardadoTXT);


            } catch (IOException e) {

                System.out.println(e.getMessage());
            }

        }
        static String pideString(String pregunta){
            System.out.println(pregunta);
            Scanner sc = new Scanner(System.in);
            String resposta=sc.nextLine();
            return resposta;
        }
    }


