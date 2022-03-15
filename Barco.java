package ED;

import ED.Motor;
import java.util.Date;

public class Barco implements ISonido {

    //Atributos
    private String nombre = new String();
    private Date fechaConstruccion = new Date();
    private Integer numCamarotes;
    private Motor motor;

    //Constructores
    private Barco(String nombre, Date fechaConstruccion, Integer numCamarotes) {
        this.nombre = nombre;
        this.fechaConstruccion = fechaConstruccion;
        this.numCamarotes = numCamarotes;
        this.motor = new Motor();
    }

    private Barco() {
        this.nombre = null;
        this.fechaConstruccion = null;
        this.numCamarotes = null;
    }

    //Gets y Sets
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private void setFechaConstruccion(Date fechaConstruccion) {
        this.fechaConstruccion = fechaConstruccion;
    }

    private void setNumCamarotes(Integer numCamarotes) {this.numCamarotes = numCamarotes;}

    private String getNombre() {return this.nombre;}
    private Date getFechaConstruccion() {return this.fechaConstruccion;}
    private Integer getNumCamarotes() {return this.numCamarotes;}
    @Override
    public void sonido() {
        System.out.println("El barco hace sonido ");
    }
}
