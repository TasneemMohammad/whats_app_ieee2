package com.example.whats_app_ieee2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout ;
    ViewPager viewPager ;
    ArrayList<Chats_Calls_details> chats ;
    Fragment_Chats fragment_chats ;
    Fragment_Calls fragment_calls ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = findViewById(R.id.tabLayout_main);
        viewPager = findViewById(R.id.main_view_pager);
        fragment_chats = new Fragment_Chats() ;
        fragment_calls = new Fragment_Calls();
        chats = new ArrayList<>();
        chats.add(new Chats_Calls_details("Alaa" , R.drawable.ic_face_black_24dp));
        chats.add(new Chats_Calls_details("Amin" , R.drawable.ic_insert_emoticon_black_24dp));
        chats.add(new Chats_Calls_details("Salma" , R.drawable.ic_face_black_24dp));
        chats.add(new Chats_Calls_details("Mama" , R.drawable.ic_face_black_24dp));
        chats.add(new Chats_Calls_details("Teta" , R.drawable.ic_face_black_24dp));
        chats.add(new Chats_Calls_details("5alo" , R.drawable.ic_insert_emoticon_black_24dp));
        chats.add(new Chats_Calls_details("5alto Sahar" , R.drawable.ic_face_black_24dp));

        Pager_Adapter adapter = new Pager_Adapter(getSupportFragmentManager());
        adapter.addTab(new Mytab("CHATS" , fragment_chats));
        adapter.addTab(new Mytab("CALLS" , fragment_calls));
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}

