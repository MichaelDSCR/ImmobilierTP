public class Maison extends Batiment implements Habitable {
    private int nbPieces;

    // CONSTRUCTEURS
    public Maison() {
        super();
        this.nbPieces = 0;
    }

    public Maison(String adresse, int nbPieces) {
        super(adresse);
        this.nbPieces = nbPieces;
    }

    // ACCESSEURS
    public int getNbPieces() {
        return nbPieces;
    }

    // MUTATEURS
    public void setNbPieces(int nbPieces) {
        this.nbPieces = nbPieces;
    }

    // MÉTHODES
    @Override
    public String toString() {
        return super.toString() + ", Nombre de pièces : " + nbPieces;
    }

    @Override
    public String afficherInformation() {
        return "Informations de la maison : " + toString();
    }

    @Override
    public void occuper(int nombreDePersonnes) {
        System.out.println("La maison avec " + nbPieces + " pièces est maintenant occupée par " + nombreDePersonnes + " personnes.");
    }
}