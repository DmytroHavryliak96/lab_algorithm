
package lab5;

import lab5.DataAccessLayer.DataProvider.StudentDataProvider;
import lab5.DataAccessLayer.Entities.Student;

public class Lab5 {

   
    public static void main(String[] args) {
     StudentDataProvider str = new StudentDataProvider("D:\\Навчання\\другий курс\\другий семестр\\Алгоритми та структури даних\\Лабораторні роботи\\лабораторна 5\\textFiles\\Student\\Student1.txt");
     System.out.println(str.GetAll());
     str.Delete(0);
     System.out.println(str.GetAll());
     str.Update(new Student("Pasha", "Bendus", 19), 0);
     System.out.println(str.GetAll());
     str.add(new Student("Wowa", "Wintoniak", 19));
     System.out.println(str.GetAll());
     System.out.println(str.GetById(2));
     str.Save("D:\\Навчання\\другий курс\\другий семестр\\Алгоритми та структури даних\\Лабораторні роботи\\лабораторна 5\\textFiles\\Student\\Student10.txt");
    }
    
}
