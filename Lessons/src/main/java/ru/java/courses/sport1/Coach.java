package ru.java.courses.sport1;

public class Coach {
    public String name;
    public int experience;

    public Coach (String name)
    {this.name = name;}
    public Coach (String name, int experience)
    {this.name = name;
    this.experience=experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public String getName() {
        return name;
    }
}

