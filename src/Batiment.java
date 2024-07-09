public class Batiment {
    private String adresse;
    private static int nombreTotalDeBatiments = 0;

    // CONSTRUCTEURS
    public Batiment() {
        this.adresse = "";
        nombreTotalDeBatiments++;
    }

    public Batiment(String adresse) {
        this.adresse = adresse;
        nombreTotalDeBatiments++;
    }

    // ACCESSEURS
    public String getAdresse() {
        return adresse;
    }

    // MUTATEURS
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    // MÉTHODES
    @Override
    public String toString() {
        return "Bâtiment à l'adresse : " + adresse;
    }

    public String afficherInformation() {
        return "Informations du bâtiment : " + toString();
    }

    public static int getNombreTotalDeBatiments() {
        return nombreTotalDeBatiments;
    }
}