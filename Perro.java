package ED;

public class Perro extends Mascota {
    //Atributos
    private String raza =new String();
    //Constructores
    public Perro(String raza){
        this.raza=raza;
    }
    public Perro(){
        this.raza=null;
    }
    //Gets y Sets
    private void setRaza(String raza){
        this.raza=raza;
    }
    private String getRaza(){
        return this.raza;
    }

    
    @Override
    public void sonido(){
        System.out.println("La mascota hace sonidos ");
    }

}
