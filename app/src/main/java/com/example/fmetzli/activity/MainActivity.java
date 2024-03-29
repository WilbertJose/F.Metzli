package com.example.fmetzli.activity;

import android.content.Context;
import android.os.Bundle;
import android.view.Window;

import com.example.fmetzli.R;
import com.example.fmetzli.adapter.PopularAdapter;
import com.example.fmetzli.domain.PopularDomain;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.fmetzli.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        statusBarColor();
        initRecyclerView();
    }

    private void statusBarColor() {
        Window window=MainActivity.this.getWindow();
        window.setStatusBarColor(ContextCompat.getColor(MainActivity.this,R.color.gris_oscuro));
    }

    private void initRecyclerView() {
        ArrayList<PopularDomain> items=new ArrayList<>();

        items.add(new PopularDomain("Camisa de vestir color negro","item_4",15,4,500,"Nuestra camisa CLASICA LISA Pierre Cardin, es perfecta para lucirla en tu día a día.\n" +
                "\n" +
                "Está elaborada con tejido 65% poliéster y 35% algodón, es libre de arrugas, planchado facíl. Su estilo slim fit y su cuello abierto tipo ingles aportarán elegancia a tu look.\n" +
                "\n" +
                "¡Una prenda infaltable en tu closet!"));
        items.add(new PopularDomain("Zapatos de vesir color negro","item_3",10,5,250,"Nuestra camisa CLASICA LISA Pierre Cardin, es perfecta para lucirla en tu día a día.\n" +
                "\n" +
                "Está elaborada con tejido 65% poliéster y 35% algodón, es libre de arrugas, planchado facíl. Su estilo slim fit y su cuello abierto tipo ingles aportarán elegancia a tu look.\n" +
                "\n" +
                "¡Una prenda infaltable en tu closet!"));
        items.add(new PopularDomain("Saco de vestir Color Negro","item_2",9,4,300,"Nuestra camisa CLASICA LISA Pierre Cardin, es perfecta para lucirla en tu día a día.\n" +
                "\n" +
                "Está elaborada con tejido 65% poliéster y 35% algodón, es libre de arrugas, planchado facíl. Su estilo slim fit y su cuello abierto tipo ingles aportarán elegancia a tu look.\n" +
                "\n" +
                "¡Una prenda infaltable en tu closet!"));
        items.add(new PopularDomain("Corbata color rojo","item_1",10,4.5,100,"Nuestra camisa CLASICA LISA Pierre Cardin, es perfecta para lucirla en tu día a día.\n" +
                "\n" +
                "Está elaborada con tejido 65% poliéster y 35% algodón, es libre de arrugas, planchado facíl. Su estilo slim fit y su cuello abierto tipo ingles aportarán elegancia a tu look.\n" +
                "\n" +
                "¡Una prenda infaltable en tu closet!"));
        items.add(new PopularDomain("Corbata color verde","item_4",10,5.0 ,10,"Nuestra camisa CLASICA LISA Pierre Cardin, es perfecta para lucirla en tu día a día.\n" +
                "\n" +
                "Está elaborada con tejido 65% poliéster y 35% algodón, es libre de arrugas, planchado facíl. Su estilo slim fit y su cuello abierto tipo ingles aportarán elegancia a tu look.\n" +
                "\n" +
                "¡Una prenda infaltable en tu closet!"));

        binding.PopularView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));
        binding.PopularView.setAdapter(new PopularAdapter(items));
    }

}