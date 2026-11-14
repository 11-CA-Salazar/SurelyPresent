package com.example.surelypresent.app.LoginFeature.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;

import com.example.surelypresent.R;

public class LoginScreen extends AppCompatActivity {

    private boolean passwordVisible = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login_screen);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        EditText etId = findViewById(R.id.etId);
        EditText etPassword = findViewById(R.id.etPassword);
        ImageView ivToggle = findViewById(R.id.ivTogglePassword);
        CheckBox cbRemember = findViewById(R.id.cbRemember);
        Button btnLogin = findViewById(R.id.btnLogin);
        TextView tvForgot = findViewById(R.id.tvForgot);
        TextView tvRegister = findViewById(R.id.tvRegister);

        // Show / hide password
        ivToggle.setOnClickListener(v -> {
            passwordVisible = !passwordVisible;

            if (passwordVisible) {
                etPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                ivToggle.setImageResource(R.drawable.ic_eye);
            } else {
                etPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                ivToggle.setImageResource(R.drawable.ic_eye_off);
            }

            etPassword.setSelection(etPassword.getText().length()); // keep cursor at the end
        });

        // Log in -> Ordinary Student page
        btnLogin.setOnClickListener(v -> {
            String id = etId.getText().toString().trim();
            String password = etPassword.getText().toString();

            if (id.isEmpty()) {
                etId.setError("Enter your ID number");
                etId.requestFocus();
                return;
            }
            if (password.isEmpty()) {
                etPassword.setError("Enter your password");
                etPassword.requestFocus();
                return;
            }

            // TODO: validate credentials (database/API) before continuing
            Intent intent = new Intent(LoginScreen.this, OrdinaryStudentActivity.class);
            intent.putExtra("ID_NUMBER", id);
            startActivity(intent);
            finish();
        });

        tvForgot.setOnClickListener(v -> {
            Intent intent = new Intent(LoginScreen.this, AccountRecovery_Email.class);
            startActivity(intent);
        });

        tvRegister.setOnClickListener(v -> {
            Intent intent = new Intent(LoginScreen.this, accountSignUp.class);
            startActivity(intent);
        });
    }

    // ===== Second screen, nested inside this file =====
    public static class OrdinaryStudentActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            EdgeToEdge.enable(this);
            setContentView(R.layout.activity_ordinary_student);
        }
    }
}