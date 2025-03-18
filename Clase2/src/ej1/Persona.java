
package ej1;

public class Persona {
    private String Nombre;
    private String Apellido;
    private int Edad;
    
    public Persona(String nombre, String apellido, int edad){
        Nombre = nombre;
        Apellido = apellido;
        Edad = edad;
    }
    
    public void SetNombre(String nombre){
        Nombre = nombre;
    }
    public void SetApellido(String apellido){
        Apellido = apellido;
    }
    public void SetEdad(int edad){
        Edad = edad;
    }
    public String GetNombre(){
        return Nombre;
    }
    public String GetApellido(){
        return Apellido;
    }
    public int GetEdad(){
        return Edad;
    }
    @Override
    public String toString(){
        
        return "Nombre: " + this.GetNombre() + "\nApellido: " + this.GetApellido() + "\nEdad: " + this.GetEdad();
    }
}
