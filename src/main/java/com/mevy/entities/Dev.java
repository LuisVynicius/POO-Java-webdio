package com.mevy.entities;

import java.util.LinkedHashSet;
import java.util.Optional;
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
    
    public void subscribeBootcamp(Bootcamp bootcamp) {
        this.subscribedContents.addAll(bootcamp.getContents());
        bootcamp.getSubscribedDevs().add(this);
    }

    public void progress() {
        Optional<Content> content = this.subscribedContents.stream().findFirst();
        if (content.isPresent()) {
            this.CompletedContents.add(content.get());
            this.subscribedContents.remove(content.get());
        } else {
            System.err.println("No Courses!!!");
        }
    }

    public double calculateTotalXP() {
        return this.CompletedContents.stream().mapToDouble(x -> x.calculateXP()).sum();
    }

}
