package com.sofkau.questions;

import com.sofkau.models.Question;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.*;
import java.io.*;

public class QuestionCollection {

    private static       List<List<Question>> totalQuestions      = new ArrayList<>();
    private final static String               ROOT_JSON_FILE      = "src/com/sofkau/questions/questions.json";
    private final static Integer              TOTAL_LEVELS        = 5;

    public static JsonArray createJsonArray(String levelQuestions) {
        JsonArray jsonArrayQuestions = new JsonArray();
        try {
            File input = new File(ROOT_JSON_FILE);
            JsonElement fileElement = JsonParser.parseReader(new FileReader(input));
            JsonObject fileObject = fileElement.getAsJsonObject();
            jsonArrayQuestions = fileObject.get(levelQuestions).getAsJsonArray();
        } catch (IOException exception) {
            System.out.println("Error al leer archivo");
        }
        return jsonArrayQuestions;
    }

    public static List<List<Question>> populateQuestionList() {
        JsonArray jsonArrayQuestions1 = createJsonArray("questions1");
        JsonArray jsonArrayQuestions2 = createJsonArray("questions2");
        JsonArray jsonArrayQuestions3 = createJsonArray("questions3");
        JsonArray jsonArrayQuestions4 = createJsonArray("questions4");
        JsonArray jsonArrayQuestions5 = createJsonArray("questions5");
        Question question;
        Integer counter = 0;

        List<Question>       questionListByLevel1 = new ArrayList<>();
        for (JsonElement questionElement : jsonArrayQuestions1) {
            JsonObject questionJsonObject = questionElement.getAsJsonObject();
            String categoria = questionJsonObject.get("categoria").getAsString();
            String nivel = questionJsonObject.get("nivel").getAsString();
            String pregunta = questionJsonObject.get("pregunta").getAsString();
            String opcion1 = questionJsonObject.get("opcion1").getAsString();
            String opcion2 = questionJsonObject.get("opcion2").getAsString();
            String opcion3 = questionJsonObject.get("opcion3").getAsString();
            String opcion4 = questionJsonObject.get("opcion4").getAsString();
            String respuesta = questionJsonObject.get("respuesta").getAsString();
            question = new Question(categoria, nivel, pregunta, opcion1, opcion2, opcion3, opcion4, respuesta);
            questionListByLevel1.add(question);
        }
        totalQuestions.add(questionListByLevel1);
        List<Question>       questionListByLevel2 = new ArrayList<>();
        for (JsonElement questionElement : jsonArrayQuestions2) {
            JsonObject questionJsonObject = questionElement.getAsJsonObject();
            String categoria = questionJsonObject.get("categoria").getAsString();
            String nivel = questionJsonObject.get("nivel").getAsString();
            String pregunta = questionJsonObject.get("pregunta").getAsString();
            String opcion1 = questionJsonObject.get("opcion1").getAsString();
            String opcion2 = questionJsonObject.get("opcion2").getAsString();
            String opcion3 = questionJsonObject.get("opcion3").getAsString();
            String opcion4 = questionJsonObject.get("opcion4").getAsString();
            String respuesta = questionJsonObject.get("respuesta").getAsString();
            question = new Question(categoria, nivel, pregunta, opcion1, opcion2, opcion3, opcion4, respuesta);
            questionListByLevel2.add(question);
        }
        totalQuestions.add(questionListByLevel2);
        List<Question>       questionListByLevel3 = new ArrayList<>();
        for (JsonElement questionElement : jsonArrayQuestions3) {
            JsonObject questionJsonObject = questionElement.getAsJsonObject();
            String categoria = questionJsonObject.get("categoria").getAsString();
            String nivel = questionJsonObject.get("nivel").getAsString();
            String pregunta = questionJsonObject.get("pregunta").getAsString();
            String opcion1 = questionJsonObject.get("opcion1").getAsString();
            String opcion2 = questionJsonObject.get("opcion2").getAsString();
            String opcion3 = questionJsonObject.get("opcion3").getAsString();
            String opcion4 = questionJsonObject.get("opcion4").getAsString();
            String respuesta = questionJsonObject.get("respuesta").getAsString();
            question = new Question(categoria, nivel, pregunta, opcion1, opcion2, opcion3, opcion4, respuesta);
            questionListByLevel3.add(question);
        }
        totalQuestions.add(questionListByLevel3);
        List<Question>       questionListByLevel4 = new ArrayList<>();
        for (JsonElement questionElement : jsonArrayQuestions4) {
            JsonObject questionJsonObject = questionElement.getAsJsonObject();
            String categoria = questionJsonObject.get("categoria").getAsString();
            String nivel = questionJsonObject.get("nivel").getAsString();
            String pregunta = questionJsonObject.get("pregunta").getAsString();
            String opcion1 = questionJsonObject.get("opcion1").getAsString();
            String opcion2 = questionJsonObject.get("opcion2").getAsString();
            String opcion3 = questionJsonObject.get("opcion3").getAsString();
            String opcion4 = questionJsonObject.get("opcion4").getAsString();
            String respuesta = questionJsonObject.get("respuesta").getAsString();
            question = new Question(categoria, nivel, pregunta, opcion1, opcion2, opcion3, opcion4, respuesta);
            questionListByLevel4.add(question);
        }
        totalQuestions.add(questionListByLevel4);
        List<Question>       questionListByLevel5 = new ArrayList<>();
        for (JsonElement questionElement : jsonArrayQuestions5) {
            JsonObject questionJsonObject = questionElement.getAsJsonObject();
            String categoria = questionJsonObject.get("categoria").getAsString();
            String nivel = questionJsonObject.get("nivel").getAsString();
            String pregunta = questionJsonObject.get("pregunta").getAsString();
            String opcion1 = questionJsonObject.get("opcion1").getAsString();
            String opcion2 = questionJsonObject.get("opcion2").getAsString();
            String opcion3 = questionJsonObject.get("opcion3").getAsString();
            String opcion4 = questionJsonObject.get("opcion4").getAsString();
            String respuesta = questionJsonObject.get("respuesta").getAsString();
            question = new Question(categoria, nivel, pregunta, opcion1, opcion2, opcion3, opcion4, respuesta);
            questionListByLevel5.add(question);
        }
        totalQuestions.add(questionListByLevel5);
        return totalQuestions;
    }
}
