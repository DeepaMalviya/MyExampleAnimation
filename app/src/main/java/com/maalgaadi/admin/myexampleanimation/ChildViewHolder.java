package com.maalgaadi.admin.myexampleanimation;

import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class ChildViewHolder<C> extends RecyclerView.ViewHolder {
    C mChild;
    ExpandableRecyclerAdapter mExpandableAdapter;


    public ChildViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    @UiThread
    public C getChild() {
        return mChild;
    }

    @UiThread
    public int getParentAdapterPosition() {
        int flatPosition = getAdapterPosition();
        if (mExpandableAdapter == null || flatPosition == RecyclerView.NO_POSITION) {
            return RecyclerView.NO_POSITION;
        }

        return mExpandableAdapter.getNearestParentPosition(flatPosition);
    }


    @UiThread
    public int getChildAdapterPosition() {
        int flatPosition = getAdapterPosition();
        if (mExpandableAdapter == null || flatPosition == RecyclerView.NO_POSITION) {
            return RecyclerView.NO_POSITION;
        }

        return mExpandableAdapter.getChildPosition(flatPosition);
    }
}