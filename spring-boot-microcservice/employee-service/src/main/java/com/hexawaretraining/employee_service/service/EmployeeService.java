package com.hexawaretraining.employee_service.service;


import com.hexawaretraining.employee_service.dto.APIResponseDto;
import com.hexawaretraining.employee_service.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    //EmployeeDto getEmployeeById(Long employeeId);
   APIResponseDto getEmployeeById(Long employeeId);



}