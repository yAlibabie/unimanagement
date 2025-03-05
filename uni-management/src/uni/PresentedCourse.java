package uni;

import java.util.ArrayList;


public class PresentedCourse {
    public int id ;
    public static ArrayList<PresentedCourse> presentedCourseList = new ArrayList<>() ;
    public int courseID ;
    public int professorID ;
    public int capacity ;
    public ArrayList<Integer> studentIds ;

    public PresentedCourse (int courseID, int professorID, int capacity) {
        id = presentedCourseList.size() + 1;
        this.courseID = courseID ;
        this.professorID = professorID;
        this.capacity = capacity;
        this.studentIds = new ArrayList<>();
        presentedCourseList.add(this);
    }

    public static PresentedCourse findById (int ID) {
        for (PresentedCourse presentedCourse : presentedCourseList) {
            if (presentedCourse.id == ID) {
                return presentedCourse;
            }
        }
        return null;
    }

    public void addStudent (int studentID) {
        if(studentIds.size() <= capacity) {
            studentIds.add(studentID);
        }else {
            System.out.println("this course has reached it's limit");
        }
    }

}
