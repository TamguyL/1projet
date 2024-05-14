public class Moteur {

    private int nbCylindre;
    private float volCylindre;

    public Moteur(int nbCylindre, float volCylindre) {
        this.nbCylindre = nbCylindre;
        this.volCylindre = volCylindre;
    }

    public int getNbCylindre() {
        return this.nbCylindre;
    }
    public float getVolCylindre() {
        return this.volCylindre;
    }
}
