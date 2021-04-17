package com.rsc.corejava.fileprocessor;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
            if (i == (lstPayload.size() - 1)) {
                thrd.join();
            }
        }

        //System.out.println(FileProcessor.getInstance().getFinalOutput());

        writeToFile(FileProcessor.getInstance().getFinalOutput());
        System.out.println("=============================all is done");
    }

    private void writeToFile(TreeMap map) {
        BufferedWriter out = new BufferedWriter(new FileWriter(FILE_FOLDER.concat("op.csv")));

        for(Map.Entry<LineData,Integer> entry : map.entrySet()) {
            LineData key = entry.getKey();
            Integer value = entry.getValue();
            out.write(key.getId() + "," + key.getName() + "," + key.getEmail() + "," + key.getAge());
            System.out.println(key + " => " + value);
          }

          out.close();
    }

    private List<List<TextFile>> getPages(List<TextFile> lstFiles) {
        return ListUtils.partition(lstFiles, PAGE_SIZE);
    }

    public static void main(String[] args) throws InterruptedException {
        new FileManager().doRun();
    }

}