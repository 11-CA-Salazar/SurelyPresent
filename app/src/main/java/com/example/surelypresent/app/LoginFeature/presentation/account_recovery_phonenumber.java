package com.example.surelypresent.app.LoginFeature.presentation;

import android.content.Intent;
import android.os.Bundle;
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

        EditText etRecoverId = findViewById(R.id.etRecoverId);
        EditText etRecoveryNumber = findViewById(R.id.etRecoveryEmail); // same ID as the email layout
        Button btnSendCode = findViewById(R.id.btnSendCode);
        TextView tvTryAnother = findViewById(R.id.tvTryAnother);

        // Send recovery code -> OTP page
        btnSendCode.setOnClickListener(v -> {
            String id = etRecoverId.getText().toString().trim();
            String number = etRecoveryNumber.getText().toString().trim();

            if (id.isEmpty()) {
                etRecoverId.setError("Enter your ID number");
                etRecoverId.requestFocus();
                return;
            }
            if (number.length() < 10) {
                etRecoveryNumber.setError("Enter a valid phone number");
                etRecoveryNumber.requestFocus();
                return;
            }

            // TODO: send the SMS code (backend)
            Intent intent = new Intent(account_recovery_phonenumber.this, authVerification.class);
            intent.putExtra("ID_NUMBER", id);
            intent.putExtra("RECOVERY_METHOD", "phone");
            intent.putExtra("RECOVERY_TARGET", number);
            startActivity(intent);
        });

        // Try another way -> Email recovery
        tvTryAnother.setOnClickListener(v -> {
            startActivity(new Intent(account_recovery_phonenumber.this, AccountRecovery_Email.class));
            finish();
        });
    }
}