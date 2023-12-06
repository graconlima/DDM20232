package com.example.exnativoddm;

import android.app.Activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    private final String TAG ="ifo";

    public void MainActivity(){

    }

    public void autenticacao(String nome, String senha){
        if(nome.equals("Aluno")  && senha.equals("123")){
            Toast.makeText(this,"Usuario Autenticado com sucesso", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this,"Autenticacao Falhou. Tente novamente...", Toast.LENGTH_LONG).show();
        }
    }

    protected void onCreate(Bundle estado) {
        super.onCreate(estado);

        Tela t = new Tela(this);
        new Thread(t).start();
        setContentView(t);

/*        setContentView(R.layout.activity_main);

        EditText campoNome = findViewById(R.id.campoNome);
        EditText campoSenha = findViewById(R.id.campoSenha);
        Button botaoEnviar =  findViewById(R.id.botaoEnviar);

        botaoEnviar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String n = campoNome.getText().toString();
                String s = campoSenha.getText().toString();
                autenticacao(n, s);
            }
        });

        Log.i(TAG, "No construtor...");
*/

        //Log.i(TAG, "No onCreate()...");
    }

    protected void onStart(){
        super.onStart();
        Log.i(TAG, "No onStart()...");
    }

    protected void onResume(){
        super.onResume();
        Log.i(TAG, "No onResume()...");
    }

    protected void onPause(){
        super.onPause();
        Log.i(TAG, "No onPause()...");
    }

    protected void onStop(){
        super.onStop();
        Log.i(TAG, "No onStop()...");
    }

    protected void onRestart(){
        super.onRestart();
        Log.i(TAG, "No onRestart()...");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG, "No onDestroy()...");
    }
}