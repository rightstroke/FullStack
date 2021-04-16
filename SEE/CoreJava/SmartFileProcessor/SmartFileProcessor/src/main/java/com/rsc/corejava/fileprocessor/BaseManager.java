package com.rsc.corejava.fileprocessor;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.rsc.corejava.fileprocessor.model.TextFile;

public abstract class BaseManager {
    public List<TextFile> getFiles(String location) {

        List<TextFile> txtFiles = new ArrayList<>();

        File[] files = new File(location).listFiles();
        //If this pathname does not denote a directory, then listFiles() returns null. 
        int count = 0;
        for (File file : files) {
            if (file.isFile()) {
                ++count;
                TextFile txtFile = new TextFile();
                txtFile.setId(count);
                txtFile.setFileName(file.getName());
                txtFile.setLoc(location);
                txtFile.setReadTimeStamp(new java.util.Date());
                txtFiles.add(txtFile);
            }
        }
        
        //txtFiles.stream().sorted((p1,p2)-> p1.getFileName().compareTo(p2.getFileName())
      
        //return txtFiles.stream().sorted((p1,p2)-> p1.getFileName().compareTo(p2.getFileName())).collect(Collectors.toList());
        return txtFiles.stream().sorted(Comparator.comparing(TextFile::getFileName)).collect(Collectors.toList());
    }
    
}
