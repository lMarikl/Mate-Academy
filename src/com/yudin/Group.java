package com.yudin;

import java.util.ArrayList;
import java.util.Collections;

public class Group {
    private String groupName;
    private ArrayList<Student> students;

    Group(String groupName) {
        this.groupName = groupName;
    }

    Student makeLeader(){
        Student result;
        Collections.sort(students);
        result = students.get(0);
        result.setLeader();
        return result;
    }

    private String getGroupName() {
        return groupName;
    }

    ArrayList<Student> getStudents() {
        return students;
    }

    void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return getGroupName();
    }
}
