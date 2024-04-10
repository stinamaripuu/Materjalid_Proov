package andmetüübid_ülesanded; // Ebaoluline, näitab, et see klass asub selles kasutas.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*********************************************************
 * Javaga alustamine
 * 10. klass, 23/24 kevad
 *
 * Teema: Andmetüübid -> Massiivid
 * Autor: Pääsu Lind
 *
 * Lisainfo: Java õppimise kursus,
 * Sain motivatsiooni Stack Overflowst, postitus: wwww.blebleble.com
 ********************************************************/


public class Ilmaandmed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Loome listi, kuhu hakkame välistemperatuuri lisama, täisarvulistena
        List<Integer> temperatuurid = new ArrayList<>();
        System.out.println("Sisesta selle temperatuur: "); // Palume kasutajalt sisendit
        Integer temp = Integer.valueOf(scanner.nextInt()); // Peale seda kui kasutaja on numbri sisestanud ja "ENTER"-it vajutanud, on väärtus antud
        temperatuurid.add(temp); // Lisame temperatuuri oma listi
        // Kordame veel paar korda küsimist -> sisestamist -> kirja panemist
        System.out.println("Sisesta selle temperatuur: ");
        temp = Integer.valueOf(scanner.nextInt());
        temperatuurid.add(temp);
        System.out.println("Sisesta selle temperatuur: ");
        temp = Integer.valueOf(scanner.nextLine()); // Võime kasutada ka nextLine()
        temperatuurid.add(temp);

        System.out.println("Sisestatud temperatuurid olid: ");
        System.out.println(temperatuurid); // Prindime saadud väärtused
    }
}
