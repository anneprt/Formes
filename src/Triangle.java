public class Triangle extends Forme {
    private int xB;
    private int yB;
    private int xC;
    private int yC;

    public Triangle() {
        xB = verifier("second sommet en X : ", 0, LARGEUR_ECRAN);
        yB = verifier("second sommet en Y : ", 0, HAUTEUR_ECRAN);
        xC = verifier("troisieme sommet en X : ", 0, LARGEUR_ECRAN);
        yC = verifier("troisieme sommet en Y : ", 0, HAUTEUR_ECRAN);
    }

    public Triangle(int nxa, int nya, int nxb, int nyb, int nxc, int nyc, int nc) {
        super(nxa, nya, nc);
        xB = verifier(nxb, 0, LARGEUR_ECRAN);
        yB = verifier(nyb, 0, HAUTEUR_ECRAN);
        xC = verifier(nxc, 0, LARGEUR_ECRAN);
        yC = verifier(nyc, 0, HAUTEUR_ECRAN);
    }

    public void afficher() {
        super.afficher();
        System.out.println("Position en " + xB + ", " + yB);
        System.out.println("Position en " + xC + ", " + yC);
    }

    public void deplacer(int nx, int ny) {
        super.deplacer(nx, ny);
        xB = verifier(xB + nx, 0, LARGEUR_ECRAN);
        yB = verifier(yB + ny, 0, HAUTEUR_ECRAN);
        xC = verifier(xC + nx, 0, LARGEUR_ECRAN);
        yC = verifier(yC + ny, 0, HAUTEUR_ECRAN);
    }

}
