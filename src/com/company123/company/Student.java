package com.company123.company;

/**
 * Created by yurko on 11.06.17.
 */
public class Student {
    private String name;
    private String surname;
    private int age;
    private int readingTiket;
    public Student(String surname,String name,int age,int readingTiket){
        this.surname=surname;
        this.name=name;
        this.age=age;
        this.readingTiket=readingTiket;

    }
    @Override
    public String toString(){
        return surname+" "+name+" "+age+" "+readingTiket;

    }
    public int getReadingTiket(){
        return readingTiket;
    }
    public int getAge(){
        return age;
    }
}
