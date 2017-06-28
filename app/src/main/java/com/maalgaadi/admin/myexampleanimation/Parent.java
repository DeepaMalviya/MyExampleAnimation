package com.maalgaadi.admin.myexampleanimation;

import java.util.List;


public interface Parent<C> {


    List<C> getChildList();

    boolean isInitiallyExpanded();
}