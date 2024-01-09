package net.springbootproject.ems.mapper;

import net.springbootproject.ems.dto.EmployeeDto;
import net.springbootproject.ems.entity.Employee;
//to map employee dto to employee and vice versa
public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmailId()

        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmailId()

        );
    }

}