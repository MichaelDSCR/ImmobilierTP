public class Main {
    public static void main(String[] args) {
        // Création de quelques instances de Bâtiment pour test
        Batiment bat1 = new Batiment("13 rue Jean Eustache");
        Batiment bat2 = new Batiment("14 place de la victoire");

        // Affichage des informations des bâtiments
        System.out.println(bat1.afficherInformation());
        System.out.println(bat2.afficherInformation());

        // Affichage du nombre total de bâtiments
        System.out.println("Nombre total de bâtiments : " + Batiment.getNombreTotalDeBatiments());

        // Création d'une instance de Maison
        Maison maison1 = new Maison("27 avenue de la résistance", 5);

        // Affichage des informations de la maison
        System.out.println(maison1.afficherInformation());

        // Occupation de la maison
        maison1.occuper(4);

        // Affichage du nombre total de bâtiments incluant la maison
        System.out.println("Nombre total de bâtiments : " + Batiment.getNombreTotalDeBatiments());
    }
}

