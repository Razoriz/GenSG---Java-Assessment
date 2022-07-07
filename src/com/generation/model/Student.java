package com.generation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student
    extends Person
    implements Evaluation
{
    private double average;

    private final List<Course> courses = new ArrayList<>(); // List of courses that the student is enrolled in

    private final Map<String, Course> approvedCourses = new HashMap<>(); //hashmap of courses that the student has approved 

    public Student( String id, String name, String email, Date birthDate )
    {
        super( id, name, email, birthDate );
    }

    public void enrollToCourse( Course course )
    {
        //TODO implement this method
        courses.add( course ); //add the course to the list of courses that the student is enrolled in


    }

    public void registerApprovedCourse( Course course )
    {
        approvedCourses.put( course.getCode(), course ); //puts the course in the hashmap 
    }

    public boolean isCourseApproved( String courseCode )
    {
        //TODO implement this method
        if (approvedCourses.containsKey( courseCode )) //if the hashmap contains the course code
        {
            return true;
        }
        
        return false;
    }

    // CHALLENGE IMPLEMENTATION: Read README.md to find instructions on how to solve. 
    public List<Course> findPassedCourses( Course course )
    {
        //TODO implement this method


        return null;
    }

    public boolean isAttendingCourse( String courseCode )
    {
        //TODO implement this method

        for (Course course : courses)
        {
            if (course.getCode().equals( courseCode ))
            {
                return true; //if the course code is in the list of courses that the student is enrolled in
            }
        }
        return false;
    }
    @Override
    public double getAverage()
    {
        return average;
    }

    @Override
    public List<Course> getApprovedCourses()
    {
        //TODO implement this method
        //get all the courses that student has been approved for
        if (approvedCourses.size() == 0)
        {
            return null;
        }
        else
        {
            List<Course> approvedCoursesList = new ArrayList<>();
            for (String key : approvedCourses.keySet())
            {
                approvedCoursesList.add( approvedCourses.get( key ) );
            }
            return approvedCoursesList;
        }
        
    }

    @Override
    public String toString()
    {
        return "Student {" + super.toString() + "}";
    }


}
