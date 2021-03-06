package ru.geekbrains.qa.java2.lesson1.homeWork.obstacleCourse;


import ru.geekbrains.qa.java2.lesson1.homeWork.team.TeamMember;

public class Fight extends Obstacle {
    public Fight(int difficulty) {
        super(difficulty);
    }

    @Override
    public void goChallenge(TeamMember member) {
        member.fight(super.getDifficulty());
    }
}
