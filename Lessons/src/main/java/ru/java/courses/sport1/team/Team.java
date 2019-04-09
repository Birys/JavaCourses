package ru.java.courses.sport1.team;

import ru.java.courses.sport1.Athlete;
import ru.java.courses.sport1.Coach;
import ru.java.courses.sport1.team.football.FootballPlayer;

import java.util.ArrayList;
import java.util.List;

public class Team {
    public Coach coach;
    public String name;
  //  public List[] players = new ArrayList<>();

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Coach getCoach() {
        return coach;
    }

    public void addPlayers(FootballPlayer goalkeeper, FootballPlayer winger, FootballPlayer defender1) {
    }

    public void addPlayer(FootballPlayer defender2) {
    }

    public void removePlayer(FootballPlayer defender1) {
    }
}
