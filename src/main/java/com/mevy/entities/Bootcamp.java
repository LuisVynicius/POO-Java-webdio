package com.mevy.entities;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Bootcamp {
    
    private String name;
    private String description;
    private final LocalDate initialDate = LocalDate.now();
    private final LocalDate endDate = initialDate.plusDays(45);
    private Set<Dev> subscribedDevs = new HashSet<>();
    private Set<Content> contents = new LinkedHashSet<>();

}
