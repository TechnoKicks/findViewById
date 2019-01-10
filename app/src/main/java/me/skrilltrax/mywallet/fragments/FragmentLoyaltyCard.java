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
import me.skrilltrax.mywallet.creditdebitcard.LoyaltyCards;
import me.skrilltrax.mywallet.govtIds.IdentityCards;

public class FragmentLoyaltyCard extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.recyclerview, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);

        List<IdentityCards> list = Utils.loadSharedPreferences(getContext(), "Loyalty Card");

        CustomAdapter adapter = new CustomAdapter(getActivity(),list);
        recyclerView.setAdapter(adapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        return view;
    }
}
