/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.abdul.onlinemobi.domain;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author Zaidah
 */
@Embeddable
public class CustomerAddress implements Serializable
{
      private String streetAddress;
      private String postalAddress;

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }
      
      
      
}
