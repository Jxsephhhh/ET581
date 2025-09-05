package Lab2;
import java.util.StringTokenizer;

public class MyStringTokenzier {
    public static void main(String[] args){
        StringTokenizer st1 = new StringTokenizer("apple.banana.orange mango");
        System.out.println(st1.nextToken());
        System.out.println(st1.nextToken());
        
        System.out.println("==================");

        StringTokenizer st2 = new StringTokenizer("apple.banana.orange mango", ".");
        System.out.println(st2.nextToken());
        System.out.println(st2.nextToken());
        System.out.println(st2.nextToken());
    }
}
