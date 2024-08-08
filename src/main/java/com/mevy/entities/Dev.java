package com.mevy.entities;

import java.util.LinkedHashSet;
import java.util.Set;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Dev {
    
    private String name;
    private Set<Content> subscribedContents = new LinkedHashSet<>();
    private Set<Content> CompletedContents = new LinkedHashSet<>();
    
    public void subscribeBootcamp(Bootcamp bootcamp) {}

    public void progress() {}

    public void calculateTotalXP() {}

}
