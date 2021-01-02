package com.example.whats_app_ieee2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class Fragment_Chats extends Fragment {

    ArrayList<Chats_Calls_details> chats ;
    public Fragment_Chats() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment__chat, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView rv_chats = view.findViewById(R.id.rv_chats);
        chats = new ArrayList<>();
        chats.add(new Chats_Calls_details("Alaa" , R.drawable.ic_face_black_24dp));
        chats.add(new Chats_Calls_details("Amin" , R.drawable.ic_insert_emoticon_black_24dp));
        chats.add(new Chats_Calls_details("Salma" , R.drawable.ic_face_black_24dp));
        chats.add(new Chats_Calls_details("Mama" , R.drawable.ic_face_black_24dp));
        chats.add(new Chats_Calls_details("Teta" , R.drawable.ic_face_black_24dp));
        chats.add(new Chats_Calls_details("5alo" , R.drawable.ic_insert_emoticon_black_24dp));
        chats.add(new Chats_Calls_details("5alto Sahar" , R.drawable.ic_face_black_24dp));

        chats.add(new Chats_Calls_details("Alaa" , R.drawable.ic_face_black_24dp));
        chats.add(new Chats_Calls_details("Amin" , R.drawable.ic_insert_emoticon_black_24dp));
        chats.add(new Chats_Calls_details("Salma" , R.drawable.ic_face_black_24dp));
        chats.add(new Chats_Calls_details("Mama" , R.drawable.ic_face_black_24dp));
        chats.add(new Chats_Calls_details("Teta" , R.drawable.ic_face_black_24dp));
        chats.add(new Chats_Calls_details("5alo" , R.drawable.ic_insert_emoticon_black_24dp));
        chats.add(new Chats_Calls_details("5alto Sahar" , R.drawable.ic_face_black_24dp));

        Recycler_adapter_Chat_calls recycler_adapter_chats = new Recycler_adapter_Chat_calls(chats , getActivity());
        rv_chats.setAdapter(recycler_adapter_chats);
        rv_chats.setLayoutManager(new LinearLayoutManager(getActivity()));

    }
}
