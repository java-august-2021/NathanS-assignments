import java.util.ArrayList;
public class BasicsTest {
    public static void main(String[] args) {
        Basics.Basic1();
        Basics.Basic2();
        int sum = Basics.Basic3();
        System.out.println(sum);
        int[] arr = {1,3,5,7,9,13,0,-1,-14};
        Basics.Basic4(arr);
        int max = Basics.Basic5(arr);
        System.out.println(max);
        ArrayList<Integer> Y = Basics.Basic6();
        System.out.println(Y);
    }
}
