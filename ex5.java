import java.util.Scanner;

public class ex5 {
    
    // Rotation de 90° dans le sens horaire en place
    // Méthode : transposition puis renversement de chaque ligne
    public static void rotate90ClockwiseInPlace(int[][] A) {
        int N = A.length;
        
        // Étape 1 : Transposition (échanger A[i][j] et A[j][i] pour i < j)
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        
        // Étape 2 : Renverser chaque ligne (échanger A[i][j] et A[i][N-1-j])
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N / 2; j++) {
                int temp = A[i][j];
                A[i][j] = A[i][N - 1 - j];
                A[i][N - 1 - j] = temp;
            }
        }
    }
    
    // Bonus : Rotation de 90° dans le sens anti-horaire en place
    // Méthode : renversement de chaque ligne puis transposition
    public static void rotate90CounterClockwiseInPlace(int[][] A) {
        int N = A.length;
        
        // Étape 1 : Renverser chaque ligne
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N / 2; j++) {
                int temp = A[i][j];
                A[i][j] = A[i][N - 1 - j];
                A[i][N - 1 - j] = temp;
            }
        }
        
        // Étape 2 : Transposition
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
    }
    
    // Bonus : Rotation de 180° en place
    // Méthode : renverser chaque ligne puis renverser chaque colonne
    // (ou simplement deux rotations de 90° horaire)
    public static void rotate180InPlace(int[][] A) {
        int N = A.length;
        
        // Renverser chaque ligne
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N / 2; j++) {
                int temp = A[i][j];
                A[i][j] = A[i][N - 1 - j];
                A[i][N - 1 - j] = temp;
            }
        }
        
        // Renverser chaque colonne
        for (int j = 0; j < N; j++) {
            for (int i = 0; i < N / 2; i++) {
                int temp = A[i][j];
                A[i][j] = A[N - 1 - i][j];
                A[N - 1 - i][j] = temp;
            }
        }
    }
    
    // Méthode pour afficher la matrice
    public static void afficherMatrice(int[][] A) {
        int N = A.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(A[i][j]);
                if (j < N - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Lecture de N
        int N = scanner.nextInt();
        
        // Lecture de la matrice N×N
        int[][] matrice = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrice[i][j] = scanner.nextInt();
            }
        }
        
        // Rotation de 90° dans le sens horaire
        rotate90ClockwiseInPlace(matrice);
        
        // Affichage de la matrice après rotation
        afficherMatrice(matrice);
        
        scanner.close();
    }
}

