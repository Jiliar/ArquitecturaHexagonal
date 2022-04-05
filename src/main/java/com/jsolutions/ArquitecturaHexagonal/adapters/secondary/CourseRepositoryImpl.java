package com.jsolutions.ArquitecturaHexagonal.adapters.secondary;

import com.jsolutions.ArquitecturaHexagonal.domain.Course;
import com.jsolutions.ArquitecturaHexagonal.ports.secondary.CourseRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CourseRepositoryImpl implements CourseRepository {

    private List<Course> courses = new ArrayList<>();

    @Override
    public List<Course> findAll() {
        return courses;
    }

    @Override
    public Course save(Course course) {
        return courses.add(course) ? course : null;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }
}