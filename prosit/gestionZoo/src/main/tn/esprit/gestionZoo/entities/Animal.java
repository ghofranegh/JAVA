package main.tn.esprit.gestionZoo.entities;

public class Animal {
    protected String family;
    protected String name;
    protected int age;
    protected boolean isMammal;

    public Animal() {}

    public Animal(String var1, String var2, int var3, boolean var4) {
        this.family = var1;
        this.name = var2;
        setAge(var3);
        this.isMammal = var4;
    }
    public String getFamily() { return family; }
    public void setFamily(String family) { this.family = family; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("L'âge ne peut pas être négatif. Valeur par défaut 0 appliquée.");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public String toString() {
        return "Animal : Family: " + this.family + ", Name: " + this.name + ", Age: " + this.age + ", Mammal: " + this.isMammal ;
    }

    public static void main(String[] var0) {
    }
}
