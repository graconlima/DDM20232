package com.example.exnativoddm.comunicacao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import com.example.exnativoddm.R;

public class ServidorTCP extends AppCompatActivity {

    int porta = 1234;
    Date d = new Date();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servidor_tcp);

        try{
            ServerSocket ss = new ServerSocket(porta);
            System.out.println("Aguardando...");
            Socket s = ss.accept();
            OutputStream os = s.getOutputStream();
            os.write(d.toString().getBytes());
            os.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}