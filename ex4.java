import java.util.Scanner;

public class ex4 {
    
    // Méthode affiche : affiche les valeurs de t, à raison d'une ligne d'écran pour une ligne du tableau
    public static void affiche(double t[][]) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j]);
                if (j < t[i].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    // Méthode regulier : teste si le tableau t est régulier (toutes les lignes ont la même taille)
    public static boolean regulier(double t[][]) {
        if (t.length == 0) {
            return true; // Un tableau vide est considéré comme régulier
        }
        
        int premiereLongueur = t[0].length;
        for (int i = 1; i < t.length; i++) {
            if (t[i].length != premiereLongueur) {
                return false;
            }
        }
        return true;
    }
    
    // Méthode sommeLignes : renvoie un tableau contenant les sommes des différentes lignes de t
    public static double[] sommeLignes(double t[][]) {
        double[] sommes = new double[t.length];
        for (int i = 0; i < t.length; i++) {
            double somme = 0.0;
            for (int j = 0; j < t[i].length; j++) {
                somme += t[i][j];
            }
            sommes[i] = somme;
        }
        return sommes;
    }
    
    // Méthode somme : vérifie que t1 et t2 sont réguliers et de mêmes dimensions
    // et renvoie leur somme ; sinon renvoie null
    public static double[][] somme(double[][] t1, double[][] t2) {
        // Vérifier que les deux tableaux sont réguliers
        if (!regulier(t1) || !regulier(t2)) {
            return null;
        }
        
        // Vérifier qu'ils ont les mêmes dimensions
        if (t1.length != t2.length) {
            return null;
        }
        
        if (t1.length > 0 && t1[0].length != t2[0].length) {
            return null;
        }
        
        // Calculer la somme
        double[][] resultat = new double[t1.length][];
        for (int i = 0; i < t1.length; i++) {
            resultat[i] = new double[t1[i].length];
            for (int j = 0; j < t1[i].length; j++) {
                resultat[i][j] = t1[i][j] + t2[i][j];
            }
        }
        return resultat;
    }
    
    // Programme de test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Programme de test de la classe utilitaire ===\n");
        
        // Test 1 : Création et affichage d'un tableau
        System.out.println("Test 1 : Affichage d'un tableau");
        double[][] t1 = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}};
        System.out.println("Tableau t1 :");
        affiche(t1);
        System.out.println();
        
        // Test 2 : Test de régularité
        System.out.println("Test 2 : Test de régularité");
        System.out.println("t1 est régulier : " + regulier(t1));
        
        double[][] t2 = {{1.0, 2.0}, {3.0, 4.0, 5.0}}; // Tableau irrégulier
        System.out.println("Tableau t2 (irrégulier) :");
        affiche(t2);
        System.out.println("t2 est régulier : " + regulier(t2));
        System.out.println();
        
        // Test 3 : Somme des lignes
        System.out.println("Test 3 : Somme des lignes");
        double[] sommes = sommeLignes(t1);
        System.out.println("Sommes des lignes de t1 :");
        for (int i = 0; i < sommes.length; i++) {
            System.out.println("Ligne " + i + " : " + sommes[i]);
        }
        System.out.println();
        
        // Test 4 : Somme de deux tableaux
        System.out.println("Test 4 : Somme de deux tableaux");
        double[][] t3 = {{1.0, 1.0, 1.0}, {1.0, 1.0, 1.0}, {1.0, 1.0, 1.0}};
        System.out.println("Tableau t3 :");
        affiche(t3);
        
        double[][] somme = somme(t1, t3);
        if (somme != null) {
            System.out.println("Somme de t1 et t3 :");
            affiche(somme);
        } else {
            System.out.println("Impossible de faire la somme (tableaux incompatibles)");
        }
        System.out.println();
        
        // Test 5 : Test avec tableaux incompatibles
        System.out.println("Test 5 : Somme de tableaux incompatibles");
        double[][] t4 = {{1.0, 2.0}, {3.0, 4.0}};
        System.out.println("Tableau t4 :");
        affiche(t4);
        double[][] somme2 = somme(t1, t4);
        if (somme2 != null) {
            System.out.println("Somme de t1 et t4 :");
            affiche(somme2);
        } else {
            System.out.println("Impossible de faire la somme (dimensions différentes)");
        }
        
        scanner.close();
    }
}

