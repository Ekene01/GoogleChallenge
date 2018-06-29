package com.storystones.android.musictriviaquiz;

public class QuestionLibrary {

    /**
     * This method contains all the questions in the question library
     */

    public String mQuestions [] = {
            "Whose 2013 world tour was called ‘The Mrs Carter Show’?",
            "What was Madonna’s first UK top ten single?",
            "Which country pop singer was born Eilleen Regina Edwards?",
            "The live album Beauty and the Beat featured pianist George Shearring and which singer?",
            "Whose band was the Tijuana Brass?",
            "Who were Cliff Richard’s backing group through the 60s?",
            "Stewart Copeland was the drummer with which band?"

    };

    /**
     * This method contains all the options for the questions in the question library
     */

    private String mChoices [] [] = {
            {"Beyonce", "Shakira"},
            {"Material Girl", "Holiday"},
            {"Faith Hill", "Shania Twain"},
            {"Peggy Lee", "Doris Day"},
            {"Herb Alpert", "Sergio Mendes"},
            {"The Shadows", "The Drifters"},
            {"Synchronicity", "The Police"}
    };

    /**
     * This method contains all the correct answers to the questions in the question library
     */

    private String mCorrectAnswers[] = {"Beyonce", "Holiday", "Shania Twain", "Peggy Lee","Herb Alpert", "The Shadows", "The Police"};


    /**
     * Getters
     */

    public String getQuestions (int a) {
        String question;
        question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice0;
        choice0 = mChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a){
        String choice1;
        choice1 = mChoices[a][1];
        return choice1;
    }

    public String getCorrectAnswer(int a){
        String answer;
        answer = mCorrectAnswers[a];
        return answer;
    }
}
