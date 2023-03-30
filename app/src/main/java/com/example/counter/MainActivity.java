package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;
import android.widget.ImageView;

import android.widget.VideoView;


public class MainActivity extends AppCompatActivity {


    private TextView textCount;
    private int count = 0;
    ImageView imageView;

    VideoView videoPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textCount = findViewById(R.id.textView2);
        Button button = findViewById(R.id.button4);
        button.setOnClickListener(listener);

    }



    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            count++;

                textCount.setText(Integer.toString(count));
                


        }

    };

}