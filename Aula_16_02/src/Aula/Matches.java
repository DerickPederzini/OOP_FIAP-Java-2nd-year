package Aula;

public class Matches {

    private Team homeTeam;
    private Team visitorTeam;
    private int goalsHomeTeam;
    private int goalsVisitorTeam;
    public String dateOfTheMatch;
    public String LocalOfTheMatch;
    private String timeOfTheMatch;

    public Matches(Team homeTeam, Team visitorTeam, String dateOfTheMatch, String localOfTheMatch) {
        this.homeTeam = homeTeam;
        this.visitorTeam = visitorTeam;
        this.dateOfTheMatch = dateOfTheMatch;
        this.LocalOfTheMatch = localOfTheMatch;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public Team getVisitorTeam() {
        return visitorTeam;
    }

    public int getGoalsHomeTeam() {
        return goalsHomeTeam;
    }

    public void setGoalsHomeTeam(int goalsHomeTeam) {
        this.goalsHomeTeam = goalsHomeTeam;
    }

    public int getGoalsVisitorTeam() {
        return goalsVisitorTeam;
    }

    public void setGoalsVisitorTeam(int goalsVisitorTeam) {
        this.goalsVisitorTeam = goalsVisitorTeam;
    }

    public String getTimeOfTheMatch() {
        return timeOfTheMatch;
    }

    public void setTimeOfTheMatch(String timeOfTheMatch) {
        this.timeOfTheMatch = timeOfTheMatch;
    }
}
