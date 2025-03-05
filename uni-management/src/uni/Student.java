package uni;

import java.util.ArrayList;

public class Student {
    public int id ;
    public static ArrayList<Student> studentList = new ArrayList<>() ;
    public int personID ;
    public final int enteranceYear ;
    public int majorID ;
    public String studentID ;

    public Student(int  personID , int enteranceYear, int majorID) {
        id = studentList.size() + 1;
        this.personID = personID;
        this.enteranceYear = enteranceYear;
        this.majorID = majorID ;
        setStudentCode();
        studentList.add(this);

    }

    public static Student findById (int id) {
        for(Student student : studentList) {
            if(student.id == id) {
                return student ;
            }
        }
        return null;
    }

    public void setStudentCode () {
        Major major = Major.findById(majorID);
        if(major != null) {
            this.studentID = String.valueOf(enteranceYear) + String.valueOf(majorID) + String.valueOf(id);
        }else {
            System.out.println("unable to find the major");
        }
    }
}
