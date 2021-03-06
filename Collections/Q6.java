package Collections;

//Write a program to sort the Student objects based on Score , if the score are same then sort on First Name .
// Class Student{ String Name; Double Score; Double Age

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Q6 {
    public static void main(String[] args) {
        ArrayList<Employee> ar=new ArrayList<Employee>();
        ar.add(new Employee("ankit",20.0, 70.0));
        ar.add(new Employee("sagar",25.0, 61.0));
        ar.add(new Employee("manna",9.0, 88.0));
        ar.add(new Employee("amisha",23.0, 75.0));
        ar.add(new Employee("ishika",22.0, 64.0));
        ar.add(new Employee("mohit",21.0, 75.0));
        ar.add(new Employee("neha", 23.0, 89.0));
        Collections.sort(ar, new CompareBySalary());
        for(int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }
    }
}
class Student{
    String name;
    Double Age;
    Double Score;
    Student(String n, Double s, Double a){
        this.name=n;
        this.Score=s;
        this.Age=a;
    }
    public String toString(){
        return name+" "+Score+" "+Age;
    }
}
class CompareByScore implements Comparator<Student> {
    public int compare(Student e1, Student e2){
        if(e1.Score>e2.Score)
            return -1;
        else if(e1.Score<e2.Score)
            return 1;
        else
            return new NameComparator().compare(e1, e2);
    }
}
class NameComparator implements Comparator<Student> {
    public int compare(Student e1, Student e2){
       return e2.name.compareTo(e1.name);
    }
}