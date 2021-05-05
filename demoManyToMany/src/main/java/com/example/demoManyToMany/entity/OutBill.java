package com.example.demoManyToMany.entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class OutBill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBranch ;
    private String billStatus;
    private long total ;

    @Temporal(TemporalType.DATE)
    private Date createTime;

    @OneToMany(mappedBy = "outBill")
    List<DetailOutBill> detailOutBills = new ArrayList<>();

    public OutBill(String billStatus, long total) {
        this.billStatus = billStatus;
        this.total = total;
        this.createTime = new Date();
    }

    public List<DetailOutBill> getDetailOutBills() {
        return detailOutBills;
    }

    public void setDetailOutBills(List<DetailOutBill> detailOutBills) {
        this.detailOutBills = detailOutBills;
    }

    public OutBill() {
    }

    public String getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }



    public int getId() {
        return id;
    }

    public int getIdBranch() {
        return idBranch;
    }

}
