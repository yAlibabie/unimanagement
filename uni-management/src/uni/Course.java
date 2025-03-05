package uni;

import java.util.ArrayList;

public class Course {
    public int id;
    public static ArrayList<Course> courseList = new ArrayList<>() ;
    public String title ;
    public int units ;

    public Course (String title , int units) {
        id = courseList.size() + 1;
        this.title = title;
        this.units = units;
        courseList.add(this);
    }

    public static Course findById(int ID) {
        for (Course course : courseList) {
            if (course.id == ID) {
                return course;
            }
        }
        return null;
    }
}
