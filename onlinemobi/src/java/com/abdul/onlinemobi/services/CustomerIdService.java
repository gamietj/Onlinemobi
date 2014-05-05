/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.abdul.onlinemobi.services;

import com.abdul.onlinemobi.domain.Customer;
import java.util.List;

/**
 *
 * @author Abdul
 */
public interface CustomerIdService {

    public List<Customer> getIdAbove(int i);
    
}
