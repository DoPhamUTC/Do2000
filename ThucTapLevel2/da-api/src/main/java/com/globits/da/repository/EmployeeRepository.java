package com.globits.da.repository;

import com.globits.da.domain.Employee;
import com.globits.da.dto.CategoryDto;
import com.globits.da.dto.EmployeeDto;
import com.globits.da.dto.search.EmployeeSearchDto;
import com.globits.da.dto.search.SearchDto;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,UUID> {

    @Query(value = "select new com.globits.da.dto.EmployeeDto(e.code ,e.name,e.email,e.phone,e.age) from Employee as e " +
            "where e.code like %?1% and e.name like %?2% and e.email like %?3% and e.phone like %?4% and CAST( e.age AS string )  like  %?5%" )
    List<EmployeeDto> findEmployees(String code ,String name ,String email ,String phone ,String age);
    @Query("select new com.globits.da.dto.EmployeeDto(e) from Employee e")
    List<EmployeeDto> getAllEmployees();

}
