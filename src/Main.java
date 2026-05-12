import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Créer le scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Créer un objet Random pour générer un nombre aléatoire
        Random random = new Random();

        // Générer un nombre aléatoire entre 1 et 100
        int nombreSecret = random.nextInt(100) + 1;

        System.out.println("=== Jeu de devinettes ===");
        System.out.println("Trouve le nombre secret entre 1 et 100.");
        System.out.println("Tu as 10 essais. Bonne chance !");
        System.out.println("=========================");

        // Boucle principale : maximum 10 essais
        for (int essai = 1; essai <= 10; essai++) {

            System.out.print("\nEssai " + essai + "/10 : ");

            // Lire la proposition de l'utilisateur
            int proposition = scanner.nextInt();

            // Comparer la proposition au nombre secret
            if (proposition == nombreSecret) {
                // L'utilisateur a trouvé le bon nombre
                System.out.println("Bravo ! Tu as gagne en " + essai + " essai(s) !");
                scanner.close();
                return;

            } else if (proposition > nombreSecret) {
                // La proposition est trop grande
                System.out.println("Trop grand ! Essaie un nombre plus petit.");

            } else {
                // La proposition est trop petite
                System.out.println("Trop petit ! Essaie un nombre plus grand.");
            }
        }

        // L'utilisateur a épuisé ses 10 essais
        System.out.println("\nPerdu ! Tu as utilise tous tes essais.");
        System.out.println("Le nombre secret etait : " + nombreSecret);

        scanner.close();
    }
}