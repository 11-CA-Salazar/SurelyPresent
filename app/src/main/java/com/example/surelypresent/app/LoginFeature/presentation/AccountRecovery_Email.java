package com.example.surelypresent.app.LoginFeature.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.surelypresent.R;

public class AccountRecovery_Email extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_account_recovery_email);

        View root = findViewById(R.id.accountRecoveryEmail);
        if (root != null) {
            ViewCompat.setOnApplyWindowInsetsListener(root, (v, insets) -> {
                Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                return insets;
            });
        }

        EditText etRecoverId = findViewById(R.id.etRecoverId);
        EditText etRecoveryEmail = findViewById(R.id.etRecoveryEmail);
        Button btnSendCode = findViewById(R.id.btnSendCode);
        TextView tvTryAnother = findViewById(R.id.tvTryAnother);

        // Send recovery code -> OTP page
        btnSendCode.setOnClickListener(v -> {
            String id = etRecoverId.getText().toString().trim();
            String email = etRecoveryEmail.getText().toString().trim();

            if (id.isEmpty()) {
                etRecoverId.setError("Enter your ID number");
                etRecoverId.requestFocus();
                return;
            }
            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                etRecoveryEmail.setError("Enter a valid email address");
                etRecoveryEmail.requestFocus();
                return;
            }

            // TODO: send the code to the email (backend)
            Intent intent = new Intent(AccountRecovery_Email.this, authVerification.class);
            intent.putExtra("ID_NUMBER", id);
            intent.putExtra("RECOVERY_METHOD", "email");
            intent.putExtra("RECOVERY_TARGET", email);
            startActivity(intent);
        });

        // Try another way -> Number recovery
        tvTryAnother.setOnClickListener(v -> {
            startActivity(new Intent(AccountRecovery_Email.this, account_recovery_phonenumber.class));
            finish();
        });
    }
}