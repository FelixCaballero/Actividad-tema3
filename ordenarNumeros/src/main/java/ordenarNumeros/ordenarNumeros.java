package ordenarNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ordenarNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        // Leer todos los números de la entrada estándar
        while (sc.hasNextInt()) {
            numeros.add(sc.nextInt());
        }
        sc.close();

        // Ordenar
        Collections.sort(numeros);

        // Imprimir en la salida estándar
        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i));
            if (i < numeros.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

