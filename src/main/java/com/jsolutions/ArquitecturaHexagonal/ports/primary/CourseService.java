package com.jsolutions.ArquitecturaHexagonal.ports.primary;
import com.jsolutions.ArquitecturaHexagonal.adapters.secondary.CourseRepositoryImpl;
import com.jsolutions.ArquitecturaHexagonal.domain.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CourseService {

    @Autowired
    private CourseRepositoryImpl repository;

    public CourseService () {

    }

    public CourseService(CourseRepositoryImpl repository) {
        this.repository = repository;
    }

    public List<Course> getAllCourses() {
        return repository.findAll();
    }

    public ResponseEntity<Course> saveCourse(Course course) {
        if(course.getDuration() < 10) {
            return ResponseEntity.of(null);
        }else{
            Course courseSaved = repository.save(course);
            return ResponseEntity.of(Optional.of(courseSaved));
        }
    }
}