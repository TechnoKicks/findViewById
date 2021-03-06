package me.skrilltrax.mywallet.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import me.skrilltrax.mywallet.CustomAdapter;
import me.skrilltrax.mywallet.R;
import me.skrilltrax.mywallet.Utils;
import me.skrilltrax.mywallet.govtIds.IdentityCards;

public class FragmentList extends Fragment {

    RecyclerView recyclerView;
    List<IdentityCards> list;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.recyclerview, container, false);
        recyclerView = view.findViewById(R.id.recycler_view);

        list = (List<IdentityCards>) Utils.loadSharedPreferences(getContext(), "Bank Card");

        CustomAdapter adapter = new CustomAdapter(getActivity(),list);
        recyclerView.setAdapter(adapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        return view;
    }


    public static class MyOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {

        }
    }
}
