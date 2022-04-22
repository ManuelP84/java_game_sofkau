package com.sofkau.questions;

import com.sofkau.models.Question;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.*;
import java.io.*;

public class QuestionCollection {
    private static List<Question> questionListByLevel = new ArrayList<>();
    private static List<List<Question>> totalQuestions = new ArrayList<>();
    private final static String ROOT_JSON_FILE = "C:/Users/pined/Desktop/CODE/java/sofka/java11_game_sofkau/src/com/sofkau/questions/questions.json";
    private final static Integer TOTAL_LEVELS = 5;

    public static JsonArray createJsonArray(){
        JsonArray jsonArrayQuestions = new JsonArray();
        try {
            File input = new File(ROOT_JSON_FILE);
            JsonElement fileElement = JsonParser.parseReader(new FileReader(input));
            JsonObject fileObject = fileElement.getAsJsonObject();
            jsonArrayQuestions = fileObject.get("questions").getAsJsonArray();
        } catch (IOException exception) {
            System.out.println("Error al leer archivo");
        }
        return jsonArrayQuestions;
    }

    public static List<List<Question>> populateQuestionList() {
        JsonArray jsonArrayQuestions = createJsonArray();
        Question question;
        Integer counter = 0;

        while (counter < TOTAL_LEVELS) {
            for (JsonElement questionElement : jsonArrayQuestions) {
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
                questionListByLevel.add(question);
            }
            totalQuestions.add(questionListByLevel);
            counter++;
        }
        return totalQuestions;
    }
}
