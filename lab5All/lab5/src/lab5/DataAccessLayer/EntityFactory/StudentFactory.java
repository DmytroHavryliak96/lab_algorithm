package lab5.DataAccessLayer.EntityFactory;

import lab5.DataAccessLayer.Entities.Student;

public class StudentFactory implements IEntityFactory<Student> {
    @Override
    public Student FromCsv(String csv) {
        String[] items = csv.split(" ");
        String name = items[0];
        String surname = items[1];
        int age = Integer.parseInt(items[2]);
        
        Student student = new Student(name, surname, age);
        return student;
    }

    @Override
    public String ToCsv(Student obj) {
        String str;
        str = obj.getName() + " " + obj.getSurname() + " " + obj.getAge();
        return str;       
    }
    
}
