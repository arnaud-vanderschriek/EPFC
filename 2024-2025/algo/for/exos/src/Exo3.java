import java.util.Scanner;

public class Exo3 {
    public static void main(String[] args) {
        // Ecrire un programme qui détermine le minimum d'une série de n nombres entiers entrés par l'utilisateur.
        // Par exemple, si l'utilisateur entre:
        // 8
        // 5 9 -1 0 12 -7 -4 3
        // l'ordinateur affiche -7

        Scanner scan = new Scanner(System.in);
        System.out.print("Combien y aura-t-il de nombres ?: ");
        int n = scan.nextInt(); // 5
        int min = 0;
        for(int i = 1; i <= n; ++i) {
            System.out.print("Entrez un nombre: ");
            int nb = scan.nextInt();
            min = nb;
            if()

        }
    }
}
