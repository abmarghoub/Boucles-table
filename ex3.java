import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        // Programme créant un tableau avec les carrés des n premiers nombres impairs
        
        Scanner scanner = new Scanner(System.in);
        
        // Lecture de la valeur de n
        System.out.print("Combien de valeurs : ");
        int n = scanner.nextInt();
        
        // Création du tableau pour stocker les carrés
        int[] carres = new int[n];
        
        // Calcul des carrés des n premiers nombres impairs
        for (int i = 0; i < n; i++) {
            int nombreImpair = 2 * i + 1;  // Les nombres impairs : 1, 3, 5, 7, 9, ...
            carres[i] = nombreImpair * nombreImpair;
        }
        
        // Affichage des valeurs au format demandé
        for (int i = 0; i < n; i++) {
            int nombreImpair = 2 * i + 1;
            System.out.println(nombreImpair + " a pour carre " + carres[i]);
        }
        
        scanner.close();
    }
}

