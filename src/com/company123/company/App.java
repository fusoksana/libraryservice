package com.company123.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yurko on 11.06.17.
 */
public class App {
    public static void main(String[] args) {


            Student s1=new Student("Vasko","Oksana",31,0045);
            Student s2=new Student("Vaskojhhf","Ok",33,0046);
            Student s3=new Student("Vkhghg","Oksa",35,0047);
            Student s4=new Student("Vaooposko","Ona",31,0076);
            Student s5=new Student("bgsko","DDsana",31,0055);


            List<Student> studentList=new ArrayList<Student>();
            studentList.add(s1);
            studentList.add(s2);
            studentList.add(s3);
            studentList.add(s4);
            studentList.add(s5);





        LibraryService ls = new LibraryService();
        ls.acceptStudentList(studentList);
        Student stBN =ls.findStudentByNumber(0047);
        System.out.println(stBN);
        List<Student> stBA=ls.findStudentsByAge(31);
        System.out.println(stBA);


    }
}
