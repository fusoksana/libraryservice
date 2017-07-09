package com.company123.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LibraryService {
    private List<Student> students;

    public Student findStudentByNumber(int lookingRNT) {
        Iterator<Student> itr = students.iterator();
        while (itr.hasNext()) {
            Student element = itr.next();
            if (lookingRNT == element.getReadingTiket()) {
                return element;
            }
        }
        return null;
    }

    public void acceptStudentList(List<Student> students) {
        this.students = students;
    }

    public List<Student> findStudentsByAge(int lookingAge) {
        Iterator<Student> itr = students.iterator();
        List<Student> list = new ArrayList<Student>();
        while (itr.hasNext()) {
            Student element = itr.next();
            if (lookingAge == element.getAge()) {
                list.add(element);
            }
        }
        return list;
    }

}
