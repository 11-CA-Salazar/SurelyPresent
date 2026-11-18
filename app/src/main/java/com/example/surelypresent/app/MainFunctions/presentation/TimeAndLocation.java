package com.example.surelypresent.app.MainFunctions.presentation;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.surelypresent.R;

import java.util.ArrayList;
import java.util.List;

public class TimeAndLocation extends AppCompatActivity {

    private Dialog successDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_time_and_location);

        View root = findViewById(R.id.main);
        if (root == null) {
            root = findViewById(android.R.id.content);
        }
        if (root != null) {
            ViewCompat.setOnApplyWindowInsetsListener(root, (v, insets) -> {
                Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                return insets;
            });
        }

        ImageButton ivBack = findViewById(R.id.ivBack);
        if (ivBack != null) {
            ivBack.setOnClickListener(v -> finish());
        }

        setupList();
    }

    private void setupList() {
        // Needs a RecyclerView with id rvTimeLocation in activity_time_and_location.xml
        RecyclerView rv = findViewById(R.id.rvTimeLocation);
        if (rv == null) return;

        List<TimeLocationAdapter.Entry> data = new ArrayList<>();
        data.add(new TimeLocationAdapter.Entry("Joaquin, Rain: Student", "Clinic", "St. Carlo Acutis", "2:15 pm"));
        data.add(new TimeLocationAdapter.Entry("Salazar Clyde: Student", "Restroom", "St. Carlo Acutis", "1:12 pm"));
        data.add(new TimeLocationAdapter.Entry("Galang, Naz: Student", "Restroom", "St. Carlo Acutis", "12:20 pm"));
        data.add(new TimeLocationAdapter.Entry("Cerbito, Angelo: Student", "Restroom", "St. Joseph Calasanctius", "12:00 pm"));
        data.add(new TimeLocationAdapter.Entry("John Paul Rodrigo: Teacher", "Gymnasium", "St. Andrew The Apostle", "12:00 pm"));
        data.add(new TimeLocationAdapter.Entry("Lucas Avila: Teacher", "Room 303", "", "12:00 pm"));

        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new TimeLocationAdapter(data, entry -> {
            // Rows whose place is "Others" are not registered with the popup
            if (!"Others".equalsIgnoreCase(entry.place)) {
                showSuccessPopup();
            }
        }));
    }

    private void showSuccessPopup() {
        if (successDialog != null && successDialog.isShowing()) {
            return;
        }

        successDialog = new Dialog(this);
        successDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        successDialog.setContentView(R.layout.activity_timeofloc_popup);
        successDialog.setCancelable(true);

        if (successDialog.getWindow() != null) {
            successDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            successDialog.getWindow().setLayout(
                    (int) (getResources().getDisplayMetrics().widthPixels * 0.85),
                    ViewGroup.LayoutParams.WRAP_CONTENT);
        }

        successDialog.show();

        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            if (successDialog != null && successDialog.isShowing() && !isFinishing()) {
                successDialog.dismiss();
            }
        }, 2000);
    }

    @Override
    protected void onDestroy() {
        if (successDialog != null && successDialog.isShowing()) {
            successDialog.dismiss();
        }
        super.onDestroy();
    }
}