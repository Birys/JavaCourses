package ru.java.courses.sport1.team.football;

import ru.java.courses.sport1.Coach;

public class FootballTeam {
    public String name;
    public int players;
    public Coach coach;



    public String addPlayers()
    {return null;}
    public int getPlayersCount()
    {return 0;}
    public int getScore()
    {return 0;}

    public void setName(String name) {
        this.name = name;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public int getPlayers() {
        return players;
    }

    public Coach getCoach() {
        return coach;
    }

}
