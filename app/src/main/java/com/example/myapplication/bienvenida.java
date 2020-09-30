package com.example.myapplication;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class bienvenida extends Fragment{
    TextView showCountTextView;
    @Override

    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        View fragmentFirstLayout = inflater.inflate(R.layout.bienvenida, container, false);
        // Inflate the layout for this fragment
        return fragmentFirstLayout;
    }
    public void onViewCreated(@NonNull final View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_next_bienvenida).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(bienvenida.this)
                        .navigate(R.id.action_bienvenida_to_vpaciente22);
            }
        });
        /*
        *view.findViewById(R.id.button_next_bienvenida).setOnClickListener(new View.OnClickListener() {
        *    @Override
        *    public void onClick(View view) {
        *       bienvenidaDirections.ActionBienvenidaToVpaciente22 action = bienvenidaDirections.actionBienvenidaToVpaciente22();
        *        NavHostFragment.findNavController(bienvenida.this).navigate(action);
        *    }
        *});
        */
    }

}
