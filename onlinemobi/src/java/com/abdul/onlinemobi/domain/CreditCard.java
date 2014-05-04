/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.abdul.onlinemobi.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author abdul
 */
@Entity
public class CreditCard implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String creditNumber;
    private String nameonCreditcard;
    private BigDecimal balance;

    public String getCreditNumber() {
        return creditNumber;
    }

    public void setCreditNumber(String creditNumber) {
        this.creditNumber = creditNumber;
    }

    public String getNameonCreditcard() {
        return nameonCreditcard;
    }

    public void setNameonCreditcard(String nameonCreditcard) {
        this.nameonCreditcard = nameonCreditcard;
    }
   

    private CreditCard(Builder builder) {
        id = builder.id;
        creditNumber = builder.creditNumber;
        balance = builder.balance;
        nameonCreditcard = builder.nameonCreditcard;    
        }

    public CreditCard() {
    }
    
    
    
    public static class Builder{
    private Long id;
    private String creditNumber;
    private String nameonCreditcard;
    private BigDecimal balance;

        public Builder(String number) {
            this.creditNumber = number;
        }
    
        public Builder id(Long value){
            this.id = value;
            return this;
        }
        
        public Builder balance(BigDecimal value){
            this.balance = value;
            return this;
        }
        
        public CreditCard build(){
            return new CreditCard(this);
        }
    
        
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return creditNumber;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CreditCard)) {
            return false;
        }
        CreditCard other = (CreditCard) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.abdul.onlinemobi.domain.Account[ id=" + id + " ]";
    }
    
}
