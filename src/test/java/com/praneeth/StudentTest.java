package com.praneeth;

import org.testng.annotations.Test;

public class StudentTest {
    
    @Test
    public void student() {
        Student myStudent = new Student();
        myStudent.setStudent_name("praneeth");
        myStudent.setStudent_id(98076);
        myStudent.setAddgrades(95);


        System.out.println("student name: " + myStudent.getStudent_name());
        System.out.println("student id: " + myStudent.getStudent_id());
        System.out.println("student grade: " + myStudent.getAddgrades());

    }
}
