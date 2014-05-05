/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.abdul.onlinemobi.repository;

import com.abdul.onlinemobi.app.conf.ConnectionConfig;
import com.abdul.onlinemobi.domain.Customer;
import com.abdul.onlinemobi.respository.CustomerRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author boniface
 */

public class CustomerRepositoryTest {
    public static ApplicationContext ctx;
    private Long id;

    private CustomerRepository repo;
    
    public CustomerRepositoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void createCustomer() {
         repo = ctx.getBean(CustomerRepository.class);
         Customer c = new Customer.Builder("210083832@cput.ac.za")
                 .firstname("A")
                 .lastnaname("J")
                 .build();
         repo.save(p);
         id = p.getId();
         Assert.assertNotNull(p);
         
     
     }
     
     @Test(dependsOnMethods = "createCustomer")
     public void readCustomer(){
         repo = ctx.getBean(CustomerRepository.class);
         Customer person = repo.findOne(id);
         Assert.assertEquals(customer.getFirstname(), "B");
         
     }
     
    @Test(dependsOnMethods = "readCustomer")
     private void updateCustomer(){
         repo = ctx.getBean(CustomerRepository.class);
         Customer person = repo.findOne(id);
         Customer updatedCustomer = new Customer.Builder("210083832@cput.ac.za")
                 .person(person)
                 .firstname("Gamiet")
                 .build();
        
         repo.save(updatedCustomer);
         
         Customer newCustomer = repo.findOne(id);
         Assert.assertEquals(newCustomer.getFirstname(), "Gamiet");
         
     }
     
     @Test(dependsOnMethods = "updateCustomer")
     private void deleteCustomer(){
         repo = ctx.getBean(CustomerRepository.class);
         Customer person = repo.findOne(id);
         repo.delete(person);
         
         Customer deletedCustomer = repo.findOne(id);
         
         Assert.assertNull(deletedCustomer);
         
         
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
        	 ctx = new AnnotationConfigApplicationContext(ConnectionConfig.class);
		
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
