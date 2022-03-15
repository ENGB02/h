package ED;

public class Mascota implements ISonido{
    //Atributos
    private String nombre=new String();
    private Integer eded;
    
    //Constructores
    public Mascota(String nombre, Integer edad){
        this.nombre=nombre;
        this.eded=edad;
    }
    public Mascota(){
        this.eded=null;
        this.nombre=null;
    }
    //Gets ySets
    private void setNombre(String nombre){
        this.nombre=nombre;
    }
    private void setEdad(Integer edad){
        this.eded=edad;
    }
    private String getNombre() {
        return this.nombre;
    }
    private Integer getEdad() {
        return this.eded;
    }
    
    @Override
    public void sonido(){
        System.out.println("La mascota hace sonidos ");
    }
}
