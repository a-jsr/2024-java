public class Main3 {
    public static void main(String[] args) {
        CompteBancaire compte1 = new CompteBancaire("Loïc", 1000);
        compte1.retirer(500);
        compte1.deposer(300);
        
    }
}