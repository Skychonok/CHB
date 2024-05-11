package com.example.chboardgame;

import java.util.ArrayList;
import java.util.List;

public class QuestionBank {
    static public List<QuestionsController.Question> buildQuestions() {
        List<QuestionsController.Question> questions = new ArrayList<>();

        /*
        Предполагаем что все страницы являются вопросами, даже финальные, у них просто нет ответов
        Все страныцы нумеруются начиная с нулевой и отображение к ним идет через индекс поэтому важно в каком порядке они добавлены
        Конечные ответы пишем первыми в списке
        */

//индекс: 0
        questions.add(new QuestionsController.QuestionBuilder()
                .addIndex(0)
                .addTitle("Play solo or with others?")
                .addAnswer("Solo", 1)
                .addImage("@drawable/cbg")
                .getQuestion()
        );
//индекс: 1
        questions.add(new QuestionsController.QuestionBuilder()
                .addIndex(1)
                .addTitle("Brain burning?")
                .addAnswer("Make it melt", 2)
                .addAnswer("Not at all", 3)
                .addAnswer("A little", 10)
                .addImage("@drawable/cbg")
                .getQuestion()
        );
//индекс: 2
        questions.add(new QuestionsController.QuestionBuilder()
                .addIndex(2)
                .addTitle("Mage knight")
                        .addImage("@drawable/mageknight")
                .getQuestion()
        );
//индекс: 3
        questions.add(new QuestionsController.QuestionBuilder()
                .addIndex(3)
                .addTitle("Like to negotiate?")
                .addAnswer("Yes", 4)
                .addAnswer("No", 5)
                .addImage("@drawable/cbg")
                .getQuestion()
        );
//индекс: 4
        questions.add(new QuestionsController.QuestionBuilder()
                .addIndex(4)
                .addTitle("Hostage negotiation")
                .addImage("@drawable/hostage")
                .getQuestion()
        );
//индекс: 5

        questions.add(new QuestionsController.QuestionBuilder()
                .addIndex(5)
                .addTitle("Like being trapped?")
                .addAnswer("Yes", 7)
                .addAnswer("No", 6)
                .addImage("@drawable/cbg")
                .getQuestion()
        );
//индекс: 6
        questions.add(new QuestionsController.QuestionBuilder()
                .addIndex(6)
                .addTitle("Epic")
                .addImage("@drawable/epic")
                .getQuestion()
        );
//индекс: 7
        questions.add(new QuestionsController.QuestionBuilder()
                .addIndex(7)
                .addTitle("Escape what?")
                .addAnswer("Dream", 8)
                .addAnswer("Island", 9)
                .addImage("@drawable/cbg")
                .getQuestion()
        );
//индекс: 8
        questions.add(new QuestionsController.QuestionBuilder()
                .addIndex(8)
                .addTitle("Onirim")
                .addImage("@drawable/onirim")
                .getQuestion()
        );

//индекс: 9
        questions.add(new QuestionsController.QuestionBuilder()
                .addIndex(9)
                .addTitle("Friday")
                .addImage("@drawable/friday")
                .getQuestion()
        );
//индекс: 10
        questions.add(new QuestionsController.QuestionBuilder()
                .addIndex(10)
                .addTitle("Investigate horror?")
                .addAnswer("Yes", 11)
                .addAnswer("No", 12)
                .addImage("@drawable/cbg")
                .getQuestion()
        );
//индекс: 11
        questions.add(new QuestionsController.QuestionBuilder()
                .addIndex(11)
                .addTitle("Arkham Horror")
                .addImage("@drawable/arkham")
                .getQuestion()
        );
//индекс: 12
        questions.add(new QuestionsController.QuestionBuilder()
                .addIndex(12)
                .addTitle("War or peace?")
                .addAnswer("War", 13)
                .addAnswer("Peace", 14)
                .addImage("@drawable/cbg")
                .getQuestion()
        );
//индекс: 13
        questions.add(new QuestionsController.QuestionBuilder()
                .addIndex(13)
                .addTitle("This war of mine")
                .addImage("@drawable/thiswar")
                .getQuestion()
        );
//индекс: 14
        questions.add(new QuestionsController.QuestionBuilder()
                .addIndex(14)
                .addTitle("Build empire in space or earth?")
                .addAnswer("Earth", 15)
                .addAnswer("Space", 16)
                .addImage("@drawable/cbg")
                .getQuestion()
        );
//индекс: 15
        questions.add(new QuestionsController.QuestionBuilder()
                .addIndex(15)
                .addTitle("Scythe")
                .addImage("@drawable/scythe")
                .getQuestion()
        );
//индекс: 16
        questions.add(new QuestionsController.QuestionBuilder()
                .addIndex(16)
                .addTitle("Terra forming MARS")
                .addImage("@drawable/terraformingmars")
                .getQuestion()
        );
        return questions;
    }

}
