package com.i012114.toolbardos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class PanatallaDosActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panatalla_dos);

        toolbar = (Toolbar) findViewById(R.id.id_tb_toolbar);

       // showToolBar(getResources().getString(R.string.str_tb_p2));

        showToolBar("Pantalla 2", true);
    }

    @Override

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_pantalla_dos, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void showToolBar(String title, boolean upButtom){
        // mostrar el toolbar en pantalla y configurarlo

        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButtom);

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        goActiivity();
        return super.onOptionsItemSelected(item);


    }

    public void goActiivity(){

        Intent intent = new Intent(this, PantallaUnoActivity.class);
        startActivity(intent);

    }
}
