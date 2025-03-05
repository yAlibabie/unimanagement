package uni;

import java.util.HashMap;

public class Transcript {
    public int studentID ;
    public HashMap<Integer , Double> transcript = new HashMap<>() ;

    public Transcript (int studentID) {
        this.studentID = studentID;
        this.transcript = new HashMap<>();
    }

    public void setGrade (int presentedCourseID , double grade) {
        PresentedCourse presentedCourse = PresentedCourse.findById(presentedCourseID);
        if(presentedCourse != null && presentedCourse.studentIds.contains(studentID)) {
            transcript.put(presentedCourseID,grade);
        }else {
            System.out.println("This student is not in this presented course");
        }
    }

    public void printTranscript() {
        for ( Integer courseID : transcript.keySet()) {
            Course course = Course.findById(courseID);
            if(course != null) {
                System.out.println(course.title + ":" + transcript.get(courseID));
            }
        }
    }

    public double getGPA () {
        double totalGradePoints = 0;
        int totalUnits = 0;
        for (Integer courseID : transcript.keySet()) {
            totalGradePoints += transcript.get(courseID) * course.units;
            totalUnits += course.units;
        }
        return (totalGradePoints/totalUnits);
    }
    
}
