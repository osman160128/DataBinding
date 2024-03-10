package com.example.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setMainActivity(this);

    }

    public void showTost() {
        Toast.makeText(this, "Main Activity toast", Toast.LENGTH_SHORT).show();
    }
    public void Osman(){
        String a = activityMainBinding.edtText.getText().toString();
        activityMainBinding.txt.setText(a);
    }

}