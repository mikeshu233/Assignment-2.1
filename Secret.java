import java.util.Scanner;
public class Secret{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's the password?");
        String password = sc.nextLine();
        if (password.equals("dragon")){
            System.out.println("Correct! My secret is: You have the wrong password.");
        }else{
            System.out.println("Incorrect Password! My secret is still safe ...");
    }
  }
}