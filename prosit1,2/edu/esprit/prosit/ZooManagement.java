package edu.esprit.prosit;
import java.util.Scanner;


public class ZooManagement {

    int nbrCages;
    String zooName;

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        ZooManagement var2 = new ZooManagement();
        System.out.println("Entrez le nom du zoo :");

        for(var2.zooName = var1.nextLine(); var2.zooName.trim().isEmpty(); var2.zooName = var1.nextLine()) {
            System.out.println("Le nom ne peut pas être vide. Réessayez :");
        }

        System.out.println("Entrez le nombre de cages :");

        while(!var1.hasNextInt()) {
            System.out.println("Veuillez entrer un nombre entier !");
            var1.next();
        }

        for(var2.nbrCages = var1.nextInt(); var2.nbrCages <= 0; var2.nbrCages = var1.nextInt()) {
            System.out.println("Le nombre doit être positif. Réessayez :");
        }

        System.out.println(var2.zooName + " comporte " + var2.nbrCages + " cages");
        var1.close();
        Animal var3 = new Animal("Felidae", "Simba", 5, true);
        Animal var4 = new Animal("Accipitridae", "Aquila", 3, false);
        Animal var5 = new Animal("Delphinidae", "Flipper", 12, true);
        Zoo var6 = new Zoo("Wildlife Park", "Tunis", 25);
        var6.animals[0] = var3;
        var6.animals[1] = var4;
        var6.animals[2] = var5;
        System.out.println(var6.name + " in " + var6.city + " has " + var6.nbrCages + " cages.");
        var6.displayZoo();
        System.out.println(var6);
        System.out.println(var6.toString());
        System.out.println(var3);
    }
}
