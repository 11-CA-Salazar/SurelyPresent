package com.example.surelypresent.app.Dashboard.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.surelypresent.R;
import com.example.surelypresent.app.MainFunctions.presentation.ChangePasswordRequest;
import com.example.surelypresent.app.MainFunctions.presentation.TimeAndLocation;

public class AdminDashboard extends AppCompatActivity {

    private String adminId = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_admin_dashboard);
        View root = findViewById(android.R.id.content);
        if (root != null) {
            ViewCompat.setOnApplyWindowInsetsListener(root, (v, insets) -> {
                Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                return insets;
            });
        }

        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("ID_NUMBER")) {
            adminId = intent.getStringExtra("ID_NUMBER");
        }

        // TIME OF LOCATION button
        Button classroomButton = findViewById(R.id.classroomButton);
        if (classroomButton != null) {
            classroomButton.setOnClickListener(v -> {
                Intent timeLocIntent = new Intent(AdminDashboard.this, TimeAndLocation.class);
                timeLocIntent.putExtra("ID_NUMBER", adminId);
                startActivity(timeLocIntent);
            });
        }

        // Student Request button
        Button restroomButton = findViewById(R.id.restroomButton);
        if (restroomButton != null) {
            restroomButton.setOnClickListener(v -> {
                Intent requestIntent = new Intent(AdminDashboard.this, ChangePasswordRequest.class);
                requestIntent.putExtra("ID_NUMBER", adminId);
                startActivity(requestIntent);
            });
        }
    }
}
