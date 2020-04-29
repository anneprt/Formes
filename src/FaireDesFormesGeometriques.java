public class FaireDesFormesGeometriques {
    public static void main(String[] args) {

        Cercle C = new Cercle(105, 105, 20, 10);
        C.afficher();
        C.deplacer(100, 100);
        C.afficher();
        if (C.perimetre() >= 0 || C.surface() >= 0) {
            System.out.println("Le périmètre de C vaut " + C.perimetre());
            System.out.println("La surface de C vaut " + C.surface());
        } else {
            System.out.println("Calcul impossible");
        }

        Rectangle R = new Rectangle(100, 100, 50, 20, 5);
        R.afficher();
        R.deplacer(200, 200);
        R.afficher();
        if (R.perimetre() >= 0 || R.surface() >= 0) {
            System.out.println("Le périmètre de R vaut " + R.perimetre());
            System.out.println("La surface de R vaut " + R.surface());
        } else {
            System.out.println("Calcul impossible");
        }

        Triangle T = new Triangle(200, 200, 100, 300, 300, 300, 2);
        T.afficher();
        T.deplacer(300, 300);
        T.afficher();


    }
}
