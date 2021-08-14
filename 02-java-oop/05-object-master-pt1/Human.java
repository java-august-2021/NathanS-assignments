public class Human {
    protected int strength = 3, stealth = 3, intelligence = 3, health = 100;
    public void displayStats() {
        System.out.println("Character Stats: " + "Health, " + health + " " + "Strength, " + strength + " " + "Stealth, " + stealth + " " + "Intelligence, " + intelligence + ".");
    }
    public void attack(Human target) {
        target.health -= this.strength;
    }
}
