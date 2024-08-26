package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private VariousCourse expert = new VariousCourse();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickSeekMenu(View view) {
        Spinner CourseSpinner = (Spinner) findViewById(R.id.CourseSpinner);
        String SelectedCourse = String.valueOf(CourseSpinner.getSelectedItem());

        List<String> courseList = expert.getMenu(SelectedCourse);

        StringBuilder courseFormatted = new StringBuilder();
        for (String course : courseList) {
            courseFormatted.append(course).append('\n');
        }

        TextView MenuTextView = (TextView) findViewById(R.id.MenuTextView);
        MenuTextView.setText(courseFormatted);
    }
}