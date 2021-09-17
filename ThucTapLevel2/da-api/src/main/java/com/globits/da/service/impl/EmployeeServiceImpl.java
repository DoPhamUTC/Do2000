package com.globits.da.service.impl;

import com.globits.da.domain.Category;
import com.globits.da.domain.Employee;
import com.globits.da.dto.CategoryDto;
import com.globits.da.dto.EmployeeDto;
import com.globits.da.dto.search.EmployeeSearchDto;
import com.globits.da.repository.EmployeeRepository;
import com.globits.da.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    EntityManager manager;
    @Override
    public List<EmployeeDto> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }

    @Override
    public Boolean deleteEmployee(UUID id) {
        try{
            employeeRepository.deleteById(id);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    @Override
    public Page<EmployeeDto> searchByPage(EmployeeSearchDto dto) {
        if (dto == null) {
            return null;
        }

        int pageIndex = dto.getPageIndex();
        int pageSize = dto.getPageSize();

        pageIndex = pageIndex>0 ? pageIndex-- : 0;
        pageSize = pageSize==0 ? 100 : pageSize;

        String whereClause = "";

        String orderBy = " ORDER BY entity.createDate DESC";

        String sqlCount = "select count(entity.id) from  Employee as entity  ";
        String sql = "select new com.globits.da.dto.EmployeeDto(entity) from  Employee as entity   ";

        if (dto.getKeyword() != null && StringUtils.hasText(dto.getKeyword())) {
            whereClause += "where entity.code LIKE :text or entity.name LIKE :text OR entity.email LIKE :text or entity.phone LIKE :text ";
        }


        sql += whereClause + orderBy;
        sqlCount += whereClause;

        Query q = manager.createQuery(sql, EmployeeDto.class);
        Query qCount = manager.createQuery(sqlCount);

        if (dto.getKeyword() != null && StringUtils.hasText(dto.getKeyword())) {
            q.setParameter("text", '%' + dto.getKeyword() + '%');
            qCount.setParameter("text", '%' + dto.getKeyword() + '%');
        }
        int startPosition = pageIndex * pageSize;
        q.setFirstResult(startPosition);
        q.setMaxResults(pageSize);
        List<EmployeeDto> entities = q.getResultList();
        long count = (long) qCount.getSingleResult();

        Pageable pageable = PageRequest.of(pageIndex, pageSize);
        Page<EmployeeDto> result = new PageImpl<EmployeeDto>(entities, pageable, count);
        return result;
    }

    @Override
    public EmployeeDto saveOrUpdate(UUID id, EmployeeDto dto) {
        if(dto != null ) {
            Employee entity = null;
            if(id !=null) {
                entity =  employeeRepository.getOne(id);
            }
            if(entity == null) {
                entity = new Employee();
            }
            entity.setEmployee(dto);

            entity = employeeRepository.save(entity);
            if (entity != null) {
                return new EmployeeDto(entity);
            }
        }
        return null;
    }
}
