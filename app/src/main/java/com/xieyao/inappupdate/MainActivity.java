package com.xieyao.inappupdate;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MainViewModel model = ViewModelProviders.of(this).get(MainViewModel.class);
        model.setup(this);
        binding.setViewModel(model);
    }

}
