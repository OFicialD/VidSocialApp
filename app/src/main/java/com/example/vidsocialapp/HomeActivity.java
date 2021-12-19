package com.example.vidsocialapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    private List<Slide> lstSlides;
    private ViewPager sliderpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        sliderpager = findViewById(R.id.slider_pager);

        lstSlides = new ArrayList<>();
        lstSlides.add(new Slide(R.drawable.slide1,"Homem-Aranha:Sem Volta Para Casa"));
        lstSlides.add(new Slide(R.drawable.slide2,"Eternos"));
        lstSlides.add(new Slide(R.drawable.slide3,"Loki"));
        lstSlides.add(new Slide(R.drawable.slide4,"Gavião Arqueiro"));
        lstSlides.add(new Slide(R.drawable.slide5,"Demolidor"));

        SliderPagerAdapter adapter = new SliderPagerAdapter(this,lstSlides);

        sliderpager.setAdapter(adapter);


    }
}