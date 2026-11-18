package com.example.surelypresent.app.MainFunctions.presentation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.TransitionManager;

import com.example.surelypresent.R;

import java.util.List;

public class TimeLocationAdapter extends RecyclerView.Adapter<TimeLocationAdapter.VH> {

    public static class Entry {
        public final String name, place, section, time;

        public Entry(String name, String place, String section, String time) {
            this.name = name;
            this.place = place;
            this.section = section;
            this.time = time;
        }
    }

    public interface OnYesListener {
        void onYes(Entry entry);
    }

    private final List<Entry> items;
    private final OnYesListener yesListener;
    private int expandedPosition = RecyclerView.NO_POSITION;

    public TimeLocationAdapter(List<Entry> items, OnYesListener yesListener) {
        this.items = items;
        this.yesListener = yesListener;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_timeofloc_row, parent, false);
        return new VH(v);
    }

    @Override
    public void onBindViewHolder(@NonNull VH h, int position) {
        Entry e = items.get(position);
        h.tvName.setText(e.name);
        h.tvPlace.setText(e.place);
        h.tvSection.setText(e.section);
        h.tvTime.setText(e.time);

        boolean expanded = position == expandedPosition;
        h.panel.setVisibility(expanded ? View.VISIBLE : View.GONE);

        h.header.setOnClickListener(v -> {
            int pos = h.getBindingAdapterPosition();
            if (pos == RecyclerView.NO_POSITION) return;

            TransitionManager.beginDelayedTransition((ViewGroup) h.itemView.getParent());
            int previous = expandedPosition;
            expandedPosition = (pos == expandedPosition) ? RecyclerView.NO_POSITION : pos;

            if (previous != RecyclerView.NO_POSITION) notifyItemChanged(previous);
            if (expandedPosition != RecyclerView.NO_POSITION) notifyItemChanged(expandedPosition);
        });

        h.btnYes.setOnClickListener(v -> {
            collapse();
            if (yesListener != null) yesListener.onYes(e);
        });
        h.btnNo.setOnClickListener(v -> collapse());
    }

    private void collapse() {
        int previous = expandedPosition;
        expandedPosition = RecyclerView.NO_POSITION;
        if (previous != RecyclerView.NO_POSITION) notifyItemChanged(previous);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class VH extends RecyclerView.ViewHolder {
        final View header, panel, btnYes, btnNo;
        final TextView tvName, tvPlace, tvSection, tvTime;

        VH(@NonNull View itemView) {
            super(itemView);
            header = itemView.findViewById(R.id.cardHeader);
            panel = itemView.findViewById(R.id.panelExpand);
            btnYes = itemView.findViewById(R.id.btnYes);
            btnNo = itemView.findViewById(R.id.btnNo);
            tvName = itemView.findViewById(R.id.tvName);
            tvPlace = itemView.findViewById(R.id.tvPlace);
            tvSection = itemView.findViewById(R.id.tvSection);
            tvTime = itemView.findViewById(R.id.tvTime);
        }
    }
}