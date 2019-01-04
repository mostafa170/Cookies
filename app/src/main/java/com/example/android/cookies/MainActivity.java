package com.example.android.cookies;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submit(View view) {
        String eat = "I'm So full";
        displayMessage(eat);
    }
    private void displayMessage(String message) {
        TextView OrderSummeryTextView = (TextView) findViewById(R.id.status_text_view);
        ImageView iconImageView=(ImageView) findViewById(R.id.android_cookie_image_view);
        iconImageView.setImageResource(R.drawable.after_cookie);
        OrderSummeryTextView.setText(message);
    }
}
