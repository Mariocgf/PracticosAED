package ej3;

import java.util.Objects;

public abstract class Funcionario {

    private String nombre;
    private String ci;

    public Funcionario(String nombre, String ci) {
        this.nombre = nombre;
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public abstract int CalcularSueldo();

    public String ganaMas(Funcionario fun) {
        String msg;
        if (this.CalcularSueldo() > fun.CalcularSueldo()) {
            msg = "El sueldo de " + this.nombre + " es mayor al de " + fun.getNombre();
        } else {
            msg = "El sueldo de " + this.nombre + " es menor al de " + fun.getNombre();

        }
        return msg;
    }

    @Override
    public boolean equals(Object obj) {
        final Funcionario other = (Funcionario) obj;
        return Objects.equals(this.ci, other.ci);
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + "\nC.I.: " + this.getCi() + "\nSueldo: " + this.CalcularSueldo();

    }
}
