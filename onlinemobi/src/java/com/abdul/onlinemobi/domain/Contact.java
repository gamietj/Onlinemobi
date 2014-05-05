/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abdul.onlinemobi.domain;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author Abdul
 */

@Embeddable
public class Contact implements Serializable{
    
    private String phoneNumber;
    private String contactNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    
    
    
}
