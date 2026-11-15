package com.example.surelypresent.app.Dashboard.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.surelypresent.R;
import com.example.surelypresent.app.MainFunctions.presentation.TimeAndLocation;

public class OrdinaryStudent extends AppCompatActivity {

    private String studentId = "";
    private String selectedRole = "ORDINARY STUDENTT";

    private RadioGroup roleGroup;
    private RadioButton auditorOption;
    private Button classroomButton;
    private Button restroomButton;
    private Button clinicButton; // XML ID: dashboardButton (Text: CLINIC)
    private Button othersButton; // XML ID: clinicButton (Text: OTHERS:)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ordinary_student);

        View root = findViewById(android.R.id.content);
        if (root != null) {
            ViewCompat.setOnApplyWindowInsetsListener(root, (v, insets) -> {
                Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                return insets;
            });
        }

        // Data Capture: Get student ID passed via Intent from Login or previous screen
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("ID_NUMBER")) {
            studentId = intent.getStringExtra("ID_NUMBER");
        }

        // View Initialization
        initializeViews();

        // Event Listeners
        setupEventListeners();
    }

    private void initializeViews() {
        roleGroup = findViewById(R.id.roleGroup);
        auditorOption = findViewById(R.id.auditorOption);
        classroomButton = findViewById(R.id.classroomButton);
        restroomButton = findViewById(R.id.restroomButton);
        clinicButton = findViewById(R.id.dashboardButton);
        othersButton = findViewById(R.id.clinicButton);
    }

    private void setupEventListeners() {
        // RadioGroup role selection event listener
        roleGroup.setOnCheckedChangeListener((group, checkedId) -> {
            if (checkedId == R.id.auditorOption && auditorOption != null) {
                selectedRole = auditorOption.getText().toString();
            }
            Toast.makeText(OrdinaryStudent.this, "Role: " + selectedRole, Toast.LENGTH_SHORT).show();
        });

        // Classroom button click listener
        if (classroomButton != null) {
            classroomButton.setOnClickListener(v -> navigateToLocation("CLASSROOM"));
        }

        // Restroom button click listener
        if (restroomButton != null) {
            restroomButton.setOnClickListener(v -> navigateToLocation("RESTROOM"));
        }

        // Clinic button click listener
        if (clinicButton != null) {
            clinicButton.setOnClickListener(v -> navigateToLocation("CLINIC"));
        }

        // Others button click listener
        if (othersButton != null) {
            othersButton.setOnClickListener(v -> navigateToLocation("OTHERS"));
        }
    }

    private void navigateToLocation(String location) {
        String message = location + " selected for " + selectedRole;
        if (studentId != null && !studentId.isEmpty()) {
            message += " (ID: " + studentId + ")";
        }
        Toast.makeText(OrdinaryStudent.this, message, Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(OrdinaryStudent.this, TimeAndLocation.class);
        intent.putExtra("ID_NUMBER", studentId);
        intent.putExtra("ROLE", selectedRole);
        intent.putExtra("LOCATION", location);
        startActivity(intent);
    }
}