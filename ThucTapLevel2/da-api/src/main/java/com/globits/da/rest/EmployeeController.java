package com.globits.da.rest;

import com.globits.da.dto.EmployeeDto;
import com.globits.da.dto.search.EmployeeSearchDto;
import com.globits.da.service.EmployeeService;
import com.globits.da.utils.ExportExcel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;


    @GetMapping("/getAllEmployee")
    public ResponseEntity<?> getAllEmployee(){
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }
    @RequestMapping(value = "/searchEmployee", method = RequestMethod.POST)
    public ResponseEntity<Page<EmployeeDto>> searchByPage(@RequestBody EmployeeSearchDto searchDto) {
//        System.out.println(searchDto);
        Page<EmployeeDto> page = this.employeeService.searchByPage(searchDto);
        return new ResponseEntity<Page<EmployeeDto>>(page, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addorupdate")
    public ResponseEntity<EmployeeDto> save(@RequestBody EmployeeDto dto) {
        EmployeeDto result = employeeService.saveOrUpdate(null, dto);
        return new ResponseEntity<EmployeeDto>(result, HttpStatus.OK);
    }

    @RequestMapping(value = "/addorupdate/{id}", method = RequestMethod.PUT)
    public ResponseEntity<EmployeeDto> save(@RequestBody EmployeeDto dto, @PathVariable UUID id) {
        System.out.println(dto.getId());
        System.out.println(id);
        EmployeeDto result = employeeService.saveOrUpdate(id, dto);
        return new ResponseEntity<EmployeeDto>(result, HttpStatus.OK);
    }
    @PostMapping("/exportexcel")
    public void exportToExcel(HttpServletResponse response,@RequestBody EmployeeSearchDto searchDto) throws IOException {
        response.setContentType("application/octet-stream");

        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=employees.xlsx";
        response.setHeader(headerKey, headerValue);

        List<EmployeeDto> listUsers = employeeService.searchByPage(searchDto).getContent();

        ExportExcel excelExporter = new ExportExcel(listUsers);

        excelExporter.export(response);
    }
    @DeleteMapping("/delEmployee/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable UUID id) {
        Boolean result = employeeService.deleteEmployee(id);
        return new ResponseEntity<Boolean>(result, HttpStatus.OK);
    }
}
