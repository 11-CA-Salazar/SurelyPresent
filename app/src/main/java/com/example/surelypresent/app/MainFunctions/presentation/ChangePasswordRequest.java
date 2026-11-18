package com.example.surelypresent.app.MainFunctions.presentation;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.transition.TransitionManager;

import com.example.surelypresent.R;

public class ChangePasswordRequest extends AppCompatActivity {

    private Dialog requestDialog;
    private ViewGroup container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_incoming_request);

        View root = findViewById(android.R.id.content);
        if (root != null) {
            ViewCompat.setOnApplyWindowInsetsListener(root, (v, insets) -> {
                Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                return insets;
            });
        }

        container = findViewById(R.id.requestContainer);

        ImageButton btnBack = findViewById(R.id.btnBack);
        if (btnBack != null) {
            btnBack.setOnClickListener(v -> finish());
        }

        setupRequestCard(R.id.header1, R.id.panel1, R.id.btnYes1, R.id.btnNo1);
        setupRequestCard(R.id.header2, R.id.panel2, R.id.btnYes2, R.id.btnNo2);
        setupRequestCard(R.id.header3, R.id.panel3, R.id.btnYes3, R.id.btnNo3);
        setupRequestCard(R.id.header4, R.id.panel4, R.id.btnYes4, R.id.btnNo4);
        setupRequestCard(R.id.header5, R.id.panel5, R.id.btnYes5, R.id.btnNo5);
    }

    private void setupRequestCard(int headerId, int panelId, int yesBtnId, int noBtnId) {
        View header = findViewById(headerId);
        View panel = findViewById(panelId);
        Button btnYes = findViewById(yesBtnId);
        Button btnNo = findViewById(noBtnId);

        if (header != null && panel != null) {
            header.setOnClickListener(v -> {
                if (container != null) {
                    TransitionManager.beginDelayedTransition(container);
                }
                boolean isCurrentlyVisible = (panel.getVisibility() == View.VISIBLE);
                hideAllPanels();
                if (!isCurrentlyVisible) {
                    panel.setVisibility(View.VISIBLE);
                }
            });
        }

        if (btnYes != null) {
            btnYes.setOnClickListener(v -> showRequestPopup());
        }

        if (btnNo != null && panel != null) {
            btnNo.setOnClickListener(v -> {
                if (container != null) {
                    TransitionManager.beginDelayedTransition(container);
                }
                panel.setVisibility(View.GONE);
            });
        }
    }

    private void hideAllPanels() {
        int[] panelIds = {R.id.panel1, R.id.panel2, R.id.panel3, R.id.panel4, R.id.panel5};
        for (int id : panelIds) {
            View p = findViewById(id);
            if (p != null) {
                p.setVisibility(View.GONE);
            }
        }
    }

    private void showRequestPopup() {
        if (requestDialog != null && requestDialog.isShowing()) {
            return;
        }

        requestDialog = new Dialog(this);
        requestDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        requestDialog.setContentView(R.layout.activity_request_popup);
        requestDialog.setCancelable(true);
        requestDialog.setCanceledOnTouchOutside(true);

        if (requestDialog.getWindow() != null) {
            requestDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            requestDialog.getWindow().setLayout(
                    (int) (getResources().getDisplayMetrics().widthPixels * 0.85),
                    ViewGroup.LayoutParams.WRAP_CONTENT);
        }

        requestDialog.show();
    }

    @Override
    protected void onDestroy() {
        if (requestDialog != null && requestDialog.isShowing()) {
            requestDialog.dismiss();
        }
        super.onDestroy();
    }
}
