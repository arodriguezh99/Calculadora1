package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class vprocedimiento extends Fragment {
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
                NavHostFragment.findNavController(vprocedimiento.this)
                        .navigate(R.id.action_vprocedimiento_to_resultado);
            }
        });

    }

}
