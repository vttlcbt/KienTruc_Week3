package com.companyname.test1;

public class Schedule {
    private String id;
    private String name;
    private String birthday;

    @Override
    public String toString() {
        return "Schedule [id=" + id + ", name=" + name + ", birthday=" + birthday + "]";
    }

    public Schedule(String id, String name, String birthday) {
        super();
        this.id = id;
        this.name = name;
        this.birthday = birthday;
    }

    public Schedule() {
        // TODO Auto-generated constructor stub
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
