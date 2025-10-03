package Aleatorios;

import java.util.Random;

public class aleatorios {
    public static void main(String[] args) {
        Random rand = new Random();
        int cantidad = 40;  // número mínimo de aleatorios a generar

        for (int i = 0; i < cantidad; i++) {
            int num = rand.nextInt(101); // genera número entre 0 y 100 (inclusive)
            System.out.print(num);

            if (i < cantidad - 1) {
                System.out.print(" "); // separar con espacio
            }
        }
        System.out.println(); // salto de línea al final
    }
}
