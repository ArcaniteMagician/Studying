package cn.arcanite.java.model;

public class Teacher extends Person {

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void showMyJob() {
        System.out.println("I am a teacher!");
    }
}
