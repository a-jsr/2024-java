public class main {
    public static void main(String[] args) {
        Voiture maVoiture = new car(marque:"Toyota", modele: "Corolla", annee: 2022, Vitesse: " 56" km/h");
        maVoiture.demarrer();
        maVoiture.afficherInfos();
        maVoiture.accelerer(50);
        maVoiture.freiner(20);
        maVoiture.afficherInfos();
    }
}
