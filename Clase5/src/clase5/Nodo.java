
package clase5;

public class Nodo {
    private Nodo sig;
    private int value;

    public Nodo(int value) {
        this.value = value;
        sig = null;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
      
    
}
