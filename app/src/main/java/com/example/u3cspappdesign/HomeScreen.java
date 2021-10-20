package com.example.u3cspappdesign;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.u3cspappdesign.databinding.HomeScreenBinding;

/***
 *
 */
public class HomeScreen extends Fragment {

    private HomeScreenBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = HomeScreenBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.cpuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openInfo(ComputerParts.CPU);
            }
        });

        binding.gpuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openInfo(ComputerParts.GPU);
            }
        });

        binding.memoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openInfo(ComputerParts.MEMORY);
            }
        });

        binding.coolingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openInfo(ComputerParts.COOLING);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void openInfo(ComputerParts stateToSet) {
        InfoManager.getInstance().setCurrentPart(stateToSet);
        NavHostFragment.findNavController(HomeScreen.this)
                .navigate(R.id.action_Home_to_Info);
    }

}