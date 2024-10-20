package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList extends ArrayList {

    public void sort(){
        Collections.sort(this);
    }

    @Override
    public boolean remove(Object o) {
        sort();
        return super.remove(o);
    }

    @Override
    public boolean add(Object object) {
        if(!this.contains(object)){
            return super.add(object);
        }
        return false;
    }
}