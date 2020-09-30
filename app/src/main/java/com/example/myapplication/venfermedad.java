package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class venfermedad extends Fragment {
    @Override

    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        View fragmentThirdLayout = inflater.inflate(R.layout.venfermedad, container, false);
        // Inflate the layout for this fragment
        return fragmentThirdLayout;
    }
    public void onViewCreated(@NonNull final View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_next_venfermedad).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                venfermedadDirections.ActionVenfermedadToVprocedimiento action = venfermedadDirections.actionVenfermedadToVprocedimiento();
                action.setPuntaje2();
                NavHostFragment.findNavController(venfermedad.this)
                        .navigate(action);
            }
        });

    }

}
