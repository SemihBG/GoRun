package com.semihbg.gorun;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class RunActivity extends AppCompatActivity {

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run);

        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null){
            actionBar.setTitle("Run");
            actionBar.setDefaultDisplayHomeAsUpEnabled(true);
        }

        findViewById(R.id.buttonNew).setOnClickListener(v-> startActivity(new Intent(this,EditorActivity.class)));
        findViewById(R.id.buttonSnippet).setOnClickListener(v-> startActivity(new Intent(this,SnippetActivity.class)));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.default_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.settingItem){
            Intent intent=new Intent(this,SettingActivity.class);
            startActivity(intent);

        }
        return super.onOptionsItemSelected(item);
    }

}