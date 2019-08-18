package com.example.android.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitQuiz(View view) {

        CheckBox Answer11CheckBox = (CheckBox) findViewById(R.id.answer_1_1_check_box);
        Boolean Answer11Checked = Answer11CheckBox.isChecked();

        CheckBox Answer12CheckBox = (CheckBox) findViewById(R.id.answer_1_2_check_box);
        Boolean Answer12Checked = Answer12CheckBox.isChecked();

        CheckBox Answer13CheckBox = (CheckBox) findViewById(R.id.answer_1_3_check_box);
        Boolean Answer13Checked = Answer13CheckBox.isChecked();

        CheckBox Answer14CheckBox = (CheckBox) findViewById(R.id.answer_1_4_check_box);
        Boolean Answer14Checked = Answer14CheckBox.isChecked();

        Boolean answerCorrect = false;

        if (Answer11Checked) {
            if (!Answer12Checked) {
                if (!Answer13Checked) {
                    if (!Answer14Checked) {
                        answerCorrect = true;
                    }
                }
            }
        }

        showQuizResultsToast(answerCorrect);
    }

    private void showQuizResultsToast(Boolean answerCorrect) {
        if (answerCorrect) {

            Toast toast = Toast.makeText(getApplicationContext(),
                    "You answered the quiz correctly!",
                    Toast.LENGTH_SHORT);
            toast.show();


        } else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "You answered the quiz incorrectly. :(",
                    Toast.LENGTH_SHORT);
            toast.show();
        }


    }
}
