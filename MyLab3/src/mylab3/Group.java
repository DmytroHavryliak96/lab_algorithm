
package mylab3;

public class Group {
    private Faculty faculty;
    private String name;
  
    public Group(String name, Faculty faculty){
        this.name = name;
        this.faculty = faculty;
    } 
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setFaculty(Faculty faculty){
        this.faculty = faculty;
    }
    
    public Faculty getFaculty(){
        return this.faculty;
    }
    
    @Override
    public String toString(){
        return "Group{name = " + name + ", " + faculty + "}";
    }
}
