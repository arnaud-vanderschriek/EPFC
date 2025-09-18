import java.util.Scanner;

public class Exo4 {
    public static void main(String[] args) {
        // Ecrire un programme qui calcule la moyenne d'une série de nombres entiers positifs entrés
        // par l'utilisateur. L'utilisateur ne sait pas à l'avance combien de nombres il compte
        // entrer mais comme ces nombres sont tous positif, il est convenu que l'utilisateur
        // indique son intention d'arrêter la saisie par le nombre -1.
        // Ce dernier nombre ne fait pas partie de la série et ne doit pas être compté dans
        // la moyenne. Il sert juste à identifier la fin de la série. On l'appelle une sentinelle.
        // Si par exemple l'utilisateur tape 15 9 12 4 15 -1 l'ordinateur calcule la moyenne des 5
        // premiers nombres et répond 11.

        Scanner scan = new Scanner(System.in);
        int somme = 0, cpt = 0;

        System.out.print("Entrez une note: ");
        int val = scan.nextInt();

        while(val != -1) {
            somme += val;
            ++cpt;
            System.out.print("Entrez une note: ");
            val = scan.nextInt();
        }

        if(cpt == 0) {
            System.out.println("Pas de nombre, pas de moyenne!");
        } else {
            System.out.print("La moyenne est de: " + (double) somme / cpt);
        }
    }
}
