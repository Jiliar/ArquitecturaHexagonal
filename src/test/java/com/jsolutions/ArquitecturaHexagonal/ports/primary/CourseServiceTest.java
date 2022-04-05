package com.jsolutions.ArquitecturaHexagonal.ports.primary;
import com.jsolutions.ArquitecturaHexagonal.domain.Course;
import com.jsolutions.ArquitecturaHexagonal.ports.secondary.CourseRepository;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class CourseServiceTest {

    private CourseRepository repository =  mock(CourseRepository.class);
    private CourseService sut =  mock(CourseService.class);
    private Course course =  mock(Course.class);

    @Test
    public void shouldGetAllCourses(){
        sut.getAllCourses();
        verify(repository).findAll();
    }

    @Test
    public void shouldSaveCourse(){
        sut.saveCourse(course);
        verify(repository).save(course);
    }

}