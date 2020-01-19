package edu.tomerbu.lec8tabbed;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import edu.tomerbu.lec8tabbed.ui.main.SectionsPagerAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ViewPager (swipe fragments)

        //ViewPager needs an adapter:
        // 1) how many fragments
        // 2) which fragment in an Index


        //init the adapter:
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        //find the viewPager:
        ViewPager viewPager = findViewById(R.id.view_pager);
        //set the viewPager's adapter.
        viewPager.setAdapter(sectionsPagerAdapter);


        //Optional part: TABS
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);


    }
}