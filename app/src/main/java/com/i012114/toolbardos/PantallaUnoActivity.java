package com.i012114.toolbardos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class PantallaUnoActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_uno);

        toolbar = (Toolbar) findViewById(R.id.id_tb_toolbar);

        showToolBar(getResources().getString(R.string.str_tb_p1));

    }


    public void showToolBar(String title){
        // mostrar el toolbar en pantalla y configurarlo

        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle(title);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_pantalla_uno, menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        goActivity();
        return super.onOptionsItemSelected(item);


    }
    public  void goActivity () {
        Intent intent = new Intent(this, PanatallaDosActivity.class);
        startActivity(intent);
    }


}


