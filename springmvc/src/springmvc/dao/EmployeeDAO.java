package springmvc.dao;

import java.util.List;

import springmvc.model.EmployeeModel;

public interface EmployeeDAO {
    public List<EmployeeModel> getAllEmployees();
}
