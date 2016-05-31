package mylab3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Comparator;

public class MyLab3 {
    
    public static void main(String[] args) {
       Faculty faculty = new Faculty("IIT");
       Group group = new Group("ПІ-14-1", faculty);
       Student student1 = new Student("Василь", "Гряділь", group);
       Student student2 = new Student("Павло", "Бендус", group);
       Student student3 = new Student("Юрій", "Гаврилко", group);
       Student student4 = new Student("Олександр", "Близнюк", group);
       Student student5 = new Student("Дмитро", "Гавриляк", group);
       Student student6 = new Student("Іван", "Боднарчук", group);
       Student student7 = new Student("Владислав", "Даниляк", group);
       Student student8 = new Student("Володимир", "Вінтоняк", group);
     
       LinkedList<Student> mylist = new LinkedList();
       mylist.add(student1);
       mylist.add(student2);
       mylist.add(student3);
       mylist.add(student4);
       mylist.add(student5);
       mylist.add(student6);
       mylist.add(student7);
       mylist.add(student8);
       
       mylist.sort(new Comparator<Student>(){
       @Override
        public int compare(Student o1, Student o2){
            String surname1 = o1.getSurname().toUpperCase();
            String surname2 = o2.getSurname().toUpperCase();
            return surname1.compareTo(surname2);
        }    
       });
    
       for(Student student : mylist){
           System.out.println(student);
       }
    }
}
