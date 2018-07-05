import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Wystapienia {
    public static void main(String[] args) throws FileNotFoundException {


        File file = new File("Noris.txt");
        Scanner scanner = new Scanner(file);

        List<Integer> lista = new ArrayList<>();
        Set<Integer> lista2 = new TreeSet<>();

        while (scanner.hasNext()) {
            int liczba = scanner.nextInt();
            if (!lista.contains(liczba)) {
                lista2.add(liczba);
            }
            lista.add(liczba);


        }
        System.out.println(lista.toString());
        System.out.println(lista2.toString());

        Iterator<Integer> iterator = lista2.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();

            int frequency = Collections.frequency(lista, next);
            System.out.println(next + " liczba wystapien :" + frequency);
        }

    }


}
