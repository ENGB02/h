package ED;

public class Gato extends Mascota {
    //Atributos
    private String raza =new String();
    //Constructores
    public Gato(String raza){
        this.raza=raza;
    }
    public Gato(){
        this.raza=null;
    }
    //Gets y Sets
    private void setRaza(String raza){
        this.raza=raza;
    }
    private String getRaza(){
        return this.raza;
    }
}
