public class FizzBuzz {
    public String fizzBuzz(int number) {

        // fizzbuzz logic here - returns "Fizz", "Buzz", "FizzBuzz"
        // or a String cast of the number itself.
        // Hint: You can use a String method to cast the int to a String.
        if (number % 15 == 0) {
            return "FizzBuzz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        } else {
            String cast = String.format("%d", number);
            return cast;
        }
    }
}

// NINJA BONUS:
// Create an overloaded method for fizzBuzz
// public String fizzBuzz(int number, String multOf3Word, String multOf5Word,
// String multOf15Word) {
// // Implement the same logic, but replace "Fizz", "Buzz" and
// // "Fizzbuzz" with the given words
// int i3 = (int) multOf3Word;
// int i5 = (int) multOf5Word;
// int i15 = (int) multOf15Word;
// if (i15 % 15 == 0) {
// return "FizzBuzz";
// }if (i5 % 5 == 0) {
// return "Buzz";
// }if (i3 % 3 == 0) {
// return "Fizz";
// }
// }
// }
