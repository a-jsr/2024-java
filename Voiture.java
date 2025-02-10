public class Voiture {
    // Attributs
    private String couleur;
    private String modele;
    private String marque;

    // Constructeur
    public Voiture(String couleur, String modele, String marque) {
        this.couleur = couleur;
        this.modele = modele;
        this.marque = marque;
    }

    // Méthodes
    public void demarrer() {
        System.out.println("La voiture " + marque + " " + modele + " de couleur " + couleur + " démarre !");
    }

    // Getters (si nécessaire pour accéder aux attributs)
    public String getCouleur() {
        return couleur;
    }

    public String getModele() {
        return modele;
    }

    public String getMarque() {
        return marque;
    }
}
