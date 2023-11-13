public class Cliente extends Persona{
    private String password;
    private Cuenta[] Productos;
    
    public Cliente(String nombre, int anhoNacimiento, String rut, String password, int tamanio){ //este es como un segundo constructor
        super(password, tamanio);
        this.password = password;
        this.Productos = new Cuenta[tamanio];
    }
    
    //Getters
    public String getPassword(){
        return this.password;
    }
    
    public Cuenta[] getProductos(){
        return this.Productos;
    }
    
    //Setters
    public void setPassword(String nuevaPassword){
        this.password = nuevaPassword;
    }
    
    public void setProductos(Cuenta[] nuevosProductos){
        this.Productos = nuevosProductos;
    }
    
    
}