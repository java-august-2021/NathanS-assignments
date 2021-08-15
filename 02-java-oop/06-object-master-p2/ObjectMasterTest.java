public class ObjectMasterTest {
    public static void main(String[] args){
        Wizard larry = new Wizard();
        Ninja brian = new Ninja();
        Samurai bob = new Samurai();
        larry.displayStats();
        brian.displayStats();
        bob.displayStats();
        //wizard test
        larry.fireball(bob);
        bob.displayStats();
        larry.heal(bob);
        bob.displayStats();
        //ninja test
        brian.runAway();
        brian.displayStats();
        brian.steal(larry);
        brian.displayStats();
        larry.displayStats();
        //samurai test
        System.out.println(Samurai.howMany());
        bob.deathBlow(brian);
        brian.displayStats();
        bob.displayStats();
        bob.meditate();
        bob.displayStats();
    }
}
