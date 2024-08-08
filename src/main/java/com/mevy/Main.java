package com.mevy;

import java.time.LocalDate;

import com.mevy.entities.Bootcamp;
import com.mevy.entities.Course;
import com.mevy.entities.Dev;
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
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp01");
        bootcamp.setDescription("Description01");
        bootcamp.getContents().add(course01);
        bootcamp.getContents().add(course02);
        bootcamp.getContents().add(mentorship);

        Dev dev01 = new Dev();
        dev01.setName("Dev01");
        dev01.subscribeBootcamp(bootcamp);
        System.out.println("Contents: " + dev01.getSubscribedContents());
        dev01.progress();
        System.out.println("Completeds: " + dev01.getCompletedContents());

        Dev dev02 = new Dev();
        dev02.setName("Dev02");
        dev02.subscribeBootcamp(bootcamp);
        System.out.println("Contents: " + dev02.getSubscribedContents());
        dev02.progress();
        System.out.println("Completeds: " + dev02.getCompletedContents());



        


        // System.out.println(course01);
        //System.out.println(course02);
    }
}