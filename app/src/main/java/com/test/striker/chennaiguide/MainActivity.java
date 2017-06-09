package com.test.striker.chennaiguide;

import android.animation.Animator;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    public static boolean viewAtHome = false;
    public void setTitle(String title){
        if(getSupportActionBar()!= null)
            getSupportActionBar().setTitle(title);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container,new HomeFragment())
                .commit();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        }
        if (viewAtHome){
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container,new HomeFragment())
                    .commit();
            viewAtHome = false;
            setTitle("Chennai Guide");
        }
        else {
            moveTaskToBack(true);
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        String title = null;
        if (id == R.id.nav_hotel) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.slide_in,0)
                    .addToBackStack(null)
                    .replace(R.id.container,new HotelFragment())
                    .commit();
            title="Hotels";
        } else if (id == R.id.nav_restaurant) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.slide_in,0)
                    .addToBackStack(null)
                    .replace(R.id.container,new RestaurantsFragment())
                    .commit();
            title="Restaurants";
        } else if (id == R.id.nav_attraction) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.slide_in,0)
                    .addToBackStack(null)
                    .replace(R.id.container,new AttractionsFragment())
                    .commit();
            title="Attractions";
        } else if (id == R.id.nav_shopping) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.slide_in,0)
                    .addToBackStack(null)
                    .replace(R.id.container,new ShoppingFragment())
                    .commit();
            title="Shopping";
        }
        setTitle(title);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
