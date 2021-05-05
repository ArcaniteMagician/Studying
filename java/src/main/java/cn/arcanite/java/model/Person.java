package cn.arcanite.java.model;

public class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showMyJob() {
        System.out.println("I have no job.");
    }
}
