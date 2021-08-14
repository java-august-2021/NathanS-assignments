public class Mammal {
    protected int energy_Level = 100;
    public int displayEnergy(){
        System.out.println("Energy Level: " + energy_Level);
        return energy_Level;
    }
    public Mammal (int energy_Level) {
        this.energy_Level = energy_Level;
    }
}
