import java.util.Scanner;

public class Ask {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print( "Entrez votre nom : ");
        String nom = scanner.nextLine();

        System.out.print( "Entrez votre age : ");
        int age = scanner.nextInt();

        String statut = (age >= 18) ? "majeur" : "mineur";

        System.out.println("Bonjour " + nom + ", vous avez " + age + " ans, et vous êtes " + statut + ".");

        scanner.close();
    }
}