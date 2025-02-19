import java.io.*;
import java.util.*;

public class GestionProduits {
    private static final String FICHIER_PRODUITS = "produits.txt";

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Afficher les produits");
            System.out.println("2. Ajouter un produit");
            System.out.println("3. Quitter");
            System.out.print("Choisissez une option : ");
            int choix = scanner.nextInt();
            scanner.nextLine();

            if (choix == 1) {
                afficherProduits();
            } else if (choix == 2) {
                System.out.print("Nom : ");
                String nom = scanner.nextLine();
                System.out.print("Prix : ");
                String prix = scanner.nextLine();
                ajouterProduit(nom, prix);
            } else if (choix == 3) {
                System.out.println("Fin du programme.");
                break;
            } else {
                System.out.println("Option invalide, réessayez.");
            }
        }
    }

    private static void afficherProduits() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(FICHIER_PRODUITS));
        String ligne;
        while ((ligne = br.readLine()) != null) {
            System.out.println(ligne);
        }
        br.close();
    }

    private static void ajouterProduit(String nom, String prix) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(FICHIER_PRODUITS, true));
        bw.write(nom + "," + prix);
        bw.newLine();
        bw.close();
        System.out.println("Produit ajouté avec succès.");
    }
}
