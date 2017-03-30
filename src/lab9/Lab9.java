package lab9;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static lab9.Student.printStudent;

/**
 * Created by Petro on 30.03.2017.
 */

class Student{
    String name;
    int course;

    Student(){
    }

    Student(String name_, int course_){
        name=name_;
        course=course_;
    }

    public Integer getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }

    static void printStudent(List<Student> list, int course){
        Iterator<Student> itr = list.iterator();
        while(itr.hasNext()){
            Student st = itr.next();
            if(st.getCourse()==course){
                System.out.println("Студент "+st.getName()+" навчається на "+st.getCourse()+" курсі;");
            }
        }
    }
}

public class Lab9 {
    public static void main(String[] args) {
        List<Student> stud =new ArrayList<Student>();
        stud.add(new Student("Валерій",3));
        stud.add(new Student("Андрій",3));
        stud.add(new Student("Олег",2));
        stud.add(new Student("Богдан",2));
        stud.add(new Student("Василь",5));
        stud.add(new Student("Мартин",5));
        stud.add(new Student("Микола",1));
        stud.add(new Student("Ігор",1));
        stud.add(new Student("Артем",4));
        stud.add(new Student("Олександр",4));
        printStudent(stud,1);
    }
}
