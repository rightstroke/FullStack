package com.rsc.dlvery.model;

import java.util.Calendar;

public class ErrorResponse extends BaseModel {
    private String message;

    private int code;

    private Calendar ts;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Calendar getTs() {
        return ts;
    }

    public void setTs(Calendar ts) {
        this.ts = ts;
    }

    
}
