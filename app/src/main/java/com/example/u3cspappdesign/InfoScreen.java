package com.example.u3cspappdesign;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.u3cspappdesign.databinding.InfoScreenBinding;


public class InfoScreen extends Fragment {

    private InfoScreenBinding binding;

    private TextView title;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = InfoScreenBinding.inflate(inflater, container, false);

        // Set the info stuff
        binding.titleBox.setText(InfoManager.getInstance().getName());
        binding.purchaseBox.setText(InfoManager.getInstance().getPurchaseOptions());
        binding.descriptionBox.setText(InfoManager.getInstance().getDescription());

        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(InfoScreen.this).navigate(R.id.action_Info_to_Home);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}