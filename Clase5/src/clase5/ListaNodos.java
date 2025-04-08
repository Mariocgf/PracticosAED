package clase5;

public class ListaNodos implements IListaSimple {

    private Nodo initial;
    private int cont = 0;

    public ListaNodos() {
        this.initial = null;
    }

    @Override
    public void agregarInicio(int x) {
        Nodo nodo = new Nodo(x);
        nodo.setSig(nodo);
        initial = nodo;
        cont++;
    }

    @Override
    public void mostrar() {
        Nodo aux = initial;
        while (aux != null) {
            System.out.println(aux.getValue());
            aux = aux.getSig();
        }
    }

    @Override
    public int cantidadElementos() {
        return cont;
    }

    @Override
    public boolean esVacia() {
        return initial == null;
    }

    @Override
    public void vaciar() {
        initial = null;
    }

    @Override
    public boolean existeElemento(int x) {
        boolean exist = false;
        while (!exist && initial.getSig() != null) {
            if (initial.getValue() == x) {
                exist = true;
            }
        }
        return exist;
    }

    @Override
    public int obtenerElemento(int indice) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void agregarFinal(int x) {
        Nodo aux = initial;
        if (!esVacia()) {
            while (aux.getSig() != null) {
                aux = aux.getSig();
            }
            aux.setSig(new Nodo(x));
        }else{
            agregarInicio(x);
        }
        cont++;
    }

    @Override
    public void eliminarInicio() {
        if (!esVacia()) {
            Nodo borrar = initial;
            initial = initial.getSig();
            borrar.setSig(null);
            cont--;
        }
    }

    @Override
    public void eliminarFinal() {
        if(initial.getSig()==null){
            vaciar();
        }else {
            Nodo aux = initial;
            while(aux.getSig().getSig() != null){   
                aux = aux.getSig();
            }
            aux.setSig(null);
        }
        cont--;
    }

}
