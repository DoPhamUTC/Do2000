package com.example.demoManyToMany.repository;

import com.example.demoManyToMany.entity.DetailOutBill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetaiOutBillRepository extends JpaRepository<DetailOutBill,Integer> {
}
