package com.jsolutions.ArquitecturaHexagonal.adapters.primary;

import com.jsolutions.ArquitecturaHexagonal.CourseRequest;
import com.jsolutions.ArquitecturaHexagonal.domain.Course;
import com.jsolutions.ArquitecturaHexagonal.ports.primary.CourseService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class CourseControllerTest {

    public CourseService courseService = mock(CourseService.class);
    public CourseController sut = new CourseController(courseService);
    public CourseRequest course =  mock(CourseRequest.class);


    @Test
    public void shouldGetAllCourses(){
        sut.getAllCourses();
        verify(courseService).getAllCourses();
    }

    @Test
    public void shouldSaveCourse(){
        sut.saveCourse(course);
        verify(courseService).saveCourse(course);
    }

}