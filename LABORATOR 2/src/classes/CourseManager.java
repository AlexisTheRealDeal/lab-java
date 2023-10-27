package classes;
import java.sql.Connection;
import java.util.Scanner; //pentru exercitiul 2 din laborator
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class CourseManager {
    Course[] courses;
    Classes[] lista;
    public CourseManager(){
        Connection conn=null;
        courses=new Course[0];
    }
    public void addCourse(Course course){
        int newLength = courses.length +1;
        Course[] aux=new Course[newLength];
        int index=0;
        for(Course c: courses){
            aux[index++]=c;
        }
        aux[index]=course;
        this.courses= new Course[newLength];
        System.arraycopy(aux,0,courses,0, newLength);
    }
    public void displayCoursesToConsole(){
        for(Course c: courses){
            System.out.println(c);
        }
    }
    //EXERCITIUL 2 ADD A METHOD TO ManagerCursuri THAT ALLOWS YOU TO ENROLL A STUDENT INTO A COURSE BY SPECIFYNG THE COURSE NAME AND THE STUDENT OBJECT
    public void enroll(){
        String curs,firstn,lastn;
        int gn;
        System.out.println("Specify course name");
        Scanner in = new Scanner(System.in);
        curs = in.nextLine();
        for(var c:courses)
        {
            if(c.name.equals(curs))
            {
                System.out.println("Specify first name ");
                firstn= in.nextLine();
                System.out.println("Specify last name ");
                lastn= in.nextLine();
                System.out.println("Specify group number");
                gn= in.nextInt();
                c.students[c.students.length].setFirstName(firstn);
                c.students[c.students.length].setLastName(lastn);
                c.students[c.students.length].setGroupNumber(gn);
                break;
            }
        }
    }
    //EXERCITIUL 3 EXTEND ManagerCursuri with a method listStudentInCourse(String courseName) that returns a list of all students enrolled in a given course
   public void listStudentsInCourse(String courseName) {
       for (var course : courses) {
           if (course.name.equals(courseName)) // == ia hashu si il compara, .equals compara in functie de obiect/ proprietatile obiectului
           {
               for (var student : course.students) {
                   System.out.println(student.getFullName());
               }
               break;
           }
       }
   }
}
