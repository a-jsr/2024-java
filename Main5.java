import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestionEtudiants gestion = new GestionEtudiants();

        while (true) {
            // Menu principal
            System.out.println("\nMenu:");
            System.out.println("1. Ajouter un étudiant");
            System.out.println("2. Afficher la liste des étudiants");
            System.out.println("3. Supprimer un étudiant par son nom");
            System.out.println("4. Quitter");
            System.out.print("Choisissez une option (1-4): ");

            int choix = scanner.nextInt();
            scanner.nextLine(); // Consommer la ligne restante

            switch (choix) {
                case 1:
                    // Ajouter un étudiant
                    System.out.print("Entrez le nom de l'étudiant : ");
                    String nom = scanner.nextLine();
                    System.out.print("Entrez le prénom de l'étudiant : ");
                    String prenom = scanner.nextLine();
                    Etudiant etudiant = new Etudiant(nom, prenom);
                    gestion.ajouterEtudiant(etudiant);
                    break;
                case 2:
                    // Afficher la liste des étudiants
                    gestion.afficherListeEtudiants();
                    break;
                case 3:
                    // Supprimer un étudiant par son nom
                    System.out.print("Entrez le nom de l'étudiant à supprimer : ");
                    String nomASupprimer = scanner.nextLine();
                    gestion.supprimerEtudiant(nomASupprimer);
                    break;
                case 4:
                    // Quitter
                    System.out.println("Au revoir !");
                    scanner.close();
                    return;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        }
    }
}
