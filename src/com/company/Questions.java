package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Questions {
    private ArrayList<String> questions;

    public Questions () {}

    public Questions (String ... a) {

    }

    public ArrayList<String> getQuestions() {
        return questions;
    }

    public void setQuestions(String question) {
        questions.add(question);
    }
}
