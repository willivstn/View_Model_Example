package com.willi_vstn.view_modal_example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    MainActivityViewModel mainActivityViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        TextView textView = findViewById(R.id.txtview);

         mainActivityViewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);

         //Getting initial count
         textView.setText("You clicked me: "+mainActivityViewModel.getInitialCounter()+" times");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //getting current count
                textView.setText("You clicked Me: "+mainActivityViewModel.getCounter() + " times");
            }
        });
    }
}