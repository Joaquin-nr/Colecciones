import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
public class MAIN {
    public static void main(String[] args) {
        LinkedList lista = new LinkedList();

        Random numeroA = new Random();
        int numero;

        // lista de 25 elementos
        for(int i = 0; i < 25; i++){
            numero = numeroA.nextInt(100)+1; // ingresar numeros aleatorios 0 - 100
            lista.add(numero);
        }
        // Ordenar lista
        Collections.sort(lista);

        System.out.println("Lista de "+lista.size() + " elementos\n" + lista);
        // sumar
        int suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma += (int) lista.get(i);

        }
        float s = suma;
        float promedio = (float)(s/lista.size());

        System.out.println("la suma es: " + suma + "\nPromedio: " + promedio);
    }
}
