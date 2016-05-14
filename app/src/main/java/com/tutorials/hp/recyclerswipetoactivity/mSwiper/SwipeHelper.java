package com.tutorials.hp.recyclerswipetoactivity.mSwiper;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

import com.tutorials.hp.recyclerswipetoactivity.mRecycler.MyAdapter;

/**
 * Created by Oclemy on 5/13/2016 for ProgrammingWizards Channel and http://www.camposha.com.
 */
public class SwipeHelper extends ItemTouchHelper.SimpleCallback {

   MyAdapter adapter;

    public SwipeHelper(int dragDirs, int swipeDirs) {
        super(dragDirs, swipeDirs);
    }

    public SwipeHelper(MyAdapter adapter) {
        super(ItemTouchHelper.UP | ItemTouchHelper.DOWN, ItemTouchHelper.RIGHT);
        this.adapter = adapter;
    }

    @Override
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
        return false;
    }

    @Override
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
        adapter.openDetailActivity();
    }
}
