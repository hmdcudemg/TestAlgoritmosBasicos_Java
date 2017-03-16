package Java.Algoritmos.Main;

import Java.Algoritmos.Busqueda.*;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by DEMG on 15/03/2017.
 */
public class main {
    public static int[] datos;
    private static Random generador = new Random();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        testBusquedaLineal();
    }

    private static void testBusquedaLineal() {
        // Se generan numeros aleatorios No iguales en el arreglo.
        generarNumeros(20);

        // Se imprimen los numeros del arreglo generado.
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] > -1 && datos[i] < 10) {
                System.out.print("0" + datos[i] + "- ");
            } else {
                System.out.print(datos[i] + "- ");
            }
        }
        System.out.println();

        // Se numeran los numeros solo para referencia.
        for (int i = 0; i < datos.length; i++) {
            if (i > -1 && i < 9) {
                System.out.print("0" + (i + 1) + "- ");
            } else {
                System.out.print((i + 1) + "- ");
            }
        }
        System.out.println();

        // Se crea el objeto de la clase busquedaLineal().
        busquedaLineal bl = new busquedaLineal();
        bl.setDatos(datos);// Se asigna el arreglo de datos a la clase de busqueda.

        System.out.println("Ingresa numero a buscar:");
        int busqueda = input.nextInt();

        System.out.println("Se encuentra en la posicion: " + (bl.busqueda(busqueda) + 1));
    }

    private static void generarNumeros(int tamaño) {
        // Se crea Objeto de la clase busquedaLineal().
        busquedaLineal bl = new busquedaLineal();
        datos = new int[tamaño];
        bl.setDatos(datos);// Se asigna el arreglo creado a la clase, el arreglo esta vacio.
        int dato = 0;

        // Se generan numeros aleatorios cuidando que el numero no exista previamente
        // en el arreglo que se esta creando.
        for (int i = 0; i < tamaño; i++) {
            dato = generador.nextInt(90);
            if (bl.busqueda(dato) == -1) {
                datos[i] = dato;
            }
        }
    }
}
