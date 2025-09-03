package Lab2;

public class StringToNewLine{
    public static void main(String[] args){
        String text = "This is a text string.";
        text.replace(' ', '\n');

        System.out.println(text);

        // this
        // is
        // a
        // test
        // string.

    }
}