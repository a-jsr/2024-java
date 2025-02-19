import java.util.ArrayList;
import java.util.List;

public class GestionEtudiants {
    private List<Etudiant> listeEtudiants;

    // Constructeur
    public GestionEtudiants() {
        this.listeEtudiants = new ArrayList<>();
    }

    // Ajouter un étudiant
    public void ajouterEtudiant(Etudiant etudiant) {
        listeEtudiants.add(etudiant);
        System.out.println("Étudiant ajouté : " + etudiant.getNom());
    }

    // Afficher la liste des étudiants
    public void afficherListeEtudiants() {
        if (listeEtudiants.isEmpty()) {
            System.out.println("Aucun étudiant dans la liste.");
        } else {
            System.out.println("Liste des étudiants :");
            for (Etudiant etudiant : listeEtudiants) {
                etudiant.afficher();
            }
        }
    }

    // Supprimer un étudiant par son nom
    public void supprimerEtudiant(String nom) {
        Etudiant etudiantASupprimer = null;
        for (Etudiant etudiant : listeEtudiants) {
            if (etudiant.getNom().equalsIgnoreCase(nom)) {
                etudiantASupprimer = etudiant;
                break;
            }
        }

        if (etudiantASupprimer != null) {
            listeEtudiants.remove(etudiantASupprimer);
            System.out.println("Étudiant supprimé : " + nom);
        } else {
            System.out.println("Aucun étudiant trouvé avec le nom : " + nom);
        }
    }
}
