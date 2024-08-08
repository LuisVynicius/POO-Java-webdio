package com.mevy.entities;

import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class Mentorship extends Content{
    
    @Getter
    @Setter
    private LocalDate date;

    @Override
    public double calculateXP() {
        return STANDARD_XP + 20;
    }

    @Override
    public String toString() {
        return "Mentorship [date=" + date + ", getDescription()=" + getDescription() + ", getTitle()=" + getTitle()
                + "]";
    }
    
}
