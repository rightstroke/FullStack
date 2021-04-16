package com.rsc.corejava.fileprocessor.model;

import java.util.Date;

public class TextFile {
    private int id;

    private String fileName;

    private String loc;

    private Date readTimeStamp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public Date getReadTimeStamp() {
        return readTimeStamp;
    }

    public void setReadTimeStamp(Date readTimeStamp) {
        this.readTimeStamp = readTimeStamp;
    }

    @Override
    public String toString() {
        return "TextFile [fileName=" + fileName + ", id=" + id + ", loc=" + loc + ", readTimeStamp=" + readTimeStamp
                + "]";
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    
}
