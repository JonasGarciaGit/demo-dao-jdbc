
package application;

import java.util.List;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.impl.DepartmentDaoJDBC;
import model.entities.Department;


public class Program2 {
   public static void main (String [] args){
       DepartmentDaoJDBC departmentDaoJDBC = null;
       DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
       
       
         System.out.println("\n=== Test 1: department insert ===");
         Department newDepartment = new Department(null, "FoodTruck");
         departmentDao.insert(newDepartment);
         System.out.println("Inserted done! ");
         
          System.out.println("\n=== Test 2: department update ===");
         Department department = departmentDao.findById(1);
         department.setId(1);
         department.setName("Mangá");
         departmentDao.update(department);
         System.out.println("Update! completed ");
         
          System.out.println("\n=== Test 3: department deleteById ===");
          departmentDao.deleteById(2);
          System.out.println("Deleted!");
       
           System.out.println("\n=== Test 4: department findById ===");
           department = departmentDao.findById(3);
           System.out.println(department);
           
            System.out.println("\n=== Test 5: department findAll===");
            List<Department> list = departmentDao.findAll();
            for(Department obj : list){
                System.out.println(obj);
            }
   }
}
