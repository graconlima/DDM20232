package com.example.exnativoddm.comunicacao;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.exnativoddm.R;

import com.example.exnativoddm.R;

import java.io.InputStream;
import java.net.Socket;

public class ClienteTCP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente_tcp);
        Button b = (Button) findViewById(R.id.botao);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Thread t = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            int porta = 1234;
                            String endereco = "192.168.0.14";//ok remoto
                            Socket s = new Socket(endereco, porta);//outra forma
                            byte[] b = new byte[1000];
                            InputStream is = s.getInputStream();
                            is.read(b);
                            System.out.println("DADOS: "+ new String(b).trim());
                            is.close();
                            s.close();
                            TextView t = (TextView)findViewById(R.id.texto);
                            t.setText("Dados: "+new String(b).trim());
                        }catch(Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
                t.start();
            }
        });
    }
}