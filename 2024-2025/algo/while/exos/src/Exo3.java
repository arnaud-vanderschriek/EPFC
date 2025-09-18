import java.util.Scanner;

public class Exo3 {
    public static void main(String[] args) {
        // Ecrire un programme qui détermine la plus grande valeur de n telle que la somme des n
        // premiers entiers positifis soit inférieure à un nombre max (entier positif) entré par
        // l'utilisateur. Par exemple si l'utilisateur entre la valeur 20, la réponse est 5
        // car 1 + 2 + 3 + 4 + 5 = 15 alors que 1 + 2 + 3 + 4 + 5 + 6 = 21

        Scanner scan = new Scanner(System.in);

        System.out.println("Veuillez entrez un nombre max: ");
        int nbMax = scan.nextInt();
        int i = 1, value = 0;
        while(value + i < nbMax) {
            value += i;
            ++i;
        }

        System.out.println("la somme des entiers de 1 a " + (i - 1)
                + "reste inférieur a " + nbMax);
    }
}
