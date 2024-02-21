package Aula;

import java.util.Date;

public class Player {

    private String positionInField;
    private int numberOfShirt;
    private final String name;
    private String birth;
    private int yellowCards;
    private int redCards;
    private int goals;
    private int assists;
    private Team team;

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, String birth, int goals, int assists) {
        this.name = name;
        this.birth = birth;
        this.goals = goals;
        this.assists = assists;
    }
    public String getPositionInField() {
        return positionInField;
    }
    public void setPositionInField(String positionInField) {
        this.positionInField = positionInField;
    }
    public int getNumberOfShirt() {
        return numberOfShirt;
    }
    public void setNumberOfShirt(int numberOfShirt) {
        this.numberOfShirt = numberOfShirt;
    }
    public String getName() {
        return name;
    }
    public String getBirth() {
        return birth;
    }
    public int getYellowCards() {
        return yellowCards;
    }
    public void setYellowCards(int yellowCards) {
        this.yellowCards += yellowCards;
    }
    public int getRedCards() {
        return redCards;
    }
    public void setRedCards(int redCard) {
        this.redCards += redCard;
    }
    public int getGoals() {
        return goals;
    }
    public void setGoals(int goals) {
        this.goals += goals;
    }
    public int getAssists() {
        return assists;
    }
    public void setAssists(int assists) {
        this.assists += assists;
    }
    public Team getTeam() {
        return team;
    }
    public void setTeam(Team team) {
        this.team = team;
    }
}
