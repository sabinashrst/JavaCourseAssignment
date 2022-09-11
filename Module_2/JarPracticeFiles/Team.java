//Assignment: 2.3
//Author: Sabina Shrestha

public class Team{

    private String teamName="";
    private String [] players = new String[20];
    private int playerCount = 0;

    //An argument constructor that creates a team using the teamName data field as an argument.
    public Team(String teamName) {
        this.teamName = teamName;
    }

    //method named addPlayer with a string argument that adds a player to the players data field
    public void addPlayer(String player) {
        players[playerCount] = player;
        playerCount ++;
    }

    //string array method named getPlayers that returns the players data field.
    public String[] getPlayers() {
        return players;
    }

    // int method named getPlayerCount that returns the playerCount data field.
    public int getPlayerCount() {
        return playerCount;
    }

    //string method named getTeamName that returns the teamName data field
    public String getTeamName() {
        return teamName;
    }
}