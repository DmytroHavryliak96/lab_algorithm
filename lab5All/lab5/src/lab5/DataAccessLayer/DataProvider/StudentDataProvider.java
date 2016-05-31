
package lab5.DataAccessLayer.DataProvider;

import java.util.LinkedList;
import lab5.DataAccessLayer.DataStorage.StudentDataStorage;
import lab5.DataAccessLayer.Entities.Student;

public class StudentDataProvider implements IDataProvider<Student>{
    private StudentDataStorage storage = new StudentDataStorage();

    public StudentDataProvider(String filename) {
        storage.Load(filename);
    }
        
    @Override
    public void Update(Student student, int index) {
        storage.getStudents().set(index, student);
    }

    @Override
    public void Delete(int index) {   
       storage.getStudents().remove(storage.getStudents().get(index));
    }

    @Override
    public void add(Student student) {
        storage.getStudents().add(student);
    }

    @Override
    public Student GetById(int i) {
        return storage.getStudents().get(i);
    }

    @Override
    public LinkedList<Student> GetAll() {
        return storage.getStudents();
    }
    
    public void Save (String filename){
        storage.Save(filename);
    } 
    
}
