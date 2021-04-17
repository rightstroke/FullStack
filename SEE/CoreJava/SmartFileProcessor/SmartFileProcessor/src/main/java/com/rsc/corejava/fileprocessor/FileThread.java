package com.rsc.corejava.fileprocessor;

import java.util.List;

import com.rsc.corejava.fileprocessor.model.TextFile;

public class FileThread implements Runnable {
    private List<TextFile> payloads;

    @Override
    public void run() {
        System.out.println("=====");
        FileProcessor.getInstance().processPayload(payloads);
        //for(TextFile tf : payloads) {
        //    System.out.println(Thread.currentThread().getName() + "," + tf);
        //    
        //}
    }

    public FileThread(List<TextFile> payloads) {
        this.payloads = payloads;
    }


    
}
