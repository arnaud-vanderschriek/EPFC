import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args) {
        // Réecrivez le même programme que pour l'exercice précédent, mais cette fois vous devez
        // assurer que l'utilisateur entre un nombre (strictement) positif pour n.
        // Vous devez l'obliger à recommencer si ce nombre n'est pas positif.

        Scanner scan = new Scanner(System.in);
        System.out.println("Veuillez entrez un nombre de valeur pour la moyenne: ");
        int nbVal = scan.nextInt();
        double sum = 0;
        int i = 1;

        while(nbVal <= 0) {
            System.out.println("Vous n'avez pas entré de valeur positive, Recommencez: ");
            nbVal = scan.nextInt();
        }

        while(i <= nbVal){
            System.out.println("Entrez une valeur: ");
            sum += scan.nextDouble();
            ++i;
        }

        System.out.println("La moyenne est de: " + sum / nbVal);
    }
}
