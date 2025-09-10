public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Prompt user
        System.out.print("Enter a 4-digit integer: ");
        int number = input.nextInt();

        // Step 2: Extract digits using division and modulus
        int firstDigit = number / 1000;              // thousands place
        int secondDigit = (number / 100) % 10;       // hundreds place
        int thirdDigit = (number / 10) % 10;         // tens place
        int fourthDigit = number % 10;               // ones place

        // Step 3: Print results
        System.out.println("first digit: " + firstDigit);
        System.out.println("second digit: " + secondDigit);
        System.out.println("third digit: " + thirdDigit);
        System.out.println("fourth digit: " + fourthDigit);
    }
}