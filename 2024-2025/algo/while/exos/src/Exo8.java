import java.util.Scanner;

public class Exo8 {
    public static void main(String[] args) {
        // Considérons que l'utilisateur entre une suite de nombres strictement positifs terminée par la valeur sentinelle
        // -1. On suppose, que la suite comporte au moins deux nombres (avant la sentinelle).
        // Il est inutile de vérifier. Ecrire un programme qui détermine si oui ou non, la suite est strictement
        // croissante. Faut il forcément attendre la sentinelle ou peut-on parfois répondre avant ?

        // nb  = scan
        // On rentre dans la boucle
        // On prend le suivant...
        // On le compare avec le précedent
        // si le suivant est plus petit que le précédent ou que le suivant == -1 => on arrète la boucle...
        // sinon on continue.
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez un nombre: ");

        int next = scan.nextInt();
        int prec = 0;
        while(next > prec) {
            prec = next;
            System.out.print("Entrez un nombre: ");
            next = scan.nextInt();
        }

        if(next == -1) {
            System.out.println("Le suite est croissante");
        } else {
            System.out.println("La suite n'est pas croissante");
        }
    }
}
