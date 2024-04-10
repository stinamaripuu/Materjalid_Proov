import java.util.ArrayList;
import java.util.List;

public class Andmetüübid {
    public static void main(String[] args) {
        // Integerid ja Floatid
        Integer nr1 = 2;
        Float nr2 = 2.2F;
        Double nr3 = 2.2;


        String tervitus = "Tere";
        String ok = "aaaa";
        String tore = "a";
        String headaega = "Tsau :)";
        /*
        System.out.println(tervitus);
        System.out.println(ok);
        System.out.println(tore);
        System.out.println(headaega);

         */

        List<String> m1 = new ArrayList<String>();
        //["pliiats", "pastakas", "Tere!", "Mis", "on", "sinu", "nimi", "?"];
        m1.add("pliiats");
        m1.add("pastakas");
        m1.add("Tere!");
        m1.add("Mis");
        m1.add("on");
        m1.add("sinu");
        m1.add("nimi");
        m1.add("?");

        System.out.println(m1);

    }
}
