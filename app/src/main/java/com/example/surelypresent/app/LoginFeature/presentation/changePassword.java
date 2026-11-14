package com.example.surelypresent.app.LoginFeature.presentation;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
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

public class changePassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_change_password);

        View root = findViewById(android.R.id.content);
        if (root != null) {
            ViewCompat.setOnApplyWindowInsetsListener(root, (v, insets) -> {
                Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                return insets;
            });
        }

        String idNumber = getIntent().getStringExtra("ID_NUMBER");

        EditText etOldPassword = findViewById(R.id.etOldPassword);
        EditText etNewPassword = findViewById(R.id.etNewPassword);
        EditText etConfirmNewPassword = findViewById(R.id.etConfirmNewPassword);
        ImageView ivToggleOld = findViewById(R.id.ivToggleOld);
        ImageView ivToggleNew = findViewById(R.id.ivToggleNew);
        ImageView ivToggleConfirm = findViewById(R.id.ivToggleConfirmNew);
        Button btnChangePassword = findViewById(R.id.btnChangePassword);

        // Show / hide password on all three boxes
        setupToggle(etOldPassword, ivToggleOld);
        setupToggle(etNewPassword, ivToggleNew);
        setupToggle(etConfirmNewPassword, ivToggleConfirm);

        // Coming from password recovery: there is no old password to enter, so hide that row
        if (idNumber != null) {
            ((View) etOldPassword.getParent()).setVisibility(View.GONE);
        }

        btnChangePassword.setOnClickListener(v -> {
            String newPass = etNewPassword.getText().toString();
            String confirm = etConfirmNewPassword.getText().toString();

            if (newPass.length() < 6) {
                etNewPassword.setError("Password must be at least 6 characters");
                etNewPassword.requestFocus();
                return;
            }
            if (!newPass.equals(confirm)) {
                etConfirmNewPassword.setError("Passwords do not match");
                etConfirmNewPassword.requestFocus();
                return;
            }

            // TODO: replace with a backend call that updates the password
            if (idNumber != null) {
                SharedPreferences prefs = getSharedPreferences("accounts", MODE_PRIVATE);
                prefs.edit().putString("pw_" + idNumber, newPass).apply();
            }

            Toast.makeText(this, "Password changed! Please log in.", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(changePassword.this, LoginScreen.class);
            intent.putExtra("ID_NUMBER", idNumber);
            intent.putExtra("NEW_PASSWORD", newPass);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(intent);
            finish();
        });
    }

    // The same show/hide logic you pasted, reusable for any password box
    private void setupToggle(EditText field, ImageView toggle) {
        toggle.setOnClickListener(v -> {
            boolean currentlyHidden =
                    field.getTransformationMethod() instanceof PasswordTransformationMethod;

            if (currentlyHidden) {
                field.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                toggle.setImageResource(R.drawable.ic_eye);
            } else {
                field.setTransformationMethod(PasswordTransformationMethod.getInstance());
                toggle.setImageResource(R.drawable.ic_eye_off);
            }

            field.setSelection(field.getText().length());
        });
    }
}