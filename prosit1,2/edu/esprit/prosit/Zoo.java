package edu.esprit.prosit;

public class Zoo {

    String name;
    int nbrCages;
    String city;
    Animal[] animals ;
    int nbrAnimaux = 0;

    public Zoo(String name, String city, int nbrCages) {
        this.animals = new Animal[25];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    public boolean addAnimal(Animal animal) {
        if (nbrAnimaux < 25) {
            animals[nbrAnimaux] = animal;
            nbrAnimaux++;
            return true;
        }
        return false;
    }

    public void displayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + nbrCages);
    }
    @Override
    public String toString() {
        return "Zoo [Name: " + name + ", City: " + city + ", Cages: " + nbrCages + "]";
    }
    public static void main(String[] args) {

    }
}
