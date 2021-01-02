package com.example.whats_app_ieee2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class Recycler_adapter_Chat_calls extends RecyclerView.Adapter<Recycler_adapter_Chat_calls.viewHolder_recycler>  {

    ArrayList<Chats_Calls_details> chats ;
    Context context ;

    public Recycler_adapter_Chat_calls(ArrayList<Chats_Calls_details> chats, Context context) {
        this.chats = chats;
        this.context = context;
    }

    public viewHolder_recycler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_cards_chat ,null , false);
    return new viewHolder_recycler(v);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder_recycler holder, int position) {
        Chats_Calls_details chat = chats.get(position);
        holder.tv_name.setText(chat.getName());
        holder.circleImageView_chat.setImageResource(chat.getId());
    }

    @Override
    public int getItemCount() {
        return  chats.size();
    }

    public class viewHolder_recycler extends RecyclerView.ViewHolder {
     TextView tv_name ;
     CircleImageView circleImageView_chat ;

       public viewHolder_recycler(@NonNull View itemView) {
           super(itemView);
           tv_name = itemView.findViewById(R.id.tv_name_chat);
           circleImageView_chat = itemView.findViewById(R.id.person_image_chat);
       }
       }
       }
