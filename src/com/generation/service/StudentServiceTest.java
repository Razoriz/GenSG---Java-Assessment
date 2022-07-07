package com.generation.service;

import org.junit.Test;

import com.generation.model.Student;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class StudentServiceTest {
 StudentService studentService = new StudentService();

  @Test
  public void testFindStudent()throws ParseException {
    DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    Student student1 = new Student("123", "Hariz", "hariz@gmail.com", formatter.parse("30/08/1992"));
    // put this student into the studetnService hashmap (student)
    studentService.subscribeStudent(student1);
    // assert that the student is found in the hashmap
    assertEquals(student1, studentService.findStudent("123"));

  }

  @Test
  public void testIsSubscribed() {
    assertFalse(studentService.isSubscribed("123"));
  }

 
}
