package com.example.chboardgame;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QuestionsActivity extends AppCompatActivity {
    Integer currentPageIndex = QuestionsController.firstQuestionIndex;

    QuestionsController questionsController = new QuestionsController();

    Button button1;
    Button button2;
    Button button3;
    TextView question;
    ImageButton back;
    ImageButton home;
    ImageView image;


    List<Integer> pagesHistory = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        questionsController.init();

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_questions);

        List<Integer> activityHistory = new ArrayList<>();
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        question = findViewById(R.id.topic);
        back = findViewById(R.id.priveouseQuestion);
        home = findViewById(R.id.mainMenuReverse);
        image = findViewById(R.id.mainImage);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeTitle(0);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeTitle(1);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeTitle(2);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuestionsActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeTitle(3);
            }
        });
        changeTitle(-1);
    }

    protected void changeTitle(int buttonNum) {
        QuestionsController.Question currentQuestion = questionsController.getQuestion(currentPageIndex);

        if (buttonNum == 3 && pagesHistory.size() > 1) {
            //возврат на предыдущую
            pagesHistory.remove(pagesHistory.size() - 1);
            currentPageIndex = pagesHistory.remove(pagesHistory.size() - 1);
        } else if (buttonNum >= 0 && currentQuestion.nextQuestions.size() > buttonNum) {
            //переходы на следующий
            currentPageIndex = currentQuestion.getNextQuestion(buttonNum);
        }
        currentQuestion = questionsController.getQuestion(currentPageIndex);

        //Заполняем историю вопросов
        pagesHistory.add(currentQuestion.currentQuestionIndex);

        //тут скрываем все кнопки изначально
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        question.setText(currentQuestion.title);

        //устанавливаем начальное изображение
        image.setImageDrawable(Drawable.createFromPath(currentQuestion.image));


        //Текст на кнопках
        if (currentQuestion.answers.size() > 0) {
            button1.setText(currentQuestion.getAnswer(0));
            button1.setEnabled(true);
        }
        if (currentQuestion.answers.size() > 1) {
            button2.setText(currentQuestion.getAnswer(1));
            button2.setEnabled(true);
        }
        if (currentQuestion.answers.size() > 2) {
            button3.setText(currentQuestion.getAnswer(2));
            button3.setEnabled(true);
        }
    }
}
