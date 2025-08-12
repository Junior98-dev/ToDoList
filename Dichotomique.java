package coreapi;

public class Dichotomique {



    public static int recherche_dichotomique(int [] a, int b) {
        var gauche = 0;
        var droite = a.length - 1;

        System.out.println("gauche: " + gauche);
        System.out.println("Droite: " + droite);

        while (gauche <= droite) {
            int milieu = (gauche + droite) / 2; // Determination du milieu

            System.out.println("milieu: " + milieu);

            if (a[milieu] == b) {
                /**
                 * On a trouvé b dans le tableau
                 * à la position milieu
                 */
                return milieu;
            }else if(a[milieu] < b) {
                // on cherche entre gauche et milieu + 1
                gauche = milieu + 1; // cherche à gauche
            }
            else {
                // on cherche entre droite et milieu - 1
                droite = milieu - 1; // cherche à droite
            }
        }

        return -1;
    };
    public static void main(String[] args) {
        int[] tableau = {3, 3, 5, 6, 8, 11, 13, 14, 14, 17, 19, 21, 23};
        int cherche = 14;

        int result = recherche_dichotomique(tableau, cherche);


        System.out.println("Resultat : " + result);
        if (result != -1) {
            System.out.println("Élément trouvé à l'index : " + result);
        } else {
            System.out.println("Élément non trouvé");
        }
    }
}
