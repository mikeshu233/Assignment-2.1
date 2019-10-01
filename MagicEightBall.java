import java.util.Scanner;
public class MagicEightBall{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int answer = (int) (Math.random()*20) + 1;
        System.out.println("What is your yes or no question?");
        sc.nextLine();
        if (answer == 1) {
            System.out.println("Sure.");
        } else if (answer == 2){
            System.out.println("Most definately.");
        } else if (answer == 3){
            System.out.println("Maybe...");
        } else if (answer == 4){
            System.out.println("Unpredictable...");
        } else if (answer == 5){
            System.out.println("Of course!");
        } else if (answer == 6){
            System.out.println("Absolutely No!!!");
        } else if (answer == 7){
            System.out.println("It is unclear to me.");
        } else if (answer == 8){
            System.out.println("Most likely no.");
        } else if (answer == 9){
            System.out.println("Most likely yes.");
        } else if (answer == 10){
            System.out.println("I can not tell you if that's a yes or a no...");
        } else if (answer == 11){
            System.out.println("Yes for sure.");
        } else if (answer == 12){
            System.out.println("No for sure.");
        } else if (answer == 13){
            System.out.println("Sounds like it's a yes to me.");
        } else if (answer == 14){
            System.out.println("Sounds like it's a no to me.");
        } else if (answer == 15){
            System.out.println("The lord suggests yes.");
        } else if (answer == 16){
            System.out.println("The lord suggests no.");
        } else if (answer == 17){
            System.out.println("The lord tells me not to answer this question.");
        } else if (answer == 18){
            System.out.println("Certainly.");
        } else if (answer == 19){
            System.out.println("Hell No!!!");
        } else if (answer == 20){
            System.out.println("Ask me the question again.");
        }
    }
}