public class Voiture {
    private String color;
    private String marque;
    private String anneeFabrication;
    private String carburant;
    private int quantiteDeCarburant = 0;
    private Moteur moteur;


    public Voiture() {
    }



    public Voiture(String color, String marque, String carburant, String anneeFabrication, Moteur moteur) {
        this.color = color;
        this.marque = marque;
        this.carburant = carburant;
        this.anneeFabrication = anneeFabrication;

        this.moteur = moteur;
    }
    

    public Voiture setQuantiteDeCarburant (int quantiteDeCarburant) {
        this.quantiteDeCarburant = quantiteDeCarburant;
        return this;
    }
    public void demarage() {
        if (quantiteDeCarburant > 0) {
            System.out.printf("En voiture Simone, VROUM! \n");
        } else {
            System.out.printf("Touse, touse, touse! \n");
        };
    }



    public Voiture setColor(String color) {
        this.color = color;
        return this;
    };
    public Voiture setMarque(String marque) {
        this.marque = marque;
        return this;
    };
    public Voiture setCarburant(String carburant) {
        this.carburant = carburant;
        return this;
    };
    public Voiture setAn(String anneeFabrication) {
        this.anneeFabrication = anneeFabrication;
        return this;
    };

    public String getColor() {
        return this.color;
    }
    public String getMarque() {
        return this.marque;
    }
    public String getCarburant() {
        return this.carburant;
    }
    public String getAn() {
        return this.anneeFabrication;
    }

    public void presentation() {
        System.out.printf("la voiture de marque : %s est de couleur %s fabrique en %s et roulant a %s \n",this.marque,this.color,this.anneeFabrication,this.carburant);
        System.out.printf("Cylindrée : %f - Nb de Cylindre %d \n",this.moteur.getVolCylindre(),this.moteur.getNbCylindre());
    }
}
