/**
 * Author:- Nardos Lemma
 * CMSC 215
 * 01| 23| 24
 *This is my propject1 class that prompt the user for the information for each of the players.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        double totalAge = 0;
        Scanner scanner = new Scanner(System.in);
        //arraylist of players added
        ArrayList<Player> players = new ArrayList<>();

        boolean addPlayers = true;

        //prompting the user to insert the information of the players
        while (addPlayers) {
            System.out.print("Enter player's name or enter 'done' to finish: ");
            String playersName = scanner.nextLine();

            if (playersName.equalsIgnoreCase("done")) {
                addPlayers = false;
            } else {

                System.out.print("Enter the player's height in feet: ");
                int feet = scanner.nextInt();
                System.out.print("Enter the player's height in Inches: ");
                int inches = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter the player's age: ");
                int age = scanner.nextInt();
                scanner.nextLine();
                Height height = new Height(feet, inches);
                Player player = new Player(playersName, height, age);
                players.add(player);
                //calculating the total age that has been entered
                totalAge += age;
            }
        }

        // Calculating the average age
        double averageAge = totalAge / players.size();
        System.out.println("The average age of all players is: " + averageAge);

        // Find the tallest player whose age is less than or equal to the average age
        Player tallestPlayer = tallestPlayer(players, averageAge);

        // Output information of the tallest player
        System.out.println("The tallest player whose age is less than or equal to the average age:");
        System.out.println(tallestPlayer);

    }
//method to find the tallest player.
    public static Player tallestPlayer (ArrayList<Player> players, double averageAge) {
        Player tallest = null;
        double maximumHeight = 0;
//for loop to check the requirement of the tallest player
        for (Player added : players) {
            if (added.getAge() <= averageAge && added.getHeight().toInches() > maximumHeight) {
                maximumHeight = added.getHeight().toInches();
                tallest = added;
            }
        }

        return tallest;


    }
}