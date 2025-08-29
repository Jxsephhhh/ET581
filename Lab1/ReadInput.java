package Lab1;
import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an interger");
        int number = input.nextInt();
        String s = input.next();
        System.out.println("The number is " + number);
        input.close();

    }
}
