public class CuentaJoven extends Cuenta{
    private float bonificacion;
    
     public CuentaJoven(Cliente titular, float saldo, int tamanio, float bonificacion){ //este es como un segundo constructor
        super(bonificacion);
        this.bonificacion = bonificacion;
    }
    
    public boolean esTitularValido(){
        if(titular.getAnhoNacimiento() <= 2005 && titular.getAnhoNacimiento() > 1998){
            return true;
        }else{
            return false;
        }
    }
    
    
    //Getters
    public float getBonificacion(){
        return this.bonificacion;
    }
    //Setters
    public void setBonificacion(float nuevaBonificacion){
        this.bonificacion = nuevaBonificacion;
    }
}