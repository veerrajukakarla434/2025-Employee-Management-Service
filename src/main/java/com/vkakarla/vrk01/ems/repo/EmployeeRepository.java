package com.vkakarla.vrk01.ems.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vkakarla.vrk01.ems.entities.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
