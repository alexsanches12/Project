package com.example.chat.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.chat.R;
import com.example.chat.databinding.ActivitySignInBinding;

public class SignUpActivity extends AppCompatActivity {
    private ActivitySignInBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignInBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }

    private void setListeners() {

        binding.buttonSignIn.setOnClickListener(v -> onBackPressed());
    }
}