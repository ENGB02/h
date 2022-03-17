Package ED;
public class Juguete extends Nin {
     
    //Atributs
	private String nombre = new String ();
	private Integer edatR;
	private Integer preu;
	
	
	//Constructors
	public Juguete(String nom,Integer edatR,Integer preu) {
		this.nombre = nombre.toUpperCase();
		this.edatR = edatR;
		this.preu = preu;
	}
	
	public Juguete() {
		this.nombre = null;
		this.edatR = null;
		this.preu = null;
	}
	
	public Juguete (Juguete juguete) {
		this.nombre = juguete.getNombre();
		this.edatR = juguete.getEdatR();
		this.preu = juguete.getPreu();
	}
	
	//Setters i getters
	private void setNombre(String nom) {this.nombre = nombre.toUpperCase();}
	private void setEdat(Integer edatR) {this.edatR=edatR;}
	private void setNif(Integer preu) {this.preu = preu;}
	private String getNombre() {return this.nombre;}
	private Integer getEdatR() {return this.edatR;}
	private Integer getPreu() {return this.preu;}   }



