//Assignment: 2.3
//Author: Sabina Shrestha
import java.util.Scanner;


public class TestSportsTeamApp {


    public static void main(String[] args) {

        System.out.println("  Welcome to the Sports Team App");
        System.out.println();
        String input = "y";

        //while loop to check whether the user wishes to continue
        while (!input.equals("n")) {
            Scanner teamNameInput = new Scanner(System.in);  // Create a Scanner object
            System.out.println("  Enter a team name: ");
            String teamName = teamNameInput.nextLine(); // Read user input
            System.out.println();

            Team teamNameObject = new Team(teamName);
            Scanner playerNamesInput = new Scanner(System.in);  // Create a Scanner object
            System.out.println("  Enter the player names: ");
            System.out.print("    hint: use commas for multiple players; no spaces>: ");
            String playerNames = playerNamesInput.nextLine();  // Read user input

            //covert the user entered players string into a string array of players.
            String[] playerNamesSplit = playerNames.split(",");
            for (int i = 0; i < playerNamesSplit.length; i++) {
                teamNameObject.addPlayer(playerNamesSplit[i]);
            }
            System.out.println();
            System.out.println("  --Team Summary--");
            System.out.println("  Number of players in team: " + teamNameObject.getPlayerCount());
            System.out.println("  Players on team: " + getPlayers(teamNameObject.getPlayers()));
            System.out.println();

            Scanner scan = new Scanner(System.in); // Create a Scanner object
            System.out.println("  Continue? (y/n): ");
            input = scan.nextLine(); // Read user input
        }
        System.out.println();
        System.out.println();
        System.out.println("  End of line...");
    }

    // this method loops through array of string and append the comma and return the string
    public static String getPlayers(String[] players) {
        String result = "";
        for (int i = 0; i < players.length; i++) {
            if (players[i] != null) {
                result += players[i] + ",";
            }
        }
        return result;
    }
}