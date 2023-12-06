package com.example.exnativoddm.componente_customizado;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.graphics.Paint;

public class Tela extends View implements Runnable {
    float x = 500, y = 500, TAMANHO = 50, xC = 100, yC = 100;
    long VELOCIDADE = 10;
    public Tela(Context c){
        super(c);
    }

    public void onDraw(Canvas c){
        super.onDraw(c);

        Paint p = new Paint();

        p.setColor(Color.BLUE);
        c.drawRect(x, y, x+TAMANHO, y+TAMANHO, p);

        p.setColor(Color.GRAY);
        c.drawCircle(xC, yC, TAMANHO, p);
    }

    public boolean onTouchEvent(MotionEvent e){
        x = e.getX();
        y = e.getY();
        invalidate();
        return true;
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return super.onKeyDown(keyCode, event);
    }

    public void run() {
        while (true) {
            yC += 10;
            invalidate();

            yC = (yC > 500) ? 0 : yC;

            try {
                Thread.sleep(VELOCIDADE);
            }catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}
















