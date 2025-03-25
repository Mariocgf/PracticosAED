package clase3;

public class Clase3 {

    public static void main(String[] args) {
        int ary[] = {6, 3, 5, 1, 8, 7, 2, 4};
        int ary2[] = {1, 2, 3, 2, 1};
        int ary3[] = {1,2,4,5,6,7,9,10,11};
        System.out.println(mostrarv(ary));
        System.out.println("Promedio: " + promedio(ary));
        System.out.println("Impares: " + muestroValoresImpares(ary));
        System.out.println("Pares: " + muestroPosPares(ary));
        System.out.println("Es simetrico: " + esSimetrico(ary2));
        System.out.println("El valor esa?: " + buscarVecOrdAsc(ary3, 5));
    }
    
    public static String mostrarv(int v[]) {
        String aux = "";
        for (int i = 0; i < v.length - 1; i++) {
            aux += v[i] + " - ";
        }
        return aux + v[v.length - 1];
    }

    public static double promedio(int v[]) {
        int sum = 0;
        for (int i = 0; i < v.length; i++) {
            sum += v[i];
        }
        return sum / v.length;
    }

    public static String muestroValoresImpares(int v[]) {
        String aux = "";
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 != 0) {
                aux += v[i] + " ";
            }
        }
        return aux;
    }

    public static String muestroPosPares(int v[]) {
        String aux = "";
        for (int i = 0; i < v.length; i++) {
            if (i % 2 == 0) {
                aux += v[i] + " ";
            }
        }
        return aux;
    }

    public int maxVecDes(int[] v) {
        int max = v[0];
        for (int i = 0; i < v.length - 1; i++) {
            if (v[i + 1] > v[i]) {
                max = v[i + 1];
            }
        }
        return max;
    }

    public int maxVecOrd(int[] v) {
        return v[v.length - 1];
    }

    public static boolean esSimetrico(int[] v) {
        boolean simetrico = true;
        for (int i = 0; i < v.length / 2 && simetrico; i++) {
            if (v[i] != v[v.length - 1 - i]) {
                simetrico = false;
            }
        }
        return simetrico;
    }

    public static int posMinVec(int[] v, int posDesde, int posHasta) {
        int min = v[posDesde];
        for (int i = posDesde; i < posHasta - 1; i++) {
            if (v[i + 1] > v[i]) {
                min = v[i + 1];
            }
        }
        return min;
    }

    public static boolean buscarVec(int[] v, int elemento) {
        boolean esta = false;
        for (int i = 0; i < v.length && !esta; i++) {
            if (v[i] == elemento) {
                esta = true;
            }
        }
        return esta;
    }

    public static boolean buscarVecOrdAsc(int[] v, int elemento) {
        boolean esta = false;
        int pos = v.length / 2;
        if (v[pos] > elemento){
            for(int i = pos ; i >= 0 && !esta; i--){
                if(v[i] == elemento){
                    esta = true;
                }
            }
        }else{
            for(int i = pos ; i < v.length && !esta; i++){
                if(v[i] == elemento){
                    esta = true;
                }
            }
        }    
        return esta;
    }
}

