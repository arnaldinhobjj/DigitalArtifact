package DigitalArtifact;
import java.util.Scanner;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> userList = new ArrayList<String>();

        int userChoice = 0;

        do {
            do {
                DisplayOptions();
                userChoice = scanner.nextInt(); 
            } while (userChoice < 1 || userChoice > 4);
    
            switch (userChoice) {
                case 1:
                    displayItem();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    removeItem();
                    break;
                default:
                    break;
            }
        } while (true);
    }


    public static ArrayList<String> addItem() {
    }

    public static ArrayList<String> removeItem() {

    }

    public static ArrayList<String> displayItem() {

    }

    public static void DisplayOptions() {
        System.out.println("-- Todo --");
        System.out.println("");
        System.out.println("1. Display items.");
        System.out.println("2. Add items.");
        System.out.println("3. Remove items.");
        System.out.println("4. Exit.");
        System.out.println("Please write a value between 1 and 4.");
    }
}