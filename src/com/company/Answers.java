package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Answers {
    private ArrayList<String> answers;

    public Answers() {}

    public Answers(String ... a) {

    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(String answer) {
        this.answers.add(answer);
    }
}
