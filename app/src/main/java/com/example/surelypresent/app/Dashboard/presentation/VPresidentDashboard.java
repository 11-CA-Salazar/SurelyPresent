
package com.example.classroomui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class VPresidentDashboard extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.vpresident_dashboard);

        TextView statusText = findViewById(R.id.statusText);
        RadioGroup roleGroup = findViewById(R.id.roleGroup);

        roleGroup.setOnCheckedChangeListener((group, checkedId) -> {
            if (checkedId == R.id.presidentOption) {
                statusText.setText("Selected role: President");
            } else if (checkedId == R.id.vicePresidentOption) {
                statusText.setText("Selected role: V. President");
            }
        });

        setupButton(R.id.classroomButton, "Classroom", statusText);
        setupButton(R.id.restroomButton, "Restroom", statusText);
        setupButton(R.id.clinicButton, "Clinic", statusText);
        setupButton(R.id.dashboardButton, "Dashboard", statusText);
    }

    private void setupButton(
            int id, String name, TextView statusText) {

        Button button = findViewById(id);

        button.setOnClickListener(view -> {
            statusText.setText(name + " selected");

            Toast.makeText(
                    VPresidentDashboard.this,
                    name + " tapped",
                    Toast.LENGTH_SHORT
            ).show();
        });
    }
}
