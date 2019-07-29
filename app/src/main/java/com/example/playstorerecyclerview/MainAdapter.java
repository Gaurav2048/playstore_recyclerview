package com.example.playstorerecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.viewHolder> {

    ArrayList<Integer> type_one = new ArrayList<>();
    ArrayList<Integer> type_two = new ArrayList<>();
    ArrayList<Integer> type_three = new ArrayList<>();

    ArrayList<String> Title = new ArrayList<>();
    ArrayList<String> subTitle = new ArrayList<>();

    Context context;


    public MainAdapter(@NonNull Context context) {
            type_one.add(R.drawable.one_one);
        type_one.add(R.drawable.one_two);
        type_one.add(R.drawable.one_thre);
        type_one.add(R.drawable.one_four);
        type_one.add(R.drawable.one_five);

        type_two.add(R.drawable.two_one);
        type_two.add(R.drawable.two_two);
        type_two.add(R.drawable.two_three);
        type_two.add(R.drawable.two_four);
        type_two.add(R.drawable.two_five);

        type_three.add(R.drawable.three_one);
        type_three.add(R.drawable.three_three);
        type_three.add(R.drawable.three_five);
        type_three.add(R.drawable.three_five);
        type_three.add(R.drawable.three_six);

        Title.add("Enjoy hindi apps");
        Title.add("Light apps to save spaces");
        Title.add("Stay updated on cricket ");
        Title.add("New arrival ");

        subTitle.add("Explore apps available in hindi");
        subTitle.add("Small sized essential apps");
        subTitle.add("Live score, match updates and more");
        subTitle.add("Just landed on play store");

        this.context = context;

    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new viewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.unit_main,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder viewHolder, int i) {
        viewHolder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
       if(i%4==0){
           viewHolder.recyclerView.setAdapter(new SubAdapter(context, type_one));
       }else if(i%4==1){
           viewHolder.recyclerView.setAdapter(new SubAdapter(context, type_two));
       }else if(i%4 == 2){
           viewHolder.recyclerView.setAdapter(new SubAdapter(context, type_three));
       }else if(i%4 == 3){
           viewHolder.recyclerView.setAdapter(new SubAdapter(context, type_one));
       }

    }

    @Override
    public int getItemCount() {
        return 8;
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        RecyclerView recyclerView;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            recyclerView = itemView.findViewById(R.id.sub_recyclerviews);
        }
    }

}
