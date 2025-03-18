package ej3;

public class Jornalero extends Funcionario {
    private int horasTrabajadas;
    private int valorHora;

    public Jornalero(String nombre, String ci, int horasTrabajadas, int valorHora) {
        super(nombre, ci);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }
    @Override
    public int CalcularSueldo(){
        return horasTrabajadas*valorHora;
    }
}
