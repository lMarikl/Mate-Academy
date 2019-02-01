package com.yudin;

import java.util.Random;

public class Student implements Comparable<Student>{
    private String lastName;
    private int age;
    private Group group;
    private int iq;
    private boolean presence;

    Student(String lastName, int age, Group group, int iq) {
        this.lastName = lastName;
        this.age = age;
        this.group = group;
        this.iq = iq;
        Random random = new Random();
        if (random.nextInt(2) == 0){
            presence = true;
        }
    }

    boolean isPresence() {
        return presence;
    }

    String getLastName() {
        return lastName;
    }

    private int getAge() {
        return age;
    }

    private Group getGroup() {
        return group;
    }

    void setLeader() {
    }

    @Override
    public String toString() {
        return "Student{" + "lastName=" + getLastName() + " age=" + getAge() + " group=" + getGroup() + '}';
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(o.iq, this.iq);
    }
}
