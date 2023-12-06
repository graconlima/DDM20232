package com.example.exnativoddm.intencoes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.example.exnativoddm.R;

public class ExIntent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.exnativoddm.R.layout.activity_ex_intent);

        //exemplos de intenções
        /*Uri u = Uri.parse("https://www.ifrn.edu.br");
        Intent i = new Intent(Intent.ACTION_VIEW, u);
        startActivity(i);*/

        Intent i = new Intent("ABRIR_TELA");
        startActivity(i);
    }
}