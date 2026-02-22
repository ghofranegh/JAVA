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
        if (nbrAnimaux >= 25) {
            System.out.println("Error: The zoo is full.");
            return false;
        }

        if (searchAnimal(animal) != -1) {
            System.out.println("Error: Animal '" + animal.name + "' already exists in the zoo.");
            return false;
        }

        animals[nbrAnimaux] = animal;
        nbrAnimaux++;
        return true;
    }

    public void displayAnimals() {
        System.out.println("List of animals in " + name + ":");
        for (int i = 0; i < nbrAnimaux; i++) {
            System.out.println("- " + animals[i]);
        }
    }
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimaux; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            return false;
        }
        for (int i = index; i < nbrAnimaux - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimaux - 1] = null;
        nbrAnimaux--;
        return true;
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
