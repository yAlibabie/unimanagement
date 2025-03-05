package uni;

import java.util.ArrayList;

public class Professor {
    public int id ;
    public static ArrayList<Professor> professorList = new ArrayList<>() ;
    public int personID;
    public int majorID ;

    public Professor (int personID , int majorID) {
        id = professorList.size() + 1;
        this.personID = personID;
        this.majorID = majorID;
        professorList.add(this);
    }

    public static Professor findById(int id) {
        for(Professor professor : professorList) {
            if(professor.id == id) {
                return professor;
            }
        }
        return null;
    }
}
