package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class resultado extends Fragment {
    int puntaje_final = 0;
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
        TextView resultado = view.findViewById(R.id.textRes);
        int puntaje_paciente = resultadoArgs.fromBundle(getArguments()).getPuntajePaciente();
        int puntaje_procedimiento = resultadoArgs.fromBundle(getArguments()).getPuntajeProcedimiento();
        int puntaje_enfermdedad = resultadoArgs.fromBundle(getArguments()).getPuntajeEnfermedad();
        int puntaje_final = puntaje_paciente + puntaje_procedimiento + puntaje_enfermdedad;
        resultado.setText(puntaje_final);

        view.findViewById(R.id.button_next_result).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(resultado.this)
                        .navigate(R.id.action_resultado_to_bienvenida);
            }
        });

    }
}
