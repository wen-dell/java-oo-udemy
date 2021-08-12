package com.udemy.generics.exercicio.entities;

public class Student {

    private Integer code;

    public Student(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return code.equals(student.code);
    }

    @Override
    public int hashCode() {
        return code.hashCode();
    }
}
