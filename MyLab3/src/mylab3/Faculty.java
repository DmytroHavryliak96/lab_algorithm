
package mylab3;

public class Faculty {
    private String name;
   
    public Faculty(String name){
        this.name = name;
    }
    
    public void setName (String name){
        this.name = name;
    }
    
    public String getName (){
        return this.name;
    }
    
    @Override
    public String toString(){
        return "Faculty{name = " + name + "}"; 
    }
}
