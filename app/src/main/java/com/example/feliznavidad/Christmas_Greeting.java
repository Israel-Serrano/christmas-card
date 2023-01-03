package com.example.feliznavidad;

import static com.example.feliznavidad.R.raw.merry_christmas;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Christmas_Greeting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Creamos objeto MediaPlayer para introducirle el sonido
        MediaPlayer mediaPlayer = MediaPlayer.create(this, merry_christmas);
        mediaPlayer.start();

        //cogemos una variable de tipo TextView y le metemos la referencia de lo que vamos a animar
        TextView title1 = findViewById(R.id.feliz);
        TextView title2 = findViewById(R.id.navidad);
        //creamos un objeto de tipo Animation y le pasamos la animación que hemos creado en xml
        Animation animTitulo = AnimationUtils.loadAnimation(this,R.anim.slideup);
        //Ahora juntamos la referencia de lo que queremos animar con la animación
        title1.startAnimation(animTitulo);
        title2.startAnimation(animTitulo);

        //cogemos una variable de tipo TextView y le metemos la referencia de lo que vamos a animar
        ImageView titulo = findViewById(R.id.papa_noel);
        //creamos un objeto de tipo Animation y le pasamos la animación que hemos creado en xml
        Animation animNoel = AnimationUtils.loadAnimation(this,R.anim.papanoel);
        //Ahora juntamos la referencia de lo que queremos animar con la animación
        titulo.startAnimation(animNoel);
    }
}