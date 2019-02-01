package com.yudin;

import java.util.ArrayList;

public class Main {

    private static Group javaIntroduction = new Group("Java Introduction");
    private static Group javaElementary = new Group("Java Elementary");
    private static ArrayList<Group> groups = new ArrayList<>();
    private static ArrayList<Student> studentsBeginer = new ArrayList<>();
    private static ArrayList<Student> studentsElementary = new ArrayList<>();
    private static Professor professor = new Professor("Andrey", "Kadatsky", groups);

    public static void main(String[] args) {
        groups.add(javaElementary);
        groups.add(javaIntroduction);
        studentsBeginer.add(new Student("Ivanov", 20, javaIntroduction, 80));
        studentsBeginer.add(new Student("Pavlov", 26, javaIntroduction, 78));
        studentsBeginer.add(new Student("Tarasov", 29, javaIntroduction, 90));
        studentsBeginer.add(new Student("Petrov", 24, javaIntroduction, 82));
        studentsBeginer.add(new Student("Sidorov", 30, javaIntroduction, 87));
        javaIntroduction.setStudents(studentsBeginer);

        studentsElementary.add(new Student("Abakumov", 24, javaElementary, 89));
        studentsElementary.add(new Student("Sharapov", 28, javaElementary, 91));
        studentsElementary.add(new Student("Dmitruk", 31, javaElementary, 90));
        studentsElementary.add(new Student("Bobov", 27, javaElementary, 92));
        studentsElementary.add(new Student("Pushkin", 21, javaElementary, 88));
        javaElementary.setStudents(studentsElementary);

        System.out.println("Назначим старосту группы Java Introduction");
        System.out.println("Старостой становится " + javaIntroduction.makeLeader());
        System.out.println();
        System.out.println("Проводим перекличку");
        professor.muster(javaIntroduction);
        System.out.println("______________________________________________________________");

        System.out.println("Назначим старосту группы Java Elementary");
        System.out.println("Старостой становится " + javaElementary.makeLeader());
        System.out.println();
        System.out.println("Проводим перекличку");
        professor.muster(javaElementary);
    }
}
