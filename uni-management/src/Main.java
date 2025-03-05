import uni.*;
import base.Person;

public class Main {
    public static void main(String[] args) {
        //Create new people
        Person person1 = new Person("Fatemeh" , "40322");
        Person person2 = new Person("Sara" , "40320");
        Person person3 = new Person("Yekta" , "40328");
        Person person4 = new Person("Khosravi" , "35310");
        Person person5 = new Person("Ghatei" , "35301");

        //Create new majors
        Major computers = new Major("Computer Science" , 21);
        Major mathematics = new Major("Mathematics" , 17);

        //Creating students out of Fatemeh,Yekta and Sara
        Student fatemehStu = new Student(person1.id , 403, computers.id);
        Student saraStu = new Student(person2.id , 403, computers.id);
        Student yektaStu = new Student(person3.id , 403, computers.id);

        //Create professors out of Khosravi and Ghatei
        Professor KhosraviPro = new Professor(person4.id , mathematics.id);
        Professor ghateiPro = new Professor(person5.id , computers.id);

        //Creating new courses
        Course advProgram = new Course("Advanced Programing" , 4);
        Course calculus = new Course("Calculus2" , 3);
        Course equations = new Course("Differential Equations" , 3);


        //Creating new presented Courses
        PresentedCourse presentedCalculus = new PresentedCourse(calculus.id , KhosraviPro.id,14);
        PresentedCourse presentedAdvProgram = new PresentedCourse(advProgram.id, ghateiPro.id, 13);
        PresentedCourse presentedEquations = new PresentedCourse(equations.id, KhosraviPro.id, 19);

        //Add new students to the courses
        //first course
        presentedCalculus.addStudent(fatemehStu.id);
        presentedCalculus.addStudent(saraStu.id);

        //second course
        presentedAdvProgram.addStudent(fatemehStu.id);
        presentedAdvProgram.addStudent(saraStu.id);
        presentedAdvProgram.addStudent(yektaStu.id);

        //thired course
        presentedEquations.addStudent(yektaStu.id);


        //printing names
        System.out.println("Student name:" + person1.name + " " + "Student id:" + fatemehStu.studentID);
        System.out.println("Student name:" + person2.name + " " + "Student id:" + saraStu.studentID);
        System.out.println("Student name:" + person3.name + " " + "Student id:" + yektaStu.studentID);

        System.out.println();

        System.out.println("Professor name:" + person4.name + " " + "Professor id:" + KhosraviPro.personID);
        System.out.println("Professor name:" + person5.name + " " + "Professor id:" + ghateiPro.personID);

        System.out.println();



        //grading
        Transcript fatemeh = new Transcript(fatemehStu.id);
        fatemeh.setGrade(presentedCalculus.id,18);
        fatemeh.setGrade(presentedAdvProgram.id , 17.25);
        fatemeh.printTranscript();
        System.out.println(fatemeh.getGPA());
        System.out.println();

        Transcript sara = new Transcript(saraStu.id);
        sara.setGrade(presentedCalculus.id,17.5);
        sara.setGrade(presentedAdvProgram.id, 19);
        sara.printTranscript();
        System.out.println(sara.getGPA());
        System.out.println();


        Transcript yekta = new Transcript(yektaStu.id);
        yekta.setGrade(presentedAdvProgram.id,18.5);
        yekta.setGrade(presentedEquations.id,18.5);
        yekta.printTranscript();
        System.out.println(yekta.getGPA());


    }
}