package com.example.prefinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class listStudentClass extends AppCompatActivity {
    private Button btnAddStudentClass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_student_class);

        btnAddStudentClass = findViewById(R.id.btnAddStudentClass);

        btnAddStudentClass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(listStudentClass.this, addStudentToClass.class);
                startActivity(intent);
            }
        });

    }
}