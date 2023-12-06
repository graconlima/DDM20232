package com.example.exnativoddm.thread_handler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;
import android.widget.Toast;

import com.example.exnativoddm.R;

public class ExThreadHandler extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex_thread_handler);

        /*new Thread(){
            public void run(){
                runOnUiThread(
                        new Runnable(){
                            public void run(){
                                Toast.makeText(getBaseContext(), "OI", Toast.LENGTH_LONG).show();
                            }
                        }
                );
            }
        }.start();*/

        tv = (TextView) findViewById(R.id.tv);

        Handler h = new Handler(getMainLooper()){
            public void handleMessage(Message m){
                atualizaUI(m);
            }
        };
        MinhaThread mt = new MinhaThread(h);
        mt.start();
    }
    public void atualizaUI(Message m){

        tv.setText(m.obj.toString());

        /*if(m.what == 1){
            tv.setText(m.obj.toString());
        }else if(m.what == 2){
            tv.setText("DOIS");
        }else{
            tv.setText("OUTRO");
        }*/
    }
}