
package ej2;

public class Socio {
    private String nombre;
    private int numero;
    private static int proxNum = 1;
    
    public Socio(String nom){
        this.SetNombre(nom);
        this.SetNumero();
    }
    
    public void SetNombre(String nom){
        nombre = nom;
    }
    public void SetNumero(){
        numero += proxNum;
        proxNum++;
    }
    public String GetNombre(){
        return nombre;
    }
    public int GetNumero(){
        return numero;
    }
    @Override
    public String toString(){
        return "Nombre: " + this.GetNombre() + "\nNumero: " + this.GetNumero();
    }
}
