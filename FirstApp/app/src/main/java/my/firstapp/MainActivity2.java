package my.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
   /*     Button button = new Button(this);*/
     /*   Button button = findViewById(R.id.button2);
        button.setOnClickListener();*/
    }
    public void click(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-2134-5678"));
        startActivity(intent);
    }
    public void click1(View v){
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
    }

}