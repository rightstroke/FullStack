package com.rsc.corejava.fileprocessor;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.rsc.corejava.fileprocessor.model.LineData;
import com.rsc.corejava.fileprocessor.model.TextFile;

import org.apache.commons.collections4.ListUtils;

public class FileManager extends BaseManager {
    public final String FILE_FOLDER = "/home/train/Documents/git-srm-fullstack/FullStack/SEE/CoreJava/data/";

    public final int PAGE_SIZE = 3;

    public void doRun() throws InterruptedException {
        List<TextFile> lstFiles = this.getFiles(FILE_FOLDER);
        List<List<TextFile>> lstPayload = getPages(lstFiles);

        for (int i = 0; i < lstPayload.size(); i++) {
            FileThread fThread = new FileThread(lstPayload.get(i));
            Thread thrd = new Thread(fThread);
            thrd.setName("Batch-" + i);
            thrd.start();
            //if (i == (lstPayload.size() - 1)) {
                thrd.join();
            //}
        }

        // System.out.println(FileProcessor.getInstance().getFinalOutput());
        
        writeToFile(FileProcessor.getInstance().getFinalOutput());
        System.out.println("=============================all is done" + FileProcessor.getInstance().getFinalOutput().size());
    }

    private void writeToFile(TreeMap map) {
        BufferedWriter out;
        try {
            out = new BufferedWriter(new FileWriter(FILE_FOLDER.concat("op" + System.currentTimeMillis() + ".csv")));

            // for(Map.Entry<LineData,Integer> entry : map.entrySet()) {
            // LineData key = entry.getKey();
            // Integer value = entry.getValue();
            // out.write(key.getId() + "," + key.getName() + "," + key.getEmail() + "," +
            // key.getAge());
            // System.out.println(key + " => " + value);
            // }

            Set set = map.entrySet();
            Iterator it = set.iterator();

            while (it.hasNext()) {
                Map.Entry me = (Map.Entry) it.next();

                LineData ldata = (LineData) me.getKey();
                out.write(ldata.getId() + "," + ldata.getName() + "," + ldata.getEmail() + "," + ldata.getAge() + "\n");
                //System.out.print("===>" + ldata.getId() + "," + ldata.getName() + "," + ldata.getEmail() + "," + ldata.getAge() + "\n");
                //System.out.println("Value is: " + me.getValue());
            }

            out.close();
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }

    private List<List<TextFile>> getPages(List<TextFile> lstFiles) {
        return ListUtils.partition(lstFiles, PAGE_SIZE);
    }

    public static void main(String[] args) throws InterruptedException {
        new FileManager().doRun();
    }

}