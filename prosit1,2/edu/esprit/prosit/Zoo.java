package edu.esprit.prosit;

public class Zoo {

    private String name;
    private final int nbrCages = 25;
    private String city;
    private Animal[] animals ;
    private int nbrAnimaux = 0;

    public Zoo(String name, String city) {
        this.animals = new Animal[25];
        setName(name);
        this.city = city;
    }
    public String getName() { return name; }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Le nom du Zoo ne doit pas être vide. Nom par défaut appliqué.");
            this.name = "MonZoo";
        } else {
            this.name = name;
        }
    }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    public int getNbrAnimaux() { return nbrAnimaux; }
    public boolean isZooFull() {
        return nbrAnimaux >= nbrCages;
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Error: The zoo is full.");
            return false;
        }
        if (searchAnimal(animal) != -1) {
            System.out.println("Error: Animal '" + animal.getName() + "' already exists.");
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

    public static Zoo compareZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimaux > z2.nbrAnimaux) {
            return z1;
        }
        return z2;
    }
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimaux; i++) {
            if (animals[i].getName().equals(animal.getName())){
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
