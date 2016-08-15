package com.anjulacodez.productshowcase.Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "PRODUCT")
public class ShowcaseProduct implements Serializable{

    public ShowcaseProduct() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PRODID")
    private long prodid;

    @Column(name = "PRODNAME")
    private String name;

    @Column(name = "PRODDETAIL",length = 2000)
    private String detail;

    public long getProdid() {
        return prodid;
    }

    public void setProdid(long prodid) {
        this.prodid = prodid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
