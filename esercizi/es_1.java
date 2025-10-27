/* Exercise 1: Restaurant chatbot */

import java.util.Scanner;

public class es_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to eat for lunch?");
        String food = scanner.nextLine();
        System.out.println("You chose: " + food);
        scanner.close();
    }
}
