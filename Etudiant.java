public class Etudiant {
    private String nom;
    private String prenom;

    // Constructeur
    public Etudiant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    // Getter pour le nom
    public String getNom() {
        return nom;
    }

    // Getter pour le prénom
    public String getPrenom() {
        return prenom;
    }

    // Méthode pour afficher les informations de l'étudiant
    public void afficher() {
        System.out.println("Nom: " + nom + ", Prénom: " + prenom);
    }

    // Méthode equals pour comparer les étudiants par leur nom
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Etudiant etudiant = (Etudiant) obj;
        return nom.equals(etudiant.nom);
    }

    @Override
    public int hashCode() {
        return nom.hashCode();
    }
}
