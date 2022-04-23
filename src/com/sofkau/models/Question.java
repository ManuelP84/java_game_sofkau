package com.sofkau.models;

public class Question {
    private String level;
    private String cathegory;
    private String question;
    private String opton1;
    private String opton2;
    private String opton3;
    private String opton4;
    private String answer;

    //Constructor
    public Question(
            String cathegory,
            String level,
            String question,
            String option1,
            String option2,
            String option3,
            String option4,
            String answer
    ) {
        this.cathegory = cathegory;
        this.level = level;
        this.question = question;
        this.opton1 = option1;
        this.opton2 = option2;
        this.opton3 = option3;
        this.opton4 = option4;
        this.answer = answer;
    }

    // Getter and setter methods
    public String showLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String showCathegory() {
        return cathegory;
    }

    public void setCathegory(String cathegory) {
        this.cathegory = cathegory;
    }

    public String showQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String showOpton1() {
        return opton1;
    }

    public void setOpton1(String opton1) {
        this.opton1 = opton1;
    }

    public String showOpton2() {
        return opton2;
    }

    public void setOpton2(String opton2) {
        this.opton2 = opton2;
    }

    public String showOpton3() {
        return opton3;
    }

    public void setOpton3(String opton3) {
        this.opton3 = opton3;
    }

    public String showOpton4() {
        return opton4;
    }

    public void setOpton4(String opton4) {
        this.opton4 = opton4;
    }

    public String showAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "level='" + level + '\'' +
                ", cathegory='" + cathegory + '\'' +
                ", question='" + question + '\'' +
                ", opton1='" + opton1 + '\'' +
                ", opton2='" + opton2 + '\'' +
                ", opton3='" + opton3 + '\'' +
                ", opton4='" + opton4 + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
