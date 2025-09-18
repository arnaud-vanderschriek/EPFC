import java.util.Scanner;

public class Exo5 {
    public static void main(String[] args) {
        // Ecrire un programme qui affiche tous les nombres entiers strictement positifs dont le carré est
        // inférieur à un nombre entier n entré par l'utilisateur. Si l'utilisateur entre 20, l'ordinateur affiche
        // 1 2 3 4

        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez un nombre entier strictement positif: ");
        int nb = scan.nextInt();
        int i = 1;
        while(nb <= 0) {
            System.out.print("Vous devez entrez un nombre entier positif: ");
            nb = scan.nextInt();
        }

        while(i * i < nb) {
            System.out.print(i + " ");
            ++i;
        }
    }
}
