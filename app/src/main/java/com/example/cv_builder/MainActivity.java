package com.example.cv_builder;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnProfilePicture=findViewById(R.id.btn_profile);
        Button btnPersonalDetails=findViewById(R.id.btn_personal_details);
        Button btnSummary=findViewById(R.id.btn_summary);
        Button btnEducation=findViewById(R.id.btn_education);
        Button btnExperience=findViewById(R.id.btn_experience);
        Button btnCertifications=findViewById(R.id.btn_certifications);
        Button btnReferences=findViewById(R.id.btn_references);

        // Set click listener to navigate to ProfilePicActivity
        btnProfilePicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProfilePicActivity.class);
                startActivity(intent);
            }
        });

        // Set click listener to navigate to Personal_Details_Activity
        btnPersonalDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Personal_Details_Activity.class);
                startActivity(intent);
            }
        });

        // Set click listener to navigate to Summary_Activity
        btnSummary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Summary_Activity.class);
                startActivity(intent);
            }
        });

        // Set click listener to navigate to Education_Activity
        btnEducation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Education_Activity.class);
                startActivity(intent);
            }
        });

        // Set click listener to navigate to Experience_Activity
        btnExperience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Experience_Activity.class);
                startActivity(intent);
            }
        });

        // Set click listener to navigate to Certifications_Activity
        btnCertifications.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Certifications_Activity.class);
                startActivity(intent);
            }
        });

        // Set click listener to navigate to References_Activity
        btnReferences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, References_Activity.class);
                startActivity(intent);
            }
        });
    }
}