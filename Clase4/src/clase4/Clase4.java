package clase4;

public class Clase4 {

    public static void main(String[] args) {
        int mat[][] = {{1, 2, 3, 5},
        {9, 1, 4, 5},
        {2, 6, 6, 2},
        {5, 9, 1, 6},
        {5, 5, 2, 9}};
        int mat2[][] = {
                        {1, 2, 3, 5, 6},
                        {9, 1, 4, 5, 9},
                        {9, 1, 15, 1, 9},
                        {1, 2, 3, 5, 1}};
        //System.out.println(maximoMatriz(mat));
        //System.out.println(buscarEnColumna(mat, 2, 9));
        System.out.println(esPalindroma(mat2));
    }

    public static void mostrarMatriz(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println("");
        }
    }

    public static void mostrardiagonal(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }
    }

    public static int maximoMatriz(int[][] mat) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (max < mat[i][j]) {
                    max = mat[i][j];
                }
            }
        }
        return max;
    }

    //Pre: Columna 
    public static void mostrarColumna(int[][] mat, int columna) {
        for (int i = 0; i < mat.length; i++) {
            System.out.println(mat[i][columna - 1]);
        }
    }

    public static void mostrarFila(int[][] mat, int fila) {
        for (int j = 0; j < mat[fila].length; j++) {
            System.out.print(mat[fila - 1][j]);
        }
    }

    public static void mostrarFilasImpares(int[][] mat) {
        for (int i = 1; i < mat.length; i += 2) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println("");
        }
    }

    public static boolean buscarElementoEnMatriz(int[][] mat, int elemento) {
        boolean esta = false;
        for (int i = 0; i < mat.length && !esta; i++) {
            for (int j = 0; j < mat[0].length && !esta; j++) {
                if (mat[i][j] == elemento) {
                    esta = true;
                }
            }
        }
        return esta;
    }

    public static boolean buscarEnColumna(int[][] mat, int columna, int elemento) {
        boolean esta = false;
        for (int i = 0; i < mat.length && !esta; i++) {
            if (elemento == mat[i][columna - 1]) {
                esta = true;
            }
        }
        return esta;
    }

    public static void mostrarSumaCol(int[][] mat) {
        int sum = 0;
        for (int j = 0; j < mat[0].length; j++) {
            for (int i = 0; i < mat.length; i++) {
                sum += mat[i][j];
            }
            System.out.println(sum);
            sum = 0;
        }
    }

    public static int filaMayorSuma(int[][] mat) {
        int sum = 0;
        int sumMax = Integer.MIN_VALUE;
        int fila = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                sum += mat[i][j];
            }
            if (sum > sumMax) {
                fila = i + 1;
                sumMax = sum;
            }
            sum = 0;
        }
        return fila;
    }

    public static boolean existeFilaRepetida3(int[][] mat, int valor) {
        boolean existe = false;
        int count = 0;
        for (int i = 0; i < mat.length && !existe; i++) {
            for (int j = 0; j < mat[0].length && !existe; j++) {
                if (mat[i][j] == valor) {
                    count++;
                }
            }
            if (count == 3) {
                existe = true;
            }
            count = 0;
        }
        return existe;
    }

    public static int existeColumnaAscendente(int[][] mat) {
        int col = -1;
        int count = 0;
        for (int j = 0; j < mat[0].length && !(count >= 2); j++) {
            for (int i = 0; i < mat.length - 1; i++) {
                if (mat[i][j] < mat[i + 1][j]) {
                    count++;
                } else if (count < 2 && mat[i][j] >= mat[i + 1][j]) {
                    count = 0;
                }
            }
            if (count >= 2) {
                col = j + 1;
            }
        }
        return col;
    }

    public static boolean esSimetricaHorizontal(int[][] mat){
        boolean esSim = true;
        for (int j = 0; j < mat[0].length && esSim; j++) {
            for (int i = 0; i < mat.length / 2 && esSim; i++) {
                if(mat[i][j] != mat[mat.length - 1 - i][j]){
                    esSim = false;
                }
            }
        }
        return esSim;
    }
    public static int esPalindroma (int[][] mat){
        int fila = -1;
        boolean esPal = true;
        boolean fin = false;
        for (int i = 0; i < mat.length && !fin; i++) {
            for (int j = 0; j < mat[0].length / 2 && esPal; j++) {
                if(mat[i][j] != mat[i][mat[0].length - 1 - j]){
                    esPal = false;
                }
            }
            if(esPal){
                fila = i + 1;
                fin = true;
            }else{
                esPal = true;
            }
        }
        return fila;
    }
}
/*
                       {9, 5, 4, 5}, 
                       {2, 6, 6, 2}, 
                       {4, 9, 5, 6}, 
                       {5, 5, 8, 9}}*/
