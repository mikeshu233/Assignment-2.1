import java.util.Scanner;
public class Grade{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your mark out of?");
        double out = sc.nextInt();
        System.out.println("What is your mark?");
        double mark = sc.nextInt();
        int percent = (int)((mark/out)*100);
        if (percent >= 86 && percent <= 100){
            System.out.println("You got an A! Congrats, you are way better than Eric Huang!");
        }  if (percent >= 73 && percent <= 85){
            System.out.println("Good job! You got a B.");
        }  if (percent >= 67 && percent <= 72){
            System.out.println("You got a C+.");
        }  if (percent >= 60 && percent <= 66){
            System.out.println("You got a C.");
        }  if (percent >= 50 && percent <= 59){
            System.out.println("You got a C-.");
        }  if (percent <= 49){
            System.out.println("You got an F, but you are still better than Eric Huang.");   
        }
        }
    }