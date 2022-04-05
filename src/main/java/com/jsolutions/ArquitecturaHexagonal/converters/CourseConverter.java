package com.jsolutions.ArquitecturaHexagonal.converters;

import com.jsolutions.ArquitecturaHexagonal.CourseRequest;
import com.jsolutions.ArquitecturaHexagonal.domain.Course;

@Mapper
public interface CourseConverter {

    Course convertCourseRequest(CourseRequest courseRequest);
}