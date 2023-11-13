public class Cuenta {
    //Atributos
    private Cliente titular;
    public float saldo;
    private float[] movimientos;

    //Métodos
    public Persona(Cliente titular, float saldo, int tamanio) {
        this.titular = titular;
        this.saldo = saldo;
        this.movimientos = new float[tamanio];
    }
    //Getters
    public Cliente getCliente(){
        return this.titular;
    }

}
