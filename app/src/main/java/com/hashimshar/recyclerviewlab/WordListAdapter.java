package com.hashimshar.recyclerviewlab;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;
import java.util.zip.Inflater;

public class WordListAdapter extends
        RecyclerView.Adapter<WordListAdapter.WordViewHolder> {
    private final LinkedList<String> mWordList;
    private LayoutInflater mInflater;
    Context context;


    public WordListAdapter(Context context,LinkedList<String> mWordList) {
        this.mWordList = mWordList;
        this.context=context;
        this.mInflater=LayoutInflater.from(context);

    }

    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.recyclerviewlayout, parent, false);
        //  view.setOnClickListener(mClickListener);
        return new WordViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {

        String mCurrent = mWordList.get(position);
        holder.wordTV.setText(mCurrent);

    }

    @Override
    public int getItemCount() {
        return mWordList.size();
    }

    public class WordViewHolder extends RecyclerView.ViewHolder {
        TextView wordTV;
        public WordViewHolder(@NonNull View itemView) {
            super(itemView);
            wordTV=itemView.findViewById(R.id.word_textView);

        }
    }
}