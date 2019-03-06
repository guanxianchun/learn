package com.martin.pattern.builder.prototype;

import com.martin.pattern.builder.bean.ICourse;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



public class ProtoType implements Cloneable, Serializable {

    private String name;

    private List<ICourse> courses = new ArrayList<ICourse>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ICourse> getCourses() {
        return courses;
    }

    public void setCourses(List<ICourse> courses) {
        this.courses = courses;
    }

    public ProtoType() {
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Object deepClone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }
}
