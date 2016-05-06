package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){

            case R.id.menu_item:

                View menuItemView = findViewById(R.id.menu_item); // SAME ID AS MENU ID
                PopupMenu popupMenu = new PopupMenu(this, menuItemView);
                popupMenu.inflate(R.menu.menuico);
                // ...
                popupMenu.show();
                // ...
                return true;
        }

        return super.onOptionsItemSelected(item);



    }
}
