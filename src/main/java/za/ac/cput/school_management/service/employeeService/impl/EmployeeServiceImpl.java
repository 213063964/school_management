/* EmployeeServiceImpl.java
Service Implementation for the Employee
Author: Jody Kearns (209023651)
Date: 12 June 2022 */

package za.ac.cput.school_management.service.employeeService.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.school_management.domain.Employee;
import za.ac.cput.school_management.repository.IEmployeeRepository;
import za.ac.cput.school_management.service.employeeService.IEmployeeService;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    private final IEmployeeRepository repository;


    @Autowired public EmployeeServiceImpl(IEmployeeRepository repository){
        this.repository = repository;
    }

    @Override
    public Employee save(Employee employee) {return this.repository.save(employee);}

    @Override
    public Optional<Employee> read(String id)
    {
        return this.repository.findById(id);
    }

    @Override
    public void delete(Employee employee) {
        this.repository.delete(employee);
    }

    @Override
    public List<Employee> findAll() {
        return this.repository.findAll();
    }

    public void deleteById(String id) {
        repository.deleteById(id);
        Optional<Employee> employee = read(id);
        if (employee.isPresent()) {
            delete(employee.get());
        }
    }

    @Override
    public Optional<Employee> findByEmail(String email) {
        return this.repository.findByEmail(email);
    }

}
