import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Wystapienia {
    public static void main(String[] args) throws FileNotFoundException {


        File file = new File("Noris.txt");
        Scanner scanner = new Scanner(file);

        List<Integer> lista = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();

        while (scanner.hasNext()) {
            int liczba = scanner.nextInt();
            if (!lista.contains(liczba)) {
                lista2.add(liczba);
            }
            lista.add(liczba);


        }
        System.out.println(lista.toString());
//        System.out.println(lista2.toString());

        int i = 0;
        while (i < lista2.size()) {
            int frequency = Collections.frequency(lista, lista2.get(i));
            System.out.println(lista2.get(i) + " liczba wystapien :" + frequency);
            i++;
        }
    }


}
