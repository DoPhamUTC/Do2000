package com.example.demoManyToMany.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OutBill_ProductKey implements Serializable {

    @Column(name = "id_outbill")
    int idOutBill;

    @Column(name = "id_product")
    int idProduct ;

    public int getIdOutBill() {
        return idOutBill;
    }

    public void setIdOutBill(int idOutBill) {
        this.idOutBill = idOutBill;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public OutBill_ProductKey(int idOutBill, int idProduct) {
        this.idOutBill = idOutBill;
        this.idProduct = idProduct;
    }

    public OutBill_ProductKey() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OutBill_ProductKey that = (OutBill_ProductKey) o;
        return idOutBill == that.idOutBill && idProduct == that.idProduct;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idOutBill, idProduct);
    }
}
