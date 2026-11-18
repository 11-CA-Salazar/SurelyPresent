package com.example.surelypresent.app.LoginFeature.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.surelypresent.R;

public class authVerification extends AppCompatActivity {

    private EditText[] otp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_auth_verification);

        View root = findViewById(R.id.authOTP);
        if (root != null) {
            ViewCompat.setOnApplyWindowInsetsListener(root, (v, insets) -> {
                Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                return insets;
            });
        }

        String idNumber = getIntent().getStringExtra("ID_NUMBER");
        String target = getIntent().getStringExtra("RECOVERY_TARGET");

        otp = new EditText[]{
                findViewById(R.id.etOtp1),
                findViewById(R.id.etOtp2),
                findViewById(R.id.etOtp3),
                findViewById(R.id.etOtp4),
                findViewById(R.id.etOtp5)
        };
        Button btnVerify = findViewById(R.id.btnVerify);
        TextView tvResend = findViewById(R.id.tvResend);
        TextView tvNotifyAdmin = findViewById(R.id.tvNotifyAdmin);

        setupOtpBoxes();

        // Verify code -> Change password
        btnVerify.setOnClickListener(v -> {
            StringBuilder code = new StringBuilder();
            for (EditText box : otp) {
                code.append(box.getText().toString().trim());
            }

            if (code.length() < otp.length) {
                Toast.makeText(this, "Enter the 5-digit code", Toast.LENGTH_SHORT).show();
                return;
            }

            // TODO: check the code against the one your backend sent
            Intent intent = new Intent(authVerification.this, changePassword.class);
            intent.putExtra("ID_NUMBER", idNumber);
            startActivity(intent);
            finish();
        });

        // Resend code
        tvResend.setOnClickListener(v -> {
            // TODO: ask the backend to send a new code
            Toast.makeText(this, "A new code was sent to " + (target != null ? target : "you"),
                    Toast.LENGTH_SHORT).show();
        });

        // Notify admin
        tvNotifyAdmin.setOnClickListener(v -> {
            // TODO: send a request to the admin (backend)
            Toast.makeText(this, "Admin has been notified", Toast.LENGTH_SHORT).show();
        });
    }

    // Move forward when a digit is typed, and back when Backspace is pressed on an empty box
    private void setupOtpBoxes() {
        for (int i = 0; i < otp.length; i++) {
            final int index = i;

            otp[i].addTextChangedListener(new TextWatcher() {
                @Override public void beforeTextChanged(CharSequence s, int st, int c, int a) {}
                @Override public void onTextChanged(CharSequence s, int st, int b, int c) {}

                @Override
                public void afterTextChanged(Editable s) {
                    if (s.length() == 1 && index < otp.length - 1) {
                        otp[index + 1].requestFocus();
                    }
                }
            });

            otp[i].setOnKeyListener((v, keyCode, event) -> {
                if (keyCode == KeyEvent.KEYCODE_DEL
                        && event.getAction() == KeyEvent.ACTION_DOWN
                        && otp[index].getText().length() == 0
                        && index > 0) {
                    otp[index - 1].requestFocus();
                    otp[index - 1].setText("");
                    return true;
                }
                return false;
            });
        }
        otp[0].requestFocus();
    }
}