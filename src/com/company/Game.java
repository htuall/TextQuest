package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Game implements Process {
    private ArrayList<String> questions;
    private ArrayList<String> answers;
    private String startText = "Хочешь поиграть(да/нет)?";
    private String comebackText = "Приходи в другой раз!";

    public Game(Questions quests, Answers answs) {
        this.questions = quests.getQuestions();
        this.answers = answs.getAnswers();

        Scanner sc = new Scanner(System.in);
        System.out.println(startText);
        String decision = sc.nextLine();
        if (Proceed(decision)) {
            for (int i = 0; i <= questions.size(); i++) {
                System.out.println(questions.get(i));
            }
        }
        else
            System.out.println(comebackText);
    }

    @Override
    public boolean Proceed(String dis) {
        if (dis.equals("Да") | dis.equals("да")) {
            return true;
        }
        else
            return false;
    }

    @Override
    public boolean Checker(String state1, String state2) {
        if (state1.equals(state2)) {
            return true;
        }
        else
            return false;
    }
}
