package com.example.surelypresent.app.LoginFeature.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.surelypresent.R;

public class accountSignUp extends AppCompatActivity {

    private boolean passwordVisible = false;
    private boolean confirmVisible = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_account_sign_up);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        EditText etContact = findViewById(R.id.etContact);
        EditText etRegId = findViewById(R.id.etRegId);
        EditText etRegPassword = findViewById(R.id.etRegPassword);
        EditText etRegConfirm = findViewById(R.id.etRegConfirm);
        ImageView ivTogglePassword = findViewById(R.id.ivToggleRegPassword);        ImageView ivToggleConfirm = findViewById(R.id.ivToggleConfirm);
        Button btnRegister = findViewById(R.id.btnRegister);

        // Show / hide password
        ivTogglePassword.setOnClickListener(v -> {
            passwordVisible = !passwordVisible;

            if (passwordVisible) {
                etRegPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                ivTogglePassword.setImageResource(R.drawable.ic_eye);
            } else {
                etRegPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                ivTogglePassword.setImageResource(R.drawable.ic_eye_off);
            }

            etRegPassword.setSelection(etRegPassword.getText().length());
        });

        // Show / hide confirm password
        ivToggleConfirm.setOnClickListener(v -> {
            confirmVisible = !confirmVisible;

            if (confirmVisible) {
                etRegConfirm.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                ivToggleConfirm.setImageResource(R.drawable.ic_eye);
            } else {
                etRegConfirm.setTransformationMethod(PasswordTransformationMethod.getInstance());
                ivToggleConfirm.setImageResource(R.drawable.ic_eye_off);
            }

            etRegConfirm.setSelection(etRegConfirm.getText().length());
        });

        // Register button
        btnRegister.setOnClickListener(v -> {
            String contact = etContact.getText().toString().trim();
            String id = etRegId.getText().toString().trim();
            String password = etRegPassword.getText().toString();
            String confirm = etRegConfirm.getText().toString();

            if (contact.isEmpty()) {
                etContact.setError("Enter your phone number or email");
                etContact.requestFocus();
                return;
            }
            if (id.isEmpty()) {
                etRegId.setError("Enter your ID number");
                etRegId.requestFocus();
                return;
            }
            if (password.length() < 6) {
                etRegPassword.setError("Password must be at least 6 characters");
                etRegPassword.requestFocus();
                return;
            }
            if (!password.equals(confirm)) {
                etRegConfirm.setError("Passwords do not match");
                etRegConfirm.requestFocus();
                return;
            }

            // TODO: save the new account (database/API)
            Toast.makeText(this, "Account created! Please log in.", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(accountSignUp.this, LoginScreen.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();
        });
    }
}