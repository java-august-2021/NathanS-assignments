import java.lang.reflect.Array;
import java.util.ArrayList;
public class Basics {
    public static void Basic1() { //print all numbers 1-255
        int i = 1;
        while (i <= 255)
        {
            System.out.println(i);
            i++;
        }
    }
    public static void Basic2() { //print odd numbers 1-255
        int i = 1;
        while (i <= 255)
        {
            System.out.println(i);
            i += 2;
        }
    }
    public static int Basic3() { // Return Sum of all numbers 1-255
        int i = 0;
        int sum = 0;
        while (i <= 255) 
        {
            sum = sum + i;
            i++;
        }
        return sum;
    }
    public static void Basic4(int[] arr) { //Iterate through array and print values 
        for (int val: arr) {
            System.out.println(val);
        }
    }
    public static int Basic5(int[] arr){ //Find Max
        int max = arr[0];
        for (int val: arr) {
            if (val > max) {
                max = val;
            }
        }return max;
    }
    public static ArrayList <Integer> Basic6() { //Odd Numbers 
        ArrayList<Integer> Y = new ArrayList<Integer>();
        int i = 1;
        while (i <= 255) {
            Y.add(i);
            i+=2;
        }return Y;
    }
}
