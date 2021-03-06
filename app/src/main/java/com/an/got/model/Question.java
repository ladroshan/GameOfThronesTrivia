package com.an.got.model;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

public class Question implements Serializable {

    private long id;
    private String questionText;
    private String imageUrl;
    private int maxTries;
    private int numTries;
    private List<Answer> answers;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public int getMaxTries() {
        return maxTries;
    }

    public void setMaxTries(int maxTries) {
        this.maxTries = maxTries;
    }

    public int getNumTries() {
        return numTries;
    }

    public void setNumTries(int numTries) {
        this.numTries = numTries;
    }

    public List<Answer> getAnswers() {
        if(answers != null && !answers.isEmpty())
            Collections.shuffle(answers);
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public void updateTries() {
        setNumTries(getNumTries()+1);
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
