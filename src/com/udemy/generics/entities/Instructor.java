package com.udemy.generics.entities;

import java.util.List;
import java.util.ArrayList;

public class Instructor {

    private String name;
    private List<Course> courses = new ArrayList<>();

    public Instructor() {
    }

    public Instructor(String name, List<Course> courses) {
        this.name = name;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

}
