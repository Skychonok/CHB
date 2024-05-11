package com.example.chboardgame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestionsController {

    static public final Integer firstQuestionIndex = 0;
    static public final Integer lastQuestionIndex = 0;

    static public class QuestionBuilder{

        Question question = new Question();

        QuestionBuilder addTitle(String title){
            question.title = title;
            return this;
        }

        QuestionBuilder addAnswer(String answer, Integer nextQuestionIndex){
            question.answers.add(answer);
            question.nextQuestions.add(nextQuestionIndex);
            return this;
        }

        QuestionBuilder addIndex(Integer currentIndex){
            question.currentQuestionIndex = currentIndex;
            return this;
        }
        QuestionBuilder addImage(String image){
            question.image = image;
            return this;
        }

        Question getQuestion(){
            return  question;
        }
    }

    static public class Question {
        String title;
        Integer currentQuestionIndex;
        String image;
        List<String> answers = new ArrayList<>();
        List<Integer> nextQuestions = new ArrayList<>();

        public Integer getNextQuestion(Integer index){
            return (Integer) nextQuestions.toArray()[index];
        }
        public String getAnswer(Integer index){return answers.toArray()[index].toString();}
    }

    List<Question> questions = new ArrayList<>();

    public Question getQuestion(Integer index){
        if(questions.size()>index) {
            return (Question) questions.toArray()[index];
        }
        return new Question();
    }

    public void init(){
        questions = QuestionBank.buildQuestions();
    }
}
