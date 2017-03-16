package Java.Algoritmos.Busqueda;

/**
 * Created by DEMG on 15/03/2017.
 */
public class busquedaLineal {

    private int[] datos;// Arreglo con la informacion.

    public int[] getDatos() {
        return datos;
    }

    public void setDatos(int[] datos) {
        this.datos = datos;
    }

    public busquedaLineal() {

    }

    public int busqueda(int busqueda) {
        int resultado = -1;

        // Se recorre el arreglo en la busqueda del numero introducido,
        // retorna la posicion en donde se encuentra el numero.
        for (int indice = 0; indice < datos.length; indice++) {
            if (datos[indice] == busqueda) {
                return indice;
            }
        }

        return resultado;
    }
}
