package com.mevy.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class Course extends Content{
    
    @Getter
    @Setter
    private int courseHours;

    @Override
    public double calculateXP() {
        return STANDARD_XP * courseHours;
    }

    @Override
    public String toString() {
        return "Course [courseHours=" + courseHours + ", getDescription()=" + getDescription() + ", getTitle()="
                + getTitle() + "]";
    }

}
