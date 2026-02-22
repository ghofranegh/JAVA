package edu.esprit.prosit;

public class Zoo {

    String name;
    final int nbrCages = 25;
    String city;
    Animal[] animals ;
    int nbrAnimaux = 0;

    public Zoo(String name, String city) {
        this.animals = new Animal[25];
        this.name = name;
        this.city = city;
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Error: The zoo is full.");
            return false;
        }
        if (searchAnimal(animal) != -1) {
            System.out.println("Error: Animal '" + animal.name + "' already exists.");
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
    public boolean isZooFull() {
        return nbrAnimaux >= nbrCages;
    }
    public static Zoo compareZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimaux > z2.nbrAnimaux) {
            return z1;
        }
        return z2;
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
