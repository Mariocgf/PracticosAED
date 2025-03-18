package clase2;

import ej1.Persona;
import ej2.Socio;
import ej3.*;

/**
 *
 * @author alumnoFI
 */
public class Clase2 {

    public static void main(String[] args) {
        Persona per = new Persona("Juan", "Perez", 15);
        //System.out.println(per.toString());
        Socio s1 = new Socio("Juan");
        Socio s2 = new Socio("Ana");
        //System.out.println(s1.toString());
        //System.out.println(s2.toString());
        Mensual mensual = new Mensual("Juan", "123", 5500);
        Jornalero jor1 = new Jornalero("Ana", "456", 8, 250);
        Jornalero jor2 = new Jornalero("Juan", "123", 5, 500);
        System.out.println(mensual.toString());
        System.out.println(jor1.toString());
        System.out.println(mensual.equals(jor2));
        System.out.println(mensual.ganaMas(jor1));

    }

}
