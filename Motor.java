package ED;
public class Motor {
    //Atributos
    private String fabricante= new String();
    private String potencia= new String();
    private Integer codigo;

    //Constructores
    public Motor (String fabricante, String potencia, Integer codigo){
           this.fabricante=fabricante;
           this.potencia=potencia;
           this.codigo=codigo;
    }
    public Motor(){
           this.fabricante=null;
           this.potencia=null;
           this.codigo=null;
    }
    //Gets Y Sets
    private void setFabricante(String fabricante){
    		this.fabricante = fabricante;
                }
    private void setPotencia(String potencia){
                this.potencia=potencia;
                }
    private void setCodigo(Integer codigo){
                this.codigo=codigo;
                }
    private String getFabricante() {return this.fabricante;}
    private String getPotencia(){return this.potencia;}
    private Integer getCodigo(){return this.codigo;}
}
