package com.tutorials.hp.recyclerswipetoactivity.mRecycler;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.tutorials.hp.recyclerswipetoactivity.R;

/**
 * Created by Oclemy on 5/13/2016 for ProgrammingWizards Channel and http://www.camposha.com.
 */
public class MyHolder extends RecyclerView.ViewHolder implements View.OnTouchListener {

    TextView nameTxt;
    ImageView img;
    ItemTouchListener itemTouchListener;

    public MyHolder(View itemView) {
        super(itemView);

        nameTxt= (TextView) itemView.findViewById(R.id.nameTxt);
        img= (ImageView) itemView.findViewById(R.id.spacecraftImage);

        itemView.setOnTouchListener(this);
    }

    public void setItemTouchListener(ItemTouchListener itemTouchListener)
    {
        this.itemTouchListener=itemTouchListener;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        this.itemTouchListener.onItemTouch(this.getLayoutPosition());
        return false;
    }
}
