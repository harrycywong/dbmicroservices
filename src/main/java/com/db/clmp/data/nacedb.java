package com.db.clmp.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "nacedb")
@Table(name = "nacedb")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer","handler"})
public class nacedb implements Serializable {

    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "naceorder")
    private Long naceOrder;

    @Column(name = "nacelevel")
    private Long naceLevel;

    @Column(name = "nacecode")
    private String naceCode;

    @Column(name = "naceparent")
    private String naceParent;

    @Column(name = "nacedescription")
    private String naceDescription;

    @Column(name = "naceitemincluded")
    private String naceItemIncluded;

    @Column(name = "naceitemincluded2")
    private String naceItemIncluded2;

    @Column(name = "nacerulings")
    private String naceRulings;

    @Column(name = "naceitemincluded3")
    private String naceItemIncluded3;

    @Column(name = "nacereferenceisic")
    private String naceReferenceISIC;

    public nacedb() {

    }

    public nacedb(Long naceOrder, Long naceLevel, String naceCode, String naceParent, String naceDescription, String naceItemIncluded, String naceItemIncluded2, String naceRulings, String naceItemIncluded3, String naceReferenceISIC) {
        this.naceOrder = naceOrder;
        this.naceLevel = naceLevel;
        this.naceCode = naceCode;
        this.naceParent = naceParent;
        this.naceDescription = naceDescription;
        this.naceItemIncluded = naceItemIncluded;
        this.naceItemIncluded2 = naceItemIncluded2;
        this.naceRulings = naceRulings;
        this.naceItemIncluded3 = naceItemIncluded3;
        this.naceReferenceISIC = naceReferenceISIC;
    }

    @Override
    public String toString() {
        return "NaceInformation{" +
                "Order=" + naceOrder +
                ", Level=" + naceLevel +
                ", Code='" + naceCode + '\'' +
                ", Parent='" + naceParent + '\'' +
                ", Description='" + naceDescription + '\'' +
                ", ItemIncluded='" + naceItemIncluded + '\'' +
                ", ItemIncluded2='" + naceItemIncluded2 + '\'' +
                ", Rulings='" + naceRulings + '\'' +
                ", ItemIncluded3='" + naceItemIncluded3 + '\'' +
                ", ReferenceISIC='" + naceReferenceISIC + '\'' +
                '}';
    }

    public Long getNaceOrder() {
        return naceOrder;
    }

    public Long getNaceLevel() {
        return naceLevel;
    }

    public String getNaceCode() {
        return naceCode;
    }

    public String getNaceParent() {
        return naceParent;
    }

    public String getNaceDescription() {
        return naceDescription;
    }

    public String getNaceItemIncluded() {
        return naceItemIncluded;
    }

    public String getNaceItemIncluded2() {
        return naceItemIncluded2;
    }

    public String getNaceRulings() {
        return naceRulings;
    }

    public String getNaceItemIncluded3() {
        return naceItemIncluded3;
    }

    public String getNaceReferenceISIC() {
        return naceReferenceISIC;
    }
}
