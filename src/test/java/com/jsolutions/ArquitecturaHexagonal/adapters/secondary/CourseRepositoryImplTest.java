package com.jsolutions.ArquitecturaHexagonal.adapters.secondary;

import com.jsolutions.ArquitecturaHexagonal.domain.Course;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CourseRepositoryImplTest{

    private CourseRepositoryImpl sut = new CourseRepositoryImpl();
    private Course course = new Course("Course 4", 30);

    @Before
    public void setup(){
        sut.addCourse(new Course("Course 1", 60));
        sut.addCourse(new Course("Course 2", 20));
        sut.addCourse(new Course("Course 3", 40));
    }

    @Test
    public void shouldObtainData(){
        List<Course> allCourses = sut.findAll();
        assertEquals(allCourses.get(0).getTitle(), "Course 1");
        assertEquals(allCourses.get(1).getTitle(), "Course 2");
        assertEquals(allCourses.get(2).getTitle(), "Course 3");
    }

    @Test
    public void shouldSaveData(){
        Course courseSave = sut.save(course);
        assertEquals(courseSave.getTitle(), "Course 4");
    }

}