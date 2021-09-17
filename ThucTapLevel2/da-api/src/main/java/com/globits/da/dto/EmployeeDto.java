package com.globits.da.dto;

import com.globits.core.domain.BaseObject;
import com.globits.core.dto.BaseObjectDto;
import com.globits.da.domain.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto extends BaseObjectDto {
    private String code ;
    private String name ;
    private String email ;
    private String phone ;
    private Integer age;

    public EmployeeDto(Employee employee) {
        if (employee!=null){
            this.setCreateDate(employee.getCreateDate());
            this.setId(employee.getId());
            this.setName(employee.getName());
            this.code= employee.getCode();
            this.email = employee.getEmail();
            this.phone = employee.getPhone();
            this.age = employee.getAge();
        }
    }


}
