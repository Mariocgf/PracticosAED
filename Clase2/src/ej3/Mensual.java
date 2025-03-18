
package ej3;

public class Mensual extends Funcionario {
    private int sueldoMensual;

    public Mensual(String nombre, String ci, int sueldoMensual) {
        super(nombre, ci);
        this.sueldoMensual = sueldoMensual;
    }

    public int getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(int sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }
    
    @Override
    public int CalcularSueldo(){
        return sueldoMensual;
    }
    
}
