public class BreakStatement {
    public static void main(String[] args){
        for(int i = 1; i <= 10; i++){
            if (i == 5){
                break;
            }
            System.out.println("i = " + i);
        }
        System.out.println("This is out of our loop");
    }
}
