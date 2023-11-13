public class Persona {
    //Atributos
    private String nombre;
    public int anhoNacimiento;
    private String rut;

    //Métodos
    public Persona(String nombre, int anhoNacimiento, String rut) {
        this.nombre = nombre;
        this.anhoNacimiento = anhoNacimiento;
        this.rut = rut;
    }
    public String toString(){
        return "El objeto es: " + this.nombre + " y " + this.rut;
    }
    public void mayorEdad(){
        if (anhoNacimiento >= 2005) {
            System.out.println("Es mayor de edad");
        }
        else {
            System.out.println("Es menor de edad");
        }
    }
    //Getters
    public String getNombre(){
        return this.nombre;
    }
    public int getAnhoNacimiento(){
        return this.anhoNacimiento;
    }
    public String getRut(){
        return this.rut;
    }

    //Setters
    public void setNombre(String newNombre){
        this.nombre = newNombre;
    }
    public void setAnhoNacimiento(int newAnhoNacimiento) {
        this.anhoNacimiento = newAnhoNacimiento;
    }
    public void setRut(String newRut){
        this.rut = newRut;
    }
}
