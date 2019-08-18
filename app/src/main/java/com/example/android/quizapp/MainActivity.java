package com.example.android.quizapp;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int numberOfQuestions = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitQuiz(View view) {

        // Get first question input values

        CheckBox Answer11CheckBox = (CheckBox) findViewById(R.id.answer_1_1_check_box);
        Boolean Answer11Checked = Answer11CheckBox.isChecked();

        CheckBox Answer12CheckBox = (CheckBox) findViewById(R.id.answer_1_2_check_box);
        Boolean Answer12Checked = Answer12CheckBox.isChecked();

        CheckBox Answer13CheckBox = (CheckBox) findViewById(R.id.answer_1_3_check_box);
        Boolean Answer13Checked = Answer13CheckBox.isChecked();

        CheckBox Answer14CheckBox = (CheckBox) findViewById(R.id.answer_1_4_check_box);
        Boolean Answer14Checked = Answer14CheckBox.isChecked();


        // Get Second question input values

        CheckBox Answer21CheckBox = (CheckBox) findViewById(R.id.answer_2_1_check_box);
        Boolean Answer21Checked = Answer21CheckBox.isChecked();

        CheckBox Answer22CheckBox = (CheckBox) findViewById(R.id.answer_2_2_check_box);
        Boolean Answer22Checked = Answer22CheckBox.isChecked();

        CheckBox Answer23CheckBox = (CheckBox) findViewById(R.id.answer_2_3_check_box);
        Boolean Answer23Checked = Answer23CheckBox.isChecked();

        CheckBox Answer24CheckBox = (CheckBox) findViewById(R.id.answer_2_4_check_box);
        Boolean Answer24Checked = Answer24CheckBox.isChecked();

        // Get Third question input values

        CheckBox Answer31CheckBox = (CheckBox) findViewById(R.id.answer_3_1_check_box);
        Boolean Answer31Checked = Answer31CheckBox.isChecked();

        CheckBox Answer32CheckBox = (CheckBox) findViewById(R.id.answer_3_2_check_box);
        Boolean Answer32Checked = Answer32CheckBox.isChecked();

        CheckBox Answer33CheckBox = (CheckBox) findViewById(R.id.answer_3_3_check_box);
        Boolean Answer33Checked = Answer33CheckBox.isChecked();

        CheckBox Answer34CheckBox = (CheckBox) findViewById(R.id.answer_3_4_check_box);
        Boolean Answer34Checked = Answer34CheckBox.isChecked();

        // Get Fourth question input values

        CheckBox Answer41CheckBox = (CheckBox) findViewById(R.id.answer_4_1_check_box);
        Boolean Answer41Checked = Answer41CheckBox.isChecked();

        CheckBox Answer42CheckBox = (CheckBox) findViewById(R.id.answer_4_2_check_box);
        Boolean Answer42Checked = Answer42CheckBox.isChecked();

        CheckBox Answer43CheckBox = (CheckBox) findViewById(R.id.answer_4_3_check_box);
        Boolean Answer43Checked = Answer43CheckBox.isChecked();

        CheckBox Answer44CheckBox = (CheckBox) findViewById(R.id.answer_4_4_check_box);
        Boolean Answer44Checked = Answer44CheckBox.isChecked();


        Boolean answerCorrect1 = false;
        Boolean answerCorrect2 = false;
        Boolean answerCorrect3 = false;
        Boolean answerCorrect4 = false;

        if (Answer11Checked) {
            if (!Answer12Checked) {
                if (!Answer13Checked) {
                    if (!Answer14Checked) {
                        answerCorrect1 = true;
                    }
                }
            }
        }

        if (Answer22Checked) {
            if (!Answer21Checked) {
                if (!Answer23Checked) {
                    if (!Answer24Checked) {
                        answerCorrect2 = true;
                    }
                }
            }
        }

        if (Answer33Checked) {
            if (!Answer31Checked) {
                if (!Answer32Checked) {
                    if (!Answer34Checked) {
                        answerCorrect3 = true;
                    }
                }
            }
        }

        if (Answer44Checked) {
            if (!Answer41Checked) {
                if (!Answer42Checked) {
                    if (!Answer43Checked) {
                        answerCorrect4 = true;
                    }
                }
            }
        }

        Boolean finalQuizResult = false;

        if (answerCorrect1 && answerCorrect2 && answerCorrect3 && answerCorrect4) {
            finalQuizResult = true;
        }

        showQuizResultsToast(finalQuizResult);

    }

    private void showQuizResultsToast(Boolean finalQuizResult) {
        if (finalQuizResult) {

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
