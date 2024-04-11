package andmetüübid_ülesanded; /*********************************************************
 * Teema: + ja -, * ja /
 ********************************************************/

/**
 * Ülesandeks on leida Smart auto, tavalise auto ja mahtuniversaali puhul
 * palju kaalub auto koos ja ilma rehvide ja velgedetta
 * NB! Vastused tuleb anda kilogrammides
 * <p>
 * Smart autol on kõige väiksemad võimalikud rehvid, mahtuniversaalil kõige suuremad
 * ja tavalisel autol on keskmised
 */

public class Autokaal {

    public static void main(String[] args) {
        // Proovime arvutamist!!
        // Keskmised rehvide/velgede kaalud: https://www.byways.org/how-much-does-a-tire-weigh/#:~:text=How%20Much%20Does%20the%20Whole,around%2035%20to%2055%20pounds.
        // Kerskmised autode kaalud: https://www.insurancenavy.com/average-car-weight/
        // Võtame kaalude vahemikud:
        int rehvMadal = 15;
        int rehvKõrge = 25;
        int velgMadal = 20;
        int velgKõrge = 30;

        int smartAutoKaal = 1500;
        int tavalineAutoKaalMadal = 2600;
        int tavalineAutoKaalKõrge = 3000;
        int mahtuniversaalAutoKaalMadal = 3000;
        int mahtuniversaalAutoKaalKõrge = 3500;

        // 1 kg on võrdne 2.20462 poundiga

        /**
         * Ülesandeks on leida Smart auto, tavalise auto ja mahtuniversaali puhul
         * palju kaalub auto koos ja ilma rehvide ja velgedetta
         * NB! Vastused tuleb anda kilogrammides
         *
         * Smart autol on kõige väiksemad võimalikud rehvid, mahtuniversaalil kõige suuremad
         * ja tavalisel autol on keskmised
         */

        // Lahendus
        // Loome muutujad väikeRatas, keskRatas, suurRatas, et arvutada
        // Meil on vaja leida kolm erinevat rehv+velg kaalu: NB! Need on vaid ühe revi kaalud
        int väikeRatas = rehvMadal + velgMadal;
        int keskRatas = (((rehvMadal + rehvKõrge) / 2) + ((velgMadal + velgKõrge) / 2)); // Miks double?? - sest jagamisel võib tekkida mitte-täisarv, mis ei sobi meile
        int suurRatas = rehvKõrge + velgKõrge;

        // Loome muutujad tavalise auto keskmiseks kaaluks ja mahtuniversaali keskmiseks kaaluks
        // Muutujateks paneme tavaKeskKaal ja mahtKeskKaal
        int tavaKeskKaal = (tavalineAutoKaalMadal + tavalineAutoKaalKõrge) / 2;
        int mahtKeskKaal = (mahtuniversaalAutoKaalMadal + mahtuniversaalAutoKaalKõrge) / 2;

        // Arvutame iga auto kohta keskmise kaalu
        int smart = väikeRatas * 4 + smartAutoKaal;
        int tavaline = keskRatas * 4 + tavaKeskKaal;
        int mahtuniversaal = suurRatas * 4 + mahtKeskKaal;

        System.out.println("Smart auto: rehvide kaal " + väikeRatas + ", auto keskmine " + smartAutoKaal + ", auto kogukaal: " + smart);
        // Et teha kogu eelmisest reast duplikaat, tuleb klikata reale ja vajutada klahvikombinatsiooni ctrl + d
        System.out.println("Keskmine auto: rehvide kaal " + keskRatas + ", auto keskmine " + tavaKeskKaal + ", auto kogukaal: " + tavaline);
        System.out.println("Mahtuniversaal: rehvide kaal " + suurRatas + ", auto keskmine " + mahtKeskKaal + ", auto kogukaal: " + mahtuniversaal);

        System.out.println(smart%2);
        System.out.println(tavaline%2);
        System.out.println(mahtuniversaal%2);
        System.out.println(5%2);


    }
}
