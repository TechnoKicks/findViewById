package me.skrilltrax.mywallet;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.Holder> {

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);
        view.setOnClickListener(new MainActivity.MyOnClickListener());
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
//        TextView card_title = holder.card_title;
//        TextView card_number = holder.card_number;
    }

    @Override
    public int getItemCount() {
        return 8;
    }

    class Holder extends RecyclerView.ViewHolder {

//        TextView card_title;
//        TextView card_number;

        public Holder(@NonNull View itemView) {

            super(itemView);
//            card_title = itemView.findViewById(R.id.card_name);
//            card_number = itemView.findViewById(R.id.card_number);
        }

        public View getView() {
            return itemView;
        }

    }
}
