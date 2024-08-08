package com.mevy.entities;

import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Mentorship {
    
    private String title;
    private String description;
    private LocalDate date;
    
}
