public class PhoneTest {
    public static void main(String[] args) {
        Galaxy s10 = new Galaxy("S10", 50, "AT&T", "RING RING");
        IPhone iPhone12 = new IPhone("12", 100, "Verizon", "BUZZ BUZZ BUZZ");
        s10.displayInfo();
        System.out.println(s10.Ring());
        System.out.println(s10.unlock());
        System.out.println(iPhone12.Ring());
        System.out.println(iPhone12.unlock());
        iPhone12.displayInfo();
    }
}
