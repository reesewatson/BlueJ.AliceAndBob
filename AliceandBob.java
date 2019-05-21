
import java.util.Scanner;
public class AliceandBob {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name here: ");
        String name = input.nextLine();
        if (name.equalsIgnoreCase("Alice") || name.equalsIgnoreCase("Bob")) {
            System.out.println("Hello " + name + ", it is a pleasure to meet you!");
        } else {
            System.out.println("Sorry, I don't recognize your name.");
        }
    }
}
