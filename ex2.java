import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        // Programme affichant un triangle isocèle formé d'étoiles
        
        Scanner scanner = new Scanner(System.in);
        
        // Lecture de la hauteur du triangle
        System.out.print("Entrez la hauteur du triangle (nombre de lignes) : ");
        int hauteur = scanner.nextInt();
        
        // Affichage du triangle isocèle
        // Pour chaque ligne i (de 1 à hauteur) :
        // - (hauteur - i) espaces pour centrer
        // - (2*i - 1) étoiles
        for (int i = 1; i <= hauteur; i++) {
            // Affichage des espaces
            for (int j = 1; j <= hauteur - i; j++) {
                System.out.print(" ");
            }
            // Affichage des étoiles
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            // Passage à la ligne suivante
            System.out.println();
        }
        
        scanner.close();
    }
}

