package classes;

import java.util.HashMap;
import java.util.Map;

public class Classes {
    public static void main(String[] args) {
        Student[] students = new Student[]{new Student("Andrei", "Negoita", 2231 , 10), new Student("Ion", "Mateescu", 4221, 12)};
        Professor prof = new Professor("Anton", "Panaitescu");
        Course course = new Course("Material Resistence", "Calculation of reactions .\n" + "effort diagrams, calculations of geometric characteristics of \n" + "flat surfaces and calculations of resistence elements to simple stresses \n", prof, students);
        CourseManager courseManager = new CourseManager();
        courseManager.addCourse(course);
        //courseManager.displayCourseToConsole();
    }
}