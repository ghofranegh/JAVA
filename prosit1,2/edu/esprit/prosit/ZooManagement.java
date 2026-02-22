package edu.esprit.prosit;
import java.util.Scanner;


public class ZooManagement {

    int nbrCages;
    String zooName;


    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        /* --- prosit 1 ---
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
        */
        Animal var3 = new Animal("Felidae", "Simba", 5, true);
        Animal var4 = new Animal("Accipitridae", "Aquila", 3, false);
        Animal var5 = new Animal("Delphinidae", "Flipper", 12, true);
        Zoo var6 = new Zoo("Wildlife Park", "Tunis");

        System.out.println("Adding Simba: " + var6.addAnimal(var3));
        System.out.println("Adding Aquila: " + var6.addAnimal(var4));
        System.out.println("Adding Flipper: " + var6.addAnimal(var5));

        /*
        for(int i = 0; i < 25; i++) {
            boolean result = var6.addAnimal(new Animal("Family" + i, "Animal" + i, 1, true));
            if (!result) {
                System.out.println("Zoo is full! Cannot add Animal " + i);
            }
        }*/
        /*
        System.out.println(var6.name + " in " + var6.city + " has " + var6.nbrCages + " cages.");
        var6.displayZoo();
        System.out.println(var6);
        System.out.println(var3);*/
        /*
        var6.displayAnimals();
        System.out.println("Index of Simba: " + var6.searchAnimal(var3));
        Animal identicalSimba = new Animal("Felidae", "Simba", 5, true);
        System.out.println("Index of identical Simba: " + var6.searchAnimal(identicalSimba));
        */
        /* in12
        System.out.println("First addition of Simba: " + var6.addAnimal(var3));
        System.out.println("Second addition of Simba: " + var6.addAnimal(var3));

        Animal var7 = new Animal("Felidae", "Simba", 3, true);
        System.out.println("Addition of another animal named Simba: " + var6.addAnimal(var7));
        var6.displayAnimals();

        var1.close();

         */

        /* in13
        System.out.println("\nRemoving " + var5.name + " : " + var6.removeAnimal(var5));
        System.out.println("\n--- After Removal ---");
        var6.displayAnimals();
         */
        Zoo myZoo = new Zoo("Wildlife Park", "Tunis");
        Zoo otherZoo = new Zoo("Safari Club", "Enfidha");

        Animal lion = new Animal("Felidae", "Simba", 5, true);
        Animal tiger = new Animal("Felidae", "Sher Khan", 8, true);
        Animal eagle = new Animal("Accipitridae", "Aquila", 3, false);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(tiger);
        otherZoo.addAnimal(eagle);

        System.out.println("Is myZoo full? " + myZoo.isZooFull());

        Zoo biggerZoo = Zoo.compareZoo(myZoo, otherZoo);
        System.out.println("The bigger zoo is: " + biggerZoo.name + " with " + biggerZoo.nbrAnimaux + " animals.");
        myZoo.displayZoo();
        otherZoo.displayZoo();


    }
}
