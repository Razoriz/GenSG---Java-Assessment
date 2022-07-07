package com.generation.service;

import org.junit.Test;

import com.generation.model.Course;
import com.generation.model.Module;

import static org.junit.Assert.*;

public class CourseServiceTest {
  CourseService courseService = new CourseService();

  @Test
  public void testGetCourse() {
    Module module = new Module( "INTRO-CS", "Introduction to Computer Science",
                                    "Introductory module for the generation technical programs" );
    Course course = new Course( "INTRO-CS-1", "Introduction to Computer Science", 9, module );
    courseService.registerCourse( course );
    assertEquals(course, courseService.getCourse(course.getCode()));
  }
  @Test
  public void testRegisterCourse() {
     Module module = new Module( "INTRO-CS", "Introduction to Computer Science",
                                    "Introductory module for the generation technical programs" );
    Course course = new Course( "INTRO-CS-1", "Introduction to Computer Science", 9, module );
    courseService.registerCourse( course ); //Test if the course is registered in the hashmap
    assertEquals(course, courseService.getCourse("INTRO-CS-1"));
    
  }
}
