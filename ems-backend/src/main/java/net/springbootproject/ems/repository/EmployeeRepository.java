package net.springbootproject.ems.repository;

import net.springbootproject.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

//EmployeeRepository will get crup methods to perform operations on Employee jpa entity
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
