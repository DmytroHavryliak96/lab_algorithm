
package lab5.DataAccessLayer.DataStorage;

import java.io.*;
import java.util.LinkedList;
import lab5.DataAccessLayer.Entities.Student;
import lab5.DataAccessLayer.EntityFactory.StudentFactory;

public class StudentDataStorage implements IDataStorage<Student>{
    private LinkedList<Student> students = new LinkedList();

    /*public StudentDataStorage(String filename) {
        this.students = Load(filename);
    }*/
    
    public LinkedList<Student> getStudents() {
        return students;
    }

    public void setStudents(LinkedList<Student> students) {
        this.students = students;
    }
    
    @Override
    public /*LinkedList<Student>*/void  Load(String filename) {
            BufferedReader reader = null;
            /*LinkedList<Student> students = new LinkedList();*/
        try {
            
            reader = new BufferedReader(new FileReader(filename));
            StudentFactory factory = new StudentFactory();
            String line = reader.readLine();
            
            while(line != null)
            {
                students.add(factory.FromCsv(line));
                line = reader.readLine();
            }
            reader.close();
            /*return students;*/
        } catch (IOException ex) {
            ex.printStackTrace();
        } 
        
    }

    @Override
    public void Save(String filename) {
        File output = new File(filename);
        BufferedWriter writer = null;
        try{
            writer = new BufferedWriter(new FileWriter(output));
            StudentFactory factory = new StudentFactory();
            for(Student student : students){
                writer.write(factory.ToCsv(student));
                writer.newLine();
            }
            writer.flush();
            writer.close();
        
        } catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
}
