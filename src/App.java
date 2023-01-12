import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {
        
        List<String> lista1 = new ArrayList<>();

        lista1.add("Morango");
        lista1.add("Uva");
        lista1.add("Acerola");
        lista1.add("Manga");
        lista1.add("Caju");

        List<String> lista2 = new ArrayList<>();

        lista2.add("Uva");
        lista2.add("Caju");
        lista2.add("Morango");
        lista2.add("Kiwi");
        lista2.add("Acerola");
        lista2.add("Maça");
        lista2.add("Manga");

        List<String> iguais = new ArrayList<>();

        for (int i = 0; i < lista1.size(); i++){
            if(lista2.contains(lista1.get(i))){
                iguais.add(lista1.get(i));
            }
        }

        System.out.println(iguais);

    }

}
