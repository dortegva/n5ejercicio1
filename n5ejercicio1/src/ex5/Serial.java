package ex5;


import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;


public class Serial {
    public static void main (String [ ] args) {
        Ordenador ord1=new Ordenador("HP",16,"intel i7");
        serializar(ord1);
        deserializar();

    }

    public static void serializar(Ordenador ordser) {


        try {
            FileOutputStream fileOutputStream= new FileOutputStream("Archivo.ser");
            ObjectOutputStream objectOutPutStream = new ObjectOutputStream(fileOutputStream);
            objectOutPutStream.writeObject(ordser);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void deserializar() {


        try  {
            FileInputStream Archivo = new FileInputStream("Archivo.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(Archivo);
            Ordenador orddes = (Ordenador)objectInputStream.readObject();
            //se castea el objeto ().
            System.out.println(orddes);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
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
     static void leerArchivo (File archivo){

        FileReader lectortxt=null;
        BufferedReader lectorPalabras=null;
        String linea;


        try {
            lectortxt=new FileReader(archivo);
            lectorPalabras=new BufferedReader(lectortxt);

            while ((linea=lectorPalabras.readLine())!=null){
                System.out.println(linea);}


        }catch (FileNotFoundException e)
        {
            System.out.println("No se ha cargado ningún archivo");
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }finally {

            try {
                lectorPalabras.close();
                lectortxt.close();//Cerrar recursos

            } catch (IOException e) {
                System.out.println(e.getMessage());

            }
        }}


    static String pideString(String pregunta){
        System.out.println(pregunta);
        Scanner sc = new Scanner(System.in);
        String resposta=sc.nextLine();
        return resposta;
    }
}


