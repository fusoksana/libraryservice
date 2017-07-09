package com.company;


import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LibraryServiceTest {

    @Test(expected=IllegalStateException.class)
    public void testForEmptyList(){
        List<Student> empty = new ArrayList<Student>();
        LibraryService ls = new LibraryService(empty);
    }

    @Test(expected=IllegalStateException.class)
    public void testForNullList(){
        List<Student> empty = null;
        LibraryService ls = new LibraryService(empty);
    }

    @Test
    public void testForCanFindAStudent(){
        List<Student> students = new ArrayList<Student>();
        Student s1=new Student("Vasko","Oksana",31,0045);
        Student s2=new Student("Vaskojhhf","Ok",33,0046);
        students.add(s1);
        students.add(s2);
        LibraryService ls = new LibraryService(students);
        Student s = ls.findStudentByNumber(0045);
        Assert.assertNotNull(s);
        Assert.assertEquals(s, s1);
    }

    @Test
    public void testForCantFindAStudent(){
        List<Student> students = new ArrayList<Student>();
        Student s1=new Student("Vasko","Oksana",31,0045);
        Student s2=new Student("Vaskojhhf","Ok",33,0046);
        students.add(s1);
        students.add(s2);
        LibraryService ls = new LibraryService(students);
        Student s = ls.findStudentByNumber(49);
        Assert.assertNull(s);

    }
    @Test
    public void testForCanFindStudentByAge(){
        List<Student>students=new ArrayList<Student>();
        Student s1=new Student("Vasko","Oksana",31,0045);
        Student s2=new Student("Vaskojhhf","Ok",33,0046);
        students.add(s1);
        students.add(s2);
        LibraryService ls = new LibraryService(students);
        List<Student>s= ls.findStudentsByAge(31);
        Assert.assertNotNull(s);
        Assert.assertEquals(s.get(0),s1);
        Assert.assertEquals(s.size(), 1);


    }
    @Test
    public void testForCantFindAge(){
        List<Student> students=new ArrayList<Student>();
        Student s1=new Student("Vasko","Oksana",31,0045);
        Student s2=new Student("Vaskojhhf","Ok",33,0046);
        students.add(s1);
        students.add(s2);
        LibraryService ls = new LibraryService(students);
        List<Student> s=  ls.findStudentsByAge(37);
        Assert.assertNull(s);
        

    }
    @Test
    public void testMultipleFindStudentByAge() {
        List<Student> students = new ArrayList<Student>();
        Student s1 = new Student("Vasko", "Oksana", 31, 0045);
        Student s2 = new Student("Vaskojhhf", "Ok", 33, 0046);
        Student s3 = new Student("Vasko", "Yeva", 31, 0044);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        LibraryService ls = new LibraryService(students);
        List<Student> s = ls.findStudentsByAge(31);
        Assert.assertEquals(s.size(), 2);
    }
    @Test
    public void testAddStudentbyTicketNumber(){
        List<Student>students=new ArrayList<Student>();
        Student s1=new Student("Vasko","Oksana",31,0045);
        Student s2=new Student("Vaskojhhf","Ok",33,0046);
        students.add(s1);
        students.add(s2);
        Student student=new Student("Fus","Oksana",31,0022);
        LibraryService ls=new LibraryService(students);
        ls.addStudent( student);
        Student sStudent=ls.findStudentByNumber(0022);
        Assert.assertEquals(sStudent,student);
        System.out.println(sStudent);


    }
    @Test
    public void testAddStudentByAgg(){
        System.out.println("Test");
        List<Student>students=new ArrayList<Student>();
        Student s1=new Student("Vasko","Oksana",31,0045);
        Student s2=new Student("Vaskojhhf","Ok",33,0046);
        students.add(s1);
        students.add(s2);
        Student student=new Student("Fus","Oksana",31,0022);
        LibraryService ls=new LibraryService(students);
        ls.addStudent( student);
        List<Student>lsH=ls.findStudentsByAge(31);
        Assert.assertEquals(lsH.size(), 2);

    }
    @Test
    public void testRemoveStudentByTN(){
        List<Student>students=new ArrayList<Student>();
        Student s1=new Student("Vasko","Yarema",3,0020);
        Student s2=new Student("Fus","Oksana",31,0022);
        students.add(s1);
        students.add(s2);
        LibraryService ls=new LibraryService(students);
        ls.removeStudentByTicketNumber(0022);
        Assert.assertNull(ls.findStudentByNumber(0022));
        Assert.assertEquals(ls.findStudentsByAge(31).size(),0);


    }




    }
