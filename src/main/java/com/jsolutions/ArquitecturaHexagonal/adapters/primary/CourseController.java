package com.jsolutions.ArquitecturaHexagonal.adapters.primary;

import com.jsolutions.ArquitecturaHexagonal.CourseRequest;
import com.jsolutions.ArquitecturaHexagonal.converters.CourseConverter;
import com.jsolutions.ArquitecturaHexagonal.domain.Course;
import com.jsolutions.ArquitecturaHexagonal.ports.primary.CourseService;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
@Component
public class CourseController {

    @Autowired
    private CourseService courseService;

    private CourseConverter converter = Mappers.getMapper(CourseConverter.class);

    public CourseController() {

    }

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @PostMapping
    public ResponseEntity<Course> saveCourse(@RequestParam CourseRequest course) {
        Course courseConverted = converter.convertCourseRequest(course);
        return courseService.saveCourse(courseConverted);
    }