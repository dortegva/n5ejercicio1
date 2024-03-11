package ex5;

import java.io.Serializable;

public class Ordenador implements Serializable {

    private String marca;
    private int RAM;
    private String procesador;

    public Ordenador(String marca, int RAM, String procesador) {
        this.marca = marca;
        this.RAM = RAM;
        this.procesador = procesador;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String toString(){
        return "La marca es " + marca + " el procesador es "+ procesador + " y la RAM es de "+ RAM;
    }
}
