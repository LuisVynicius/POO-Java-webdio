package com.mevy.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Course {
    
    private String title;
    private String description;
    private int courseHours; 

}
