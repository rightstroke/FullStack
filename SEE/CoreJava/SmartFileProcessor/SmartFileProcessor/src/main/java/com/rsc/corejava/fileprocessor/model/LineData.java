package com.rsc.corejava.fileprocessor.model;

public class LineData {
    private int id;
    
    private String name;
    
    private String email;
    
    private int	age;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public LineData(int id, String name, String email, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }
    @Override
    public String toString() {
        return "LineData [age=" + age + ", email=" + email + ", id=" + id + ", name=" + name + "]";
    }

    

}
