package modulo2.POO.exemplo1;

import java.time.OffsetDateTime;

public class Person {

    private String name;
    private int age;

    private int lastYearAgeInc = OffsetDateTime.now().getYear();

    public Person(){}

    public Person(String name) {
        this.name = name;
        this.age = 1;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void incAge(){
        if (this.lastYearAgeInc >= OffsetDateTime.now().getYear()) return;

        this.age += 1;
        this.lastYearAgeInc = OffsetDateTime.now().getYear();
    }

    @Override
    public String toString() {
        return "name: " + name +
                ", age: " + age;
    }
}
