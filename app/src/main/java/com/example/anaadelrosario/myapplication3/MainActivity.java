package com.example.anaadelrosario.myapplication3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;

public class MainActivity extends AppCompatActivity {

    int numStars;
    CustomDrawableView mCustomDrawableView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RatingBar barStars= (RatingBar) findViewById(R.id.ratingBar);
        barStars.setBackgroundColor(Color.CYAN);

        mCustomDrawableView= new CustomDrawableView(this);

        setContentView(mCustomDrawableView);


    }

    public class CustomDrawableView extends View {
        private ShapeDrawable mDrawable;

        public CustomDrawableView(Context context){
            super(context);

            int x=10;
            int y=10;
            int width=50;
            int height=50;

            mDrawable= new ShapeDrawable(new OvalShape());
            mDrawable.getPaint().setColor(0xff74AC23);
            mDrawable.setBounds(x,y,x + width, y +height);
        }

        protected void onDraw(Canvas canvas){
            mDrawable.draw(canvas);
        }
    }
}
