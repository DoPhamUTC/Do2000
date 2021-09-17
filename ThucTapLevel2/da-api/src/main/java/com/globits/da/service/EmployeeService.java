package com.globits.da.service;

import com.globits.da.dto.CategoryDto;
import com.globits.da.dto.EmployeeDto;
import com.globits.da.dto.search.EmployeeSearchDto;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.UUID;

public interface EmployeeService {
    List<EmployeeDto> getAllEmployees();
    Page<EmployeeDto> searchByPage(EmployeeSearchDto dto);

    EmployeeDto saveOrUpdate(UUID id, EmployeeDto dto);
    Boolean deleteEmployee(UUID id);

}
