import java.util.Scanner;

public class ZooManagement {
    int nbrCages;
    String zooName;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ZooManagement zm = new ZooManagement();

        System.out.println("Entrez le nom du zoo :");
        zm.zooName = sc.nextLine();
        while (zm.zooName.trim().isEmpty()) {
            System.out.println("Le nom ne peut pas être vide. Réessayez :");
            zm.zooName = sc.nextLine();
        }

        System.out.println("Entrez le nombre de cages :");
        while (!sc.hasNextInt()) {
            System.out.println("Veuillez entrer un nombre entier !");
            sc.next();
        }
        zm.nbrCages = sc.nextInt();
        
        while (zm.nbrCages <= 0) {
            System.out.println("Le nombre doit être positif. Réessayez :");
            zm.nbrCages = sc.nextInt();
        }

        System.out.println(zm.zooName + " comporte " + zm.nbrCages + " cages");
        sc.close();

        Animal lion = new Animal("Felidae", "Simba", 5, true);
        Animal eagle = new Animal("Accipitridae", "Aquila", 3, false);
        Animal dolphin = new Animal("Delphinidae", "Flipper", 12, true);

        Zoo myZoo = new Zoo("Wildlife Park", "Tunis", 25);
        myZoo.animals[0] = lion;
        myZoo.animals[1] = eagle;
        myZoo.animals[2] = dolphin;

        System.out.println(myZoo.name + " in " + myZoo.city + " has " + myZoo.nbrCages + " cages.");
    }
}