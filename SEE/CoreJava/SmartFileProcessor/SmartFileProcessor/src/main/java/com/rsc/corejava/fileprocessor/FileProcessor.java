package com.rsc.corejava.fileprocessor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

import javax.swing.plaf.BorderUIResource.LineBorderUIResource;

import com.rsc.corejava.fileprocessor.model.LineData;
import com.rsc.corejava.fileprocessor.model.TextFile;

public class FileProcessor {

    private static FileProcessor fileProcessor;

    private TreeMap<LineData,Integer> tMap = new TreeMap<LineData,Integer>(new LineDataComparator());

    private FileProcessor() {

    }

    public static FileProcessor getInstance() {
        if (fileProcessor == null) {
            fileProcessor = new FileProcessor();
        }

        return fileProcessor;
    }

    public TreeMap getFinalOutput(){
        return tMap;
    }

    public void processPayload(List<TextFile> payload) {
        for (TextFile f : payload) {
            processFile(f.getFileName(), f.getLoc());
        }
    }

    private void processFile(String fileName, String location) {
        File file = new File(location.concat(fileName));
        System.out.println(file);
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null) {
                //System.out.println(st);
                String[] lineitems = st.split(",");
                //int id = Integer.parseInt(lineitems[0]);
                //System.out.println(id + "=" + lineitems[1] + "=" + lineitems[2] + "=" + lineitems[3]);
                if (!lineitems[0].equalsIgnoreCase("id")){
                    collectTheData(new LineData(Integer.parseInt(lineitems[0]) , lineitems[1].concat("rsc") , lineitems[2].concat("ABCD") , Integer.parseInt(lineitems[3])));
                }
                
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    private void  collectTheData(LineData lData) {
       
        synchronized(this) {
            tMap.put(lData, lData.getId());
        }
       
        
    }

}
