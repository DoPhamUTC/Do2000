package com.example.demoManyToMany.entity;

import javax.persistence.*;

@Entity
@Table
public class DetailOutBill {
    @EmbeddedId
    OutBill_ProductKey id ;

    @ManyToOne
    @MapsId("idOutBill")
    @JoinColumn(name = "id_outbill")
    private OutBill outBill;

    @ManyToOne
    @MapsId("idProduct")
    @JoinColumn(name = "id_product")
    private Product product;

    private int amount ;

    public OutBill_ProductKey getId() {
        return id;
    }

    public void setId(OutBill_ProductKey id) {
        this.id = id;
    }

    public OutBill getOutBill() {
        return outBill;
    }

    public void setOutBill(OutBill outBill) {
        this.outBill = outBill;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public DetailOutBill() {
    }

    public DetailOutBill(OutBill_ProductKey id) {
        this.id = id;
    }
}
