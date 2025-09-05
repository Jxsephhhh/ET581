import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Prompt user
        System.out.print("Enter the number of seconds: ");
        int totalSeconds = input.nextInt();

        // Step 2: Convert to hours, minutes, seconds
        int hours = totalSeconds / 3600;           // 1 hour = 3600 seconds
        int minutes = (totalSeconds % 3600) / 60;  // remaining minutes
        int seconds = totalSeconds % 60;           // remaining seconds

        // Step 3: Print result
        System.out.println(totalSeconds + " seconds = " 
                + hours + " hour(s), " 
                + minutes + " minute(s), and " 
                + seconds + " second(s)");
    }
}