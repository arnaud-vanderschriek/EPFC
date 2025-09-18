import java.util.Scanner;

public class Exo7 {
    public static void main(String[] args) {
        // On suppose que l'utilisateur entre une suite d'entiers positifs, terminée par la valeur sentinelle -1.
        // Votre programme doit comparer le premier et le dernier élément de la suite et afficher l'un des messages suivants

        // - Le premier est inférieur au dernier
        // - Le premier est égale au dernier
        // - Le premier est supérieur au dernier
        // La suite est vide

        // La suite est vide si le premier nombre entré est -1. Si la suite ne compte qu'un élément, on considère que le
        // premier est égal au dernier.

        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez un nombre: ");
        int nb = scan.nextInt();

        if(nb == -1) {
            System.out.println("La suite est vide");
        } else {
            int premier = nb;
            int dernier = 0;
            while(nb != -1) {
                dernier = nb;
                System.out.print("Entrez un nombre: ");
                nb = scan.nextInt();
            }

            if(premier < dernier) {
                System.out.println("Le premier est inférieur au dernier");
            } else if (premier == dernier) {
                System.out.println("Le premier est égal au dernier");
            } else {
                System.out.println("Le premier est supérieur au dernier");
            }
        }
    }
}
