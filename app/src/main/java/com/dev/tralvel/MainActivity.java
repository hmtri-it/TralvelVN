package com.dev.tralvel;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private BottomNavigationView navigation;
    private View search_bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponent();
    }

    private void initComponent() {
        search_bar = (View) findViewById(R.id.search_bar);
        mTextMessage = (TextView) findViewById(R.id.search_text);

        navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        mTextMessage.setText(item.getTitle());
                        return true;
                    case R.id.navigation_hotel:
                        mTextMessage.setText(item.getTitle());
                        return true;
                    case R.id.navigation_map:
                        mTextMessage.setText(item.getTitle());
                        return true;

                    case R.id.navigation_food:
                        mTextMessage.setText(item.getTitle());
                        return true;

                    case R.id.navigation_account:
                        Toast.makeText(MainActivity.this, "Show info or logout", Toast.LENGTH_SHORT).show();
                        return true;
                }
                return false;
            }
        });

    }
}