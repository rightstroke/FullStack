package com.rsc.corejava.fileprocessor;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.rsc.corejava.fileprocessor.model.TextFile;

import org.apache.commons.collections4.ListUtils;

public class FileManager extends BaseManager {
    public final String FILE_FOLDER = "/home/train/Documents/git-srm-fullstack/FullStack/SEE/CoreJava/data";

    public final int PAGE_SIZE = 3;

    public void doRun(){
        List<TextFile> lstFiles = this.getFiles(FILE_FOLDER);
        List<List<TextFile>> lstPayload = getPages(lstFiles);
        
        for(int i=0;i<lstPayload.size();i++) {
            FileThread fThread = new FileThread(lstPayload.get(i));
            Thread thrd = new Thread(fThread);
            thrd.setName("Batch-" +  i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            thrd.start();
        }
    }

    private List<List<TextFile>> getPages(List<TextFile> lstFiles) {
        return  ListUtils.partition(lstFiles, PAGE_SIZE);
    }

    public static void main(String[] args){
        new FileManager().doRun();
    }


}