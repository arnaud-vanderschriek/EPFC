import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exo1 {
    public static void main(String[] args) {
        // Ecrire un programme qui calcule la moyenne d'une série de n nombres entrés par
        // l'utilisateur. La valeur de n est fournie en préambule par l'utilisateur.
        // Par exemple si l'utilisateur veut calculer la moyenne de 8 nombres, il entre d'abord 8
        // et ensuite, les 8 nombres...

        Scanner scan = new Scanner(System.in);
        System.out.println("Veuillez entrer le nombre de valeur pour la moyenne: ");
        int nbVal = scan.nextInt();
        double sum = 0;
        int i = 1;

        while(i <= nbVal) {
            System.out.println("Entrez une valeur: ");
            sum += scan.nextDouble();
            ++i;
        }

        System.out.println("La moyenne est de: " + sum / nbVal);
    }
}