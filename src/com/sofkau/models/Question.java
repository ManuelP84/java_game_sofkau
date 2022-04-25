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

    public void displayQuestion(){
        System.out.println("--------------------------------------------------------------------");
        System.out.println("NIVEL DE DIFICULTAD: " + this.level);
        System.out.println();
        System.out.println("CATEGORIA DE LA PREGUNTA \n"+"-------"+this.cathegory.toUpperCase()+"-------");
        System.out.println();
        System.out.println(this.question);
        System.out.println();
        System.out.println("1. " + this.opton1);
        System.out.println("2. " + this.opton2);
        System.out.println("3. " + this.opton3);
        System.out.println("4. " + this.opton4);
        System.out.println("--------------------------------------------------------------------");
        System.out.println();
    }

    public String showAnswer() {
        return answer;
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
