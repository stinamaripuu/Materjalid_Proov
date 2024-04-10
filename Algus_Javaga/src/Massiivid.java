import java.util.ArrayList;
import java.util.List;

public class Massiivid {
    public static void main(String[] args) {
        // Loome tavalise täisarvude massiivi
        List<Integer> täisarvud = new ArrayList<>();
        System.out.println(täisarvud); // Algselt on meil tühi list

        // Lisame sinna elemente ilma täiendavate juhisteta
        täisarvud.add(5);
        täisarvud.add(0);
        täisarvud.add(33);
        //täisarvud.add(6.2); // problemaatiline rida. Miks? Paranda ära :))
        täisarvud.add(6);  // või 62 jne aga komakohti ei tohi olla!!
        System.out.println(täisarvud); // väljund: [5, 0, 33, 6] Näeme, et kõik elemendid on järjest lisatud listi, nii nagu tahtsime

        täisarvud.add(1, 88);
        System.out.println(täisarvud); // väljund: [5, 88, 0, 33, 6] Indeksile 1 lisati element 88, teised nihkusid edasi

        täisarvud.remove(0); // Kustutame elemendi indeksilt 0
        System.out.println(täisarvud); // väljund: [88, 0, 33, 6]

        int kustutatud = täisarvud.remove(2); // Kustutame elemendi indeksilt 2 aga jätame meelde, mis element see oli
        System.out.println(täisarvud); // väljund: [88, 0, 6]
        System.out.println(kustutatud); // väljund: 33

        System.out.println(täisarvud.size()); // väljund: 3
        täisarvud.remove(täisarvud.size()-1); // Kuidas viimast elementi listist kusututada
        // .size() annab listi pikkuse, kuna lugemine algab 0-st ja soovime kustutada viimast elementi, lisame ka -1
        // kui .size() andis 3 ja -1, siis kustutame elemendi indeksil 2.
        System.out.println(täisarvud); // väljund: [88, 0]

        // Kõik see kehtib samuti ka Stringide kohta



    }
}
