import java.util.Arrays;

public class Sõned {
    public static void main(String[] args) {
        String algTekst = "Java on lahe programmeerimiskeel!";

        // Leiame teksti pikkuse: teeme uue muutuja tekstiPikkus. Sõne pikkuse leiame .length() funktsiooniga
        Integer tekstiPikkus = algTekst.length();
        System.out.println(tekstiPikkus); // See rida peaks väljastama 33

        // Otsime tekstist mingil kindlal asukohal olevat märki
        Character suvalineMärk = algTekst.charAt(2);
        System.out.println(suvalineMärk); // Väljastab 'v'

        // Kas kaks sõne on samasugused?
        String s1 = "Tere!";
        String s2 = "Tere.";
        String s3 = "Tere!";

        Boolean equals1 = s1.equals(s2);
        Boolean equals2 = s1.equals(s3);
        System.out.println(equals1); // Leia, millised on omavahel võrdsed!

        // Liidame stringe
        String osa1 = "Java on";
        String osa2 = "lahe programmeerimiskeel!";
        String kokku = osa1.concat(osa2);
        System.out.println(kokku); // NB! paneme tähele, et väljund on "Java onlahe programmeerimiskeel!", kuidas parandada?
        // Pea meeles, et arvuti teeb täpselt ja ainult seda, mida sa tal teha palud. K.a vahede lisamine.

        // Kas tekst sisaldab midagi? Saad kasutada pika teksti sees ctrl+f -i ;))
        boolean on = osa1.contains("on");
        System.out.println(on);

        // Leiame mis kohal 'on' meie tekstis sisaldub
        int o = osa1.indexOf('o');
        System.out.println(o); // o asub 5ndal indeksil

        // Asendame teksti
        String uusTekst = osa1.replace('a', 'd'); // Muudame tekstis 'Java on', kõik a-d d-deks.
        System.out.println(uusTekst); // Uus muudetud tekst on 'Jdvd on'
        System.out.println(osa1); // Vana tekst on muutmata

        // Kui ei tekitaks uut Stringi, oleks tulemus selline:
        String vanaTekst = "Java on";
        vanaTekst = vanaTekst.replace('a', 'd'); // Peame vanale muutujale andma uue teksti väärtuse, kuid võime muutujanime samaks jätta
        System.out.println(vanaTekst);

        // Tutvune StringBuilderiga, mis on Javas juba olemasolev andmetüüp, millel on oma kasulikud funktsioonid
        // Nii saame muuta teksti järjekorda
        StringBuilder osa3 = new StringBuilder(); // Deklareerime elemendi
        osa3.append(osa1);
        osa3.reverse();
        System.out.println(osa3);

        // Liidame nüüd paar erinevat osakest kokku
        // Funktsioon String.join(delimiter, elements:    , , , , ) liidab kokku elemendid selles järjekorras kui need talle ette annad
        // Esimene elementi loetakse 'delimiter'iks, see tähendab et see sõne pannakse iga osa vahele
        String kõikKokku = String.join("",osa1, osa2, osa3); // Vahele ei panda midagi, '' tähendab tühja sõnet
        System.out.println(kõikKokku);
        String kõikKokku2 = String.join(" ",osa1, osa2, osa3); // Sõnede vahele lisatakse ' ' tühikud.
        System.out.println(kõikKokku2);

        // Vaatame, kuidas kiirelt sõnest mingi info eemaldada.
        String pikkTekst = "   Siin on hästi palju ja tüütut  teksti     erinevate vahedega \\n  ss  ";
        pikkTekst = pikkTekst.strip(); // Tekstilt eemaldatakse eelnevad ja järgnevad tühikud
        System.out.println(pikkTekst);

        // Proovime oma pikka teksti jupikesteks teha
        String[] pikkTekstJupid = pikkTekst.split(" "); // Teeme teksti tühikute kohtadelt jupikesteks
        String[] juppideks2 = osa1.split(" ");
        System.out.println(pikkTekstJupid);
        System.out.println(Arrays.toString(pikkTekstJupid));
        System.out.println(Arrays.toString(juppideks2));






    }
}
