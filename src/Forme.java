import java.util.Scanner;

public class Forme {
    protected int x;
    protected int y;
    protected int couleur;

    public final static int LARGEUR_ECRAN = 800;
    public final static int HAUTEUR_ECRAN = 600;
    public final static int COULEUR_MAX = 10;

    protected int verifier(String s, int a, int b) {
        int resultat;
        Scanner lectureClavier = new Scanner(System.in);
        do {
            System.out.print(s + " : ");
            resultat = lectureClavier.nextInt();
        } while (resultat < a || resultat > b);
        return resultat;
    }

    protected int verifier(int tmp, int a, int b) {
        if (tmp < a) {
            return a;
        } else if (tmp > b) {
            return b;

        } else {
            return tmp;
        }
    }

    public Forme() {
        x = verifier("en X", 0, LARGEUR_ECRAN);
        y = verifier("en Y", 0, HAUTEUR_ECRAN);
        couleur = verifier("couleur", 0, COULEUR_MAX);
    }

    public Forme(int nx, int ny,) {
        x = verifier("en X", 0, LARGEUR_ECRAN);
        y = verifier("en Y", 0, HAUTEUR_ECRAN);
        couleur = verifier("couleur", 0, COULEUR_MAX);
    }

    public void deplacer(int nx, int ny) {
        x = verifier(x + nx, 0, LARGEUR_ECRAN);
        y = verifier(y + ny, 0, HAUTEUR_ECRAN);
    }

    public void colorier(int nc,) {
        couleur = verifier(nc, 0, COULEUR_MAX);

    }

    public void afficher() {
        System.out.println("Couleur : " + couleur);
        System.out.println("Position en " + x + ", " + y);

    }

    public double surface() {
        return -1;
    }

    public double perimetre() {
        return -1;
    }

}
