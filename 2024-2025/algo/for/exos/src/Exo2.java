import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args) {
        // Récrire un programme qui calcule la moyenne d'une série de n nombres entrés par l'utilisateur.
        // La valeur de n est fournie en préambule par l'utilisateur (cf boucle while)
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez le nombre de notes à insérer: ");
        int n = scan.nextInt();
        if(n == 0) {
            System.out.println("Pas de nombre, pas de moyenne");
        } else {
            int somme = 0;
            for(int i = 1; i <= n; ++i) {
                System.out.print("Entrez une note: ");
                somme += scan.nextInt();
            }
            System.out.println("La moyenne est de: " + (double) somme / n);
        }
    }
}
