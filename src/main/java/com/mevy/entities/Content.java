package com.mevy.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Content {
    
    protected static final double STANDARD_XP = 10;

    private String title;
    private String description;

    public abstract double calculateXP();

}
