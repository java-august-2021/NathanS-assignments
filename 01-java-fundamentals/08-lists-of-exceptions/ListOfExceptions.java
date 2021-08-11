import java.util.ArrayList;
import java.util.Random;

public class ListOfExceptions {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();//create new instance of ArrayList called myList

        myList.add("13");
        myList.add("hello world");//error
        myList.add(48);
        myList.add("Goodbye World"); //error 

        for(int i = 0; i < myList.size(); i++) {
            try{
                Integer castedValue = (Integer) myList.get(i);
            }catch(ClassCastException e){
                System.out.println("Error at index: " + i + ", with value " + "'" + myList.get(i) + "'" + " Reason: " + e);
            }
            System.out.println("Still Running!");
        }   
    }
}
