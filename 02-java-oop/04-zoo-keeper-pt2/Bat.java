public class Bat extends Mammal {
    public Bat(int energy_Level) {
        super(300);
    }
    public void fly() {
        System.out.println("SCREACH!!!!!!!!!");
        energy_Level -= 50;
    }
    public void eatHumans() {
        System.out.println("Omm nom nom!");
        energy_Level += 25;
    }
    public void attackTown() {
        energy_Level -= 100;
        System.out.println("AHHHHHHHHasdfasdfad!");
    }
}
