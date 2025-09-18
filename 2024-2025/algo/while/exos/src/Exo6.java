import java.util.Scanner;

public class Exo6 {
    public static void main(String[] args) {
        // On suppose que l'utilisateur entre une suite d'entier positifs, terminée par la valeur sentinelle -1.
        // Votre programme doit afficher le dernier nombre (hormis le -1) entré par l'utilisateur.
        // Si l'utilisateur entre 5 3 4 1 6 3 -1, l'ordinateur affiche: "Le dernier est 3". Que fait votre programme si
        // l'utilisateur entre uniquement -1 ?

        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez un nombre: ");
        int nb = scan.nextInt();

        if(nb == -1) {
            System.out.println("Pas de nombre, pas de dernier!");
        } else {
            int tmp = 0;
            while(nb != -1) {
                tmp = nb;
                System.out.print("Entrez un nombre: ");
                nb = scan.nextInt();
            }

            System.out.print("Le dernier nombre était: " + tmp);
        }
    }
}

// On peut faire une version ou l'on oblige l'utilisateur a entrer un nombre avant le -1
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Entrer une suite de nombres positifs (terminer par -1):");
//        int x = scan.nextInt();
//        while (x == -1) {
//            System.out.println("Il faut au moins un nombre avant le -1");
//            x = scan.nextInt();
//        }
//        int dernier = x;
//        x = scan.nextInt();
//        while (x != -1) {
//            dernier = x;
//            x = scan.nextInt();
//        }
//        System.out.println("Le dernier était: " + dernier);
//    }
