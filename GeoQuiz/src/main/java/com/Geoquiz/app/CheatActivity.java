package com.Geoquiz.app;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by koray on 8/1/14.
 */
public class CheatActivity extends Activity {

    public static final String EXTRA_ANSWER_IS_TURE = "com.Geoquiz.app.answer_is_true";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat);
    }
}
