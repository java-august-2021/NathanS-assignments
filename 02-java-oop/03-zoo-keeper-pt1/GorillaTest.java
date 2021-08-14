public class GorillaTest {
    public static void main(String[] args){
        Gorilla sam = new Gorilla(); //new instance of a Gorilla named Sam
        //three throws
        System.out.println(sam.throwSomething());
        System.out.println(sam.throwSomething());
        System.out.println(sam.throwSomething());
        //eats two bananas
        System.out.println(sam.eatBananas());
        System.out.println(sam.eatBananas());
        //climbs once
        System.out.println(sam.climb());
    }
}
