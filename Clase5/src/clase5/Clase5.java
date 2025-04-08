package clase5;

public class Clase5 {

    //Listas, pila y cola -> con TAD
    public static void main(String[] args) {
        //ListaV1 lista = new ListaV1(5);
        System.out.println("1");
        ListaNodos lista = new ListaNodos();
        lista.agregarInicio(5);
        lista.agregarInicio(8);
        lista.agregarInicio(3);
        lista.agregarInicio(18);
        //lista.agregarFinal(6);
        lista.mostrar();
        
    }

}
