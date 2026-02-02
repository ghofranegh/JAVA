public class Zoo {
    String name;
    int nbrCages;
    String city;
    Animal[] animals ;
    public Zoo(String name, String city, int nbrCages) {
        this.animals = new Animal[25]; // Initialisation du tableau (max 25)
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }
    public static void main(String[] args) {
        
    }
}
