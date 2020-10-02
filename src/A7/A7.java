package A7;

import java.util.*;

public class A7 {
    public static void main(String[] args) {
        int in, n1 = 0, n2 = 1, sum = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Números primos: ");
        in = sc.nextInt();
        sc.close();
        int[] arrPrimo = new int[in];
        for (int j = 0; j < arrPrimo.length; j++) {
            if (esPrimo(j)) {
                System.out.print((j) + ",");
            }
        }
        System.out.println(" ");
        System.out.print("Sucesión de fibonacci: "+in);
        System.out.println(" ");
        int[] arreglo = new int[in];
        arreglo[0] = 0;
        for (int i = 1; i < arreglo.length; i++) {
            arreglo[i] = sum;
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }

        for (int i : arreglo) System.out.print(i + ", ");
    }

    public static boolean esPrimo(int p) {
        if (p == 0 || p == 1 || p == 4) {
            return false;
        }
        for (int x = 2; x < p / 2; x++) {
            if (p % x == 0)
                return false;
        }
        return true;
    }
}