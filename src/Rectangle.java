public class Rectangle extends Forme {
    private int largeur;
    private int hauteur;

    public Rectangle() {
        largeur = verifier("Largeur", 0, LARGEUR_ECRAN);
        hauteur = verifier("Hauteur", 0, HAUTEUR_ECRAN);

    }

    public Rectangle(int nx, int ny, int nl, int nh, int nc) {
        super(nx, ny, nc);
        largeur = verifier(nl, 0, LARGEUR_ECRAN);
        hauteur = verifier(nh, 0, HAUTEUR_ECRAN);
    }

    public void afficher() {
        super.afficher();
        System.out.println("Largeur du rectangle : " + largeur);
        System.out.println("Hauteur du rectangle : " + hauteur);
    }

    public double perimetre() {
        return 2 * (largeur + hauteur);
    }

    public double surface() {
        return largeur * hauteur;
    }
}
