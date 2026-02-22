package edu.esprit.prosit;

public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    public Animal(String var1, String var2, int var3, boolean var4) {
        this.family = var1;
        this.name = var2;
        this.age = var3;
        this.isMammal = var4;
    }

    public String toString() {
        return "Animal [Family: " + this.family + ", Name: " + this.name + ", Age: " + this.age + ", Mammal: " + this.isMammal + "]";
    }

    public static void main(String[] var0) {
    }
}
