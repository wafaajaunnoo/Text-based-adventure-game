import java.util.Scanner;

public class TextAdventureGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Text Adventure Game!");
        System.out.println("You find yourself in a dark forest. What do you do? Choose one option:");
        System.out.println("1. Go left");
        System.out.println("2. Go right");
        System.out.println("3. Go straight");
        System.out.print("Enter your choice (1/2/3): ");
        int choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("You encounter a wild bear! What do you do?");
                System.out.println("1. Fight the bear");
                System.out.println("2. Run away");
                System.out.print("Enter your choice (1/2): ");
                choice = scanner.nextInt();
                if (choice == 1) {
                    System.out.println("You tried to fight the bear, but unfortunately, you lost. Game over!");
                } else {
                    System.out.println("You managed to escape from the bear and find a hidden treasure! You win!");
                }
                break;
            case 2:
                System.out.println("You come across a mysterious cave. What do you do?");
                System.out.println("1. Enter the cave");
                System.out.println("2. Ignore the cave and continue");
                System.out.print("Enter your choice (1/2): ");
                choice = scanner.nextInt();
                if (choice == 1) {
                    System.out.println("You enter the cave and find a treasure chest! You win!");
                } else {
                    System.out.println("You continue your journey and encounter a friendly traveler who helps you. You win!");
                }
                break;
            case 3:
                System.out.println("You walk straight and find a bridge guarded by trolls. What do you do?");
                System.out.println("1. Try to cross the bridge");
                System.out.println("2. Try to bribe the trolls");
                System.out.print("Enter your choice (1/2): ");
                choice = scanner.nextInt();
                if (choice == 1) {
                    System.out.println("The trolls do not allow you to cross the bridge. Game over!");
                } else {
                    System.out.println("The trolls accept your bribe and allow you to cross the bridge. You win!");
                }
                break;
            default:
                System.out.println("Invalid choice! Game over!");
                break;
        }
        scanner.close();
    }
}
