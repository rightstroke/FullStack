package com.rsc.corejava.fileprocessor;

import java.util.Comparator;

import com.rsc.corejava.fileprocessor.model.LineData;

public class LineDataComparator implements Comparator<LineData> {

    @Override
    public int compare(LineData o1, LineData o2) {
        return o1.getName().compareTo(o2.getName());
    }
    
}
