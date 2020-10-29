package com.example.zoom_in__zoom_out;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayOut;
    ViewPager veiwPage;
    fragmWhats fragmWhats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayOut=findViewById(R.id.tabLayOut);
        veiwPage=findViewById(R.id.veiwPage);
        fragmWhats=new fragmWhats(getSupportFragmentManager(),getApplicationContext());
        fragmWhats.addFragment(new CALL(),"Call");
        fragmWhats.addFragment(new CHATS(),"CHAT");
        fragmWhats.addFragment(new STATUS(),"STATUS");
        veiwPage.setAdapter(fragmWhats);
        tabLayOut.setupWithViewPager(veiwPage);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_setting,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.sett:
                Toast.makeText(this, "SETTION", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.contect:
                Toast.makeText(this, "View Contact", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.web:
                Toast.makeText(this, "Web Whatsapp", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.newgroup:
                Toast.makeText(this, "Starred Message", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}