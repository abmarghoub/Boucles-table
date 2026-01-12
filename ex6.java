import java.util.Scanner;

public class ex6 {
    private static final int MAXV = 100000;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Lecture de n et k
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        // Lecture du tableau T
        int[] T = new int[n];
        for (int i = 0; i < n; i++) {
            T[i] = scanner.nextInt();
        }
        
        // Tableau de fréquences de taille MAXV+1
        int[] freq = new int[MAXV + 1];
        
        // Compteur du nombre de valeurs distinctes
        int distinct = 0;
        
        // Initialisation de la première fenêtre [0..k-1]
        for (int i = 0; i < k; i++) {
            int x = T[i];
            freq[x]++;
            // Si freq[x] passe de 0 à 1, c'est une nouvelle valeur distincte
            if (freq[x] == 1) {
                distinct++;
            }
        }
        
        // Affichage du résultat pour la première fenêtre
        System.out.print(distinct);
        
        // Glisser la fenêtre d'un cran vers la droite pour chaque i de k à n-1
        for (int i = k; i < n; i++) {
            // Retirer l'élément sortant T[i-k]
            int out = T[i - k];
            freq[out]--;
            // Si freq[out] devient 0, on a perdu une valeur distincte
            if (freq[out] == 0) {
                distinct--;
            }
            
            // Ajouter l'élément entrant T[i]
            int in = T[i];
            freq[in]++;
            // Si freq[in] devient 1, on a gagné une nouvelle valeur distincte
            if (freq[in] == 1) {
                distinct++;
            }
            
            // Affichage du résultat pour cette fenêtre
            System.out.print(" " + distinct);
        }
        
        System.out.println();
        
        scanner.close();
    }
}

