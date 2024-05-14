// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.HashSet;

public class TestVoiture {
    public static void main(String[] args) {
        // Voiture v1 = new Voiture();
        // v1.setColor("noir")
        //     .setMarque("audi")
        //     .setCarburant("essence")
        //     .setAn("2011");
        // v1.presentation();
        Moteur moteur = new Moteur (2,4.4f);
        Voiture v2 = new Voiture("bleue", "HONDA","essence", "2003", moteur);
        v2.presentation();

        // Voiture v3 = new Voiture();
        // v3.setMarque("Porche");
        // v3.setQuantiteDeCarburant(10);
        // v3.demarage();

        // Voiture v4 = new Voiture();
        // v4.setMarque("Ford");
        // v4.demarage();

        // // generique avec operateur diamant
        // ArrayList<String> listCars = new ArrayList<String>();
        // listCars.add("BMW");
        // listCars.add("AUDI");
        // listCars.add("CITROEN");
        // System.out.println(listCars);

        // ArrayList<Voiture> listVoit = new ArrayList<Voiture>();
        // listVoit.add(v1);
        // listVoit.add(v2);
        // listVoit.add(v3);
        // listVoit.add(v4);
        // listVoit.forEach((c) -> {System.out.println(c.getMarque());} );

        // Voiture v5 = listVoit.get(0);
        // // listVoit.remove(0);
        // System.out.println(v5.getMarque());
        // System.out.println(listVoit.size());


        // HashMap<String, String> departements = new HashMap<String, String>();
        // departements.put("29", "finistère");
        // departements.put("22", "cote d'armor");
        // departements.put("35", "ille et villaine");
        // departements.put("56", "morbihan");
        // System.out.println(departements.get("29"));

        // HashSet<String> aux = new HashSet<String>();
        // aux.add("TOTO");
        // aux.add("XXX");
        // aux.add("TOTO");
        // System.out.println(aux);

    }
}
