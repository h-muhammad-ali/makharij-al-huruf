package com.example.makharij_al_huruf;

public class Question {
    private int answerId;
    private String correctAnswer;

    public Question(int answerId, String correctAnswer) {
        this.answerId = answerId;
        this.correctAnswer = correctAnswer;
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
