package com.example.demoManyToMany.repository;

import com.example.demoManyToMany.entity.OutBill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OutBillRepository extends JpaRepository<OutBill,Integer> {
}
