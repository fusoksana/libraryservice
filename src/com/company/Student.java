package com.company;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (readingTiket != student.readingTiket) return false;
        if (!name.equals(student.name)) return false;
        if (!surname.equals(student.surname)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + age;
        result = 31 * result + readingTiket;
        return result;
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
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
}
