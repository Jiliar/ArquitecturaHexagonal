package com.jsolutions.ArquitecturaHexagonal.ports.secondary;

import com.jsolutions.ArquitecturaHexagonal.domain.Course;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CourseRepository {

    List<Course> findAll();

    Course save(Course course);
}
