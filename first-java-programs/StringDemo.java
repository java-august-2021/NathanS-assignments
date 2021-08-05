public class StringDemo {
    public static void main(String[] args) {
        String ninja = "Coding Dojo is Awesome!";
        int length = ninja.length();
        System.out.println( "String Length is: " + length);
        String string1 = "My name is ";
        String string2 = "Nathan";
        String string3 = string1.concat(string2);// "Welcome" + "nijnja" + "!" gives similar functionality
        System.out.println(string3);
        String format = String.format("Hi %s, you owe me $%.2f !","Jack", 25.0);
        System.out.println(format);
        String welcome = "Welcome to Coding Dojo!";
        int a = welcome.indexOf("Coding");
        int b = welcome.indexOf("co");
        int c = welcome.indexOf("pizza");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
