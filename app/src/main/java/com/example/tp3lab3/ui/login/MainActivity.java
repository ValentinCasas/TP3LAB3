package com.example.tp3lab3.ui.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tp3lab3.R;
import com.example.tp3lab3.databinding.ActivityMainBinding;
import com.example.tp3lab3.ui.register.RegistroActivity;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private MainActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        viewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MainActivityViewModel.class);

        binding.btLogin.setOnClickListener(v -> {
            viewModel.login(binding.etMail.getText().toString().trim(), binding.etPass.getText().toString());
        });

        binding.btRegistro.setOnClickListener(v -> {
            viewModel.irAregistrar();
        });
    }
}