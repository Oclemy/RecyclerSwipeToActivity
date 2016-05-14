package com.tutorials.hp.recyclerswipetoactivity.mRecycler;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tutorials.hp.recyclerswipetoactivity.R;
import com.tutorials.hp.recyclerswipetoactivity.mData.SpaceCraft;
import com.tutorials.hp.recyclerswipetoactivity.mDetail.DetailActivity;

import java.util.ArrayList;

/**
 * Created by Oclemy on 5/13/2016 for ProgrammingWizards Channel and http://www.camposha.com.
 */
public class MyAdapter extends RecyclerView.Adapter<MyHolder> {


    Context c;
    ArrayList<SpaceCraft> spaceCrafts;
    SpaceCraft spaceCraft;

    public MyAdapter(Context c, ArrayList<SpaceCraft> spaceCrafts) {
        this.c = c;
        this.spaceCrafts = spaceCrafts;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.model,parent,false);
        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        String name=spaceCrafts.get(position).getName();
        int image=spaceCrafts.get(position).getImage();

        holder.nameTxt.setText(name);
        holder.img.setImageResource(image);

        holder.setItemTouchListener(new ItemTouchListener() {
            @Override
            public void onItemTouch(int pos) {
                spaceCraft=spaceCrafts.get(pos);
            }
        });

    }

    @Override
    public int getItemCount() {
        return spaceCrafts.size();
    }

    public void openDetailActivity()
    {
        Intent i=new Intent(c, DetailActivity.class);

        //PACK DATA
        i.putExtra("NAME_KEY",spaceCraft.getName());
        i.putExtra("IMAGE_KEY",spaceCraft.getImage());

        //OPEN ACTIVITY
        c.startActivity(i);
    }
}
