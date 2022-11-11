package com.rutadelcielacoAPP.evaluacion1_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TercerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercer);
    }

    //metodo que nos permite volver a la app
    public void volverInicio(View view){
        Intent volverInicio = new Intent(this,SegundoActvity.class);
        startActivity(volverInicio);
    }
}