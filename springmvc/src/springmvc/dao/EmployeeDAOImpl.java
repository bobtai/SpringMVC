package springmvc.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import springmvc.model.EmployeeModel;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    public List<EmployeeModel> getAllEmployees() {
        List<EmployeeModel> employees = new ArrayList<EmployeeModel>();
        
        EmployeeModel obj1 = new EmployeeModel();
        obj1.setId(1);
        obj1.setName("Bob");
        obj1.setTitle("Senior Engineer");
        employees.add(obj1);
        
        EmployeeModel obj2 = new EmployeeModel();
        obj2.setId(2);
        obj2.setName("John");
        obj2.setTitle("Junior Engineer");
        employees.add(obj2);
        
        return employees;
    }
}
