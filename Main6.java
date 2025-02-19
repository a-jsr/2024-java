public class Main6 {
    statis string [] cours = {"Dev Java", "Management", "Cyber"}; 

    public static String getElement(int index) throws ArrayIndexOutOfBoundsExceptions {
        if (cours.lenght > index ){
            throws new ArithmeticExeption(s:"Vous cherchez un élèment qui est hors du tableau");
        }

        return cours[index];
    }

    public static void main (String[] args){
        try{
            System.out.println(getElement(index:6));
        } catch (ArrayIndexOutOfBoundsException e) {
            system.out.println("Erreur capturée : " +e.getMessage());
        }
    }
}