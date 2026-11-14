package com.example.surelypresent.app.LoginFeature.presentation;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.surelypresent.R;
import com.example.surelypresent.app.Dashboard.presentation.OrdinaryStudent;

public class LoginScreen extends AppCompatActivity {

    private boolean passwordVisible = false;
    private EditText etId, etPassword;

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

        etId = findViewById(R.id.etId);
        etPassword = findViewById(R.id.etPassword);
        ImageView ivToggle = findViewById(R.id.ivTogglePassword);
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

            etPassword.setSelection(etPassword.getText().length());
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

            SharedPreferences prefs = getSharedPreferences("accounts", MODE_PRIVATE);
            String saved = prefs.getString("pw_" + id, null);
            if (saved != null && !saved.equals(password)) {
                etPassword.setError("Wrong password");
                etPassword.requestFocus();
                return;
            }

            // TODO: validate credentials (database/API) before continuing
            Intent intent = new Intent(LoginScreen.this, OrdinaryStudent.class);
            intent.putExtra("ID_NUMBER", id);
            startActivity(intent);
            finish();
        });

        // Forgot password -> Email recovery
        tvForgot.setOnClickListener(v ->
                startActivity(new Intent(LoginScreen.this, AccountRecovery_Email.class)));

        // Register -> Sign up
        tvRegister.setOnClickListener(v ->
                startActivity(new Intent(LoginScreen.this, accountSignUp.class)));
    }

    // Receives the ID and new password after changing the password
    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        String id = intent.getStringExtra("ID_NUMBER");
        String pass = intent.getStringExtra("NEW_PASSWORD");
        if (id != null) etId.setText(id);
        if (pass != null) etPassword.setText(pass);
    }
}