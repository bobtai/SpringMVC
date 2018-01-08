package springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.EmployeeDAO;
import springmvc.model.EmployeeModel;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeDAO dao;
    
    public List<EmployeeModel> getAllEmployees() {
        return dao.getAllEmployees();
    }
}
