package com.mevy;

import java.time.LocalDate;

import com.mevy.entities.Course;
import com.mevy.entities.Mentorship;

public class Main {
    public static void main(String[] args) {
        Course course01 = new Course();
        course01.setTitle("Course01");
        course01.setDescription("Description01");
        course01.setCourseHours(0);

        Course course02 = new Course();
        course02.setTitle("Course02");
        course02.setDescription("Description02");
        course02.setCourseHours(0);

        Mentorship mentorship    = new Mentorship();
        mentorship.setTitle("Mentorship01");
        mentorship.setDescription("Description01");
        mentorship.setDate(LocalDate.now());
        
        System.out.println(course01);
        System.out.println(course02);
    }
}