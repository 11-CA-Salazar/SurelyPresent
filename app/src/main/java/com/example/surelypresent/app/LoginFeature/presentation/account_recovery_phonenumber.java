package com.example.surelypresent.app.LoginFeature.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.surelypresent.R;

public class account_recovery_phonenumber extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_account_recovery_phonenumber);

        View root = findViewById(R.id.numberAccountRecovery);
        if (root != null) {
            ViewCompat.setOnApplyWindowInsetsListener(root, (v, insets) -> {
                Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                return insets;
            });
        }

        TextView tvTryAnother = findViewById(R.id.tvTryAnother);

        // Try another way -> back to Email recovery
        tvTryAnother.setOnClickListener(v -> {
            Intent intent = new Intent(account_recovery_phonenumber.this, AccountRecovery_Email.class);
            startActivity(intent);
            finish();
        });
    }
}