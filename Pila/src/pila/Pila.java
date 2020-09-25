package pila;

import java.util.Scanner;

public class Pila {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tope = 0, op = 0;
        System.out.println("\nEsta pila trabaja con letras...");
        char pila[] = new char[26];
        do {
            System.out.println("\nIngrese una opcion...\n");
            System.out.println("1.- Ingresar dato...\n");
            System.out.println("2.- Mostrar pila...\n");
            System.out.println("3.- Llenar pila...\n");
            System.out.println("4.- Borrar ultimo dato...\n");
            System.out.println("5.- Salir...\n");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    if (tope == 26) {
                        System.out.println("La pila esta llena...");
                    } else {
                        System.out.println("Ingrese la letra...\n");
                        pila[tope] = sc.next().charAt(0);
                        tope++;
                    }
                    break;
                case 2:
                    if (tope == 0) {
                        System.out.println("La pila esta vacia...");
                    } else {
                        for (int x = tope - 1; x >= 0; x--) {
                            System.out.print(" " + pila[x]);
                        }
                    }
                    break;
                case 3:
                    int x = 65;
                    for (; tope < 26; tope++) {// ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! !
                        pila[tope] = (char) x;
                        x++;

                    }
                    System.out.println("Pila llena...");
                    break;
                case 4:
                    if (tope == 0) {
                        System.out.println("No hay elementos para borrar...");
                    } else {
                        tope--;
                        System.out.println("Elemento eliminado...");
                    }
                    break;
            }
        } while (op != 5);

    }
}
