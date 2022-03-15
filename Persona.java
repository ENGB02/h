package ED;
public class Persona { 
    //Atributs
	private String  nombre= new String ();
	private Integer edat;
	private String nif = new String ();
	
	
	//Constructors
	public Persona(String nom,Integer edat, String nif) {
		this.nombre = nombre;
		this.edat = edat;
		this.nif = nif;
	}
	
	public Persona() {
		this.nombre = null;
		this.edat = null;
		this.nif = null;
	}
	
	public Persona(Persona persona) {
		this.nombre = persona.getNombre();
		this.edat = persona.getEdat();
		this.nif = persona.getNif();
	}
	
	//Setters i getters
	private void setNombre(String nom) {this.nombre = nombre.toUpperCase();}
	private void setEdat(Integer edat) {this.edat=edat;}
	private void setNif(String nif) {this.nif = nif;}
	private String getNombre() {return this.nombre;}
	private Integer getEdat() {return this.edat;}
	private String getNif() {return this.nif;}
        }


