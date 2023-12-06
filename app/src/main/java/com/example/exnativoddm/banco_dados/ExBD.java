package com.example.exnativoddm.banco_dados;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;
import com.example.exnativoddm.R;

public class ExBD extends AppCompatActivity {

    String TAG = "ifo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex_bd);

        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Aluno a = new Aluno();
                a.setId(1);
                a.setNome("Joao");
                a.setMatricula("111");

                ManipulaBD bd = new ManipulaBD(getBaseContext());

                if(bd.buscar(a)){
                    System.out.println("Aluno ja existe. nao adicionado");
                }else{
                    System.out.println("Adicionnando aluno novo");
                    bd.inserir(a);
                }

                List<Aluno> l = bd.buscar();
                int i = 0;
                while(i < l.size()){
                    Log.i(TAG, "id: "+l.get(i).getId()+" Nome: " + l.get(i).getNome()+" Matricula: "+l.get(i).getMatricula());
                    i++;
                }
            }
        });
    }
}