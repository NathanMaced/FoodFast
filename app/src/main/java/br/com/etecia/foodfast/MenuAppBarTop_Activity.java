package br.com.etecia.foodfast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.appbar.MaterialToolbar;

public class MenuAppBarTop_Activity extends AppCompatActivity {
    MaterialToolbar idToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_app_bar_top_layout);
        //apresentnado a toolbar xml para o java
        idToolbar = findViewById(R.id.idToolBar);
    }
}