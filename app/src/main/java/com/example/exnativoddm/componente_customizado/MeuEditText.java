package com.example.exnativoddm.componente_customizado;

import android.content.Context;
import android.text.InputType;
import android.util.AttributeSet;
import android.widget.EditText;

public class MeuEditText extends EditText {

    public MeuEditText(Context c, AttributeSet as){
        super(c, as);
        setInputType(
                InputType.TYPE_CLASS_TEXT
                        |
                InputType.TYPE_TEXT_VARIATION_PASSWORD
        );
    }
}
