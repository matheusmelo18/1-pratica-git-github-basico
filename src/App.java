import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {

        List<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(2);
        numeros.add(4);
        numeros.add(3);
        numeros.add(5);

        System.out.println("Número de elementos repetidos: " + nroRepeat(numeros));
        System.out.println("Lista de elementos repetidos: " + listaRepeat(numeros));
    }

    // c - Método que retorna o número de elementos repetidos
    public static int nroRepeat(List<Integer> numeros) {
        Set<Integer> unique = new HashSet<>();
        Set<Integer> repeated = new HashSet<>();

        for (Integer num : numeros) {
            if (!unique.add(num)) {
                repeated.add(num);
            }
        }

        return repeated.size();
    }

    // d - Método que retorna uma lista de elementos repetidos
    public static List<Integer> listaRepeat(List<Integer> numeros) {
        Set<Integer> unique = new HashSet<>();
        Set<Integer> repeated = new HashSet<>();

        for (Integer num : numeros) {
            if (!unique.add(num)) {
                repeated.add(num);
            }
        }

        return new ArrayList<>(repeated);
    }
}
