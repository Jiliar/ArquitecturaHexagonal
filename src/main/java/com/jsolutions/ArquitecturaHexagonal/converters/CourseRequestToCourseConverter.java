package com.jsolutions.ArquitecturaHexagonal.converters;

import com.jsolutions.ArquitecturaHexagonal.CourseRequest;
import com.jsolutions.ArquitecturaHexagonal.domain.Course;

public class CourseRequestToCourseConverter {

    public Course converter(CourseRequest request) {
        return new Course(request.getTitle(), request.getDuration());
    }

}
