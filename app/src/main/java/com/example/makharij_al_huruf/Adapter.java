package com.example.makharij_al_huruf;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.Viewholder> {

    private Context context;
    private List<String> questions;
    private List<String> correctAnswers;
    private List<String> userAnswers;

    public Adapter(Context context, List<String> questions, List<String> correctAnswers, List<String> userAnswers) {
        this.context = context;
        this.questions = questions;
        this.correctAnswers = correctAnswers;
        this.userAnswers = userAnswers;
    }

    @NonNull
    @Override
    public Adapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // to inflate the layout for each item of recycler view.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.Viewholder holder, int position) {
        holder.question.setText(questions.get(position));
        holder.correctAnswer.setText(correctAnswers.get(position));
        holder.userAnswer.setText(userAnswers.get(position));
    }

    @Override
    public int getItemCount() {
        return questions.size();
    }

    // View holder class for initializing of
    // your views such as TextView and Imageview.
    public class Viewholder extends RecyclerView.ViewHolder {
        //private ImageView courseIV;
        private TextView question;
        private TextView correctAnswer;
        private TextView userAnswer;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            question = itemView.findViewById(R.id.question);
            correctAnswer = itemView.findViewById(R.id.correct);
            userAnswer = itemView.findViewById(R.id.user);
        }
    }
}
