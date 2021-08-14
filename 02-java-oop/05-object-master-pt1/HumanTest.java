public class HumanTest {
    public static void main(String[] args){
        Human wizard = new Human();
        Human samurai = new Human();
        Human ninja = new Human();
        wizard.displayStats();
        samurai.displayStats();
        ninja.displayStats();

        wizard.attack(samurai);
        samurai.attack(ninja);
        ninja.attack(wizard);
        //Health for all characters should be 97
        wizard.displayStats();
        samurai.displayStats();
        ninja.displayStats();
    }
}
