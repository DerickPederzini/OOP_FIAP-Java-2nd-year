package Aula;

import java.util.ArrayList;
import java.util.Scanner;

public class Team {

    static Scanner input = new Scanner(System.in);

    private String teamName;
    private String manager;
    private int wins = 0;
    private int losses;
    private int goalsPro;
    private int goalsAgainst;
    private ArrayList<Player> players;
    public Team(String teamName, String manager) {
        this.teamName = teamName;
        this.manager = manager;
    }

    public String getTeamName() {
        return teamName;
    }
    public int getWins() {
        return wins;
    }
    public int getLosses() {
        return losses;
    }
    private void setLosses(int losses) {
        this.losses += losses;
    }
    private void setWins(int wins) {
        this.wins += wins;
    }
    public int getGoalsPro() {
        return goalsPro;
    }
    private void setGoalsPro(int goalsPro) {
        this.goalsPro += goalsPro;
    }
    public ArrayList<Player> getPlayers() {
        return players;
    }
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
    public void AddWins(int wins){
        setWins(wins);
    }
    public void AddLosses(int losses){
        setLosses(losses);
    }
    public void AddGoalsMade(int goals){
        setGoalsPro(goals);
    }
    public void AddGoalsTaken(int goals){
        setGoalsAgainst(goals);
    }
    private void setGoalsAgainst(int goals) {
        this.goalsAgainst += goals;
    }
    public ArrayList<Player> changePlayer(Player newPlayer){

        ArrayList<Player> newPlayers = changePlayer(newPlayer, getPlayers());

        return newPlayers;
    }
    private ArrayList<Player> changePlayer(Player newPlayer, ArrayList<Player> oldPlayers){

        ArrayList<Player> newPlayers = oldPlayers;
        boolean changePlayers;

        System.out.println("Do you want to change player or add a new one?");
        System.out.println("Change the players?");
        changePlayers = input.nextBoolean();
        if(changePlayers){
            System.out.println("What is the name of the player being changed? ");
            String name = input.next();

            Player player = new Player(name);

            for (int i = 0; i < newPlayers.size(); i++) {
                if(newPlayers.contains(name)){ newPlayers.add(i, player); }
            }

            System.out.println("Congratulations, you have changed "+ player.getName());

            return newPlayers;

        }else{
            System.out.println("What is the name of the new player? ");
            String name = input.next();
            Player player = new Player(name);

            newPlayers.add(player);
            System.out.println("Congratulations, you have addded "+ player.getName());
        }
        return newPlayers;
    }


}
