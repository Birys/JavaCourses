package ru.java.courses.sport1.team.football;

public class FootballPlayer {
    public String name;
    public int goals;
    public PlayerRole playerole;

    public FootballPlayer(String name, PlayerRole playerole) {
        this.name = name;
        this.playerole = playerole;

    }


    public int score()
    {return 0;}

    public void setName(String name) {
        this.name = name;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }



    public String getName() {
        return name;
    }

    public int getGoals() {
        return goals;
    }

    public void setPlayerole(PlayerRole playerole) {
        this.playerole = playerole;
    }

    public PlayerRole getPlayerole() {
        return playerole;
    }
}
