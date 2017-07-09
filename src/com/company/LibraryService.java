package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class LibraryService {
    private HashMap<String,Student> ticketNumToStudentMap =new HashMap<String, Student>();
    private  HashMap<Integer,List<Student>> ageToStudentsMap =new HashMap<Integer, List<Student>>();





    public LibraryService(List<Student> students) {

        if (students == null || students.isEmpty()){
            throw new IllegalStateException("List of students can't be empty or null");
        }
        Iterator<Student> itr = students.iterator();
        while (itr.hasNext()) {
            Student element = itr.next();
           addStudent(element);
        }


    }

    public Student findStudentByNumber(int lookingRNT) {
        return ticketNumToStudentMap.get(Integer.toString(lookingRNT));
    }


    public List<Student> findStudentsByAge(int lookingAge) {
      return   ageToStudentsMap.get(Integer.valueOf(lookingAge));

    }
    public void  addStudent(Student student){
      ticketNumToStudentMap.put(Integer.toString(student.getReadingTiket()), student);
        List<Student>lsHM=null;
        if(ageToStudentsMap.containsKey(Integer.valueOf(student.getAge()))){
            lsHM= ageToStudentsMap.get(Integer.valueOf(student.getAge()));
        }else {
            lsHM=new ArrayList<Student>();

        }
        lsHM.add(student);
        ageToStudentsMap.put(student.getAge(), lsHM);



    }
    public void removeStudentByTicketNumber(int readingTiket){
        Student removedStudent=ticketNumToStudentMap.remove(Integer.toString(readingTiket));
       List<Student> tmpStudents= ageToStudentsMap.get(removedStudent.getAge());
        tmpStudents.remove(removedStudent);


    }

}
