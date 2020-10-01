package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class vprocedimiento extends Fragment {
    int puntaje_procedimiento = 0;
    @Override

    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        View fragmentForthLayout = inflater.inflate(R.layout.venfermedad, container, false);
        // Inflate the layout for this fragment
        return fragmentForthLayout;
    }
    public void onViewCreated(@NonNull final View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_next_vprocedimiento).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vprocedimientoDirections.ActionVprocedimientoToResultado action = vprocedimientoDirections.actionVprocedimientoToResultado();
                action.setPuntajeProcedimiento(puntaje_procedimiento);
                NavHostFragment.findNavController(vprocedimiento.this)
                        .navigate(action);
            }
        });

    }

}
