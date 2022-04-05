package com.jsolutions.ArquitecturaHexagonal.domain;

import lombok.Data;

@Data
public class Course {

    private String title;
    private int duration;

    public Course(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }
}
