
package mylab3;

public class Student {
    private String name;
    private String surname;
    private Group group;
    
    public Student(String name, String surname, Group group){
        this.name = name;
        this.surname = surname;
        this.group = group;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setSurname(String sutname){
        this.surname = surname;
    }
    
    public String getSurname(){
        return surname;
    }
    
    public void setGroup(Group group){
        this.group = group;
    }
    
    public Group getGroup(){
        return group;
    }
    
    @Override
    public String toString(){
        return "Student{name = " + name + ", surname = " + surname + ", " + group;
    }
}
