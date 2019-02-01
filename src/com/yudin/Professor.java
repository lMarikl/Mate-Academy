package com.yudin;

import java.util.ArrayList;

class Professor {
    private String firstName;
    private String lastName;
    private ArrayList<Group> groups;

    Professor(String firstName, String lastName, ArrayList<Group> groups) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.groups = groups;
    }

    void muster(Group group){
        ArrayList<Student> outers = new ArrayList<>();
        for (int i = 0; i < group.getStudents().size(); i++) {
            if (!group.getStudents().get(i).isPresence()){
                outers.add(group.getStudents().get(i));
            }
        }

        if (outers.size() > 0){
            System.out.println("Отсутствуют " + outers.size() + " Студента(ов)");
            for (Student outer : outers) {
                System.out.println(outer.getLastName());
            }
        }else {
            System.out.println("Все на месте, начинаем лекцию...");
        }
    }

}
