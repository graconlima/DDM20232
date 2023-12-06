package com.example.exnativoddm.componente_customizado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.exnativoddm.R;

public class ExComponenteCustomizado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.exnativoddm.R.layout.activity_ex_componente_customizado);

        //exemplo compoenete customizado
        Tela t = new Tela(this);
        new Thread(t).start();
        setContentView(t);
    }
}