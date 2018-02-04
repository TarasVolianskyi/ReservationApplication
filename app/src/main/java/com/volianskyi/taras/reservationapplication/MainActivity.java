package com.volianskyi.taras.reservationapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.FrameLayout;

import com.volianskyi.taras.reservationapplication.fragments.AboutCompany;
import com.volianskyi.taras.reservationapplication.fragments.CalendarForReservation;
import com.volianskyi.taras.reservationapplication.fragments.ChangeLanguage;
import com.volianskyi.taras.reservationapplication.fragments.ChangeOffice;
import com.volianskyi.taras.reservationapplication.fragments.FragmentsInterface;
import com.volianskyi.taras.reservationapplication.fragments.OnlineReservation;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, FragmentsInterface {

    private FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        initView();
    }

    private void initView() {
        frameLayout = (FrameLayout) findViewById(R.id.flMainActivity);


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_online_reservation) {
            OnlineReservation onlineReservation = new OnlineReservation();
            getSupportFragmentManager().beginTransaction().add(R.id.flMainActivity, onlineReservation, "onlineReservation").commit();
        } else if (id == R.id.nav_about_company) {
            AboutCompany aboutCompany = new AboutCompany();
            getSupportFragmentManager().beginTransaction().add(R.id.flMainActivity, aboutCompany, "aboutCompany").commit();
        } else if (id == R.id.nav_my_cabinet) {

        } else if (id == R.id.nav_change_language) {
            ChangeLanguage changeLanguage = new ChangeLanguage();
            getSupportFragmentManager().beginTransaction().add(R.id.flMainActivity, changeLanguage, "aboutCompany").commit();
        } else if (id == R.id.nav_change_office) {
            ChangeOffice changeOffice = new ChangeOffice();
            getSupportFragmentManager().beginTransaction().add(R.id.flMainActivity, changeOffice, "aboutCompany").commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void goToCalendar() {
        android.support.v4.app.Fragment fragment = null;

        fragment = new CalendarForReservation();


        getSupportFragmentManager().beginTransaction().replace(R.id.flMainActivity, fragment, "goToCalendar").commit();

    }
}

