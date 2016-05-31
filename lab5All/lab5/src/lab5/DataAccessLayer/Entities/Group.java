
package lab5.DataAccessLayer.Entities;

import java.util.LinkedList;
import lab5.DataAccessLayer.EntityFactory.IEntityFactory;


public class Group  {
    private String name;
    private LinkedList<Student> student;

    public Group(String name, LinkedList<Student> student) {
        this.name = name;
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<Student> getStudent() {
        return student;
    }

    public void setStudent(LinkedList<Student> student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Group{" + "name=" + name + ", student=" + student + '}';
    }    
}
