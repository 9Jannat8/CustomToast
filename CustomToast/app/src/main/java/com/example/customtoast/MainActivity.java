package com.example.customtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btnid);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //layoutInflater class er under a instant variable inflater declare kora hoyeche..karon ai class diye amra akta method call korte parbo..
                //method ti holo inflate..jar modde amra 2ta parameter pass korte  parbo..akta holo customtoast er layout er nam, r onnota customtoast layout er id..
                //tarpor Toast class er object create korte hobe...
                LayoutInflater inflater = getLayoutInflater();
                View customView = inflater.inflate(R.layout.customtoast_layout, findViewById(R.id.customToastid));

                Toast toast = new Toast(MainActivity.this);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.setView(customView);
                toast.show();

            }
        });
    }
}