package com.globits.da.domain;

import com.globits.core.domain.BaseObject;
import com.globits.da.dto.EmployeeDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee extends BaseObject {
    private String code ;
    private String name ;
    private String email ;
    private String phone ;
    private int age ;

    public void setEmployee(EmployeeDto dto) {
        this.code = dto.getCode();
        this.name = dto.getName();
        this.email = dto.getEmail();
        this.phone = dto.getPhone();
        this.age = dto.getAge();
    }
}
