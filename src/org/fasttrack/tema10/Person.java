package org.fasttrack.tema10;

public class Person {
    private String name;
    private String position;
    private int age;

    public Person(String name, String position, int age) {
        this.name = name;
        this.position = position;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return name + ";" + position + ";" + age;
    }
}
