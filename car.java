public class car {
    // Attributs
    private String marque;
    private String modele;
    private int annee;
    private double vitesse;

    // Constructeur
    public car(String marque, String modele, int annee) {
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
        this.vitesse = 0.0;
    }

    // Méthodes
    public void accelerer(double increment) {
        vitesse += increment;
        System.out.println("La voiture accélère à " + vitesse + " km/h.");
    }

    public void freiner(double decrement) {
        vitesse -= decrement;
        if (vitesse < 0) {
            vitesse = 0;
        }
        System.out.println("La voiture ralentit à " + vitesse + " km/h.");
    }

    public void demarrer() {
        System.out.println("La voiture démarre.");
    }

    public void afficherInfos() {
        System.out.println("marque: " + marque + ", modele: " + modele + ", annee: " + annee + ", Vitesse: " + vitesse + " km/h");
    }
}
