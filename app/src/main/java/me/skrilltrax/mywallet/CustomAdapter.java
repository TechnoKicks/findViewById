package me.skrilltrax.mywallet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import me.skrilltrax.mywallet.fragments.FragmentList;
import me.skrilltrax.mywallet.govtIds.IdentityCards;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.Holder> {

    private List<IdentityCards> list;
    Context context;

    public CustomAdapter(Context context, List<IdentityCards> list) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);
        view.setOnClickListener(new FragmentList.MyOnClickListener());
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        final TextView card_title = holder.card_title;
        final TextView card_number = holder.card_number;

        card_title.setText(list.get(position).getType());
        card_number.setText(list.get(position).getCardNumber());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                QRCodeDialogFragment.newInstance(1, card_number.getText().toString(), card_title.getText().toString()).show(((AppCompatActivity) context ).getSupportFragmentManager(), "dialog");
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class Holder extends RecyclerView.ViewHolder {

        TextView card_title;
        TextView card_number;

        public Holder(@NonNull View itemView) {

            super(itemView);
            card_title = itemView.findViewById(R.id.card_name);
            card_number = itemView.findViewById(R.id.card_number);
        }

        public View getView() {
            return itemView;
        }

    }
}
