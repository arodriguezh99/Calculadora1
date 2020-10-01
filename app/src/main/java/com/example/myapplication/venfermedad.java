package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class venfermedad extends Fragment {
    int puntaje_enfermedad = 0;
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

        final int[] puntajes={1,2,3,4,5};

        //Spinners
        Spinner spinner2_E = (Spinner) view.findViewById(R.id.spinner2_E);
        ArrayAdapter<CharSequence> adapter2_E = ArrayAdapter.createFromResource(getContext(),
                R.array.spinner2_E, android.R.layout.simple_spinner_item);
        adapter2_E.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2_E.setAdapter(adapter2_E);
        spinner2_E.setOnItemSelectedListener(new Spinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                puntaje_enfermedad = puntaje_enfermedad + puntajes[i];
                //String text = parent.getItemAtPosition(position).toString();
                //Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });//this

        view.findViewById(R.id.button_next_venfermedad).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                venfermedadDirections.ActionVenfermedadToVprocedimiento action = venfermedadDirections.actionVenfermedadToVprocedimiento();
                venfermedadDirections.ActionVenfermedadToResultado action2 = venfermedadDirections.actionVenfermedadToResultado();
                action2.setPuntajeEnfermedad(puntaje_enfermedad);
                NavHostFragment.findNavController(venfermedad.this)
                        .navigate(action);
            }
        });

    }

}
