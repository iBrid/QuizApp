package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void firstQuestion(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.R_button10:
                if (checked)
                    score += 0;
                break;
            case R.id.R_button11:
                if (checked)
                    score += 0;
                break;
            case R.id.R_Button12:
                if (checked)
                    score += 2;
                break;
            case R.id.R_Button13:
                if (checked)
                    score += 0;
                break;
        }
    }

    public void secondQuestion(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.R_Button20:
                if (checked)
                    score += 2;
                break;
            case R.id.R_Button21:
                if (checked)
                    score += 0;
                break;
            case R.id.R_Button22:
                if (checked)
                    score += 0;
                break;
            case R.id.R_Button23:
                if (checked)
                    score += 0;
                break;
        }
    }

    public void fourthQuestion(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.checkbox1:
                if (checked)
                    score += 1;
                break;
            case R.id.checkbox2:
                if (checked)
                    score += 1;
                break;
            case R.id.checkbox3:
                if (checked)
                    score += 0;
                break;
            case R.id.checkbox4:
                if (checked)
                    score += 0;
                break;
        }
    }

    public void fifthQuestion(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.R_Button30:
                if (checked)
                    score += 0;
                break;
            case R.id.R_Button31:
                if (checked)
                    score += 0;
                break;
            case R.id.R_Button32:
                if (checked)
                    score += 2;
                break;
            case R.id.R_Button33:
                if (checked)
                    score += 0;
                break;
        }
    }

    public void submit(View view) {
        EditText text = findViewById(R.id.Text1);
        String value = text.getText().toString();

        if (value.trim().equalsIgnoreCase("mars")) {
            score = score + 2;
            Toast.makeText(this, "You got " + score + " out of 10 points", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "you got " + score + " out of 10 points", Toast.LENGTH_SHORT).show();
        }
    }

    public void tryAgain(View view) {
        score = 0;
        RadioButton myRadioButton1 = findViewById(R.id.R_button10);
        myRadioButton1.setChecked(false);
        RadioButton myRadioButton2 = findViewById(R.id.R_button11);
        myRadioButton2.setChecked(false);
        RadioButton myRadioButton3 = findViewById(R.id.R_Button12);
        myRadioButton3.setChecked(false);
        RadioButton myRadioButton4 = findViewById(R.id.R_Button13);
        myRadioButton4.setChecked(false);
        RadioButton myRadioButton5 = findViewById(R.id.R_Button20);
        myRadioButton5.setChecked(false);
        RadioButton myRadioButton6 = findViewById(R.id.R_Button21);
        myRadioButton6.setChecked(false);
        RadioButton myRadioButton7 = findViewById(R.id.R_Button22);
        myRadioButton7.setChecked(false);
        RadioButton myRadioButton8 = findViewById(R.id.R_Button23);
        myRadioButton8.setChecked(false);
        RadioButton myRadioButton9 = findViewById(R.id.R_Button30);
        myRadioButton9.setChecked(false);
        RadioButton myRadioButton10 = findViewById(R.id.R_Button31);
        myRadioButton10.setChecked(false);
        RadioButton myRadioButton11 = findViewById(R.id.R_Button32);
        myRadioButton11.setChecked(false);
        RadioButton myRadioButton12 = findViewById(R.id.R_Button33);
        myRadioButton12.setChecked(false);
        CheckBox myCheckBox1 = findViewById(R.id.checkbox1);
        myCheckBox1.setChecked(false);
        CheckBox myCheckBox2 = findViewById(R.id.checkbox2);
        myCheckBox2.setChecked(false);
        CheckBox myCheckBox3 = findViewById(R.id.checkbox3);
        myCheckBox3.setChecked(false);
        CheckBox myCheckBox4 = findViewById(R.id.checkbox4);
        myCheckBox4.setChecked(false);
        EditText myText = findViewById(R.id.Text1);
        myText.setText("");

    }
}
