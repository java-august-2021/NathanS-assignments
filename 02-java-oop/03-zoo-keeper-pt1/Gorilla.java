public class Gorilla extends Mammal {
    public Mammal g = new Mammal();
    public int throwSomething() {
        this.energy_level = energy_level - 5;
        System.out.println("The gorilla has thrown something!");
        return this.energy_level;
    }
    public int eatBananas() {
        this.energy_level = energy_level + 10;
        System.out.println("The gorilla has eatten a banana. Yum!");
        return this.energy_level;
    }
    public int climb() {
        this.energy_level = energy_level - 10;
        System.out.println("The gorilla has climbed a tree. Wowie!");
        return this.energy_level;
    }
}
