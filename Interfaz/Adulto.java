Package Interfaz;

import Barco;
import Perro;
import Persona;
import Gato;

public class Adulto extends Persona{

  
    
    //Atributs
	private String nss = new String ();
	private String direccion = new String();
	
	
	
	//Constructors
	public Adulto (String nss,String direccion) {
		this.nss = nss.toUpperCase();
		this.direccion = direccion.toUpperCase();
	}
	
	public Adulto () {
		this.nss = null;
		this.direccion = null;
	}
	
	public Adulto (Adulto adulto) {
		this.nss = adulto.getNss();
		this.direccion = adulto.getDireccion();
	}
	
	//Setters i getters
	private void setNss(String nss) {this.nss = nss.toUpperCase();}
	private void setDireccion(String direccion) {this.direccion=direccion;}
	private String getNss() {return this.nss;}
	private String getDireccion() {return this.direccion;}
}

