package com.example.demoManyToMany.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private int amount;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int idList;
    @Temporal(TemporalType.DATE)
    private Date ExpiryDay;

    @OneToMany(mappedBy = "product")
    List<DetailOutBill> detailOutBills = new ArrayList<>();

    public Product(int amount ) {
        this.amount = amount;
        ExpiryDay = new Date();
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getIdList() {
        return idList;
    }

    public void setIdList(int idList) {
        this.idList = idList;
    }

    public Date getExpiryDay() {
        return ExpiryDay;
    }

    public void setExpiryDay(Date expiryDay) {
        ExpiryDay = expiryDay;
    }

    public List<DetailOutBill> getDetailOutBills() {
        return detailOutBills;
    }

    public void setDetailOutBills(List<DetailOutBill> detailOutBills) {
        this.detailOutBills = detailOutBills;
    }
}
