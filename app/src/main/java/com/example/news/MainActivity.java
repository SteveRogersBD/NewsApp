package com.example.news;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.news.Fragments.BBCragment;
import com.example.news.Fragments.CnnFragment;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        drawerLayout = findViewById(R.id.drawer);
        navigationView = findViewById(R.id.navView);

        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toogle = new ActionBarDrawerToggle(
                this, drawerLayout,toolbar,R.string.Open,R.string.Close);
        drawerLayout.addDrawerListener(toogle);
        toogle.syncState();
        drawerLayout.closeDrawer(GravityCompat.START);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if(id==R.id.bbc)
                {
                    loadFragment(new BBCragment());
                } else if (id==R.id.cnn) {
                    loadFragment(new CnnFragment());
                }

                return true;
            }
        });

    }
    public void loadFragment(Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container,fragment);
        transaction.commit();
        drawerLayout.closeDrawer(GravityCompat.START);
        return;
    }
}