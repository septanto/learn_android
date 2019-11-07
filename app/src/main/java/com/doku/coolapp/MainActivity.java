package com.doku.coolapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView editTextMainUsername = findViewById(R.id.edittext_main_username);
        TextView editTextMainPassword = findViewById(R.id.edittext_main_password);

        Button buttonMainSubmit = findViewById(R.id.Button_main_submit);
        buttonMainSubmit.setOnClickListener(v ->
            {
                if (!"".equals(editTextMainUsername.getText().toString()) && !"".equals(editTextMainPassword.getText().toString())) {
                    Toast.makeText(getApplicationContext(), "Selamat Datang " + editTextMainUsername.getText().toString(), Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, Dashboard.class);
                    intent.putExtra("username", editTextMainUsername.getText().toString());
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Silahkan Lengkapi username dan password", Toast.LENGTH_SHORT).show();
                }
            });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
