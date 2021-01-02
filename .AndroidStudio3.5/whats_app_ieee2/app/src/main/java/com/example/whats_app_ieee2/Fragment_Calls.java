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


public class Fragment_Calls extends Fragment {

    ArrayList<Chats_Calls_details> calls ;

    public Fragment_Calls() {
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
        return inflater.inflate(R.layout.fragment__calls, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView rv_calls = view.findViewById(R.id.rv_calls);
        calls = new ArrayList<>();
        calls.add(new Chats_Calls_details("Alaa" , R.drawable.ic_face_black_24dp));
        calls.add(new Chats_Calls_details("Amin" , R.drawable.ic_insert_emoticon_black_24dp));
        calls.add(new Chats_Calls_details("Salma" , R.drawable.ic_face_black_24dp));
        calls.add(new Chats_Calls_details("Mama" , R.drawable.ic_face_black_24dp));
        calls.add(new Chats_Calls_details("Teta" , R.drawable.ic_face_black_24dp));
        calls.add(new Chats_Calls_details("5alo" , R.drawable.ic_insert_emoticon_black_24dp));
        calls.add(new Chats_Calls_details("5alto Sahar" , R.drawable.ic_face_black_24dp));

        calls.add(new Chats_Calls_details("Alaa" , R.drawable.ic_face_black_24dp));
        calls.add(new Chats_Calls_details("Amin" , R.drawable.ic_insert_emoticon_black_24dp));
        calls.add(new Chats_Calls_details("Salma" , R.drawable.ic_face_black_24dp));
        calls.add(new Chats_Calls_details("Mama" , R.drawable.ic_face_black_24dp));
        calls.add(new Chats_Calls_details("Teta" , R.drawable.ic_face_black_24dp));
        calls.add(new Chats_Calls_details("5alo" , R.drawable.ic_insert_emoticon_black_24dp));
        calls.add(new Chats_Calls_details("5alto Sahar" , R.drawable.ic_face_black_24dp));

        Recycler_adapter_Chat_calls recycler_adapter_calls = new Recycler_adapter_Chat_calls(calls , getActivity());
        rv_calls.setAdapter(recycler_adapter_calls);
        rv_calls.setLayoutManager(new LinearLayoutManager(getActivity()));
    }
    }
