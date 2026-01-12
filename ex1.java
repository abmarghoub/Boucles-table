import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        // Programme calculant la somme des n premiers termes de la série harmonique
        // 1 + 1/2 + 1/3 + 1/4 + ... + 1/n
        
        Scanner scanner = new Scanner(System.in);
        
        // Lecture de la valeur de n
        System.out.print("Entrez la valeur de n : ");
        int n = scanner.nextInt();
        
        // Calcul de la somme de la série harmonique
        double somme = 0.0;
        for (int i = 1; i <= n; i++) {
            somme += 1.0 / i;
        }
        
        // Affichage du résultat
        System.out.println("La somme des " + n + " premiers termes de la série harmonique est : " + somme);
        
        scanner.close();
    }
}

