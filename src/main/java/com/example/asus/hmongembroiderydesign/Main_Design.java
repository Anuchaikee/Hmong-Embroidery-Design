package com.example.asus.hmongembroiderydesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Main_Design extends AppCompatActivity {

    String Pic = "a1";
    ImageView addimage;
    FrameLayout canvas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__design);

        add1();
        add2();
        add3();


    }
    public  void add1 (){
        addimage = findViewById(R.id.image1);
        canvas = findViewById(R.id.layout);

        addimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //ImageView imageView = new ImageView(Main_Design.this);
                //imageView.setImageResource(R.drawable.a1);

                //addView(imageView, 400, 400);

                //LinearLayout canvas = (LinearLayout) findViewById(R.id.layout);

                StickerImageView iv_sticker = new StickerImageView(Main_Design.this);
                iv_sticker.setImageDrawable(getResources().getDrawable(R.drawable.a1));
                canvas.addView(iv_sticker);


            }
        });
    }
    public  void add2 (){
        addimage = findViewById(R.id.image2);
        canvas = findViewById(R.id.layout);

        addimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //ImageView imageView = new ImageView(Main_Design.this);
                //imageView.setImageResource(R.drawable.a1);

                //addView(imageView, 400, 400);

                //LinearLayout canvas = (LinearLayout) findViewById(R.id.layout);

                StickerImageView iv_sticker = new StickerImageView(Main_Design.this);
                iv_sticker.setImageDrawable(getResources().getDrawable(R.drawable.a2));
                canvas.addView(iv_sticker);


            }
        });
    }
    public  void add3 (){
        addimage = findViewById(R.id.image3);
        canvas = findViewById(R.id.layout);

        addimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //ImageView imageView = new ImageView(Main_Design.this);
                //imageView.setImageResource(R.drawable.a1);

                //addView(imageView, 400, 400);

                //LinearLayout canvas = (LinearLayout) findViewById(R.id.layout);

                StickerImageView iv_sticker = new StickerImageView(Main_Design.this);
                iv_sticker.setImageDrawable(getResources().getDrawable(R.drawable.a3));
                canvas.addView(iv_sticker);


            }
        });
    }
    //public void addView(ImageView imageView, int widh, int height){
      //  LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(widh,height);
       // layoutParams.setMargins(0,10,0,10);

       // imageView.setLayoutParams(layoutParams);
       // layout.addView(imageView);

    //}

}
