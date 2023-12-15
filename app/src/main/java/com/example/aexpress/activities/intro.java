package com.example.aexpress.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.aexpress.Login;
import com.example.aexpress.R;

public class intro extends AppCompatActivity {
    private static int SPLASH_SCREEN = 3000;
    Animation topAnim,botAnim;
    ImageView image;
    TextView txtwl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_intro);

        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_anim);
        botAnim = AnimationUtils.loadAnimation(this,R.anim.bot_anim);

        image = findViewById(R.id.imageView2);
        txtwl = findViewById(R.id.txtwelcom);

        image.setAnimation(topAnim);
        txtwl.setAnimation(botAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(intro.this, Login.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);
    }
}