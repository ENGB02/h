package ED;
public class Nin extends Persona{
    
    
    
     //Atributs
	private String colegio = new String ();
		
	//Constructors
	public Nin (String colegio) {
		this.colegio =colegio;
        }
	
	public Nin () {
		this.colegio = null;
	}
	
	public Nin (Nin nin) {
		this.colegio = nin.getColegio();

	}
	
	//Setters i getters
	private void setColegio(String colegio) {this.colegio = colegio.toUpperCase();}
	private String getColegio() {return this.colegio;}
}

