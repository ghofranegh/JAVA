/*public class ZooManagement {
    int nbrCages = 20;
    String zooName = "my zoo";

    public static void main(String[] args) {
        ZooManagement zm = new ZooManagement();
        System.out.println(zm.zooName + " comporte " + zm.nbrCages + " cages");
    }
}*/
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
    }
}