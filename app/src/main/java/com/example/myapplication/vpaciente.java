package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class vpaciente extends Fragment {
    int puntaje_paciente = 22;
    @Override

    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        View fragmentSecondLayout = inflater.inflate(R.layout.vpaciente, container, false);
        // Inflate the layout for this fragment
        return fragmentSecondLayout;
    }

    public void onViewCreated(@NonNull final View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_next_vpaciente).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vpacienteDirections.ActionVpaciente2ToVenfermedad action = vpacienteDirections.actionVpaciente2ToVenfermedad();
                vpacienteDirections.ActionVpaciente2ToResultado action2 = vpacienteDirections.actionVpaciente2ToResultado();
                action2.setPuntajePaciente(puntaje_paciente);
                NavHostFragment.findNavController(vpaciente.this)
                        .navigate(action);

            }
        });

    }
}
