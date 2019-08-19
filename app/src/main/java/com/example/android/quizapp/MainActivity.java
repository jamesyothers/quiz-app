package com.example.android.quizapp;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    boolean firstQuestionCorrect = false;
    boolean secondQuestionCorrect = false;
    boolean thirdQuestionCorrect = false;
    boolean fourthQuestionCorrect = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitQuiz(View view) {

        checkFirstQuestion();
        checkFourthQuestion();

        int quizPercentage = calculateScore();

        // call the toast message function

        showQuizResultsToast(quizPercentage);

    }

    private void checkFirstQuestion() {

        // Get question input values

        CheckBox Answer11CheckBox = findViewById(R.id.answer_1_1_check_box);
        boolean Answer11Checked = Answer11CheckBox.isChecked();

        CheckBox Answer12CheckBox = findViewById(R.id.answer_1_2_check_box);
        boolean Answer12Checked = Answer12CheckBox.isChecked();

        CheckBox Answer13CheckBox = findViewById(R.id.answer_1_3_check_box);
        boolean Answer13Checked = Answer13CheckBox.isChecked();

        CheckBox Answer14CheckBox = findViewById(R.id.answer_1_4_check_box);
        boolean Answer14Checked = Answer14CheckBox.isChecked();

        // Check if first question is correct

        firstQuestionCorrect = Answer11Checked && Answer12Checked && Answer13Checked && Answer14Checked;
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.second_question_answer_1:
                if (checked) {
                    secondQuestionCorrect = false;
                }
                break;
            case R.id.second_question_answer_2:
                if (checked) {
                    secondQuestionCorrect = true;
                }
                break;

            case R.id.second_question_answer_3:
                if (checked) {
                    secondQuestionCorrect = false;
                }
                break;

            case R.id.second_question_answer_4:
                if (checked) {
                    secondQuestionCorrect = false;
                }
                break;

            case R.id.third_question_answer_1:
                if (checked) {
                    thirdQuestionCorrect = false;
                }
                break;

            case R.id.third_question_answer_2:
                if (checked) {
                    thirdQuestionCorrect = false;
                }
                break;

            case R.id.third_question_answer_3:
                if (checked) {
                    thirdQuestionCorrect = true;
                }
                break;

            case R.id.third_question_answer_4:
                if (checked) {
                    thirdQuestionCorrect = false;
                }
                break;
        }
    }

    private void checkFourthQuestion() {

        // Get Fourth question input value

        EditText questionFourAnswer = findViewById(R.id.question_4_edit_text);
        String questionFourAnswerString = questionFourAnswer.getText().toString();

        if (questionFourAnswerString.equals("quark")) {
            fourthQuestionCorrect = true;
        } else if (questionFourAnswerString.equals("Quark")) {
            fourthQuestionCorrect = true;
        } else fourthQuestionCorrect = questionFourAnswerString.equals("QUARK");
    }

    private int calculateScore() {

        int score = 0;

        if (firstQuestionCorrect) {
            score = score + 25;
        }

        if (secondQuestionCorrect) {
            score = score + 25;
        }

        if (thirdQuestionCorrect) {
            score = score + 25;
        }

        if (fourthQuestionCorrect) {
            score = score + 25;
        }

        return score;
    }

    // show the final quiz result message in a toast

    private void showQuizResultsToast(int quizPercentage) {
        if (quizPercentage == 100) {

            Toast toast = Toast.makeText(getApplicationContext(),
                    "You answered the quiz correctly! Score: 100%",
                    Toast.LENGTH_LONG);
            toast.show();


        } else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "You answered some questions incorrectly. Score: " + quizPercentage + "%. Please try again!",
                    Toast.LENGTH_LONG);
            toast.show();
        }


    }
}
